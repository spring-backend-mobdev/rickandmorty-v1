package cl.mobdev.challenge.controller;

import cl.mobdev.challenge.domain.response.CharacterResponse;
import cl.mobdev.challenge.gateway.RickAndMortyGateway;
import cl.mobdev.challenge.usecase.GetCharacterUseCase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private final RickAndMortyGateway rickAndMortyGateway;
    private final GetCharacterUseCase getCharacterUseCase;
    private final GetLocationUseCase getLocationUseCase;

    public HomeController(RickAndMortyGateway rickAndMortyGateway, GetCharacterUseCase getCharacterUseCase, GetLocationUseCase getLocationUseCase) {
        this.rickAndMortyGateway = rickAndMortyGateway;
        this.getCharacterUseCase = getCharacterUseCase;
        this.getLocationUseCase = getLocationUseCase;
    }


    @GetMapping("/character/{id}")
    public CharacterResponse getCharacter(@PathVariable String id) {
        getCharacterUseCase.execute(id);
        //getLocationUseCase.execute(character);
        return rickAndMortyGateway.getCharacter(id);
    }
}
