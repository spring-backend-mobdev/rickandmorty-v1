package cl.mobdev.challenge.gateway.model;

import java.util.ArrayList;

public class ApiCharacter {

  private int id;
  private String name;
  private String status;
  private String species;
  private String type;
  private String gender;
  private ApiOrigin apiOrigin;
  private ApiLocation apiLocation;
  private String image;
  private ArrayList<String> episode;
  private String url;
  private String created;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getSpecies() {
    return species;
  }

  public void setSpecies(String species) {
    this.species = species;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public ApiOrigin getOrigin() {
    return apiOrigin;
  }

  public void setOrigin(ApiOrigin apiOrigin) {
    this.apiOrigin = apiOrigin;
  }

  public ApiLocation getLocation() {
    return apiLocation;
  }

  public void setLocation(ApiLocation apiLocation) {
    this.apiLocation = apiLocation;
  }

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public ArrayList<String> getEpisode() {
    return episode;
  }

  public void setEpisode(ArrayList<String> episode) {
    this.episode = episode;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }
}
