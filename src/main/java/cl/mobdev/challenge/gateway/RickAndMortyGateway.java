package cl.mobdev.challenge.gateway;

import cl.mobdev.challenge.controller.mapper.CharacterMapper;
import cl.mobdev.challenge.domain.request.Character;
import cl.mobdev.challenge.domain.request.Location;
import cl.mobdev.challenge.domain.response.CharacterResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RickAndMortyGateway {

    private final String characterUrl;

    private final RestTemplate restTemplate;
    private final CharacterMapper characterToCharacterResponseMapper = new CharacterMapper();

    public RickAndMortyGateway(@Value("${urlApi}") String characterUrl, RestTemplate restTemplate) {
        this.characterUrl = characterUrl;
        this.restTemplate = restTemplate;
    }


    public CharacterResponse getCharacter(String id) {

        CharacterMapper characterMapper = new CharacterMapper();
        Location location = new Location();
        Character character = restTemplate.getForObject(characterUrl + id, Character.class);

        if (null != character.getOrigin() && !"".equals(character.getOrigin().getUrl())) {
            location = restTemplate.getForObject(character.getOrigin().getUrl(), Location.class);
        }
        return characterMapper(character, location);
    }
}