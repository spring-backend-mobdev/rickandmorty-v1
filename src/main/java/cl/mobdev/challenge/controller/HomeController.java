package cl.mobdev.challenge.controller;

import cl.mobdev.challenge.domain.Character;
import cl.mobdev.challenge.gateway.mapper.APIResponseToCharacterMapper;
import cl.mobdev.challenge.usecase.GetCharacterUseCase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

  private final GetCharacterUseCase getCharacterUseCase;
  private final APIResponseToCharacterMapper mapperToResponse;

  public HomeController(GetCharacterUseCase getCharacterUseCase,
                        APIResponseToCharacterMapper mapperToResponse) {
    this.getCharacterUseCase = getCharacterUseCase;
    this.mapperToResponse = mapperToResponse;
  }

  @GetMapping("/character/{id}")
  public Character getCharacter(@PathVariable String id) {
    return getCharacterUseCase.execute(id);
  }
}

// Test
// 1.- Verificar que los datos del mapper vengan correctos
// 2.- Comparar que el id consultado responda al original
// 3.-
// 4.-
// 5.-
// 6.-
