package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.OrganizationPresence;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class UserPresence  implements Serializable {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("source")
  private String source = null;

  @SerializedName("primary")
  private Boolean primary = false;

  @SerializedName("presenceDefinition")
  private OrganizationPresence presenceDefinition = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("modifiedDate")
  private Date modifiedDate = null;

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
   * Represents the source where the Presence was set. Some examples are: PURECLOUD, LYNC, OUTLOOK, etc.
   **/
  @ApiModelProperty(value = "Represents the source where the Presence was set. Some examples are: PURECLOUD, LYNC, OUTLOOK, etc.")
  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }

  /**
   * A boolean used to tell whether or not to set this presence source as the primary on a PATCH
   **/
  @ApiModelProperty(value = "A boolean used to tell whether or not to set this presence source as the primary on a PATCH")
  public Boolean getPrimary() {
    return primary;
  }
  public void setPrimary(Boolean primary) {
    this.primary = primary;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OrganizationPresence getPresenceDefinition() {
    return presenceDefinition;
  }
  public void setPresenceDefinition(OrganizationPresence presenceDefinition) {
    this.presenceDefinition = presenceDefinition;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getModifiedDate() {
    return modifiedDate;
  }
  public void setModifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
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
    UserPresence userPresence = (UserPresence) o;
    return Objects.equals(id, userPresence.id) &&
        Objects.equals(name, userPresence.name) &&
        Objects.equals(source, userPresence.source) &&
        Objects.equals(primary, userPresence.primary) &&
        Objects.equals(presenceDefinition, userPresence.presenceDefinition) &&
        Objects.equals(message, userPresence.message) &&
        Objects.equals(modifiedDate, userPresence.modifiedDate) &&
        Objects.equals(selfUri, userPresence.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, source, primary, presenceDefinition, message, modifiedDate, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPresence {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    presenceDefinition: ").append(toIndentedString(presenceDefinition)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
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
