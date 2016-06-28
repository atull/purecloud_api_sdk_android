package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.AnalyticsQueryFilter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class AggregationQuery   {
  
  @SerializedName("interval")
  private String interval = null;

  @SerializedName("granularity")
  private Date granularity = null;


  /**
   * Gets or Sets groupBy
   */
  public enum GroupByEnum {
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

    GroupByEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("groupBy")
  private List<GroupByEnum> groupBy = new ArrayList<GroupByEnum>();

  @SerializedName("filter")
  private AnalyticsQueryFilter filter = null;


  /**
   * Gets or Sets metrics
   */
  public enum MetricsEnum {
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
    OWAITING("oWaiting");

    private String value;

    MetricsEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("metrics")
  private List<MetricsEnum> metrics = new ArrayList<MetricsEnum>();

  @SerializedName("flattenMultivaluedDimensions")
  private Boolean flattenMultivaluedDimensions = false;

  /**
   * Behaves like one clause in a SQL WHERE. Specifies the date and time range of data being queried. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss
   **/
  @ApiModelProperty(value = "Behaves like one clause in a SQL WHERE. Specifies the date and time range of data being queried. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss")
  public String getInterval() {
    return interval;
  }
  public void setInterval(String interval) {
    this.interval = interval;
  }

  /**
   * Granularity aggregates metrics into subpartitions within the time interval specified. The default granularity is the same duration as the interval. Periods are represented as an ISO-8601 string. For example: P1D or P1DT12H
   **/
  @ApiModelProperty(value = "Granularity aggregates metrics into subpartitions within the time interval specified. The default granularity is the same duration as the interval. Periods are represented as an ISO-8601 string. For example: P1D or P1DT12H")
  public Date getGranularity() {
    return granularity;
  }
  public void setGranularity(Date granularity) {
    this.granularity = granularity;
  }

  /**
   * Behaves like a SQL GROUPBY. Allows for multiple levels of grouping as a list of dimensions. Partitions resulting aggregate computations into distinct named subgroups rather than across the entire result set as if it were one group.
   **/
  @ApiModelProperty(value = "Behaves like a SQL GROUPBY. Allows for multiple levels of grouping as a list of dimensions. Partitions resulting aggregate computations into distinct named subgroups rather than across the entire result set as if it were one group.")
  public List<GroupByEnum> getGroupBy() {
    return groupBy;
  }
  public void setGroupBy(List<GroupByEnum> groupBy) {
    this.groupBy = groupBy;
  }

  /**
   * Behaves like a SQL WHERE clause. This is ANDed with the interval parameter. Expresses boolean logical predicates as well as dimensional filters
   **/
  @ApiModelProperty(value = "Behaves like a SQL WHERE clause. This is ANDed with the interval parameter. Expresses boolean logical predicates as well as dimensional filters")
  public AnalyticsQueryFilter getFilter() {
    return filter;
  }
  public void setFilter(AnalyticsQueryFilter filter) {
    this.filter = filter;
  }

  /**
   * Behaves like a SQL SELECT clause. Enables retrieving only named metrics. If omitted, all metrics that are available will be returned (like SELECT *).
   **/
  @ApiModelProperty(value = "Behaves like a SQL SELECT clause. Enables retrieving only named metrics. If omitted, all metrics that are available will be returned (like SELECT *).")
  public List<MetricsEnum> getMetrics() {
    return metrics;
  }
  public void setMetrics(List<MetricsEnum> metrics) {
    this.metrics = metrics;
  }

  /**
   * Flattens any multivalued dimensions used in response groups (e.g. ['a','b','c']->'a,b,c')
   **/
  @ApiModelProperty(value = "Flattens any multivalued dimensions used in response groups (e.g. ['a','b','c']->'a,b,c')")
  public Boolean getFlattenMultivaluedDimensions() {
    return flattenMultivaluedDimensions;
  }
  public void setFlattenMultivaluedDimensions(Boolean flattenMultivaluedDimensions) {
    this.flattenMultivaluedDimensions = flattenMultivaluedDimensions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregationQuery aggregationQuery = (AggregationQuery) o;
    return Objects.equals(interval, aggregationQuery.interval) &&
        Objects.equals(granularity, aggregationQuery.granularity) &&
        Objects.equals(groupBy, aggregationQuery.groupBy) &&
        Objects.equals(filter, aggregationQuery.filter) &&
        Objects.equals(metrics, aggregationQuery.metrics) &&
        Objects.equals(flattenMultivaluedDimensions, aggregationQuery.flattenMultivaluedDimensions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, granularity, groupBy, filter, metrics, flattenMultivaluedDimensions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregationQuery {\n");
    
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    granularity: ").append(toIndentedString(granularity)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    flattenMultivaluedDimensions: ").append(toIndentedString(flattenMultivaluedDimensions)).append("\n");
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
