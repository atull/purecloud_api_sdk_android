package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class ConversationNotificationVideos  implements Serializable {
  

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

  @SerializedName("context")
  private String context = null;

  @SerializedName("audioMuted")
  private Boolean audioMuted = null;

  @SerializedName("videoMuted")
  private Boolean videoMuted = null;

  @SerializedName("sharingScreen")
  private Boolean sharingScreen = null;


  /**
   * Gets or Sets provider
   */
  public enum ProviderEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("PureCloud WebRTC")
    PURECLOUD_WEBRTC("PureCloud WebRTC"),

    @SerializedName("PureCloud Email")
    PURECLOUD_EMAIL("PureCloud Email"),

    @SerializedName("PureCloud Webchat")
    PURECLOUD_WEBCHAT("PureCloud Webchat"),

    @SerializedName("PureCloud Co-browse")
    PURECLOUD_CO_BROWSE("PureCloud Co-browse"),

    @SerializedName("PureCloud VR")
    PURECLOUD_VR("PureCloud VR"),

    @SerializedName("PureCloud Callback")
    PURECLOUD_CALLBACK("PureCloud Callback"),

    @SerializedName("PureCloud Social Channel Management")
    PURECLOUD_SOCIAL_CHANNEL_MANAGEMENT("PureCloud Social Channel Management"),

    @SerializedName("PureCloud Fax")
    PURECLOUD_FAX("PureCloud Fax"),

    @SerializedName("Edge")
    EDGE("Edge"),

    @SerializedName("Twillio")
    TWILLIO("Twillio"),

    @SerializedName("Bifrost")
    BIFROST("Bifrost"),

    @SerializedName("Unknown")
    UNKNOWN("Unknown");

    private String value;

    ProviderEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("provider")
  private ProviderEnum provider = null;


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

  @SerializedName("connectedTime")
  private Integer connectedTime = null;

  @SerializedName("disconnectedTime")
  private Integer disconnectedTime = null;

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
  public String getContext() {
    return context;
  }
  public void setContext(String context) {
    this.context = context;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getAudioMuted() {
    return audioMuted;
  }
  public void setAudioMuted(Boolean audioMuted) {
    this.audioMuted = audioMuted;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getVideoMuted() {
    return videoMuted;
  }
  public void setVideoMuted(Boolean videoMuted) {
    this.videoMuted = videoMuted;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getSharingScreen() {
    return sharingScreen;
  }
  public void setSharingScreen(Boolean sharingScreen) {
    this.sharingScreen = sharingScreen;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ProviderEnum getProvider() {
    return provider;
  }
  public void setProvider(ProviderEnum provider) {
    this.provider = provider;
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
    ConversationNotificationVideos conversationNotificationVideos = (ConversationNotificationVideos) o;
    return Objects.equals(state, conversationNotificationVideos.state) &&
        Objects.equals(id, conversationNotificationVideos.id) &&
        Objects.equals(context, conversationNotificationVideos.context) &&
        Objects.equals(audioMuted, conversationNotificationVideos.audioMuted) &&
        Objects.equals(videoMuted, conversationNotificationVideos.videoMuted) &&
        Objects.equals(sharingScreen, conversationNotificationVideos.sharingScreen) &&
        Objects.equals(provider, conversationNotificationVideos.provider) &&
        Objects.equals(disconnectType, conversationNotificationVideos.disconnectType) &&
        Objects.equals(connectedTime, conversationNotificationVideos.connectedTime) &&
        Objects.equals(disconnectedTime, conversationNotificationVideos.disconnectedTime) &&
        Objects.equals(additionalProperties, conversationNotificationVideos.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, id, context, audioMuted, videoMuted, sharingScreen, provider, disconnectType, connectedTime, disconnectedTime, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationNotificationVideos {\n");
    
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    audioMuted: ").append(toIndentedString(audioMuted)).append("\n");
    sb.append("    videoMuted: ").append(toIndentedString(videoMuted)).append("\n");
    sb.append("    sharingScreen: ").append(toIndentedString(sharingScreen)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    disconnectType: ").append(toIndentedString(disconnectType)).append("\n");
    sb.append("    connectedTime: ").append(toIndentedString(connectedTime)).append("\n");
    sb.append("    disconnectedTime: ").append(toIndentedString(disconnectedTime)).append("\n");
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
