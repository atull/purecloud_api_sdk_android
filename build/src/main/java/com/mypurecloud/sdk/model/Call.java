package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.DisconnectReason;
import com.mypurecloud.sdk.model.ErrorBody;
import com.mypurecloud.sdk.model.FaxStatus;
import com.mypurecloud.sdk.model.Segment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class Call  implements Serializable {
  

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

  @SerializedName("id")
  private String id = null;


  /**
   * Gets or Sets direction
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

  @SerializedName("recording")
  private Boolean recording = false;


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
  private Boolean muted = false;

  @SerializedName("confined")
  private Boolean confined = false;

  @SerializedName("held")
  private Boolean held = false;

  @SerializedName("recordingId")
  private String recordingId = null;

  @SerializedName("segments")
  private List<Segment> segments = new ArrayList<Segment>();

  @SerializedName("errorInfo")
  private ErrorBody errorInfo = null;


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
  private Date startHoldTime = null;

  @SerializedName("documentId")
  private String documentId = null;

  @SerializedName("connectedTime")
  private Date connectedTime = null;

  @SerializedName("disconnectedTime")
  private Date disconnectedTime = null;

  @SerializedName("disconnectReasons")
  private List<DisconnectReason> disconnectReasons = new ArrayList<DisconnectReason>();

  @SerializedName("faxStatus")
  private FaxStatus faxStatus = null;

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
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
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
  public String getRecordingId() {
    return recordingId;
  }
  public void setRecordingId(String recordingId) {
    this.recordingId = recordingId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Segment> getSegments() {
    return segments;
  }
  public void setSegments(List<Segment> segments) {
    this.segments = segments;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ErrorBody getErrorInfo() {
    return errorInfo;
  }
  public void setErrorInfo(ErrorBody errorInfo) {
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
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getStartHoldTime() {
    return startHoldTime;
  }
  public void setStartHoldTime(Date startHoldTime) {
    this.startHoldTime = startHoldTime;
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
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getDisconnectedTime() {
    return disconnectedTime;
  }
  public void setDisconnectedTime(Date disconnectedTime) {
    this.disconnectedTime = disconnectedTime;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<DisconnectReason> getDisconnectReasons() {
    return disconnectReasons;
  }
  public void setDisconnectReasons(List<DisconnectReason> disconnectReasons) {
    this.disconnectReasons = disconnectReasons;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public FaxStatus getFaxStatus() {
    return faxStatus;
  }
  public void setFaxStatus(FaxStatus faxStatus) {
    this.faxStatus = faxStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Call call = (Call) o;
    return Objects.equals(state, call.state) &&
        Objects.equals(id, call.id) &&
        Objects.equals(direction, call.direction) &&
        Objects.equals(recording, call.recording) &&
        Objects.equals(recordingState, call.recordingState) &&
        Objects.equals(muted, call.muted) &&
        Objects.equals(confined, call.confined) &&
        Objects.equals(held, call.held) &&
        Objects.equals(recordingId, call.recordingId) &&
        Objects.equals(segments, call.segments) &&
        Objects.equals(errorInfo, call.errorInfo) &&
        Objects.equals(disconnectType, call.disconnectType) &&
        Objects.equals(startHoldTime, call.startHoldTime) &&
        Objects.equals(documentId, call.documentId) &&
        Objects.equals(connectedTime, call.connectedTime) &&
        Objects.equals(disconnectedTime, call.disconnectedTime) &&
        Objects.equals(disconnectReasons, call.disconnectReasons) &&
        Objects.equals(faxStatus, call.faxStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, id, direction, recording, recordingState, muted, confined, held, recordingId, segments, errorInfo, disconnectType, startHoldTime, documentId, connectedTime, disconnectedTime, disconnectReasons, faxStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Call {\n");
    
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    recording: ").append(toIndentedString(recording)).append("\n");
    sb.append("    recordingState: ").append(toIndentedString(recordingState)).append("\n");
    sb.append("    muted: ").append(toIndentedString(muted)).append("\n");
    sb.append("    confined: ").append(toIndentedString(confined)).append("\n");
    sb.append("    held: ").append(toIndentedString(held)).append("\n");
    sb.append("    recordingId: ").append(toIndentedString(recordingId)).append("\n");
    sb.append("    segments: ").append(toIndentedString(segments)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
    sb.append("    disconnectType: ").append(toIndentedString(disconnectType)).append("\n");
    sb.append("    startHoldTime: ").append(toIndentedString(startHoldTime)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    connectedTime: ").append(toIndentedString(connectedTime)).append("\n");
    sb.append("    disconnectedTime: ").append(toIndentedString(disconnectedTime)).append("\n");
    sb.append("    disconnectReasons: ").append(toIndentedString(disconnectReasons)).append("\n");
    sb.append("    faxStatus: ").append(toIndentedString(faxStatus)).append("\n");
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
