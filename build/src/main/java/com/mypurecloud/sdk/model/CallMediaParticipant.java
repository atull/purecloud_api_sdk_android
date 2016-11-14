package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.ErrorBody;
import com.mypurecloud.sdk.model.FaxStatus;
import com.mypurecloud.sdk.model.UriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class CallMediaParticipant  implements Serializable {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("startTime")
  private Date startTime = null;

  @SerializedName("connectedTime")
  private Date connectedTime = null;

  @SerializedName("endTime")
  private Date endTime = null;

  @SerializedName("startHoldTime")
  private Date startHoldTime = null;

  @SerializedName("purpose")
  private String purpose = null;


  /**
   * The participant's state.  Values can be: 'alerting', 'connected', 'disconnected', 'dialing', 'contacting
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


  /**
   * The participant's direction.  Values can be: 'inbound' or 'outbound'
   */
  public enum DirectionEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("INBOUND")
    INBOUND("INBOUND"),

    @SerializedName("OUTBOUND")
    OUTBOUND("OUTBOUND");

    private String value;

    DirectionEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("direction")
  private DirectionEnum direction = null;


  /**
   * The reason the participant was disconnected from the conversation.
   */
  public enum DisconnectTypeEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("ENDPOINT")
    ENDPOINT("ENDPOINT"),

    @SerializedName("CLIENT")
    CLIENT("CLIENT"),

    @SerializedName("SYSTEM")
    SYSTEM("SYSTEM"),

    @SerializedName("TRANSFER")
    TRANSFER("TRANSFER"),

    @SerializedName("TRANSFER_CONFERENCE")
    TRANSFER_CONFERENCE("TRANSFER_CONFERENCE"),

    @SerializedName("TRANSFER_CONSULT")
    TRANSFER_CONSULT("TRANSFER_CONSULT"),

    @SerializedName("TRANSFER_FORWARD")
    TRANSFER_FORWARD("TRANSFER_FORWARD"),

    @SerializedName("TRANSPORT_FAILURE")
    TRANSPORT_FAILURE("TRANSPORT_FAILURE"),

    @SerializedName("ERROR")
    ERROR("ERROR"),

    @SerializedName("PEER")
    PEER("PEER"),

    @SerializedName("OTHER")
    OTHER("OTHER"),

    @SerializedName("SPAM")
    SPAM("SPAM");

    private String value;

    DisconnectTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("disconnectType")
  private DisconnectTypeEnum disconnectType = null;

  @SerializedName("held")
  private Boolean held = false;

  @SerializedName("wrapupRequired")
  private Boolean wrapupRequired = false;

  @SerializedName("wrapupPrompt")
  private String wrapupPrompt = null;

  @SerializedName("user")
  private UriReference user = null;

  @SerializedName("queue")
  private UriReference queue = null;

  @SerializedName("attributes")
  private Map<String, String> attributes = new HashMap<String, String>();

  @SerializedName("errorInfo")
  private ErrorBody errorInfo = null;

  @SerializedName("script")
  private UriReference script = null;

  @SerializedName("wrapupTimeoutMs")
  private Integer wrapupTimeoutMs = null;

  @SerializedName("wrapupSkipped")
  private Boolean wrapupSkipped = false;

  @SerializedName("muted")
  private Boolean muted = false;

  @SerializedName("confined")
  private Boolean confined = false;

  @SerializedName("recording")
  private Boolean recording = false;


  /**
   * The state of the call recording.
   */
  public enum RecordingStateEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("NONE")
    NONE("NONE"),

    @SerializedName("ACTIVE")
    ACTIVE("ACTIVE"),

    @SerializedName("PAUSED")
    PAUSED("PAUSED");

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

  @SerializedName("group")
  private UriReference group = null;

  @SerializedName("ani")
  private String ani = null;

  @SerializedName("dnis")
  private String dnis = null;

  @SerializedName("documentId")
  private String documentId = null;

  @SerializedName("faxStatus")
  private FaxStatus faxStatus = null;

  @SerializedName("monitoredParticipantId")
  private String monitoredParticipantId = null;

  @SerializedName("consultParticipantId")
  private String consultParticipantId = null;

  /**
   * The unique participant ID.
   **/
  @ApiModelProperty(value = "The unique participant ID.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The display friendly name of the participant.
   **/
  @ApiModelProperty(value = "The display friendly name of the participant.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The participant address.
   **/
  @ApiModelProperty(value = "The participant address.")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * The time when this participant joined the conversation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "The time when this participant joined the conversation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getStartTime() {
    return startTime;
  }
  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }

  /**
   * The time when this participant went connected on the conversation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "The time when this participant went connected on the conversation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getConnectedTime() {
    return connectedTime;
  }
  public void setConnectedTime(Date connectedTime) {
    this.connectedTime = connectedTime;
  }

  /**
   * The time when this participant when disconnected on the conversation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "The time when this participant when disconnected on the conversation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getEndTime() {
    return endTime;
  }
  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }

  /**
   * The time when this participant's hold started. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "The time when this participant's hold started. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getStartHoldTime() {
    return startHoldTime;
  }
  public void setStartHoldTime(Date startHoldTime) {
    this.startHoldTime = startHoldTime;
  }

  /**
   * The participant's purpose.  Values can be: 'agent', 'user', 'customer', 'external', 'acd', 'ivr
   **/
  @ApiModelProperty(value = "The participant's purpose.  Values can be: 'agent', 'user', 'customer', 'external', 'acd', 'ivr")
  public String getPurpose() {
    return purpose;
  }
  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  /**
   * The participant's state.  Values can be: 'alerting', 'connected', 'disconnected', 'dialing', 'contacting
   **/
  @ApiModelProperty(value = "The participant's state.  Values can be: 'alerting', 'connected', 'disconnected', 'dialing', 'contacting")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }

  /**
   * The participant's direction.  Values can be: 'inbound' or 'outbound'
   **/
  @ApiModelProperty(value = "The participant's direction.  Values can be: 'inbound' or 'outbound'")
  public DirectionEnum getDirection() {
    return direction;
  }
  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }

  /**
   * The reason the participant was disconnected from the conversation.
   **/
  @ApiModelProperty(value = "The reason the participant was disconnected from the conversation.")
  public DisconnectTypeEnum getDisconnectType() {
    return disconnectType;
  }
  public void setDisconnectType(DisconnectTypeEnum disconnectType) {
    this.disconnectType = disconnectType;
  }

  /**
   * Value is true when the participant is on hold.
   **/
  @ApiModelProperty(value = "Value is true when the participant is on hold.")
  public Boolean getHeld() {
    return held;
  }
  public void setHeld(Boolean held) {
    this.held = held;
  }

  /**
   * Value is true when the participant requires wrap-up.
   **/
  @ApiModelProperty(value = "Value is true when the participant requires wrap-up.")
  public Boolean getWrapupRequired() {
    return wrapupRequired;
  }
  public void setWrapupRequired(Boolean wrapupRequired) {
    this.wrapupRequired = wrapupRequired;
  }

  /**
   * The wrap-up prompt indicating the type of wrap-up to be performed.
   **/
  @ApiModelProperty(value = "The wrap-up prompt indicating the type of wrap-up to be performed.")
  public String getWrapupPrompt() {
    return wrapupPrompt;
  }
  public void setWrapupPrompt(String wrapupPrompt) {
    this.wrapupPrompt = wrapupPrompt;
  }

  /**
   * The PureCloud user for this participant.
   **/
  @ApiModelProperty(value = "The PureCloud user for this participant.")
  public UriReference getUser() {
    return user;
  }
  public void setUser(UriReference user) {
    this.user = user;
  }

  /**
   * The PureCloud queue for this participant.
   **/
  @ApiModelProperty(value = "The PureCloud queue for this participant.")
  public UriReference getQueue() {
    return queue;
  }
  public void setQueue(UriReference queue) {
    this.queue = queue;
  }

  /**
   * A list of ad-hoc attributes for the participant.
   **/
  @ApiModelProperty(value = "A list of ad-hoc attributes for the participant.")
  public Map<String, String> getAttributes() {
    return attributes;
  }
  public void setAttributes(Map<String, String> attributes) {
    this.attributes = attributes;
  }

  /**
   * If the conversation ends in error, contains additional error details.
   **/
  @ApiModelProperty(value = "If the conversation ends in error, contains additional error details.")
  public ErrorBody getErrorInfo() {
    return errorInfo;
  }
  public void setErrorInfo(ErrorBody errorInfo) {
    this.errorInfo = errorInfo;
  }

  /**
   * The Engage script that should be used by this participant.
   **/
  @ApiModelProperty(value = "The Engage script that should be used by this participant.")
  public UriReference getScript() {
    return script;
  }
  public void setScript(UriReference script) {
    this.script = script;
  }

  /**
   * The amount of time the participant has to complete wrap-up.
   **/
  @ApiModelProperty(value = "The amount of time the participant has to complete wrap-up.")
  public Integer getWrapupTimeoutMs() {
    return wrapupTimeoutMs;
  }
  public void setWrapupTimeoutMs(Integer wrapupTimeoutMs) {
    this.wrapupTimeoutMs = wrapupTimeoutMs;
  }

  /**
   * Value is true when the participant has skipped wrap-up.
   **/
  @ApiModelProperty(value = "Value is true when the participant has skipped wrap-up.")
  public Boolean getWrapupSkipped() {
    return wrapupSkipped;
  }
  public void setWrapupSkipped(Boolean wrapupSkipped) {
    this.wrapupSkipped = wrapupSkipped;
  }

  /**
   * Value is true when the call is muted.
   **/
  @ApiModelProperty(value = "Value is true when the call is muted.")
  public Boolean getMuted() {
    return muted;
  }
  public void setMuted(Boolean muted) {
    this.muted = muted;
  }

  /**
   * Value is true when the call is confined.
   **/
  @ApiModelProperty(value = "Value is true when the call is confined.")
  public Boolean getConfined() {
    return confined;
  }
  public void setConfined(Boolean confined) {
    this.confined = confined;
  }

  /**
   * Value is true when the call is being recorded.
   **/
  @ApiModelProperty(value = "Value is true when the call is being recorded.")
  public Boolean getRecording() {
    return recording;
  }
  public void setRecording(Boolean recording) {
    this.recording = recording;
  }

  /**
   * The state of the call recording.
   **/
  @ApiModelProperty(value = "The state of the call recording.")
  public RecordingStateEnum getRecordingState() {
    return recordingState;
  }
  public void setRecordingState(RecordingStateEnum recordingState) {
    this.recordingState = recordingState;
  }

  /**
   * The group involved in the group ring call.
   **/
  @ApiModelProperty(value = "The group involved in the group ring call.")
  public UriReference getGroup() {
    return group;
  }
  public void setGroup(UriReference group) {
    this.group = group;
  }

  /**
   * The call ANI.
   **/
  @ApiModelProperty(value = "The call ANI.")
  public String getAni() {
    return ani;
  }
  public void setAni(String ani) {
    this.ani = ani;
  }

  /**
   * The call DNIS.
   **/
  @ApiModelProperty(value = "The call DNIS.")
  public String getDnis() {
    return dnis;
  }
  public void setDnis(String dnis) {
    this.dnis = dnis;
  }

  /**
   * The ID of the Content Management document if the call is a fax.
   **/
  @ApiModelProperty(value = "The ID of the Content Management document if the call is a fax.")
  public String getDocumentId() {
    return documentId;
  }
  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }

  /**
   * Extra fax information if the call is a fax.
   **/
  @ApiModelProperty(value = "Extra fax information if the call is a fax.")
  public FaxStatus getFaxStatus() {
    return faxStatus;
  }
  public void setFaxStatus(FaxStatus faxStatus) {
    this.faxStatus = faxStatus;
  }

  /**
   * The ID of the participant being monitored when performing a call monitor.
   **/
  @ApiModelProperty(value = "The ID of the participant being monitored when performing a call monitor.")
  public String getMonitoredParticipantId() {
    return monitoredParticipantId;
  }
  public void setMonitoredParticipantId(String monitoredParticipantId) {
    this.monitoredParticipantId = monitoredParticipantId;
  }

  /**
   * The ID of the consult transfer target participant when performing a consult transfer.
   **/
  @ApiModelProperty(value = "The ID of the consult transfer target participant when performing a consult transfer.")
  public String getConsultParticipantId() {
    return consultParticipantId;
  }
  public void setConsultParticipantId(String consultParticipantId) {
    this.consultParticipantId = consultParticipantId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallMediaParticipant callMediaParticipant = (CallMediaParticipant) o;
    return Objects.equals(id, callMediaParticipant.id) &&
        Objects.equals(name, callMediaParticipant.name) &&
        Objects.equals(address, callMediaParticipant.address) &&
        Objects.equals(startTime, callMediaParticipant.startTime) &&
        Objects.equals(connectedTime, callMediaParticipant.connectedTime) &&
        Objects.equals(endTime, callMediaParticipant.endTime) &&
        Objects.equals(startHoldTime, callMediaParticipant.startHoldTime) &&
        Objects.equals(purpose, callMediaParticipant.purpose) &&
        Objects.equals(state, callMediaParticipant.state) &&
        Objects.equals(direction, callMediaParticipant.direction) &&
        Objects.equals(disconnectType, callMediaParticipant.disconnectType) &&
        Objects.equals(held, callMediaParticipant.held) &&
        Objects.equals(wrapupRequired, callMediaParticipant.wrapupRequired) &&
        Objects.equals(wrapupPrompt, callMediaParticipant.wrapupPrompt) &&
        Objects.equals(user, callMediaParticipant.user) &&
        Objects.equals(queue, callMediaParticipant.queue) &&
        Objects.equals(attributes, callMediaParticipant.attributes) &&
        Objects.equals(errorInfo, callMediaParticipant.errorInfo) &&
        Objects.equals(script, callMediaParticipant.script) &&
        Objects.equals(wrapupTimeoutMs, callMediaParticipant.wrapupTimeoutMs) &&
        Objects.equals(wrapupSkipped, callMediaParticipant.wrapupSkipped) &&
        Objects.equals(muted, callMediaParticipant.muted) &&
        Objects.equals(confined, callMediaParticipant.confined) &&
        Objects.equals(recording, callMediaParticipant.recording) &&
        Objects.equals(recordingState, callMediaParticipant.recordingState) &&
        Objects.equals(group, callMediaParticipant.group) &&
        Objects.equals(ani, callMediaParticipant.ani) &&
        Objects.equals(dnis, callMediaParticipant.dnis) &&
        Objects.equals(documentId, callMediaParticipant.documentId) &&
        Objects.equals(faxStatus, callMediaParticipant.faxStatus) &&
        Objects.equals(monitoredParticipantId, callMediaParticipant.monitoredParticipantId) &&
        Objects.equals(consultParticipantId, callMediaParticipant.consultParticipantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, address, startTime, connectedTime, endTime, startHoldTime, purpose, state, direction, disconnectType, held, wrapupRequired, wrapupPrompt, user, queue, attributes, errorInfo, script, wrapupTimeoutMs, wrapupSkipped, muted, confined, recording, recordingState, group, ani, dnis, documentId, faxStatus, monitoredParticipantId, consultParticipantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallMediaParticipant {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    connectedTime: ").append(toIndentedString(connectedTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    startHoldTime: ").append(toIndentedString(startHoldTime)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    disconnectType: ").append(toIndentedString(disconnectType)).append("\n");
    sb.append("    held: ").append(toIndentedString(held)).append("\n");
    sb.append("    wrapupRequired: ").append(toIndentedString(wrapupRequired)).append("\n");
    sb.append("    wrapupPrompt: ").append(toIndentedString(wrapupPrompt)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
    sb.append("    script: ").append(toIndentedString(script)).append("\n");
    sb.append("    wrapupTimeoutMs: ").append(toIndentedString(wrapupTimeoutMs)).append("\n");
    sb.append("    wrapupSkipped: ").append(toIndentedString(wrapupSkipped)).append("\n");
    sb.append("    muted: ").append(toIndentedString(muted)).append("\n");
    sb.append("    confined: ").append(toIndentedString(confined)).append("\n");
    sb.append("    recording: ").append(toIndentedString(recording)).append("\n");
    sb.append("    recordingState: ").append(toIndentedString(recordingState)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    ani: ").append(toIndentedString(ani)).append("\n");
    sb.append("    dnis: ").append(toIndentedString(dnis)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    faxStatus: ").append(toIndentedString(faxStatus)).append("\n");
    sb.append("    monitoredParticipantId: ").append(toIndentedString(monitoredParticipantId)).append("\n");
    sb.append("    consultParticipantId: ").append(toIndentedString(consultParticipantId)).append("\n");
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
