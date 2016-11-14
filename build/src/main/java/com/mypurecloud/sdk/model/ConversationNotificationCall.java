package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.ConversationNotificationDisconnectReasons;
import com.mypurecloud.sdk.model.ConversationNotificationErrorInfo;
import com.mypurecloud.sdk.model.ConversationNotificationFaxStatus;
import com.mypurecloud.sdk.model.ConversationNotificationSelf;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class ConversationNotificationCall  implements Serializable {
  

  /**
   * Gets or Sets state
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

    @SerializedName("UPLOADING")
    UPLOADING("UPLOADING"),

    @SerializedName("CONVERTING")
    CONVERTING("CONVERTING"),

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

  @SerializedName("recording")
  private Boolean recording = null;


  /**
   * Gets or Sets recordingState
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

  @SerializedName("muted")
  private Boolean muted = null;

  @SerializedName("confined")
  private Boolean confined = null;

  @SerializedName("held")
  private Boolean held = null;

  @SerializedName("errorInfo")
  private ConversationNotificationErrorInfo errorInfo = null;


  /**
   * Gets or Sets disconnectType
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

    @SerializedName("TIMEOUT")
    TIMEOUT("TIMEOUT"),

    @SerializedName("TRANSFER")
    TRANSFER("TRANSFER"),

    @SerializedName("TRANSFER_CONFERENCE")
    TRANSFER_CONFERENCE("TRANSFER_CONFERENCE"),

    @SerializedName("TRANSFER_CONSULT")
    TRANSFER_CONSULT("TRANSFER_CONSULT"),

    @SerializedName("TRANSFER_FORWARD")
    TRANSFER_FORWARD("TRANSFER_FORWARD"),

    @SerializedName("TRANSFER_NO_ANSWER")
    TRANSFER_NO_ANSWER("TRANSFER_NO_ANSWER"),

    @SerializedName("TRANSFER_NOT_AVAILABLE")
    TRANSFER_NOT_AVAILABLE("TRANSFER_NOT_AVAILABLE"),

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

  @SerializedName("startHoldTime")
  private Integer startHoldTime = null;


  /**
   * Gets or Sets direction
   */
  public enum DirectionEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("OUTBOUND")
    OUTBOUND("OUTBOUND"),

    @SerializedName("INBOUND")
    INBOUND("INBOUND");

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

  @SerializedName("documentId")
  private String documentId = null;

  @SerializedName("self")
  private ConversationNotificationSelf self = null;

  @SerializedName("connectedTime")
  private Integer connectedTime = null;

  @SerializedName("disconnectedTime")
  private Integer disconnectedTime = null;

  @SerializedName("disconnectReasons")
  private List<ConversationNotificationDisconnectReasons> disconnectReasons = new ArrayList<ConversationNotificationDisconnectReasons>();

  @SerializedName("faxStatus")
  private ConversationNotificationFaxStatus faxStatus = null;

  @SerializedName("additionalProperties")
  private Object additionalProperties = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getRecording() {
    return recording;
  }
  public void setRecording(Boolean recording) {
    this.recording = recording;
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

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getMuted() {
    return muted;
  }
  public void setMuted(Boolean muted) {
    this.muted = muted;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getConfined() {
    return confined;
  }
  public void setConfined(Boolean confined) {
    this.confined = confined;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getHeld() {
    return held;
  }
  public void setHeld(Boolean held) {
    this.held = held;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConversationNotificationErrorInfo getErrorInfo() {
    return errorInfo;
  }
  public void setErrorInfo(ConversationNotificationErrorInfo errorInfo) {
    this.errorInfo = errorInfo;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public DisconnectTypeEnum getDisconnectType() {
    return disconnectType;
  }
  public void setDisconnectType(DisconnectTypeEnum disconnectType) {
    this.disconnectType = disconnectType;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getStartHoldTime() {
    return startHoldTime;
  }
  public void setStartHoldTime(Integer startHoldTime) {
    this.startHoldTime = startHoldTime;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public DirectionEnum getDirection() {
    return direction;
  }
  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDocumentId() {
    return documentId;
  }
  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConversationNotificationSelf getSelf() {
    return self;
  }
  public void setSelf(ConversationNotificationSelf self) {
    this.self = self;
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
  public Integer getDisconnectedTime() {
    return disconnectedTime;
  }
  public void setDisconnectedTime(Integer disconnectedTime) {
    this.disconnectedTime = disconnectedTime;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<ConversationNotificationDisconnectReasons> getDisconnectReasons() {
    return disconnectReasons;
  }
  public void setDisconnectReasons(List<ConversationNotificationDisconnectReasons> disconnectReasons) {
    this.disconnectReasons = disconnectReasons;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConversationNotificationFaxStatus getFaxStatus() {
    return faxStatus;
  }
  public void setFaxStatus(ConversationNotificationFaxStatus faxStatus) {
    this.faxStatus = faxStatus;
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
    ConversationNotificationCall conversationNotificationCall = (ConversationNotificationCall) o;
    return Objects.equals(state, conversationNotificationCall.state) &&
        Objects.equals(recording, conversationNotificationCall.recording) &&
        Objects.equals(recordingState, conversationNotificationCall.recordingState) &&
        Objects.equals(muted, conversationNotificationCall.muted) &&
        Objects.equals(confined, conversationNotificationCall.confined) &&
        Objects.equals(held, conversationNotificationCall.held) &&
        Objects.equals(errorInfo, conversationNotificationCall.errorInfo) &&
        Objects.equals(disconnectType, conversationNotificationCall.disconnectType) &&
        Objects.equals(startHoldTime, conversationNotificationCall.startHoldTime) &&
        Objects.equals(direction, conversationNotificationCall.direction) &&
        Objects.equals(documentId, conversationNotificationCall.documentId) &&
        Objects.equals(self, conversationNotificationCall.self) &&
        Objects.equals(connectedTime, conversationNotificationCall.connectedTime) &&
        Objects.equals(disconnectedTime, conversationNotificationCall.disconnectedTime) &&
        Objects.equals(disconnectReasons, conversationNotificationCall.disconnectReasons) &&
        Objects.equals(faxStatus, conversationNotificationCall.faxStatus) &&
        Objects.equals(additionalProperties, conversationNotificationCall.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, recording, recordingState, muted, confined, held, errorInfo, disconnectType, startHoldTime, direction, documentId, self, connectedTime, disconnectedTime, disconnectReasons, faxStatus, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationNotificationCall {\n");
    
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    recording: ").append(toIndentedString(recording)).append("\n");
    sb.append("    recordingState: ").append(toIndentedString(recordingState)).append("\n");
    sb.append("    muted: ").append(toIndentedString(muted)).append("\n");
    sb.append("    confined: ").append(toIndentedString(confined)).append("\n");
    sb.append("    held: ").append(toIndentedString(held)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
    sb.append("    disconnectType: ").append(toIndentedString(disconnectType)).append("\n");
    sb.append("    startHoldTime: ").append(toIndentedString(startHoldTime)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    connectedTime: ").append(toIndentedString(connectedTime)).append("\n");
    sb.append("    disconnectedTime: ").append(toIndentedString(disconnectedTime)).append("\n");
    sb.append("    disconnectReasons: ").append(toIndentedString(disconnectReasons)).append("\n");
    sb.append("    faxStatus: ").append(toIndentedString(faxStatus)).append("\n");
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
