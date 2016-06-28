package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Call;
import io.swagger.client.model.Callback;
import io.swagger.client.model.ConversationChat;
import io.swagger.client.model.Email;
import io.swagger.client.model.Evaluation;
import io.swagger.client.model.SocialExpression;
import io.swagger.client.model.Video;
import io.swagger.client.model.Wrapup;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;





public class Participant   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("startTime")
  private Date startTime = null;

  @SerializedName("endTime")
  private Date endTime = null;

  @SerializedName("connectedTime")
  private Date connectedTime = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("userUri")
  private String userUri = null;

  @SerializedName("userId")
  private String userId = null;

  @SerializedName("externalContactId")
  private String externalContactId = null;

  @SerializedName("queueId")
  private String queueId = null;

  @SerializedName("groupId")
  private String groupId = null;

  @SerializedName("queueName")
  private String queueName = null;

  @SerializedName("purpose")
  private String purpose = null;

  @SerializedName("participantType")
  private String participantType = null;

  @SerializedName("consultParticipantId")
  private String consultParticipantId = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("ani")
  private String ani = null;

  @SerializedName("dnis")
  private String dnis = null;

  @SerializedName("locale")
  private String locale = null;

  @SerializedName("wrapupRequired")
  private Boolean wrapupRequired = false;


  /**
   * Gets or Sets wrapupPrompt
   */
  public enum WrapupPromptEnum {
    @SerializedName("MANDATORY")
    MANDATORY("MANDATORY"),

    @SerializedName("OPTIONAL")
    OPTIONAL("OPTIONAL"),

    @SerializedName("TIMEOUT")
    TIMEOUT("TIMEOUT"),

    @SerializedName("FORCED_TIMEOUT")
    FORCED_TIMEOUT("FORCED_TIMEOUT");

    private String value;

    WrapupPromptEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("wrapupPrompt")
  private WrapupPromptEnum wrapupPrompt = null;

  @SerializedName("wrapupTimeoutMs")
  private Integer wrapupTimeoutMs = null;

  @SerializedName("wrapupSkipped")
  private Boolean wrapupSkipped = false;

  @SerializedName("wrapup")
  private Wrapup wrapup = null;

  @SerializedName("monitoredParticipantId")
  private String monitoredParticipantId = null;

  @SerializedName("attributes")
  private Map<String, String> attributes = new HashMap<String, String>();

  @SerializedName("calls")
  private List<Call> calls = new ArrayList<Call>();

  @SerializedName("callbacks")
  private List<Callback> callbacks = new ArrayList<Callback>();

  @SerializedName("chats")
  private List<ConversationChat> chats = new ArrayList<ConversationChat>();

  @SerializedName("emails")
  private List<Email> emails = new ArrayList<Email>();

  @SerializedName("socialExpressions")
  private List<SocialExpression> socialExpressions = new ArrayList<SocialExpression>();

  @SerializedName("videos")
  private List<Video> videos = new ArrayList<Video>();

  @SerializedName("evaluations")
  private List<Evaluation> evaluations = new ArrayList<Evaluation>();

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
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getStartTime() {
    return startTime;
  }
  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getEndTime() {
    return endTime;
  }
  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getConnectedTime() {
    return connectedTime;
  }
  public void setConnectedTime(Date connectedTime) {
    this.connectedTime = connectedTime;
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
  public String getUserUri() {
    return userUri;
  }
  public void setUserUri(String userUri) {
    this.userUri = userUri;
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
  public String getQueueName() {
    return queueName;
  }
  public void setQueueName(String queueName) {
    this.queueName = queueName;
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
  public String getParticipantType() {
    return participantType;
  }
  public void setParticipantType(String participantType) {
    this.participantType = participantType;
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
  public String getAni() {
    return ani;
  }
  public void setAni(String ani) {
    this.ani = ani;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDnis() {
    return dnis;
  }
  public void setDnis(String dnis) {
    this.dnis = dnis;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getLocale() {
    return locale;
  }
  public void setLocale(String locale) {
    this.locale = locale;
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
  public WrapupPromptEnum getWrapupPrompt() {
    return wrapupPrompt;
  }
  public void setWrapupPrompt(WrapupPromptEnum wrapupPrompt) {
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
  public Boolean getWrapupSkipped() {
    return wrapupSkipped;
  }
  public void setWrapupSkipped(Boolean wrapupSkipped) {
    this.wrapupSkipped = wrapupSkipped;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Wrapup getWrapup() {
    return wrapup;
  }
  public void setWrapup(Wrapup wrapup) {
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
  public List<Call> getCalls() {
    return calls;
  }
  public void setCalls(List<Call> calls) {
    this.calls = calls;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Callback> getCallbacks() {
    return callbacks;
  }
  public void setCallbacks(List<Callback> callbacks) {
    this.callbacks = callbacks;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<ConversationChat> getChats() {
    return chats;
  }
  public void setChats(List<ConversationChat> chats) {
    this.chats = chats;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Email> getEmails() {
    return emails;
  }
  public void setEmails(List<Email> emails) {
    this.emails = emails;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<SocialExpression> getSocialExpressions() {
    return socialExpressions;
  }
  public void setSocialExpressions(List<SocialExpression> socialExpressions) {
    this.socialExpressions = socialExpressions;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Video> getVideos() {
    return videos;
  }
  public void setVideos(List<Video> videos) {
    this.videos = videos;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Evaluation> getEvaluations() {
    return evaluations;
  }
  public void setEvaluations(List<Evaluation> evaluations) {
    this.evaluations = evaluations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Participant participant = (Participant) o;
    return Objects.equals(id, participant.id) &&
        Objects.equals(startTime, participant.startTime) &&
        Objects.equals(endTime, participant.endTime) &&
        Objects.equals(connectedTime, participant.connectedTime) &&
        Objects.equals(name, participant.name) &&
        Objects.equals(userUri, participant.userUri) &&
        Objects.equals(userId, participant.userId) &&
        Objects.equals(externalContactId, participant.externalContactId) &&
        Objects.equals(queueId, participant.queueId) &&
        Objects.equals(groupId, participant.groupId) &&
        Objects.equals(queueName, participant.queueName) &&
        Objects.equals(purpose, participant.purpose) &&
        Objects.equals(participantType, participant.participantType) &&
        Objects.equals(consultParticipantId, participant.consultParticipantId) &&
        Objects.equals(address, participant.address) &&
        Objects.equals(ani, participant.ani) &&
        Objects.equals(dnis, participant.dnis) &&
        Objects.equals(locale, participant.locale) &&
        Objects.equals(wrapupRequired, participant.wrapupRequired) &&
        Objects.equals(wrapupPrompt, participant.wrapupPrompt) &&
        Objects.equals(wrapupTimeoutMs, participant.wrapupTimeoutMs) &&
        Objects.equals(wrapupSkipped, participant.wrapupSkipped) &&
        Objects.equals(wrapup, participant.wrapup) &&
        Objects.equals(monitoredParticipantId, participant.monitoredParticipantId) &&
        Objects.equals(attributes, participant.attributes) &&
        Objects.equals(calls, participant.calls) &&
        Objects.equals(callbacks, participant.callbacks) &&
        Objects.equals(chats, participant.chats) &&
        Objects.equals(emails, participant.emails) &&
        Objects.equals(socialExpressions, participant.socialExpressions) &&
        Objects.equals(videos, participant.videos) &&
        Objects.equals(evaluations, participant.evaluations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, startTime, endTime, connectedTime, name, userUri, userId, externalContactId, queueId, groupId, queueName, purpose, participantType, consultParticipantId, address, ani, dnis, locale, wrapupRequired, wrapupPrompt, wrapupTimeoutMs, wrapupSkipped, wrapup, monitoredParticipantId, attributes, calls, callbacks, chats, emails, socialExpressions, videos, evaluations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Participant {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    connectedTime: ").append(toIndentedString(connectedTime)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    userUri: ").append(toIndentedString(userUri)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    externalContactId: ").append(toIndentedString(externalContactId)).append("\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    participantType: ").append(toIndentedString(participantType)).append("\n");
    sb.append("    consultParticipantId: ").append(toIndentedString(consultParticipantId)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    ani: ").append(toIndentedString(ani)).append("\n");
    sb.append("    dnis: ").append(toIndentedString(dnis)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    wrapupRequired: ").append(toIndentedString(wrapupRequired)).append("\n");
    sb.append("    wrapupPrompt: ").append(toIndentedString(wrapupPrompt)).append("\n");
    sb.append("    wrapupTimeoutMs: ").append(toIndentedString(wrapupTimeoutMs)).append("\n");
    sb.append("    wrapupSkipped: ").append(toIndentedString(wrapupSkipped)).append("\n");
    sb.append("    wrapup: ").append(toIndentedString(wrapup)).append("\n");
    sb.append("    monitoredParticipantId: ").append(toIndentedString(monitoredParticipantId)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    calls: ").append(toIndentedString(calls)).append("\n");
    sb.append("    callbacks: ").append(toIndentedString(callbacks)).append("\n");
    sb.append("    chats: ").append(toIndentedString(chats)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    socialExpressions: ").append(toIndentedString(socialExpressions)).append("\n");
    sb.append("    videos: ").append(toIndentedString(videos)).append("\n");
    sb.append("    evaluations: ").append(toIndentedString(evaluations)).append("\n");
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
