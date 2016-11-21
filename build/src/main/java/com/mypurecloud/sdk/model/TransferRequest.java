package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class TransferRequest  implements Serializable {
  
  @SerializedName("userId")
  private String userId = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("userName")
  private String userName = null;

  @SerializedName("queueId")
  private String queueId = null;

  @SerializedName("voicemail")
  private Boolean voicemail = false;

  /**
   * The user ID of the transfer target.
   **/
  @ApiModelProperty(value = "The user ID of the transfer target.")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  /**
   * The phone number or address of the transfer target.
   **/
  @ApiModelProperty(value = "The phone number or address of the transfer target.")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * The user name of the transfer target.
   **/
  @ApiModelProperty(value = "The user name of the transfer target.")
  public String getUserName() {
    return userName;
  }
  public void setUserName(String userName) {
    this.userName = userName;
  }

  /**
   * The queue ID of the transfer target.
   **/
  @ApiModelProperty(value = "The queue ID of the transfer target.")
  public String getQueueId() {
    return queueId;
  }
  public void setQueueId(String queueId) {
    this.queueId = queueId;
  }

  /**
   * If true, then transfer to the user's voicemail.
   **/
  @ApiModelProperty(value = "If true, then transfer to the user's voicemail.")
  public Boolean getVoicemail() {
    return voicemail;
  }
  public void setVoicemail(Boolean voicemail) {
    this.voicemail = voicemail;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferRequest transferRequest = (TransferRequest) o;
    return Objects.equals(userId, transferRequest.userId) &&
        Objects.equals(address, transferRequest.address) &&
        Objects.equals(userName, transferRequest.userName) &&
        Objects.equals(queueId, transferRequest.queueId) &&
        Objects.equals(voicemail, transferRequest.voicemail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, address, userName, queueId, voicemail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferRequest {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    voicemail: ").append(toIndentedString(voicemail)).append("\n");
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
