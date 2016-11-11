package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.AnalyticsQueryFilter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class ObservationQuery  implements Serializable {
  
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
    OWAITING("oWaiting"),

    @SerializedName("oOnQueueUsers")
    OONQUEUEUSERS("oOnQueueUsers"),

    @SerializedName("oOffQueueUsers")
    OOFFQUEUEUSERS("oOffQueueUsers");

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

  /**
   * Filter to return a subset of observations. Expresses boolean logical predicates as well as dimensional filters
   **/
  @ApiModelProperty(value = "Filter to return a subset of observations. Expresses boolean logical predicates as well as dimensional filters")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservationQuery observationQuery = (ObservationQuery) o;
    return Objects.equals(filter, observationQuery.filter) &&
        Objects.equals(metrics, observationQuery.metrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, metrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservationQuery {\n");
    
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
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
