package cl.mobdev.challenge.domain;
// Test
// 1.-
// 2.-
// 3.-
// 4.-
// 5.-
// 6.-
public class Character {

  private int id;
  private String name;
  private String status;
  private String species;
  private String type;
  private Integer episode_count;
  private Location origin;


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

  public Integer getEpisode_count() {
    return episode_count;
  }

  public void setEpisode_count(Integer episode_count) {
    this.episode_count = episode_count;
  }

  public Location getOrigin() {
    return origin;
  }

  public void setOrigin(Location origin) {
    this.origin = origin;
  }
}
