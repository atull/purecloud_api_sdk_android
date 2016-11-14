package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.UserConversationSummaryNotificationCall;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class UserConversationSummaryNotification  implements Serializable {
  
  @SerializedName("userId")
  private String userId = null;

  @SerializedName("call")
  private UserConversationSummaryNotificationCall call = null;

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
  public UserConversationSummaryNotificationCall getCall() {
    return call;
  }
  public void setCall(UserConversationSummaryNotificationCall call) {
    this.call = call;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserConversationSummaryNotification userConversationSummaryNotification = (UserConversationSummaryNotification) o;
    return Objects.equals(userId, userConversationSummaryNotification.userId) &&
        Objects.equals(call, userConversationSummaryNotification.call);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, call);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserConversationSummaryNotification {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    call: ").append(toIndentedString(call)).append("\n");
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
