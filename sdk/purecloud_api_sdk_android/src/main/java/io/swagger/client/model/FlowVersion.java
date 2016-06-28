package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.UriReference;

import com.google.gson.annotations.SerializedName;





public class FlowVersion   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("commitVersion")
  private String commitVersion = null;

  @SerializedName("configurationVersion")
  private String configurationVersion = null;


  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    @SerializedName("PUBLISH")
    PUBLISH("PUBLISH"),

    @SerializedName("CHECKIN")
    CHECKIN("CHECKIN"),

    @SerializedName("SAVE")
    SAVE("SAVE");

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

  @SerializedName("createdBy")
  private UriReference createdBy = null;

  @SerializedName("configurationUri")
  private String configurationUri = null;

  @SerializedName("dateCreated")
  private Long dateCreated = null;

  @SerializedName("generationId")
  private String generationId = null;

  @SerializedName("publishResultUri")
  private String publishResultUri = null;

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
  public String getCommitVersion() {
    return commitVersion;
  }
  public void setCommitVersion(String commitVersion) {
    this.commitVersion = commitVersion;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getConfigurationVersion() {
    return configurationVersion;
  }
  public void setConfigurationVersion(String configurationVersion) {
    this.configurationVersion = configurationVersion;
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
   **/
  @ApiModelProperty(value = "")
  public UriReference getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(UriReference createdBy) {
    this.createdBy = createdBy;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getConfigurationUri() {
    return configurationUri;
  }
  public void setConfigurationUri(String configurationUri) {
    this.configurationUri = configurationUri;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Long dateCreated) {
    this.dateCreated = dateCreated;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getGenerationId() {
    return generationId;
  }
  public void setGenerationId(String generationId) {
    this.generationId = generationId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPublishResultUri() {
    return publishResultUri;
  }
  public void setPublishResultUri(String publishResultUri) {
    this.publishResultUri = publishResultUri;
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
    FlowVersion flowVersion = (FlowVersion) o;
    return Objects.equals(id, flowVersion.id) &&
        Objects.equals(name, flowVersion.name) &&
        Objects.equals(commitVersion, flowVersion.commitVersion) &&
        Objects.equals(configurationVersion, flowVersion.configurationVersion) &&
        Objects.equals(type, flowVersion.type) &&
        Objects.equals(createdBy, flowVersion.createdBy) &&
        Objects.equals(configurationUri, flowVersion.configurationUri) &&
        Objects.equals(dateCreated, flowVersion.dateCreated) &&
        Objects.equals(generationId, flowVersion.generationId) &&
        Objects.equals(publishResultUri, flowVersion.publishResultUri) &&
        Objects.equals(selfUri, flowVersion.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, commitVersion, configurationVersion, type, createdBy, configurationUri, dateCreated, generationId, publishResultUri, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowVersion {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    commitVersion: ").append(toIndentedString(commitVersion)).append("\n");
    sb.append("    configurationVersion: ").append(toIndentedString(configurationVersion)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    configurationUri: ").append(toIndentedString(configurationUri)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    generationId: ").append(toIndentedString(generationId)).append("\n");
    sb.append("    publishResultUri: ").append(toIndentedString(publishResultUri)).append("\n");
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
