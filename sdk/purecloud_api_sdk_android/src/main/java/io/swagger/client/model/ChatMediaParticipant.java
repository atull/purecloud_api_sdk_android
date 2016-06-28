package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ErrorBody;
import io.swagger.client.model.UriReference;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;





public class ChatMediaParticipant   {
  
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

    @SerializedName("ERROR")
    ERROR("ERROR"),

    @SerializedName("PEER")
    PEER("PEER"),

    @SerializedName("OTHER")
    OTHER("OTHER");

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

  @SerializedName("roomId")
  private String roomId = null;

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
   * The ID of the chat room.
   **/
  @ApiModelProperty(value = "The ID of the chat room.")
  public String getRoomId() {
    return roomId;
  }
  public void setRoomId(String roomId) {
    this.roomId = roomId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatMediaParticipant chatMediaParticipant = (ChatMediaParticipant) o;
    return Objects.equals(id, chatMediaParticipant.id) &&
        Objects.equals(name, chatMediaParticipant.name) &&
        Objects.equals(address, chatMediaParticipant.address) &&
        Objects.equals(startTime, chatMediaParticipant.startTime) &&
        Objects.equals(connectedTime, chatMediaParticipant.connectedTime) &&
        Objects.equals(endTime, chatMediaParticipant.endTime) &&
        Objects.equals(startHoldTime, chatMediaParticipant.startHoldTime) &&
        Objects.equals(purpose, chatMediaParticipant.purpose) &&
        Objects.equals(state, chatMediaParticipant.state) &&
        Objects.equals(direction, chatMediaParticipant.direction) &&
        Objects.equals(disconnectType, chatMediaParticipant.disconnectType) &&
        Objects.equals(held, chatMediaParticipant.held) &&
        Objects.equals(wrapupRequired, chatMediaParticipant.wrapupRequired) &&
        Objects.equals(wrapupPrompt, chatMediaParticipant.wrapupPrompt) &&
        Objects.equals(user, chatMediaParticipant.user) &&
        Objects.equals(queue, chatMediaParticipant.queue) &&
        Objects.equals(attributes, chatMediaParticipant.attributes) &&
        Objects.equals(errorInfo, chatMediaParticipant.errorInfo) &&
        Objects.equals(script, chatMediaParticipant.script) &&
        Objects.equals(wrapupTimeoutMs, chatMediaParticipant.wrapupTimeoutMs) &&
        Objects.equals(wrapupSkipped, chatMediaParticipant.wrapupSkipped) &&
        Objects.equals(roomId, chatMediaParticipant.roomId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, address, startTime, connectedTime, endTime, startHoldTime, purpose, state, direction, disconnectType, held, wrapupRequired, wrapupPrompt, user, queue, attributes, errorInfo, script, wrapupTimeoutMs, wrapupSkipped, roomId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatMediaParticipant {\n");
    
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
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
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
