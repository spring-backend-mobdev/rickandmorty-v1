package cl.mobdev.challenge.gateway.mapper;

import cl.mobdev.challenge.domain.Character;
import cl.mobdev.challenge.gateway.model.ApiCharacter;
import cl.mobdev.challenge.gateway.model.ApiLocation;
import org.springframework.stereotype.Component;

@Component
public class APIResponseToCharacterMapper {

  public Character mapper(ApiCharacter apiCharacter, ApiLocation apiLocation) {
    Character character = new Character();

    character.setId(apiCharacter.getId());
    character.setName(apiCharacter.getName());


    return character;
  }

}
