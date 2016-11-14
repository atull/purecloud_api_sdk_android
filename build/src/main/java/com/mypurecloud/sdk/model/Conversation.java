package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.Participant;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class Conversation  implements Serializable {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("startTime")
  private Date startTime = null;

  @SerializedName("endTime")
  private Date endTime = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("participants")
  private List<Participant> participants = new ArrayList<Participant>();

  @SerializedName("conversationIds")
  private List<String> conversationIds = new ArrayList<String>();

  @SerializedName("maxParticipants")
  private Integer maxParticipants = null;


  /**
   * On update, 'paused' initiates a secure pause, 'active' resumes any paused recordings; otherwise indicates state of conversation recording.
   */
  public enum RecordingStateEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("ACTIVE")
    ACTIVE("ACTIVE"),

    @SerializedName("PAUSED")
    PAUSED("PAUSED"),

    @SerializedName("NONE")
    NONE("NONE");

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
   * The conversation's state.  Values can be: 'disconnected'
   */
  public enum StateEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("ALERTING")
    ALERTING("ALERTING"),

    @SerializedName("DIALING")
    DIALING("DIALING"),

    @SerializedName("CONTACTING")
    CONTACTING("CONTACTING"),

    @SerializedName("OFFERING")
    OFFERING("OFFERING"),

    @SerializedName("CONNECTED")
    CONNECTED("CONNECTED"),

    @SerializedName("DISCONNECTED")
    DISCONNECTED("DISCONNECTED"),

    @SerializedName("TERMINATED")
    TERMINATED("TERMINATED"),

    @SerializedName("CONVERTING")
    CONVERTING("CONVERTING"),

    @SerializedName("UPLOADING")
    UPLOADING("UPLOADING"),

    @SerializedName("TRANSMITTING")
    TRANSMITTING("TRANSMITTING"),

    @SerializedName("NONE")
    NONE("NONE");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("state")
  private StateEnum state = null;

  @SerializedName("selfUri")
  private String selfUri = null;

  /**
   * The globally unique identifier for the object.
   **/
  @ApiModelProperty(value = "The globally unique identifier for the object.")
  public String getId() {
    return id;
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
   * The time when the conversation started. This will be the time when the first participant joined the conversation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(required = true, value = "The time when the conversation started. This will be the time when the first participant joined the conversation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getStartTime() {
    return startTime;
  }
  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }

  /**
   * The time when the conversation ended. This will be the time when the last participant left the conversation, or null when the conversation is still active. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "The time when the conversation ended. This will be the time when the last participant left the conversation, or null when the conversation is still active. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getEndTime() {
    return endTime;
  }
  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }

  /**
   * The address of the conversation as seen from an external participant. For phone calls this will be the DNIS for inbound calls and the ANI for outbound calls. For other media types this will be the address of the destination participant for inbound and the address of the initiating participant for outbound.
   **/
  @ApiModelProperty(value = "The address of the conversation as seen from an external participant. For phone calls this will be the DNIS for inbound calls and the ANI for outbound calls. For other media types this will be the address of the destination participant for inbound and the address of the initiating participant for outbound.")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * The list of all participants in the conversation.
   **/
  @ApiModelProperty(required = true, value = "The list of all participants in the conversation.")
  public List<Participant> getParticipants() {
    return participants;
  }
  public void setParticipants(List<Participant> participants) {
    this.participants = participants;
  }

  /**
   * A list of conversations to merge into this conversation to create a conference. This field is null except when being used to create a conference.
   **/
  @ApiModelProperty(value = "A list of conversations to merge into this conversation to create a conference. This field is null except when being used to create a conference.")
  public List<String> getConversationIds() {
    return conversationIds;
  }
  public void setConversationIds(List<String> conversationIds) {
    this.conversationIds = conversationIds;
  }

  /**
   * If this is a conference conversation, then this field indicates the maximum number of participants allowed to participant in the conference.
   **/
  @ApiModelProperty(value = "If this is a conference conversation, then this field indicates the maximum number of participants allowed to participant in the conference.")
  public Integer getMaxParticipants() {
    return maxParticipants;
  }
  public void setMaxParticipants(Integer maxParticipants) {
    this.maxParticipants = maxParticipants;
  }

  /**
   * On update, 'paused' initiates a secure pause, 'active' resumes any paused recordings; otherwise indicates state of conversation recording.
   **/
  @ApiModelProperty(value = "On update, 'paused' initiates a secure pause, 'active' resumes any paused recordings; otherwise indicates state of conversation recording.")
  public RecordingStateEnum getRecordingState() {
    return recordingState;
  }
  public void setRecordingState(RecordingStateEnum recordingState) {
    this.recordingState = recordingState;
  }

  /**
   * The conversation's state.  Values can be: 'disconnected'
   **/
  @ApiModelProperty(value = "The conversation's state.  Values can be: 'disconnected'")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }

  /**
   * The URI for this object
   **/
  @ApiModelProperty(value = "The URI for this object")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Conversation conversation = (Conversation) o;
    return Objects.equals(id, conversation.id) &&
        Objects.equals(name, conversation.name) &&
        Objects.equals(startTime, conversation.startTime) &&
        Objects.equals(endTime, conversation.endTime) &&
        Objects.equals(address, conversation.address) &&
        Objects.equals(participants, conversation.participants) &&
        Objects.equals(conversationIds, conversation.conversationIds) &&
        Objects.equals(maxParticipants, conversation.maxParticipants) &&
        Objects.equals(recordingState, conversation.recordingState) &&
        Objects.equals(state, conversation.state) &&
        Objects.equals(selfUri, conversation.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, startTime, endTime, address, participants, conversationIds, maxParticipants, recordingState, state, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Conversation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
    sb.append("    conversationIds: ").append(toIndentedString(conversationIds)).append("\n");
    sb.append("    maxParticipants: ").append(toIndentedString(maxParticipants)).append("\n");
    sb.append("    recordingState: ").append(toIndentedString(recordingState)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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
