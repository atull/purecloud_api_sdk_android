package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.CallConversationNotificationParticipants;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class CallConversationNotification  implements Serializable {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("participants")
  private List<CallConversationNotificationParticipants> participants = new ArrayList<CallConversationNotificationParticipants>();

  @SerializedName("otherMediaUris")
  private List<String> otherMediaUris = new ArrayList<String>();


  /**
   * Gets or Sets recordingState
   */
  public enum RecordingStateEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("none")
    NONE("none"),

    @SerializedName("active")
    ACTIVE("active"),

    @SerializedName("paused")
    PAUSED("paused");

    private String value;

    RecordingStateEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("recordingState")
  private RecordingStateEnum recordingState = null;

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
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<CallConversationNotificationParticipants> getParticipants() {
    return participants;
  }
  public void setParticipants(List<CallConversationNotificationParticipants> participants) {
    this.participants = participants;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getOtherMediaUris() {
    return otherMediaUris;
  }
  public void setOtherMediaUris(List<String> otherMediaUris) {
    this.otherMediaUris = otherMediaUris;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public RecordingStateEnum getRecordingState() {
    return recordingState;
  }
  public void setRecordingState(RecordingStateEnum recordingState) {
    this.recordingState = recordingState;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallConversationNotification callConversationNotification = (CallConversationNotification) o;
    return Objects.equals(id, callConversationNotification.id) &&
        Objects.equals(name, callConversationNotification.name) &&
        Objects.equals(participants, callConversationNotification.participants) &&
        Objects.equals(otherMediaUris, callConversationNotification.otherMediaUris) &&
        Objects.equals(recordingState, callConversationNotification.recordingState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, participants, otherMediaUris, recordingState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallConversationNotification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
    sb.append("    otherMediaUris: ").append(toIndentedString(otherMediaUris)).append("\n");
    sb.append("    recordingState: ").append(toIndentedString(recordingState)).append("\n");
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
