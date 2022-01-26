package cl.mobdev.challenge.usecase;

import cl.mobdev.challenge.domain.Character;
import cl.mobdev.challenge.gateway.RickAndMortyGateway;
import org.springframework.stereotype.Component;

@Component
public class GetCharacterUseCase {

  private final RickAndMortyGateway rickAndMortyGateway;

  public GetCharacterUseCase(RickAndMortyGateway rickAndMortyGateway) {
    this.rickAndMortyGateway = rickAndMortyGateway;
  }

  public Character execute(String id) {
    Character character = rickAndMortyGateway.getCharacter(id);

    // Lanzar una excepcion cuando el character tiene status "Dead"
    if ("Dead".equals(character.getStatus())) {
      throw new DeadException("El personaje está muerto !!!");
    }

    return character;
  }
}
