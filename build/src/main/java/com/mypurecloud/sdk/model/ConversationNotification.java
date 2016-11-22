package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.ConversationNotificationParticipants;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class ConversationNotification  implements Serializable {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("maxParticipants")
  private Integer maxParticipants = null;

  @SerializedName("participants")
  private List<ConversationNotificationParticipants> participants = new ArrayList<ConversationNotificationParticipants>();

  @SerializedName("recordingState")
  private String recordingState = null;

  @SerializedName("address")
  private String address = null;

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
  public Integer getMaxParticipants() {
    return maxParticipants;
  }
  public void setMaxParticipants(Integer maxParticipants) {
    this.maxParticipants = maxParticipants;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<ConversationNotificationParticipants> getParticipants() {
    return participants;
  }
  public void setParticipants(List<ConversationNotificationParticipants> participants) {
    this.participants = participants;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getRecordingState() {
    return recordingState;
  }
  public void setRecordingState(String recordingState) {
    this.recordingState = recordingState;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationNotification conversationNotification = (ConversationNotification) o;
    return Objects.equals(id, conversationNotification.id) &&
        Objects.equals(maxParticipants, conversationNotification.maxParticipants) &&
        Objects.equals(participants, conversationNotification.participants) &&
        Objects.equals(recordingState, conversationNotification.recordingState) &&
        Objects.equals(address, conversationNotification.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, maxParticipants, participants, recordingState, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationNotification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    maxParticipants: ").append(toIndentedString(maxParticipants)).append("\n");
    sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
    sb.append("    recordingState: ").append(toIndentedString(recordingState)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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
