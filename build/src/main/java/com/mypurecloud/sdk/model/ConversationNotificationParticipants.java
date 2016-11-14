package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.ConversationNotificationCallbacks;
import com.mypurecloud.sdk.model.ConversationNotificationCalls;
import com.mypurecloud.sdk.model.ConversationNotificationChats;
import com.mypurecloud.sdk.model.ConversationNotificationCobrowses;
import com.mypurecloud.sdk.model.ConversationNotificationEmails;
import com.mypurecloud.sdk.model.ConversationNotificationSocialExpressions;
import com.mypurecloud.sdk.model.ConversationNotificationVideos;
import com.mypurecloud.sdk.model.ConversationNotificationWrapup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class ConversationNotificationParticipants  implements Serializable {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("connectedTime")
  private Integer connectedTime = null;

  @SerializedName("endTime")
  private Integer endTime = null;

  @SerializedName("userId")
  private String userId = null;

  @SerializedName("externalContactId")
  private String externalContactId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("queueId")
  private String queueId = null;

  @SerializedName("groupId")
  private String groupId = null;

  @SerializedName("purpose")
  private String purpose = null;

  @SerializedName("consultParticipantId")
  private String consultParticipantId = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("wrapupRequired")
  private Boolean wrapupRequired = null;

  @SerializedName("wrapupExpected")
  private Boolean wrapupExpected = null;

  @SerializedName("wrapupPrompt")
  private String wrapupPrompt = null;

  @SerializedName("wrapupTimeoutMs")
  private Integer wrapupTimeoutMs = null;

  @SerializedName("wrapup")
  private ConversationNotificationWrapup wrapup = null;

  @SerializedName("monitoredParticipantId")
  private String monitoredParticipantId = null;

  @SerializedName("attributes")
  private Map<String, String> attributes = new HashMap<String, String>();

  @SerializedName("calls")
  private List<ConversationNotificationCalls> calls = new ArrayList<ConversationNotificationCalls>();

  @SerializedName("callbacks")
  private List<ConversationNotificationCallbacks> callbacks = new ArrayList<ConversationNotificationCallbacks>();

  @SerializedName("chats")
  private List<ConversationNotificationChats> chats = new ArrayList<ConversationNotificationChats>();

  @SerializedName("cobrowses")
  private List<ConversationNotificationCobrowses> cobrowses = new ArrayList<ConversationNotificationCobrowses>();

  @SerializedName("emails")
  private List<ConversationNotificationEmails> emails = new ArrayList<ConversationNotificationEmails>();

  @SerializedName("socialExpressions")
  private List<ConversationNotificationSocialExpressions> socialExpressions = new ArrayList<ConversationNotificationSocialExpressions>();

  @SerializedName("videos")
  private List<ConversationNotificationVideos> videos = new ArrayList<ConversationNotificationVideos>();

  @SerializedName("additionalProperties")
  private Object additionalProperties = null;

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
  public Integer getConnectedTime() {
    return connectedTime;
  }
  public void setConnectedTime(Integer connectedTime) {
    this.connectedTime = connectedTime;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getEndTime() {
    return endTime;
  }
  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

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
  public String getExternalContactId() {
    return externalContactId;
  }
  public void setExternalContactId(String externalContactId) {
    this.externalContactId = externalContactId;
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
  public String getQueueId() {
    return queueId;
  }
  public void setQueueId(String queueId) {
    this.queueId = queueId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getGroupId() {
    return groupId;
  }
  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPurpose() {
    return purpose;
  }
  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getConsultParticipantId() {
    return consultParticipantId;
  }
  public void setConsultParticipantId(String consultParticipantId) {
    this.consultParticipantId = consultParticipantId;
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

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getWrapupRequired() {
    return wrapupRequired;
  }
  public void setWrapupRequired(Boolean wrapupRequired) {
    this.wrapupRequired = wrapupRequired;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getWrapupExpected() {
    return wrapupExpected;
  }
  public void setWrapupExpected(Boolean wrapupExpected) {
    this.wrapupExpected = wrapupExpected;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getWrapupPrompt() {
    return wrapupPrompt;
  }
  public void setWrapupPrompt(String wrapupPrompt) {
    this.wrapupPrompt = wrapupPrompt;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getWrapupTimeoutMs() {
    return wrapupTimeoutMs;
  }
  public void setWrapupTimeoutMs(Integer wrapupTimeoutMs) {
    this.wrapupTimeoutMs = wrapupTimeoutMs;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConversationNotificationWrapup getWrapup() {
    return wrapup;
  }
  public void setWrapup(ConversationNotificationWrapup wrapup) {
    this.wrapup = wrapup;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getMonitoredParticipantId() {
    return monitoredParticipantId;
  }
  public void setMonitoredParticipantId(String monitoredParticipantId) {
    this.monitoredParticipantId = monitoredParticipantId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Map<String, String> getAttributes() {
    return attributes;
  }
  public void setAttributes(Map<String, String> attributes) {
    this.attributes = attributes;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<ConversationNotificationCalls> getCalls() {
    return calls;
  }
  public void setCalls(List<ConversationNotificationCalls> calls) {
    this.calls = calls;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<ConversationNotificationCallbacks> getCallbacks() {
    return callbacks;
  }
  public void setCallbacks(List<ConversationNotificationCallbacks> callbacks) {
    this.callbacks = callbacks;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<ConversationNotificationChats> getChats() {
    return chats;
  }
  public void setChats(List<ConversationNotificationChats> chats) {
    this.chats = chats;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<ConversationNotificationCobrowses> getCobrowses() {
    return cobrowses;
  }
  public void setCobrowses(List<ConversationNotificationCobrowses> cobrowses) {
    this.cobrowses = cobrowses;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<ConversationNotificationEmails> getEmails() {
    return emails;
  }
  public void setEmails(List<ConversationNotificationEmails> emails) {
    this.emails = emails;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<ConversationNotificationSocialExpressions> getSocialExpressions() {
    return socialExpressions;
  }
  public void setSocialExpressions(List<ConversationNotificationSocialExpressions> socialExpressions) {
    this.socialExpressions = socialExpressions;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<ConversationNotificationVideos> getVideos() {
    return videos;
  }
  public void setVideos(List<ConversationNotificationVideos> videos) {
    this.videos = videos;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Object getAdditionalProperties() {
    return additionalProperties;
  }
  public void setAdditionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationNotificationParticipants conversationNotificationParticipants = (ConversationNotificationParticipants) o;
    return Objects.equals(id, conversationNotificationParticipants.id) &&
        Objects.equals(connectedTime, conversationNotificationParticipants.connectedTime) &&
        Objects.equals(endTime, conversationNotificationParticipants.endTime) &&
        Objects.equals(userId, conversationNotificationParticipants.userId) &&
        Objects.equals(externalContactId, conversationNotificationParticipants.externalContactId) &&
        Objects.equals(name, conversationNotificationParticipants.name) &&
        Objects.equals(queueId, conversationNotificationParticipants.queueId) &&
        Objects.equals(groupId, conversationNotificationParticipants.groupId) &&
        Objects.equals(purpose, conversationNotificationParticipants.purpose) &&
        Objects.equals(consultParticipantId, conversationNotificationParticipants.consultParticipantId) &&
        Objects.equals(address, conversationNotificationParticipants.address) &&
        Objects.equals(wrapupRequired, conversationNotificationParticipants.wrapupRequired) &&
        Objects.equals(wrapupExpected, conversationNotificationParticipants.wrapupExpected) &&
        Objects.equals(wrapupPrompt, conversationNotificationParticipants.wrapupPrompt) &&
        Objects.equals(wrapupTimeoutMs, conversationNotificationParticipants.wrapupTimeoutMs) &&
        Objects.equals(wrapup, conversationNotificationParticipants.wrapup) &&
        Objects.equals(monitoredParticipantId, conversationNotificationParticipants.monitoredParticipantId) &&
        Objects.equals(attributes, conversationNotificationParticipants.attributes) &&
        Objects.equals(calls, conversationNotificationParticipants.calls) &&
        Objects.equals(callbacks, conversationNotificationParticipants.callbacks) &&
        Objects.equals(chats, conversationNotificationParticipants.chats) &&
        Objects.equals(cobrowses, conversationNotificationParticipants.cobrowses) &&
        Objects.equals(emails, conversationNotificationParticipants.emails) &&
        Objects.equals(socialExpressions, conversationNotificationParticipants.socialExpressions) &&
        Objects.equals(videos, conversationNotificationParticipants.videos) &&
        Objects.equals(additionalProperties, conversationNotificationParticipants.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, connectedTime, endTime, userId, externalContactId, name, queueId, groupId, purpose, consultParticipantId, address, wrapupRequired, wrapupExpected, wrapupPrompt, wrapupTimeoutMs, wrapup, monitoredParticipantId, attributes, calls, callbacks, chats, cobrowses, emails, socialExpressions, videos, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationNotificationParticipants {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    connectedTime: ").append(toIndentedString(connectedTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    externalContactId: ").append(toIndentedString(externalContactId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    consultParticipantId: ").append(toIndentedString(consultParticipantId)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    wrapupRequired: ").append(toIndentedString(wrapupRequired)).append("\n");
    sb.append("    wrapupExpected: ").append(toIndentedString(wrapupExpected)).append("\n");
    sb.append("    wrapupPrompt: ").append(toIndentedString(wrapupPrompt)).append("\n");
    sb.append("    wrapupTimeoutMs: ").append(toIndentedString(wrapupTimeoutMs)).append("\n");
    sb.append("    wrapup: ").append(toIndentedString(wrapup)).append("\n");
    sb.append("    monitoredParticipantId: ").append(toIndentedString(monitoredParticipantId)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    calls: ").append(toIndentedString(calls)).append("\n");
    sb.append("    callbacks: ").append(toIndentedString(callbacks)).append("\n");
    sb.append("    chats: ").append(toIndentedString(chats)).append("\n");
    sb.append("    cobrowses: ").append(toIndentedString(cobrowses)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    socialExpressions: ").append(toIndentedString(socialExpressions)).append("\n");
    sb.append("    videos: ").append(toIndentedString(videos)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
