package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class SubscriberResponse  implements Serializable {
  
  @SerializedName("messageReturned")
  private List<String> messageReturned = new ArrayList<String>();

  @SerializedName("status")
  private String status = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getMessageReturned() {
    return messageReturned;
  }
  public void setMessageReturned(List<String> messageReturned) {
    this.messageReturned = messageReturned;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriberResponse subscriberResponse = (SubscriberResponse) o;
    return Objects.equals(messageReturned, subscriberResponse.messageReturned) &&
        Objects.equals(status, subscriberResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageReturned, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriberResponse {\n");
    
    sb.append("    messageReturned: ").append(toIndentedString(messageReturned)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
