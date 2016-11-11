package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.AnalyticsProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class AnalyticsConversationSegment  implements Serializable {
  
  @SerializedName("segmentStart")
  private Date segmentStart = null;

  @SerializedName("segmentEnd")
  private Date segmentEnd = null;

  @SerializedName("queueId")
  private String queueId = null;

  @SerializedName("wrapUpCode")
  private String wrapUpCode = null;

  @SerializedName("wrapUpNote")
  private String wrapUpNote = null;

  @SerializedName("wrapUpTags")
  private List<String> wrapUpTags = new ArrayList<String>();

  @SerializedName("errorCode")
  private String errorCode = null;


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

    @SerializedName("error")
    ERROR("error"),

    @SerializedName("peer")
    PEER("peer"),

    @SerializedName("other")
    OTHER("other"),

    @SerializedName("spam")
    SPAM("spam"),

    @SerializedName("transportFailure")
    TRANSPORTFAILURE("transportFailure"),

    @SerializedName("conferenceTransfer")
    CONFERENCETRANSFER("conferenceTransfer"),

    @SerializedName("consultTransfer")
    CONSULTTRANSFER("consultTransfer"),

    @SerializedName("forwardTransfer")
    FORWARDTRANSFER("forwardTransfer");

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


  /**
   * Gets or Sets segmentType
   */
  public enum SegmentTypeEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("unknown")
    UNKNOWN("unknown"),

    @SerializedName("alert")
    ALERT("alert"),

    @SerializedName("system")
    SYSTEM("system"),

    @SerializedName("delay")
    DELAY("delay"),

    @SerializedName("hold")
    HOLD("hold"),

    @SerializedName("interact")
    INTERACT("interact"),

    @SerializedName("ivr")
    IVR("ivr"),

    @SerializedName("dialing")
    DIALING("dialing"),

    @SerializedName("wrapup")
    WRAPUP("wrapup"),

    @SerializedName("voicemail")
    VOICEMAIL("voicemail"),

    @SerializedName("scheduled")
    SCHEDULED("scheduled");

    private String value;

    SegmentTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("segmentType")
  private SegmentTypeEnum segmentType = null;

  @SerializedName("requestedRoutingUserIds")
  private List<String> requestedRoutingUserIds = new ArrayList<String>();

  @SerializedName("requestedRoutingSkillIds")
  private List<String> requestedRoutingSkillIds = new ArrayList<String>();

  @SerializedName("requestedLanguageId")
  private String requestedLanguageId = null;

  @SerializedName("properties")
  private List<AnalyticsProperty> properties = new ArrayList<AnalyticsProperty>();

  @SerializedName("sourceConversationId")
  private String sourceConversationId = null;

  @SerializedName("destinationConversationId")
  private String destinationConversationId = null;

  @SerializedName("sourceSessionId")
  private String sourceSessionId = null;

  @SerializedName("destinationSessionId")
  private String destinationSessionId = null;

  @SerializedName("sipResponseCodes")
  private List<Long> sipResponseCodes = new ArrayList<Long>();

  @SerializedName("q850ResponseCodes")
  private List<Long> q850ResponseCodes = new ArrayList<Long>();

  @SerializedName("conference")
  private Boolean conference = false;

  @SerializedName("groupId")
  private String groupId = null;

  @SerializedName("subject")
  private String subject = null;

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getSegmentStart() {
    return segmentStart;
  }
  public void setSegmentStart(Date segmentStart) {
    this.segmentStart = segmentStart;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getSegmentEnd() {
    return segmentEnd;
  }
  public void setSegmentEnd(Date segmentEnd) {
    this.segmentEnd = segmentEnd;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getQueueId() {
    return queueId;
  }
  public void setQueueId(String queueId) {
    this.queueId = queueId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getWrapUpCode() {
    return wrapUpCode;
  }
  public void setWrapUpCode(String wrapUpCode) {
    this.wrapUpCode = wrapUpCode;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getWrapUpNote() {
    return wrapUpNote;
  }
  public void setWrapUpNote(String wrapUpNote) {
    this.wrapUpNote = wrapUpNote;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getWrapUpTags() {
    return wrapUpTags;
  }
  public void setWrapUpTags(List<String> wrapUpTags) {
    this.wrapUpTags = wrapUpTags;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getErrorCode() {
    return errorCode;
  }
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
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
  public SegmentTypeEnum getSegmentType() {
    return segmentType;
  }
  public void setSegmentType(SegmentTypeEnum segmentType) {
    this.segmentType = segmentType;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getRequestedRoutingUserIds() {
    return requestedRoutingUserIds;
  }
  public void setRequestedRoutingUserIds(List<String> requestedRoutingUserIds) {
    this.requestedRoutingUserIds = requestedRoutingUserIds;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getRequestedRoutingSkillIds() {
    return requestedRoutingSkillIds;
  }
  public void setRequestedRoutingSkillIds(List<String> requestedRoutingSkillIds) {
    this.requestedRoutingSkillIds = requestedRoutingSkillIds;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getRequestedLanguageId() {
    return requestedLanguageId;
  }
  public void setRequestedLanguageId(String requestedLanguageId) {
    this.requestedLanguageId = requestedLanguageId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<AnalyticsProperty> getProperties() {
    return properties;
  }
  public void setProperties(List<AnalyticsProperty> properties) {
    this.properties = properties;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSourceConversationId() {
    return sourceConversationId;
  }
  public void setSourceConversationId(String sourceConversationId) {
    this.sourceConversationId = sourceConversationId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDestinationConversationId() {
    return destinationConversationId;
  }
  public void setDestinationConversationId(String destinationConversationId) {
    this.destinationConversationId = destinationConversationId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSourceSessionId() {
    return sourceSessionId;
  }
  public void setSourceSessionId(String sourceSessionId) {
    this.sourceSessionId = sourceSessionId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDestinationSessionId() {
    return destinationSessionId;
  }
  public void setDestinationSessionId(String destinationSessionId) {
    this.destinationSessionId = destinationSessionId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Long> getSipResponseCodes() {
    return sipResponseCodes;
  }
  public void setSipResponseCodes(List<Long> sipResponseCodes) {
    this.sipResponseCodes = sipResponseCodes;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Long> getQ850ResponseCodes() {
    return q850ResponseCodes;
  }
  public void setQ850ResponseCodes(List<Long> q850ResponseCodes) {
    this.q850ResponseCodes = q850ResponseCodes;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getConference() {
    return conference;
  }
  public void setConference(Boolean conference) {
    this.conference = conference;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getGroupId() {
    return groupId;
  }
  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSubject() {
    return subject;
  }
  public void setSubject(String subject) {
    this.subject = subject;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsConversationSegment analyticsConversationSegment = (AnalyticsConversationSegment) o;
    return Objects.equals(segmentStart, analyticsConversationSegment.segmentStart) &&
        Objects.equals(segmentEnd, analyticsConversationSegment.segmentEnd) &&
        Objects.equals(queueId, analyticsConversationSegment.queueId) &&
        Objects.equals(wrapUpCode, analyticsConversationSegment.wrapUpCode) &&
        Objects.equals(wrapUpNote, analyticsConversationSegment.wrapUpNote) &&
        Objects.equals(wrapUpTags, analyticsConversationSegment.wrapUpTags) &&
        Objects.equals(errorCode, analyticsConversationSegment.errorCode) &&
        Objects.equals(disconnectType, analyticsConversationSegment.disconnectType) &&
        Objects.equals(segmentType, analyticsConversationSegment.segmentType) &&
        Objects.equals(requestedRoutingUserIds, analyticsConversationSegment.requestedRoutingUserIds) &&
        Objects.equals(requestedRoutingSkillIds, analyticsConversationSegment.requestedRoutingSkillIds) &&
        Objects.equals(requestedLanguageId, analyticsConversationSegment.requestedLanguageId) &&
        Objects.equals(properties, analyticsConversationSegment.properties) &&
        Objects.equals(sourceConversationId, analyticsConversationSegment.sourceConversationId) &&
        Objects.equals(destinationConversationId, analyticsConversationSegment.destinationConversationId) &&
        Objects.equals(sourceSessionId, analyticsConversationSegment.sourceSessionId) &&
        Objects.equals(destinationSessionId, analyticsConversationSegment.destinationSessionId) &&
        Objects.equals(sipResponseCodes, analyticsConversationSegment.sipResponseCodes) &&
        Objects.equals(q850ResponseCodes, analyticsConversationSegment.q850ResponseCodes) &&
        Objects.equals(conference, analyticsConversationSegment.conference) &&
        Objects.equals(groupId, analyticsConversationSegment.groupId) &&
        Objects.equals(subject, analyticsConversationSegment.subject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(segmentStart, segmentEnd, queueId, wrapUpCode, wrapUpNote, wrapUpTags, errorCode, disconnectType, segmentType, requestedRoutingUserIds, requestedRoutingSkillIds, requestedLanguageId, properties, sourceConversationId, destinationConversationId, sourceSessionId, destinationSessionId, sipResponseCodes, q850ResponseCodes, conference, groupId, subject);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsConversationSegment {\n");
    
    sb.append("    segmentStart: ").append(toIndentedString(segmentStart)).append("\n");
    sb.append("    segmentEnd: ").append(toIndentedString(segmentEnd)).append("\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    wrapUpCode: ").append(toIndentedString(wrapUpCode)).append("\n");
    sb.append("    wrapUpNote: ").append(toIndentedString(wrapUpNote)).append("\n");
    sb.append("    wrapUpTags: ").append(toIndentedString(wrapUpTags)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    disconnectType: ").append(toIndentedString(disconnectType)).append("\n");
    sb.append("    segmentType: ").append(toIndentedString(segmentType)).append("\n");
    sb.append("    requestedRoutingUserIds: ").append(toIndentedString(requestedRoutingUserIds)).append("\n");
    sb.append("    requestedRoutingSkillIds: ").append(toIndentedString(requestedRoutingSkillIds)).append("\n");
    sb.append("    requestedLanguageId: ").append(toIndentedString(requestedLanguageId)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    sourceConversationId: ").append(toIndentedString(sourceConversationId)).append("\n");
    sb.append("    destinationConversationId: ").append(toIndentedString(destinationConversationId)).append("\n");
    sb.append("    sourceSessionId: ").append(toIndentedString(sourceSessionId)).append("\n");
    sb.append("    destinationSessionId: ").append(toIndentedString(destinationSessionId)).append("\n");
    sb.append("    sipResponseCodes: ").append(toIndentedString(sipResponseCodes)).append("\n");
    sb.append("    q850ResponseCodes: ").append(toIndentedString(q850ResponseCodes)).append("\n");
    sb.append("    conference: ").append(toIndentedString(conference)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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
