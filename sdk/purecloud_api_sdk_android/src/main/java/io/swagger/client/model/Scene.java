package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Asset;
import io.swagger.client.model.SceneGroup;
import io.swagger.client.model.Thumbnail;
import io.swagger.client.model.Waypoint;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class Scene   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("sceneGroup")
  private SceneGroup sceneGroup = null;

  @SerializedName("assets")
  private List<Asset> assets = new ArrayList<Asset>();

  @SerializedName("thumbnail")
  private Thumbnail thumbnail = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("waypoints")
  private List<Waypoint> waypoints = new ArrayList<Waypoint>();

  @SerializedName("defaultOrientationY")
  private Double defaultOrientationY = null;


  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    @SerializedName("PRIMARY")
    PRIMARY("PRIMARY"),

    @SerializedName("SECONDARY")
    SECONDARY("SECONDARY");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("selfUri")
  private String selfUri = null;

  /**
   * The globally unique identifier for the object.
   **/
  @ApiModelProperty(value = "The globally unique identifier for the object.")
  public String getId() {
    return id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public SceneGroup getSceneGroup() {
    return sceneGroup;
  }
  public void setSceneGroup(SceneGroup sceneGroup) {
    this.sceneGroup = sceneGroup;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Asset> getAssets() {
    return assets;
  }
  public void setAssets(List<Asset> assets) {
    this.assets = assets;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Thumbnail getThumbnail() {
    return thumbnail;
  }
  public void setThumbnail(Thumbnail thumbnail) {
    this.thumbnail = thumbnail;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Waypoint> getWaypoints() {
    return waypoints;
  }
  public void setWaypoints(List<Waypoint> waypoints) {
    this.waypoints = waypoints;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getDefaultOrientationY() {
    return defaultOrientationY;
  }
  public void setDefaultOrientationY(Double defaultOrientationY) {
    this.defaultOrientationY = defaultOrientationY;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * The URI for this object
   **/
  @ApiModelProperty(value = "The URI for this object")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Scene scene = (Scene) o;
    return Objects.equals(id, scene.id) &&
        Objects.equals(name, scene.name) &&
        Objects.equals(sceneGroup, scene.sceneGroup) &&
        Objects.equals(assets, scene.assets) &&
        Objects.equals(thumbnail, scene.thumbnail) &&
        Objects.equals(description, scene.description) &&
        Objects.equals(waypoints, scene.waypoints) &&
        Objects.equals(defaultOrientationY, scene.defaultOrientationY) &&
        Objects.equals(type, scene.type) &&
        Objects.equals(selfUri, scene.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, sceneGroup, assets, thumbnail, description, waypoints, defaultOrientationY, type, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Scene {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sceneGroup: ").append(toIndentedString(sceneGroup)).append("\n");
    sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    waypoints: ").append(toIndentedString(waypoints)).append("\n");
    sb.append("    defaultOrientationY: ").append(toIndentedString(defaultOrientationY)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
