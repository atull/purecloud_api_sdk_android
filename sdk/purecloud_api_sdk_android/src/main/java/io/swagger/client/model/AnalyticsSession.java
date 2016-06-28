package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.AnalyticsConversationSegment;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class AnalyticsSession   {
  

  /**
   * Gets or Sets mediaType
   */
  public enum MediaTypeEnum {
    @SerializedName("voice")
    VOICE("voice"),

    @SerializedName("chat")
    CHAT("chat"),

    @SerializedName("email")
    EMAIL("email"),

    @SerializedName("callback")
    CALLBACK("callback");

    private String value;

    MediaTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("mediaType")
  private MediaTypeEnum mediaType = null;

  @SerializedName("sessionId")
  private String sessionId = null;

  @SerializedName("addressOther")
  private String addressOther = null;

  @SerializedName("addressSelf")
  private String addressSelf = null;

  @SerializedName("ani")
  private String ani = null;


  /**
   * Gets or Sets direction
   */
  public enum DirectionEnum {
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

  @SerializedName("dnis")
  private String dnis = null;

  @SerializedName("outboundCampaignId")
  private String outboundCampaignId = null;

  @SerializedName("outboundContactId")
  private String outboundContactId = null;

  @SerializedName("outboundContactListId")
  private String outboundContactListId = null;

  @SerializedName("dispositionAnalyzer")
  private String dispositionAnalyzer = null;

  @SerializedName("dispositionName")
  private String dispositionName = null;

  @SerializedName("edgeId")
  private String edgeId = null;

  @SerializedName("remoteNameDisplayable")
  private String remoteNameDisplayable = null;

  @SerializedName("roomId")
  private String roomId = null;

  @SerializedName("monitoredSessionId")
  private String monitoredSessionId = null;

  @SerializedName("monitoredParticipantId")
  private String monitoredParticipantId = null;

  @SerializedName("callbackUserName")
  private String callbackUserName = null;

  @SerializedName("callbackNumbers")
  private List<String> callbackNumbers = new ArrayList<String>();

  @SerializedName("callbackScheduledTime")
  private Date callbackScheduledTime = null;

  @SerializedName("scriptId")
  private String scriptId = null;

  @SerializedName("skipEnabled")
  private Boolean skipEnabled = false;

  @SerializedName("timeoutSeconds")
  private Integer timeoutSeconds = null;

  @SerializedName("segments")
  private List<AnalyticsConversationSegment> segments = new ArrayList<AnalyticsConversationSegment>();

  /**
   **/
  @ApiModelProperty(value = "")
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }
  public void setMediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSessionId() {
    return sessionId;
  }
  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getAddressOther() {
    return addressOther;
  }
  public void setAddressOther(String addressOther) {
    this.addressOther = addressOther;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getAddressSelf() {
    return addressSelf;
  }
  public void setAddressSelf(String addressSelf) {
    this.addressSelf = addressSelf;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getAni() {
    return ani;
  }
  public void setAni(String ani) {
    this.ani = ani;
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
  public String getDnis() {
    return dnis;
  }
  public void setDnis(String dnis) {
    this.dnis = dnis;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getOutboundCampaignId() {
    return outboundCampaignId;
  }
  public void setOutboundCampaignId(String outboundCampaignId) {
    this.outboundCampaignId = outboundCampaignId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getOutboundContactId() {
    return outboundContactId;
  }
  public void setOutboundContactId(String outboundContactId) {
    this.outboundContactId = outboundContactId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getOutboundContactListId() {
    return outboundContactListId;
  }
  public void setOutboundContactListId(String outboundContactListId) {
    this.outboundContactListId = outboundContactListId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDispositionAnalyzer() {
    return dispositionAnalyzer;
  }
  public void setDispositionAnalyzer(String dispositionAnalyzer) {
    this.dispositionAnalyzer = dispositionAnalyzer;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDispositionName() {
    return dispositionName;
  }
  public void setDispositionName(String dispositionName) {
    this.dispositionName = dispositionName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getEdgeId() {
    return edgeId;
  }
  public void setEdgeId(String edgeId) {
    this.edgeId = edgeId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getRemoteNameDisplayable() {
    return remoteNameDisplayable;
  }
  public void setRemoteNameDisplayable(String remoteNameDisplayable) {
    this.remoteNameDisplayable = remoteNameDisplayable;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getRoomId() {
    return roomId;
  }
  public void setRoomId(String roomId) {
    this.roomId = roomId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getMonitoredSessionId() {
    return monitoredSessionId;
  }
  public void setMonitoredSessionId(String monitoredSessionId) {
    this.monitoredSessionId = monitoredSessionId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getMonitoredParticipantId() {
    return monitoredParticipantId;
  }
  public void setMonitoredParticipantId(String monitoredParticipantId) {
    this.monitoredParticipantId = monitoredParticipantId;
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
  public List<String> getCallbackNumbers() {
    return callbackNumbers;
  }
  public void setCallbackNumbers(List<String> callbackNumbers) {
    this.callbackNumbers = callbackNumbers;
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
  public List<AnalyticsConversationSegment> getSegments() {
    return segments;
  }
  public void setSegments(List<AnalyticsConversationSegment> segments) {
    this.segments = segments;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsSession analyticsSession = (AnalyticsSession) o;
    return Objects.equals(mediaType, analyticsSession.mediaType) &&
        Objects.equals(sessionId, analyticsSession.sessionId) &&
        Objects.equals(addressOther, analyticsSession.addressOther) &&
        Objects.equals(addressSelf, analyticsSession.addressSelf) &&
        Objects.equals(ani, analyticsSession.ani) &&
        Objects.equals(direction, analyticsSession.direction) &&
        Objects.equals(dnis, analyticsSession.dnis) &&
        Objects.equals(outboundCampaignId, analyticsSession.outboundCampaignId) &&
        Objects.equals(outboundContactId, analyticsSession.outboundContactId) &&
        Objects.equals(outboundContactListId, analyticsSession.outboundContactListId) &&
        Objects.equals(dispositionAnalyzer, analyticsSession.dispositionAnalyzer) &&
        Objects.equals(dispositionName, analyticsSession.dispositionName) &&
        Objects.equals(edgeId, analyticsSession.edgeId) &&
        Objects.equals(remoteNameDisplayable, analyticsSession.remoteNameDisplayable) &&
        Objects.equals(roomId, analyticsSession.roomId) &&
        Objects.equals(monitoredSessionId, analyticsSession.monitoredSessionId) &&
        Objects.equals(monitoredParticipantId, analyticsSession.monitoredParticipantId) &&
        Objects.equals(callbackUserName, analyticsSession.callbackUserName) &&
        Objects.equals(callbackNumbers, analyticsSession.callbackNumbers) &&
        Objects.equals(callbackScheduledTime, analyticsSession.callbackScheduledTime) &&
        Objects.equals(scriptId, analyticsSession.scriptId) &&
        Objects.equals(skipEnabled, analyticsSession.skipEnabled) &&
        Objects.equals(timeoutSeconds, analyticsSession.timeoutSeconds) &&
        Objects.equals(segments, analyticsSession.segments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaType, sessionId, addressOther, addressSelf, ani, direction, dnis, outboundCampaignId, outboundContactId, outboundContactListId, dispositionAnalyzer, dispositionName, edgeId, remoteNameDisplayable, roomId, monitoredSessionId, monitoredParticipantId, callbackUserName, callbackNumbers, callbackScheduledTime, scriptId, skipEnabled, timeoutSeconds, segments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsSession {\n");
    
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    addressOther: ").append(toIndentedString(addressOther)).append("\n");
    sb.append("    addressSelf: ").append(toIndentedString(addressSelf)).append("\n");
    sb.append("    ani: ").append(toIndentedString(ani)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    dnis: ").append(toIndentedString(dnis)).append("\n");
    sb.append("    outboundCampaignId: ").append(toIndentedString(outboundCampaignId)).append("\n");
    sb.append("    outboundContactId: ").append(toIndentedString(outboundContactId)).append("\n");
    sb.append("    outboundContactListId: ").append(toIndentedString(outboundContactListId)).append("\n");
    sb.append("    dispositionAnalyzer: ").append(toIndentedString(dispositionAnalyzer)).append("\n");
    sb.append("    dispositionName: ").append(toIndentedString(dispositionName)).append("\n");
    sb.append("    edgeId: ").append(toIndentedString(edgeId)).append("\n");
    sb.append("    remoteNameDisplayable: ").append(toIndentedString(remoteNameDisplayable)).append("\n");
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
    sb.append("    monitoredSessionId: ").append(toIndentedString(monitoredSessionId)).append("\n");
    sb.append("    monitoredParticipantId: ").append(toIndentedString(monitoredParticipantId)).append("\n");
    sb.append("    callbackUserName: ").append(toIndentedString(callbackUserName)).append("\n");
    sb.append("    callbackNumbers: ").append(toIndentedString(callbackNumbers)).append("\n");
    sb.append("    callbackScheduledTime: ").append(toIndentedString(callbackScheduledTime)).append("\n");
    sb.append("    scriptId: ").append(toIndentedString(scriptId)).append("\n");
    sb.append("    skipEnabled: ").append(toIndentedString(skipEnabled)).append("\n");
    sb.append("    timeoutSeconds: ").append(toIndentedString(timeoutSeconds)).append("\n");
    sb.append("    segments: ").append(toIndentedString(segments)).append("\n");
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
