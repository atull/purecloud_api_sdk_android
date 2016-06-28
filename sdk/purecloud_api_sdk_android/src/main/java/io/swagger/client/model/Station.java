package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.UriReference;

import com.google.gson.annotations.SerializedName;





public class Station   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;


  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    @SerializedName("AVAILABLE")
    AVAILABLE("AVAILABLE"),

    @SerializedName("ASSOCIATED")
    ASSOCIATED("ASSOCIATED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("userId")
  private String userId = null;

  @SerializedName("primaryEdge")
  private UriReference primaryEdge = null;

  @SerializedName("secondaryEdge")
  private UriReference secondaryEdge = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("lineAppearanceId")
  private String lineAppearanceId = null;

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
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public UriReference getPrimaryEdge() {
    return primaryEdge;
  }
  public void setPrimaryEdge(UriReference primaryEdge) {
    this.primaryEdge = primaryEdge;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public UriReference getSecondaryEdge() {
    return secondaryEdge;
  }
  public void setSecondaryEdge(UriReference secondaryEdge) {
    this.secondaryEdge = secondaryEdge;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getLineAppearanceId() {
    return lineAppearanceId;
  }
  public void setLineAppearanceId(String lineAppearanceId) {
    this.lineAppearanceId = lineAppearanceId;
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
    Station station = (Station) o;
    return Objects.equals(id, station.id) &&
        Objects.equals(name, station.name) &&
        Objects.equals(description, station.description) &&
        Objects.equals(status, station.status) &&
        Objects.equals(userId, station.userId) &&
        Objects.equals(primaryEdge, station.primaryEdge) &&
        Objects.equals(secondaryEdge, station.secondaryEdge) &&
        Objects.equals(type, station.type) &&
        Objects.equals(lineAppearanceId, station.lineAppearanceId) &&
        Objects.equals(selfUri, station.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, status, userId, primaryEdge, secondaryEdge, type, lineAppearanceId, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Station {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    primaryEdge: ").append(toIndentedString(primaryEdge)).append("\n");
    sb.append("    secondaryEdge: ").append(toIndentedString(secondaryEdge)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    lineAppearanceId: ").append(toIndentedString(lineAppearanceId)).append("\n");
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
