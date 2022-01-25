package cl.mobdev.challenge.usecase;

import cl.mobdev.challenge.domain.request.Character;
import cl.mobdev.challenge.gateway.RickAndMortyGateway;
import org.springframework.stereotype.Component;

@Component
public class GetCharacterUseCase {

    private final RickAndMortyGateway rickAndMortyGateway;
    public Character characterRequest;

    public GetCharacterUseCase(RickAndMortyGateway rickAndMortyGateway, Character characterRequest) {
        this.rickAndMortyGateway = rickAndMortyGateway;
        this.characterRequest = characterRequest;
    }


    public java.lang.Character execute(String id) {
        // Devolver un Character pero si esta Muerto lanzar una Exception
        characterRequest  =  rickAndMortyGateway.getCharacter(id);

        if ("Dead".equals(characterRequest.getStatus())) {
            throw new DeadException("El personaje está muerto !!!");
        }
        return characterRequest;
    }
}
