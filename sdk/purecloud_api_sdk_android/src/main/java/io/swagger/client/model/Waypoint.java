package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Scene;

import com.google.gson.annotations.SerializedName;





public class Waypoint   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("targetScene")
  private Scene targetScene = null;

  @SerializedName("rotationY")
  private Double rotationY = null;

  @SerializedName("rotationX")
  private Double rotationX = null;

  @SerializedName("sceneRotationY")
  private Double sceneRotationY = null;

  @SerializedName("distance")
  private Double distance = null;

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
  public Scene getTargetScene() {
    return targetScene;
  }
  public void setTargetScene(Scene targetScene) {
    this.targetScene = targetScene;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getRotationY() {
    return rotationY;
  }
  public void setRotationY(Double rotationY) {
    this.rotationY = rotationY;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getRotationX() {
    return rotationX;
  }
  public void setRotationX(Double rotationX) {
    this.rotationX = rotationX;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getSceneRotationY() {
    return sceneRotationY;
  }
  public void setSceneRotationY(Double sceneRotationY) {
    this.sceneRotationY = sceneRotationY;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getDistance() {
    return distance;
  }
  public void setDistance(Double distance) {
    this.distance = distance;
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
    Waypoint waypoint = (Waypoint) o;
    return Objects.equals(id, waypoint.id) &&
        Objects.equals(name, waypoint.name) &&
        Objects.equals(targetScene, waypoint.targetScene) &&
        Objects.equals(rotationY, waypoint.rotationY) &&
        Objects.equals(rotationX, waypoint.rotationX) &&
        Objects.equals(sceneRotationY, waypoint.sceneRotationY) &&
        Objects.equals(distance, waypoint.distance) &&
        Objects.equals(selfUri, waypoint.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, targetScene, rotationY, rotationX, sceneRotationY, distance, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Waypoint {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    targetScene: ").append(toIndentedString(targetScene)).append("\n");
    sb.append("    rotationY: ").append(toIndentedString(rotationY)).append("\n");
    sb.append("    rotationX: ").append(toIndentedString(rotationX)).append("\n");
    sb.append("    sceneRotationY: ").append(toIndentedString(sceneRotationY)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
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
