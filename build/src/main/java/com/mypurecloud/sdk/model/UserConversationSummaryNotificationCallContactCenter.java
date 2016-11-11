package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class UserConversationSummaryNotificationCallContactCenter  implements Serializable {
  
  @SerializedName("active")
  private Integer active = null;

  @SerializedName("acw")
  private Integer acw = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getActive() {
    return active;
  }
  public void setActive(Integer active) {
    this.active = active;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getAcw() {
    return acw;
  }
  public void setAcw(Integer acw) {
    this.acw = acw;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserConversationSummaryNotificationCallContactCenter userConversationSummaryNotificationCallContactCenter = (UserConversationSummaryNotificationCallContactCenter) o;
    return Objects.equals(active, userConversationSummaryNotificationCallContactCenter.active) &&
        Objects.equals(acw, userConversationSummaryNotificationCallContactCenter.acw);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, acw);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserConversationSummaryNotificationCallContactCenter {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    acw: ").append(toIndentedString(acw)).append("\n");
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
