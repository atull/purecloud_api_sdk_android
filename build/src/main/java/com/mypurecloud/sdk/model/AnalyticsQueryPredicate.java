package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.NumericRange;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class AnalyticsQueryPredicate  implements Serializable {
  

  /**
   * Optional type, can usually be inferred
   */
  public enum TypeEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("dimension")
    DIMENSION("dimension"),

    @SerializedName("property")
    PROPERTY("property"),

    @SerializedName("metric")
    METRIC("metric");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;


  /**
   * Left hand side for dimension predicates
   */
  public enum DimensionEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("conversationId")
    CONVERSATIONID("conversationId"),

    @SerializedName("sessionId")
    SESSIONID("sessionId"),

    @SerializedName("mediaType")
    MEDIATYPE("mediaType"),

    @SerializedName("queueId")
    QUEUEID("queueId"),

    @SerializedName("userId")
    USERID("userId"),

    @SerializedName("participantId")
    PARTICIPANTID("participantId"),

    @SerializedName("participantName")
    PARTICIPANTNAME("participantName"),

    @SerializedName("direction")
    DIRECTION("direction"),

    @SerializedName("wrapUpCode")
    WRAPUPCODE("wrapUpCode"),

    @SerializedName("wrapUpNote")
    WRAPUPNOTE("wrapUpNote"),

    @SerializedName("interactionType")
    INTERACTIONTYPE("interactionType"),

    @SerializedName("requestedRoutingSkillId")
    REQUESTEDROUTINGSKILLID("requestedRoutingSkillId"),

    @SerializedName("requestedLanguageId")
    REQUESTEDLANGUAGEID("requestedLanguageId"),

    @SerializedName("purpose")
    PURPOSE("purpose"),

    @SerializedName("participantType")
    PARTICIPANTTYPE("participantType"),

    @SerializedName("segmentType")
    SEGMENTTYPE("segmentType"),

    @SerializedName("disconnectType")
    DISCONNECTTYPE("disconnectType"),

    @SerializedName("errorCode")
    ERRORCODE("errorCode"),

    @SerializedName("conversationEnd")
    CONVERSATIONEND("conversationEnd"),

    @SerializedName("stationId")
    STATIONID("stationId"),

    @SerializedName("edgeId")
    EDGEID("edgeId"),

    @SerializedName("dnis")
    DNIS("dnis"),

    @SerializedName("ani")
    ANI("ani"),

    @SerializedName("outboundCampaignId")
    OUTBOUNDCAMPAIGNID("outboundCampaignId"),

    @SerializedName("outboundContactId")
    OUTBOUNDCONTACTID("outboundContactId"),

    @SerializedName("outboundContactListId")
    OUTBOUNDCONTACTLISTID("outboundContactListId"),

    @SerializedName("monitoredParticipantId")
    MONITOREDPARTICIPANTID("monitoredParticipantId"),

    @SerializedName("sourceSessionId")
    SOURCESESSIONID("sourceSessionId"),

    @SerializedName("destinationSessionId")
    DESTINATIONSESSIONID("destinationSessionId"),

    @SerializedName("sourceConversationId")
    SOURCECONVERSATIONID("sourceConversationId"),

    @SerializedName("destinationConversationId")
    DESTINATIONCONVERSATIONID("destinationConversationId"),

    @SerializedName("remoteNameDisplayable")
    REMOTENAMEDISPLAYABLE("remoteNameDisplayable"),

    @SerializedName("sipResponseCode")
    SIPRESPONSECODE("sipResponseCode"),

    @SerializedName("q850ResponseCode")
    Q850RESPONSECODE("q850ResponseCode"),

    @SerializedName("conference")
    CONFERENCE("conference"),

    @SerializedName("groupId")
    GROUPID("groupId"),

    @SerializedName("roomId")
    ROOMID("roomId"),

    @SerializedName("addressFrom")
    ADDRESSFROM("addressFrom"),

    @SerializedName("addressTo")
    ADDRESSTO("addressTo"),

    @SerializedName("peerId")
    PEERID("peerId"),

    @SerializedName("scriptId")
    SCRIPTID("scriptId"),

    @SerializedName("evaluationId")
    EVALUATIONID("evaluationId"),

    @SerializedName("evaluatorId")
    EVALUATORID("evaluatorId"),

    @SerializedName("contextId")
    CONTEXTID("contextId"),

    @SerializedName("formId")
    FORMID("formId"),

    @SerializedName("formName")
    FORMNAME("formName"),

    @SerializedName("eventTime")
    EVENTTIME("eventTime");

    private String value;

    DimensionEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("dimension")
  private DimensionEnum dimension = null;


  /**
   * Left hand side for property predicates
   */
  public enum PropertyTypeEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("bool")
    BOOL("bool"),

    @SerializedName("integer")
    INTEGER("integer"),

    @SerializedName("real")
    REAL("real"),

    @SerializedName("date")
    DATE("date"),

    @SerializedName("string")
    STRING("string"),

    @SerializedName("uuid")
    UUID("uuid");

    private String value;

    PropertyTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("propertyType")
  private PropertyTypeEnum propertyType = null;

  @SerializedName("property")
  private String property = null;


  /**
   * Left hand side for metric predicates
   */
  public enum MetricEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("tSegmentDuration")
    TSEGMENTDURATION("tSegmentDuration"),

    @SerializedName("oTotalCriticalScore")
    OTOTALCRITICALSCORE("oTotalCriticalScore"),

    @SerializedName("oTotalScore")
    OTOTALSCORE("oTotalScore"),

    @SerializedName("nEvaluations")
    NEVALUATIONS("nEvaluations"),

    @SerializedName("tAbandon")
    TABANDON("tAbandon"),

    @SerializedName("tIvr")
    TIVR("tIvr"),

    @SerializedName("tAnswered")
    TANSWERED("tAnswered"),

    @SerializedName("tAcd")
    TACD("tAcd"),

    @SerializedName("tTalk")
    TTALK("tTalk"),

    @SerializedName("tHeld")
    THELD("tHeld"),

    @SerializedName("tTalkComplete")
    TTALKCOMPLETE("tTalkComplete"),

    @SerializedName("tHeldComplete")
    THELDCOMPLETE("tHeldComplete"),

    @SerializedName("tAcw")
    TACW("tAcw"),

    @SerializedName("tHandle")
    THANDLE("tHandle"),

    @SerializedName("tWait")
    TWAIT("tWait"),

    @SerializedName("tAgentRoutingStatus")
    TAGENTROUTINGSTATUS("tAgentRoutingStatus"),

    @SerializedName("tOrganizationPresence")
    TORGANIZATIONPRESENCE("tOrganizationPresence"),

    @SerializedName("tSystemPresence")
    TSYSTEMPRESENCE("tSystemPresence"),

    @SerializedName("tUserResponseTime")
    TUSERRESPONSETIME("tUserResponseTime"),

    @SerializedName("tAgentResponseTime")
    TAGENTRESPONSETIME("tAgentResponseTime"),

    @SerializedName("nOffered")
    NOFFERED("nOffered"),

    @SerializedName("nOverSla")
    NOVERSLA("nOverSla"),

    @SerializedName("nTransferred")
    NTRANSFERRED("nTransferred"),

    @SerializedName("nOutboundAttempted")
    NOUTBOUNDATTEMPTED("nOutboundAttempted"),

    @SerializedName("nOutboundConnected")
    NOUTBOUNDCONNECTED("nOutboundConnected"),

    @SerializedName("nOutboundAbandoned")
    NOUTBOUNDABANDONED("nOutboundAbandoned"),

    @SerializedName("nError")
    NERROR("nError"),

    @SerializedName("oServiceTarget")
    OSERVICETARGET("oServiceTarget"),

    @SerializedName("oServiceLevel")
    OSERVICELEVEL("oServiceLevel"),

    @SerializedName("tActive")
    TACTIVE("tActive"),

    @SerializedName("tInactive")
    TINACTIVE("tInactive"),

    @SerializedName("oActiveUsers")
    OACTIVEUSERS("oActiveUsers"),

    @SerializedName("oMemberUsers")
    OMEMBERUSERS("oMemberUsers"),

    @SerializedName("oActiveQueues")
    OACTIVEQUEUES("oActiveQueues"),

    @SerializedName("oMemberQueues")
    OMEMBERQUEUES("oMemberQueues"),

    @SerializedName("oInteracting")
    OINTERACTING("oInteracting"),

    @SerializedName("oWaiting")
    OWAITING("oWaiting"),

    @SerializedName("oOnQueueUsers")
    OONQUEUEUSERS("oOnQueueUsers"),

    @SerializedName("oOffQueueUsers")
    OOFFQUEUEUSERS("oOffQueueUsers");

    private String value;

    MetricEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("metric")
  private MetricEnum metric = null;


  /**
   * Optional operator, default is matches
   */
  public enum OperatorEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("matches")
    MATCHES("matches"),

    @SerializedName("exists")
    EXISTS("exists"),

    @SerializedName("notExists")
    NOTEXISTS("notExists");

    private String value;

    OperatorEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("operator")
  private OperatorEnum operator = null;

  @SerializedName("value")
  private String value = null;

  @SerializedName("range")
  private NumericRange range = null;

  /**
   * Optional type, can usually be inferred
   **/
  @ApiModelProperty(value = "Optional type, can usually be inferred")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Left hand side for dimension predicates
   **/
  @ApiModelProperty(value = "Left hand side for dimension predicates")
  public DimensionEnum getDimension() {
    return dimension;
  }
  public void setDimension(DimensionEnum dimension) {
    this.dimension = dimension;
  }

  /**
   * Left hand side for property predicates
   **/
  @ApiModelProperty(value = "Left hand side for property predicates")
  public PropertyTypeEnum getPropertyType() {
    return propertyType;
  }
  public void setPropertyType(PropertyTypeEnum propertyType) {
    this.propertyType = propertyType;
  }

  /**
   * Left hand side for property predicates
   **/
  @ApiModelProperty(value = "Left hand side for property predicates")
  public String getProperty() {
    return property;
  }
  public void setProperty(String property) {
    this.property = property;
  }

  /**
   * Left hand side for metric predicates
   **/
  @ApiModelProperty(value = "Left hand side for metric predicates")
  public MetricEnum getMetric() {
    return metric;
  }
  public void setMetric(MetricEnum metric) {
    this.metric = metric;
  }

  /**
   * Optional operator, default is matches
   **/
  @ApiModelProperty(value = "Optional operator, default is matches")
  public OperatorEnum getOperator() {
    return operator;
  }
  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }

  /**
   * Right hand side for dimension, property, or metric predicates
   **/
  @ApiModelProperty(value = "Right hand side for dimension, property, or metric predicates")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * Right hand side for property or metric predicates
   **/
  @ApiModelProperty(value = "Right hand side for property or metric predicates")
  public NumericRange getRange() {
    return range;
  }
  public void setRange(NumericRange range) {
    this.range = range;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsQueryPredicate analyticsQueryPredicate = (AnalyticsQueryPredicate) o;
    return Objects.equals(type, analyticsQueryPredicate.type) &&
        Objects.equals(dimension, analyticsQueryPredicate.dimension) &&
        Objects.equals(propertyType, analyticsQueryPredicate.propertyType) &&
        Objects.equals(property, analyticsQueryPredicate.property) &&
        Objects.equals(metric, analyticsQueryPredicate.metric) &&
        Objects.equals(operator, analyticsQueryPredicate.operator) &&
        Objects.equals(value, analyticsQueryPredicate.value) &&
        Objects.equals(range, analyticsQueryPredicate.range);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, dimension, propertyType, property, metric, operator, value, range);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsQueryPredicate {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
    sb.append("    propertyType: ").append(toIndentedString(propertyType)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
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
