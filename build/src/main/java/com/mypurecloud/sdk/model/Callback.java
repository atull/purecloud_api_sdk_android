package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.DialerPreview;
import com.mypurecloud.sdk.model.Segment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class Callback  implements Serializable {
  

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

    @SerializedName("SCHEDULED")
    SCHEDULED("SCHEDULED"),

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

  @SerializedName("segments")
  private List<Segment> segments = new ArrayList<Segment>();


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

  @SerializedName("held")
  private Boolean held = false;


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

  @SerializedName("dialerPreview")
  private DialerPreview dialerPreview = null;

  @SerializedName("callbackNumbers")
  private List<String> callbackNumbers = new ArrayList<String>();

  @SerializedName("callbackUserName")
  private String callbackUserName = null;

  @SerializedName("scriptId")
  private String scriptId = null;

  @SerializedName("skipEnabled")
  private Boolean skipEnabled = false;

  @SerializedName("timeoutSeconds")
  private Integer timeoutSeconds = null;

  @SerializedName("connectedTime")
  private Date connectedTime = null;

  @SerializedName("disconnectedTime")
  private Date disconnectedTime = null;

  @SerializedName("callbackScheduledTime")
  private Date callbackScheduledTime = null;

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
  public List<Segment> getSegments() {
    return segments;
  }
  public void setSegments(List<Segment> segments) {
    this.segments = segments;
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
  public Boolean getHeld() {
    return held;
  }
  public void setHeld(Boolean held) {
    this.held = held;
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
  public DialerPreview getDialerPreview() {
    return dialerPreview;
  }
  public void setDialerPreview(DialerPreview dialerPreview) {
    this.dialerPreview = dialerPreview;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getCallbackNumbers() {
    return callbackNumbers;
  }
  public void setCallbackNumbers(List<String> callbackNumbers) {
    this.callbackNumbers = callbackNumbers;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCallbackUserName() {
    return callbackUserName;
  }
  public void setCallbackUserName(String callbackUserName) {
    this.callbackUserName = callbackUserName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getScriptId() {
    return scriptId;
  }
  public void setScriptId(String scriptId) {
    this.scriptId = scriptId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getSkipEnabled() {
    return skipEnabled;
  }
  public void setSkipEnabled(Boolean skipEnabled) {
    this.skipEnabled = skipEnabled;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getTimeoutSeconds() {
    return timeoutSeconds;
  }
  public void setTimeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
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
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getCallbackScheduledTime() {
    return callbackScheduledTime;
  }
  public void setCallbackScheduledTime(Date callbackScheduledTime) {
    this.callbackScheduledTime = callbackScheduledTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Callback callback = (Callback) o;
    return Objects.equals(state, callback.state) &&
        Objects.equals(id, callback.id) &&
        Objects.equals(segments, callback.segments) &&
        Objects.equals(direction, callback.direction) &&
        Objects.equals(held, callback.held) &&
        Objects.equals(disconnectType, callback.disconnectType) &&
        Objects.equals(startHoldTime, callback.startHoldTime) &&
        Objects.equals(dialerPreview, callback.dialerPreview) &&
        Objects.equals(callbackNumbers, callback.callbackNumbers) &&
        Objects.equals(callbackUserName, callback.callbackUserName) &&
        Objects.equals(scriptId, callback.scriptId) &&
        Objects.equals(skipEnabled, callback.skipEnabled) &&
        Objects.equals(timeoutSeconds, callback.timeoutSeconds) &&
        Objects.equals(connectedTime, callback.connectedTime) &&
        Objects.equals(disconnectedTime, callback.disconnectedTime) &&
        Objects.equals(callbackScheduledTime, callback.callbackScheduledTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, id, segments, direction, held, disconnectType, startHoldTime, dialerPreview, callbackNumbers, callbackUserName, scriptId, skipEnabled, timeoutSeconds, connectedTime, disconnectedTime, callbackScheduledTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Callback {\n");
    
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    segments: ").append(toIndentedString(segments)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    held: ").append(toIndentedString(held)).append("\n");
    sb.append("    disconnectType: ").append(toIndentedString(disconnectType)).append("\n");
    sb.append("    startHoldTime: ").append(toIndentedString(startHoldTime)).append("\n");
    sb.append("    dialerPreview: ").append(toIndentedString(dialerPreview)).append("\n");
    sb.append("    callbackNumbers: ").append(toIndentedString(callbackNumbers)).append("\n");
    sb.append("    callbackUserName: ").append(toIndentedString(callbackUserName)).append("\n");
    sb.append("    scriptId: ").append(toIndentedString(scriptId)).append("\n");
    sb.append("    skipEnabled: ").append(toIndentedString(skipEnabled)).append("\n");
    sb.append("    timeoutSeconds: ").append(toIndentedString(timeoutSeconds)).append("\n");
    sb.append("    connectedTime: ").append(toIndentedString(connectedTime)).append("\n");
    sb.append("    disconnectedTime: ").append(toIndentedString(disconnectedTime)).append("\n");
    sb.append("    callbackScheduledTime: ").append(toIndentedString(callbackScheduledTime)).append("\n");
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
