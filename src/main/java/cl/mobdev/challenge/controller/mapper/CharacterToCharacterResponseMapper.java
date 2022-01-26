package cl.mobdev.challenge.controller.mapper;

import cl.mobdev.challenge.domain.Character;
import cl.mobdev.challenge.domain.Location;
import cl.mobdev.challenge.gateway.model.ApiCharacter;
import org.springframework.stereotype.Component;

@Component
public class CharacterToCharacterResponseMapper {

  public Character mapper(ApiCharacter apiCharacter) {

    Character characterMapper = new Character();
    Location location = new Location();

    characterMapper.setId(apiCharacter.getId());
    characterMapper.setName(apiCharacter.getName());
    characterMapper.setSpecies(apiCharacter.getSpecies());
    characterMapper.setStatus(apiCharacter.getStatus());
    characterMapper.setType(apiCharacter.getType());
    characterMapper.setOrigin(location);
    characterMapper.setEpisode_count(apiCharacter.getEpisode().size());

    location.setName(location.getName());
    location.setUrl(location.getUrl());
    location.setDimension(location.getDimension());
    location.setResidents(location.getResidents());

    return characterMapper;

  }
}