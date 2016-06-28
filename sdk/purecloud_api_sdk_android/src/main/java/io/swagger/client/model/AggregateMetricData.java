package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.StatisticalSummary;

import com.google.gson.annotations.SerializedName;





public class AggregateMetricData   {
  

  /**
   * Gets or Sets metric
   */
  public enum MetricEnum {
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

  @SerializedName("qualifier")
  private String qualifier = null;

  @SerializedName("stats")
  private StatisticalSummary stats = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public MetricEnum getMetric() {
    return metric;
  }
  public void setMetric(MetricEnum metric) {
    this.metric = metric;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getQualifier() {
    return qualifier;
  }
  public void setQualifier(String qualifier) {
    this.qualifier = qualifier;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public StatisticalSummary getStats() {
    return stats;
  }
  public void setStats(StatisticalSummary stats) {
    this.stats = stats;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregateMetricData aggregateMetricData = (AggregateMetricData) o;
    return Objects.equals(metric, aggregateMetricData.metric) &&
        Objects.equals(qualifier, aggregateMetricData.qualifier) &&
        Objects.equals(stats, aggregateMetricData.stats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metric, qualifier, stats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregateMetricData {\n");
    
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    qualifier: ").append(toIndentedString(qualifier)).append("\n");
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
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
