package cl.mobdev.challenge.gateway;

import cl.mobdev.challenge.domain.Character;
import cl.mobdev.challenge.gateway.mapper.APIResponseToCharacterMapper;
import cl.mobdev.challenge.gateway.model.ApiCharacter;
import cl.mobdev.challenge.gateway.model.ApiLocation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
// Test
// 1.-
// 2.-
// 3.-
// 4.-
// 5.-
// 6.-
@Component
public class RickAndMortyGateway {

  private final String characterUrl;
  private final RestTemplate restTemplate;
  private final APIResponseToCharacterMapper mapperToCharacter;

  public RickAndMortyGateway(@Value("${urlApi}") String characterUrl,
                             RestTemplate restTemplate,
                             APIResponseToCharacterMapper mapperToCharacter) {
    this.characterUrl = characterUrl;
    this.restTemplate = restTemplate;
    this.mapperToCharacter = mapperToCharacter;
  }

  public Character getCharacter(String id) {

    Character character;
    ResponseEntity<ApiCharacter> apiCharacter = restTemplate.getForEntity(characterUrl + id, ApiCharacter.class);
    character = mapperToCharacter.mapper(apiCharacter.getBody(), getLocation(apiCharacter.getBody()));

    return character;
  }

  public ApiLocation getLocation(ApiCharacter apiCharacter) {

    ApiLocation location = null;
    if (null != apiCharacter.getOrigin() && !"".equals(apiCharacter.getOrigin().getUrl())) {
      location = restTemplate.getForObject(apiCharacter.getOrigin().getUrl(), ApiLocation.class);
    }

    return location;

  }
}


// Consulta:
// 1.- Se puede setear un argumento privado para Test ?
