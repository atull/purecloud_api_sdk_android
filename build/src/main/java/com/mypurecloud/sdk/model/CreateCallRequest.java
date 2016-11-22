package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.Destination;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class CreateCallRequest  implements Serializable {
  
  @SerializedName("phoneNumber")
  private String phoneNumber = null;

  @SerializedName("callFromQueueId")
  private String callFromQueueId = null;

  @SerializedName("callQueueId")
  private String callQueueId = null;

  @SerializedName("callUserId")
  private String callUserId = null;

  @SerializedName("priority")
  private Integer priority = null;

  @SerializedName("languageId")
  private String languageId = null;

  @SerializedName("routingSkillsIds")
  private List<String> routingSkillsIds = new ArrayList<String>();

  @SerializedName("conversationIds")
  private List<String> conversationIds = new ArrayList<String>();

  @SerializedName("participants")
  private List<Destination> participants = new ArrayList<Destination>();

  /**
   * The phone number to dial.
   **/
  @ApiModelProperty(value = "The phone number to dial.")
  public String getPhoneNumber() {
    return phoneNumber;
  }
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  /**
   * The queue ID to call on behalf of.
   **/
  @ApiModelProperty(value = "The queue ID to call on behalf of.")
  public String getCallFromQueueId() {
    return callFromQueueId;
  }
  public void setCallFromQueueId(String callFromQueueId) {
    this.callFromQueueId = callFromQueueId;
  }

  /**
   * The queue ID to call.
   **/
  @ApiModelProperty(value = "The queue ID to call.")
  public String getCallQueueId() {
    return callQueueId;
  }
  public void setCallQueueId(String callQueueId) {
    this.callQueueId = callQueueId;
  }

  /**
   * The user ID to call.
   **/
  @ApiModelProperty(value = "The user ID to call.")
  public String getCallUserId() {
    return callUserId;
  }
  public void setCallUserId(String callUserId) {
    this.callUserId = callUserId;
  }

  /**
   * The priority to assign to this call (if calling a queue).
   **/
  @ApiModelProperty(value = "The priority to assign to this call (if calling a queue).")
  public Integer getPriority() {
    return priority;
  }
  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  /**
   * The language skill ID to use for routing this call (if calling a queue).
   **/
  @ApiModelProperty(value = "The language skill ID to use for routing this call (if calling a queue).")
  public String getLanguageId() {
    return languageId;
  }
  public void setLanguageId(String languageId) {
    this.languageId = languageId;
  }

  /**
   * The skill ID's to use for routing this call (if calling a queue).
   **/
  @ApiModelProperty(value = "The skill ID's to use for routing this call (if calling a queue).")
  public List<String> getRoutingSkillsIds() {
    return routingSkillsIds;
  }
  public void setRoutingSkillsIds(List<String> routingSkillsIds) {
    this.routingSkillsIds = routingSkillsIds;
  }

  /**
   * The list of existing call conversations to merge into a new ad-hoc conference.
   **/
  @ApiModelProperty(value = "The list of existing call conversations to merge into a new ad-hoc conference.")
  public List<String> getConversationIds() {
    return conversationIds;
  }
  public void setConversationIds(List<String> conversationIds) {
    this.conversationIds = conversationIds;
  }

  /**
   * The list of participants to call to create a new ad-hoc conference.
   **/
  @ApiModelProperty(value = "The list of participants to call to create a new ad-hoc conference.")
  public List<Destination> getParticipants() {
    return participants;
  }
  public void setParticipants(List<Destination> participants) {
    this.participants = participants;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCallRequest createCallRequest = (CreateCallRequest) o;
    return Objects.equals(phoneNumber, createCallRequest.phoneNumber) &&
        Objects.equals(callFromQueueId, createCallRequest.callFromQueueId) &&
        Objects.equals(callQueueId, createCallRequest.callQueueId) &&
        Objects.equals(callUserId, createCallRequest.callUserId) &&
        Objects.equals(priority, createCallRequest.priority) &&
        Objects.equals(languageId, createCallRequest.languageId) &&
        Objects.equals(routingSkillsIds, createCallRequest.routingSkillsIds) &&
        Objects.equals(conversationIds, createCallRequest.conversationIds) &&
        Objects.equals(participants, createCallRequest.participants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, callFromQueueId, callQueueId, callUserId, priority, languageId, routingSkillsIds, conversationIds, participants);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCallRequest {\n");
    
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    callFromQueueId: ").append(toIndentedString(callFromQueueId)).append("\n");
    sb.append("    callQueueId: ").append(toIndentedString(callQueueId)).append("\n");
    sb.append("    callUserId: ").append(toIndentedString(callUserId)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    languageId: ").append(toIndentedString(languageId)).append("\n");
    sb.append("    routingSkillsIds: ").append(toIndentedString(routingSkillsIds)).append("\n");
    sb.append("    conversationIds: ").append(toIndentedString(conversationIds)).append("\n");
    sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
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
