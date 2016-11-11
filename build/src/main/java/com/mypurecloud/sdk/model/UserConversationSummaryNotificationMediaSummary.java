package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.UserConversationSummaryNotificationCallContactCenter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class UserConversationSummaryNotificationMediaSummary  implements Serializable {
  
  @SerializedName("contactCenter")
  private UserConversationSummaryNotificationCallContactCenter contactCenter = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public UserConversationSummaryNotificationCallContactCenter getContactCenter() {
    return contactCenter;
  }
  public void setContactCenter(UserConversationSummaryNotificationCallContactCenter contactCenter) {
    this.contactCenter = contactCenter;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserConversationSummaryNotificationMediaSummary userConversationSummaryNotificationMediaSummary = (UserConversationSummaryNotificationMediaSummary) o;
    return Objects.equals(contactCenter, userConversationSummaryNotificationMediaSummary.contactCenter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactCenter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserConversationSummaryNotificationMediaSummary {\n");
    
    sb.append("    contactCenter: ").append(toIndentedString(contactCenter)).append("\n");
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
