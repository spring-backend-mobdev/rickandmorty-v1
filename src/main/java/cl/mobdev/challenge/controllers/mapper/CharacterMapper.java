package cl.mobdev.challenge.controllers.mapper;

import cl.mobdev.challenge.domain.response.CharacterResponse;
import cl.mobdev.challenge.domain.response.LocationResponse;

public class CharacterMapper {

    public CharacterResponse characterMapper(CharacterResponse character) {

    CharacterResponse characterMapper = new CharacterResponse();
    LocationResponse locationResponse = new LocationResponse();

    characterMapper.setId(character.getId());
    characterMapper.setName(character.getName());
    characterMapper.setSpecies(character.getSpecies());
    characterMapper.setStatus(character.getStatus());
    characterMapper.setType(character.getType());
    characterMapper.setOrigin(locationResponse);
    characterMapper.setEpisode_count(character.getEpisode().size());

    locationResponse.setName(locationResponse.getName());
    locationResponse.setUrl(locationResponse.getUrl());
    locationResponse.setDimension(locationResponse.getDimension());
    locationResponse.setResidents(locationResponse.getResidents());


    return characterMapper;
}


}
