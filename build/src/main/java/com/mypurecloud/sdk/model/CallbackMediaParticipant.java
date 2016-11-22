package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.DialerPreview;
import com.mypurecloud.sdk.model.ErrorBody;
import com.mypurecloud.sdk.model.UriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class CallbackMediaParticipant  implements Serializable {
  
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

  @SerializedName("outboundPreview")
  private DialerPreview outboundPreview = null;

  @SerializedName("callbackNumbers")
  private List<String> callbackNumbers = new ArrayList<String>();

  @SerializedName("callbackUserName")
  private String callbackUserName = null;

  @SerializedName("skipEnabled")
  private Boolean skipEnabled = false;

  @SerializedName("timeoutSeconds")
  private Integer timeoutSeconds = null;

  @SerializedName("callbackScheduledTime")
  private Date callbackScheduledTime = null;

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
   * The outbound preview associated with this callback.
   **/
  @ApiModelProperty(value = "The outbound preview associated with this callback.")
  public DialerPreview getOutboundPreview() {
    return outboundPreview;
  }
  public void setOutboundPreview(DialerPreview outboundPreview) {
    this.outboundPreview = outboundPreview;
  }

  /**
   * The list of phone number to use for this callback.
   **/
  @ApiModelProperty(value = "The list of phone number to use for this callback.")
  public List<String> getCallbackNumbers() {
    return callbackNumbers;
  }
  public void setCallbackNumbers(List<String> callbackNumbers) {
    this.callbackNumbers = callbackNumbers;
  }

  /**
   * The name of the callback target.
   **/
  @ApiModelProperty(value = "The name of the callback target.")
  public String getCallbackUserName() {
    return callbackUserName;
  }
  public void setCallbackUserName(String callbackUserName) {
    this.callbackUserName = callbackUserName;
  }

  /**
   * If true, the callback can be skipped
   **/
  @ApiModelProperty(value = "If true, the callback can be skipped")
  public Boolean getSkipEnabled() {
    return skipEnabled;
  }
  public void setSkipEnabled(Boolean skipEnabled) {
    this.skipEnabled = skipEnabled;
  }

  /**
   * Duration in seconds before the callback will be auto-dialed.
   **/
  @ApiModelProperty(value = "Duration in seconds before the callback will be auto-dialed.")
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
    CallbackMediaParticipant callbackMediaParticipant = (CallbackMediaParticipant) o;
    return Objects.equals(id, callbackMediaParticipant.id) &&
        Objects.equals(name, callbackMediaParticipant.name) &&
        Objects.equals(address, callbackMediaParticipant.address) &&
        Objects.equals(startTime, callbackMediaParticipant.startTime) &&
        Objects.equals(connectedTime, callbackMediaParticipant.connectedTime) &&
        Objects.equals(endTime, callbackMediaParticipant.endTime) &&
        Objects.equals(startHoldTime, callbackMediaParticipant.startHoldTime) &&
        Objects.equals(purpose, callbackMediaParticipant.purpose) &&
        Objects.equals(state, callbackMediaParticipant.state) &&
        Objects.equals(direction, callbackMediaParticipant.direction) &&
        Objects.equals(disconnectType, callbackMediaParticipant.disconnectType) &&
        Objects.equals(held, callbackMediaParticipant.held) &&
        Objects.equals(wrapupRequired, callbackMediaParticipant.wrapupRequired) &&
        Objects.equals(wrapupPrompt, callbackMediaParticipant.wrapupPrompt) &&
        Objects.equals(user, callbackMediaParticipant.user) &&
        Objects.equals(queue, callbackMediaParticipant.queue) &&
        Objects.equals(attributes, callbackMediaParticipant.attributes) &&
        Objects.equals(errorInfo, callbackMediaParticipant.errorInfo) &&
        Objects.equals(script, callbackMediaParticipant.script) &&
        Objects.equals(wrapupTimeoutMs, callbackMediaParticipant.wrapupTimeoutMs) &&
        Objects.equals(wrapupSkipped, callbackMediaParticipant.wrapupSkipped) &&
        Objects.equals(outboundPreview, callbackMediaParticipant.outboundPreview) &&
        Objects.equals(callbackNumbers, callbackMediaParticipant.callbackNumbers) &&
        Objects.equals(callbackUserName, callbackMediaParticipant.callbackUserName) &&
        Objects.equals(skipEnabled, callbackMediaParticipant.skipEnabled) &&
        Objects.equals(timeoutSeconds, callbackMediaParticipant.timeoutSeconds) &&
        Objects.equals(callbackScheduledTime, callbackMediaParticipant.callbackScheduledTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, address, startTime, connectedTime, endTime, startHoldTime, purpose, state, direction, disconnectType, held, wrapupRequired, wrapupPrompt, user, queue, attributes, errorInfo, script, wrapupTimeoutMs, wrapupSkipped, outboundPreview, callbackNumbers, callbackUserName, skipEnabled, timeoutSeconds, callbackScheduledTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallbackMediaParticipant {\n");
    
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
    sb.append("    outboundPreview: ").append(toIndentedString(outboundPreview)).append("\n");
    sb.append("    callbackNumbers: ").append(toIndentedString(callbackNumbers)).append("\n");
    sb.append("    callbackUserName: ").append(toIndentedString(callbackUserName)).append("\n");
    sb.append("    skipEnabled: ").append(toIndentedString(skipEnabled)).append("\n");
    sb.append("    timeoutSeconds: ").append(toIndentedString(timeoutSeconds)).append("\n");
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
