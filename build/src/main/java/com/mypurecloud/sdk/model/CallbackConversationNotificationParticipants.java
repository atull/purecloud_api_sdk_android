package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.CallbackConversationNotificationErrorInfo;
import com.mypurecloud.sdk.model.CallbackConversationNotificationUser;
import com.mypurecloud.sdk.model.ConversationNotificationDialerPreview;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class CallbackConversationNotificationParticipants  implements Serializable {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("startTime")
  private Integer startTime = null;

  @SerializedName("connectedTime")
  private Integer connectedTime = null;

  @SerializedName("endTime")
  private Integer endTime = null;

  @SerializedName("startHoldTime")
  private Integer startHoldTime = null;

  @SerializedName("purpose")
  private String purpose = null;


  /**
   * Gets or Sets state
   */
  public enum StateEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("alerting")
    ALERTING("alerting"),

    @SerializedName("dialing")
    DIALING("dialing"),

    @SerializedName("contacting")
    CONTACTING("contacting"),

    @SerializedName("offering")
    OFFERING("offering"),

    @SerializedName("connected")
    CONNECTED("connected"),

    @SerializedName("disconnected")
    DISCONNECTED("disconnected"),

    @SerializedName("terminated")
    TERMINATED("terminated"),

    @SerializedName("converting")
    CONVERTING("converting"),

    @SerializedName("uploading")
    UPLOADING("uploading"),

    @SerializedName("transmitting")
    TRANSMITTING("transmitting"),

    @SerializedName("scheduled")
    SCHEDULED("scheduled"),

    @SerializedName("none")
    NONE("none");

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
   * Gets or Sets direction
   */
  public enum DirectionEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("inbound")
    INBOUND("inbound"),

    @SerializedName("outbound")
    OUTBOUND("outbound");

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
   * Gets or Sets disconnectType
   */
  public enum DisconnectTypeEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("endpoint")
    ENDPOINT("endpoint"),

    @SerializedName("client")
    CLIENT("client"),

    @SerializedName("system")
    SYSTEM("system"),

    @SerializedName("transfer")
    TRANSFER("transfer"),

    @SerializedName("timeout")
    TIMEOUT("timeout"),

    @SerializedName("transfer.conference")
    TRANSFER_CONFERENCE("transfer.conference"),

    @SerializedName("transfer.consult")
    TRANSFER_CONSULT("transfer.consult"),

    @SerializedName("transfer.forward")
    TRANSFER_FORWARD("transfer.forward"),

    @SerializedName("transport.failure")
    TRANSPORT_FAILURE("transport.failure"),

    @SerializedName("transport.noanswer")
    TRANSPORT_NOANSWER("transport.noanswer"),

    @SerializedName("transport.notavailable")
    TRANSPORT_NOTAVAILABLE("transport.notavailable"),

    @SerializedName("error")
    ERROR("error"),

    @SerializedName("peer")
    PEER("peer"),

    @SerializedName("other")
    OTHER("other"),

    @SerializedName("spam")
    SPAM("spam");

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
  private Boolean held = null;

  @SerializedName("wrapupRequired")
  private Boolean wrapupRequired = null;

  @SerializedName("wrapupPrompt")
  private String wrapupPrompt = null;

  @SerializedName("user")
  private CallbackConversationNotificationUser user = null;

  @SerializedName("attributes")
  private Map<String, String> attributes = new HashMap<String, String>();

  @SerializedName("errorInfo")
  private CallbackConversationNotificationErrorInfo errorInfo = null;

  @SerializedName("wrapupTimeoutMs")
  private Integer wrapupTimeoutMs = null;

  @SerializedName("wrapupSkipped")
  private Boolean wrapupSkipped = null;

  @SerializedName("outboundPreview")
  private ConversationNotificationDialerPreview outboundPreview = null;

  @SerializedName("callbackNumbers")
  private List<String> callbackNumbers = new ArrayList<String>();

  @SerializedName("callbackUserName")
  private String callbackUserName = null;

  @SerializedName("skipEnabled")
  private Boolean skipEnabled = null;

  @SerializedName("timeoutSeconds")
  private Integer timeoutSeconds = null;

  @SerializedName("callbackScheduledTime")
  private Integer callbackScheduledTime = null;

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
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
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
  public Integer getStartTime() {
    return startTime;
  }
  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
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
  public Integer getStartHoldTime() {
    return startHoldTime;
  }
  public void setStartHoldTime(Integer startHoldTime) {
    this.startHoldTime = startHoldTime;
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
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
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
  public DisconnectTypeEnum getDisconnectType() {
    return disconnectType;
  }
  public void setDisconnectType(DisconnectTypeEnum disconnectType) {
    this.disconnectType = disconnectType;
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
  public Boolean getWrapupRequired() {
    return wrapupRequired;
  }
  public void setWrapupRequired(Boolean wrapupRequired) {
    this.wrapupRequired = wrapupRequired;
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
  public CallbackConversationNotificationUser getUser() {
    return user;
  }
  public void setUser(CallbackConversationNotificationUser user) {
    this.user = user;
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
  public CallbackConversationNotificationErrorInfo getErrorInfo() {
    return errorInfo;
  }
  public void setErrorInfo(CallbackConversationNotificationErrorInfo errorInfo) {
    this.errorInfo = errorInfo;
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
  public ConversationNotificationDialerPreview getOutboundPreview() {
    return outboundPreview;
  }
  public void setOutboundPreview(ConversationNotificationDialerPreview outboundPreview) {
    this.outboundPreview = outboundPreview;
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
   **/
  @ApiModelProperty(value = "")
  public Integer getCallbackScheduledTime() {
    return callbackScheduledTime;
  }
  public void setCallbackScheduledTime(Integer callbackScheduledTime) {
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
    CallbackConversationNotificationParticipants callbackConversationNotificationParticipants = (CallbackConversationNotificationParticipants) o;
    return Objects.equals(id, callbackConversationNotificationParticipants.id) &&
        Objects.equals(name, callbackConversationNotificationParticipants.name) &&
        Objects.equals(address, callbackConversationNotificationParticipants.address) &&
        Objects.equals(startTime, callbackConversationNotificationParticipants.startTime) &&
        Objects.equals(connectedTime, callbackConversationNotificationParticipants.connectedTime) &&
        Objects.equals(endTime, callbackConversationNotificationParticipants.endTime) &&
        Objects.equals(startHoldTime, callbackConversationNotificationParticipants.startHoldTime) &&
        Objects.equals(purpose, callbackConversationNotificationParticipants.purpose) &&
        Objects.equals(state, callbackConversationNotificationParticipants.state) &&
        Objects.equals(direction, callbackConversationNotificationParticipants.direction) &&
        Objects.equals(disconnectType, callbackConversationNotificationParticipants.disconnectType) &&
        Objects.equals(held, callbackConversationNotificationParticipants.held) &&
        Objects.equals(wrapupRequired, callbackConversationNotificationParticipants.wrapupRequired) &&
        Objects.equals(wrapupPrompt, callbackConversationNotificationParticipants.wrapupPrompt) &&
        Objects.equals(user, callbackConversationNotificationParticipants.user) &&
        Objects.equals(attributes, callbackConversationNotificationParticipants.attributes) &&
        Objects.equals(errorInfo, callbackConversationNotificationParticipants.errorInfo) &&
        Objects.equals(wrapupTimeoutMs, callbackConversationNotificationParticipants.wrapupTimeoutMs) &&
        Objects.equals(wrapupSkipped, callbackConversationNotificationParticipants.wrapupSkipped) &&
        Objects.equals(outboundPreview, callbackConversationNotificationParticipants.outboundPreview) &&
        Objects.equals(callbackNumbers, callbackConversationNotificationParticipants.callbackNumbers) &&
        Objects.equals(callbackUserName, callbackConversationNotificationParticipants.callbackUserName) &&
        Objects.equals(skipEnabled, callbackConversationNotificationParticipants.skipEnabled) &&
        Objects.equals(timeoutSeconds, callbackConversationNotificationParticipants.timeoutSeconds) &&
        Objects.equals(callbackScheduledTime, callbackConversationNotificationParticipants.callbackScheduledTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, address, startTime, connectedTime, endTime, startHoldTime, purpose, state, direction, disconnectType, held, wrapupRequired, wrapupPrompt, user, attributes, errorInfo, wrapupTimeoutMs, wrapupSkipped, outboundPreview, callbackNumbers, callbackUserName, skipEnabled, timeoutSeconds, callbackScheduledTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallbackConversationNotificationParticipants {\n");
    
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
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
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
