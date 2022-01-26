package cl.mobdev.challenge.controller;

import cl.mobdev.challenge.controller.mapper.CharacterToCharacterResponseMapper;
import cl.mobdev.challenge.domain.Character;
import cl.mobdev.challenge.usecase.GetCharacterUseCase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

  private final GetCharacterUseCase getCharacterUseCase;
  private final CharacterToCharacterResponseMapper mapperToResponse;

  public HomeController(GetCharacterUseCase getCharacterUseCase,
                        CharacterToCharacterResponseMapper mapperToResponse) {
    this.getCharacterUseCase = getCharacterUseCase;
    this.mapperToResponse = mapperToResponse;
  }


  @GetMapping("/character/{id}")
  public Character getCharacter(@PathVariable String id) {
    Character character = getCharacterUseCase.execute(id);
    return character;
  }
}
