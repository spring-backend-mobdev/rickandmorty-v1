package cl.mobdev.challenge.gateway.mapper;

import cl.mobdev.challenge.domain.Character;
import cl.mobdev.challenge.domain.Location;
import cl.mobdev.challenge.gateway.model.ApiCharacter;
import cl.mobdev.challenge.gateway.model.ApiLocation;
import org.springframework.stereotype.Component;

@Component
public class APIResponseToCharacterMapper {

    public Character mapper(ApiCharacter apiCharacter, ApiLocation apiLocation) {

        Character character = new Character();
        character.setId(apiCharacter.getId());
        character.setName(apiCharacter.getName());
        character.setSpecies(apiCharacter.getSpecies());
        character.setStatus(apiCharacter.getStatus());
        character.setType(apiCharacter.getType());
        character.setEpisode_count(apiCharacter.getEpisode().size());

        Location location = new Location();
        location.setName(apiLocation.getName());
        location.setUrl(apiLocation.getUrl());
        location.setDimension(apiLocation.getDimension());
        location.setResidents(apiLocation.getResidents());
        character.setOrigin(location);

        return character;
    }
}

// Test
// 1.- Verificar que los datos recibidos vienen de Character
// 2.- Verificar que los datos recibidos vienen de Location
// 3.-
// 4.-
