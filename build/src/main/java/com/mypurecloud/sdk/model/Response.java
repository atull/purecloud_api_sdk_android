package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.ResponseText;
import com.mypurecloud.sdk.model.UriReference;
import com.mypurecloud.sdk.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


/**
 * Contains information about a response.
 **/
@ApiModel(description = "Contains information about a response.")
public class Response  implements Serializable {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("version")
  private Integer version = null;

  @SerializedName("libraries")
  private List<UriReference> libraries = new ArrayList<UriReference>();

  @SerializedName("texts")
  private List<ResponseText> texts = new ArrayList<ResponseText>();

  @SerializedName("createdBy")
  private User createdBy = null;

  @SerializedName("dateCreated")
  private Date dateCreated = null;


  /**
   * The interaction type for this response.
   */
  public enum InteractionTypeEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("chat")
    CHAT("chat"),

    @SerializedName("email")
    EMAIL("email"),

    @SerializedName("twitter")
    TWITTER("twitter");

    private String value;

    InteractionTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("interactionType")
  private InteractionTypeEnum interactionType = null;

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
   * Version number required for updates.
   **/
  @ApiModelProperty(value = "Version number required for updates.")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }

  /**
   * One or more libraries response is associated with.
   **/
  @ApiModelProperty(required = true, value = "One or more libraries response is associated with.")
  public List<UriReference> getLibraries() {
    return libraries;
  }
  public void setLibraries(List<UriReference> libraries) {
    this.libraries = libraries;
  }

  /**
   * One or more texts associated with the response.
   **/
  @ApiModelProperty(required = true, value = "One or more texts associated with the response.")
  public List<ResponseText> getTexts() {
    return texts;
  }
  public void setTexts(List<ResponseText> texts) {
    this.texts = texts;
  }

  /**
   * User that created the response
   **/
  @ApiModelProperty(value = "User that created the response")
  public User getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(User createdBy) {
    this.createdBy = createdBy;
  }

  /**
   * The date and time the response was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "The date and time the response was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }

  /**
   * The interaction type for this response.
   **/
  @ApiModelProperty(value = "The interaction type for this response.")
  public InteractionTypeEnum getInteractionType() {
    return interactionType;
  }
  public void setInteractionType(InteractionTypeEnum interactionType) {
    this.interactionType = interactionType;
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
    Response response = (Response) o;
    return Objects.equals(id, response.id) &&
        Objects.equals(name, response.name) &&
        Objects.equals(version, response.version) &&
        Objects.equals(libraries, response.libraries) &&
        Objects.equals(texts, response.texts) &&
        Objects.equals(createdBy, response.createdBy) &&
        Objects.equals(dateCreated, response.dateCreated) &&
        Objects.equals(interactionType, response.interactionType) &&
        Objects.equals(selfUri, response.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, version, libraries, texts, createdBy, dateCreated, interactionType, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Response {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    libraries: ").append(toIndentedString(libraries)).append("\n");
    sb.append("    texts: ").append(toIndentedString(texts)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    interactionType: ").append(toIndentedString(interactionType)).append("\n");
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
