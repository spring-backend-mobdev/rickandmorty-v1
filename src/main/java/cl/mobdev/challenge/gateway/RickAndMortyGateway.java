package cl.mobdev.challenge.gateway;

import cl.mobdev.challenge.domain.Character;
import cl.mobdev.challenge.gateway.mapper.APIResponseToCharacterMapper;
import cl.mobdev.challenge.gateway.model.ApiCharacter;
import cl.mobdev.challenge.gateway.model.ApiLocation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

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
    ApiLocation apiLocation = null;
    ApiCharacter apiCharacter = restTemplate.getForObject(characterUrl + id, ApiCharacter.class);

    if (null != apiCharacter.getOrigin() && !"".equals(apiCharacter.getOrigin().getUrl())) {
      apiLocation = restTemplate.getForObject(apiCharacter.getOrigin().getUrl(), ApiLocation.class);
    }

    return mapperToCharacter.mapper(apiCharacter, apiLocation);
  }
}