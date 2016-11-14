package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.ConversationNotificationDialerPreview;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class ConversationNotificationCallbacks  implements Serializable {
  

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
  private Boolean held = null;


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

    @SerializedName("TRANSFER_NO_ANSWER")
    TRANSFER_NO_ANSWER("TRANSFER_NO_ANSWER"),

    @SerializedName("TRANSFER_NOT_AVAILABLE")
    TRANSFER_NOT_AVAILABLE("TRANSFER_NOT_AVAILABLE"),

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
  private Integer startHoldTime = null;

  @SerializedName("dialerPreview")
  private ConversationNotificationDialerPreview dialerPreview = null;

  @SerializedName("callbackNumbers")
  private List<String> callbackNumbers = new ArrayList<String>();

  @SerializedName("callbackUserName")
  private String callbackUserName = null;

  @SerializedName("scriptId")
  private String scriptId = null;

  @SerializedName("skipEnabled")
  private Boolean skipEnabled = null;

  @SerializedName("timeoutSeconds")
  private Integer timeoutSeconds = null;

  @SerializedName("connectedTime")
  private Integer connectedTime = null;

  @SerializedName("disconnectedTime")
  private Integer disconnectedTime = null;

  @SerializedName("callbackScheduledTime")
  private Integer callbackScheduledTime = null;

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
  public ConversationNotificationDialerPreview getDialerPreview() {
    return dialerPreview;
  }
  public void setDialerPreview(ConversationNotificationDialerPreview dialerPreview) {
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
  public Integer getCallbackScheduledTime() {
    return callbackScheduledTime;
  }
  public void setCallbackScheduledTime(Integer callbackScheduledTime) {
    this.callbackScheduledTime = callbackScheduledTime;
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
    ConversationNotificationCallbacks conversationNotificationCallbacks = (ConversationNotificationCallbacks) o;
    return Objects.equals(state, conversationNotificationCallbacks.state) &&
        Objects.equals(id, conversationNotificationCallbacks.id) &&
        Objects.equals(direction, conversationNotificationCallbacks.direction) &&
        Objects.equals(held, conversationNotificationCallbacks.held) &&
        Objects.equals(disconnectType, conversationNotificationCallbacks.disconnectType) &&
        Objects.equals(startHoldTime, conversationNotificationCallbacks.startHoldTime) &&
        Objects.equals(dialerPreview, conversationNotificationCallbacks.dialerPreview) &&
        Objects.equals(callbackNumbers, conversationNotificationCallbacks.callbackNumbers) &&
        Objects.equals(callbackUserName, conversationNotificationCallbacks.callbackUserName) &&
        Objects.equals(scriptId, conversationNotificationCallbacks.scriptId) &&
        Objects.equals(skipEnabled, conversationNotificationCallbacks.skipEnabled) &&
        Objects.equals(timeoutSeconds, conversationNotificationCallbacks.timeoutSeconds) &&
        Objects.equals(connectedTime, conversationNotificationCallbacks.connectedTime) &&
        Objects.equals(disconnectedTime, conversationNotificationCallbacks.disconnectedTime) &&
        Objects.equals(callbackScheduledTime, conversationNotificationCallbacks.callbackScheduledTime) &&
        Objects.equals(additionalProperties, conversationNotificationCallbacks.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, id, direction, held, disconnectType, startHoldTime, dialerPreview, callbackNumbers, callbackUserName, scriptId, skipEnabled, timeoutSeconds, connectedTime, disconnectedTime, callbackScheduledTime, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationNotificationCallbacks {\n");
    
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
