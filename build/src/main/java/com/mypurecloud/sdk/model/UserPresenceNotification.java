package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.UserPresenceNotificationPresenceDefinition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class UserPresenceNotification  implements Serializable {
  
  @SerializedName("source")
  private String source = null;

  @SerializedName("presenceDefinition")
  private UserPresenceNotificationPresenceDefinition presenceDefinition = null;

  @SerializedName("primary")
  private Boolean primary = null;

  @SerializedName("message")
  private String message = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public UserPresenceNotificationPresenceDefinition getPresenceDefinition() {
    return presenceDefinition;
  }
  public void setPresenceDefinition(UserPresenceNotificationPresenceDefinition presenceDefinition) {
    this.presenceDefinition = presenceDefinition;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getPrimary() {
    return primary;
  }
  public void setPrimary(Boolean primary) {
    this.primary = primary;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserPresenceNotification userPresenceNotification = (UserPresenceNotification) o;
    return Objects.equals(source, userPresenceNotification.source) &&
        Objects.equals(presenceDefinition, userPresenceNotification.presenceDefinition) &&
        Objects.equals(primary, userPresenceNotification.primary) &&
        Objects.equals(message, userPresenceNotification.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, presenceDefinition, primary, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPresenceNotification {\n");
    
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    presenceDefinition: ").append(toIndentedString(presenceDefinition)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
