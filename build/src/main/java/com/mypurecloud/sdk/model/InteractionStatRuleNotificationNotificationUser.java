package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class InteractionStatRuleNotificationNotificationUser  implements Serializable {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("displayName")
  private String displayName = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InteractionStatRuleNotificationNotificationUser interactionStatRuleNotificationNotificationUser = (InteractionStatRuleNotificationNotificationUser) o;
    return Objects.equals(id, interactionStatRuleNotificationNotificationUser.id) &&
        Objects.equals(displayName, interactionStatRuleNotificationNotificationUser.displayName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, displayName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteractionStatRuleNotificationNotificationUser {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
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
