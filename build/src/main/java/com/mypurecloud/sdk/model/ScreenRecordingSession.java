package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.Conversation;
import com.mypurecloud.sdk.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class ScreenRecordingSession  implements Serializable {
  
  @SerializedName("user")
  private User user = null;

  @SerializedName("participantId")
  private String participantId = null;

  @SerializedName("conversation")
  private Conversation conversation = null;

  @SerializedName("startTime")
  private Date startTime = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public User getUser() {
    return user;
  }
  public void setUser(User user) {
    this.user = user;
  }

  /**
   * The id of the participant whose screen is being recorded on the conversation
   **/
  @ApiModelProperty(value = "The id of the participant whose screen is being recorded on the conversation")
  public String getParticipantId() {
    return participantId;
  }
  public void setParticipantId(String participantId) {
    this.participantId = participantId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Conversation getConversation() {
    return conversation;
  }
  public void setConversation(Conversation conversation) {
    this.conversation = conversation;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getStartTime() {
    return startTime;
  }
  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScreenRecordingSession screenRecordingSession = (ScreenRecordingSession) o;
    return Objects.equals(user, screenRecordingSession.user) &&
        Objects.equals(participantId, screenRecordingSession.participantId) &&
        Objects.equals(conversation, screenRecordingSession.conversation) &&
        Objects.equals(startTime, screenRecordingSession.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, participantId, conversation, startTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScreenRecordingSession {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    participantId: ").append(toIndentedString(participantId)).append("\n");
    sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
