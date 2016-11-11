package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.AnalyticsQueryAggregation;
import com.mypurecloud.sdk.model.AnalyticsQueryFilter;
import com.mypurecloud.sdk.model.PagingSpec;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class ConversationQuery  implements Serializable {
  
  @SerializedName("interval")
  private String interval = null;

  @SerializedName("conversationFilters")
  private List<AnalyticsQueryFilter> conversationFilters = new ArrayList<AnalyticsQueryFilter>();

  @SerializedName("evaluationFilters")
  private List<AnalyticsQueryFilter> evaluationFilters = new ArrayList<AnalyticsQueryFilter>();

  @SerializedName("segmentFilters")
  private List<AnalyticsQueryFilter> segmentFilters = new ArrayList<AnalyticsQueryFilter>();

  @SerializedName("aggregations")
  private List<AnalyticsQueryAggregation> aggregations = new ArrayList<AnalyticsQueryAggregation>();

  @SerializedName("paging")
  private PagingSpec paging = null;


  /**
   * Sort the result set in ascending/descending order. Default is ascending
   */
  public enum OrderEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("asc")
    ASC("asc"),

    @SerializedName("desc")
    DESC("desc");

    private String value;

    OrderEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("order")
  private OrderEnum order = null;


  /**
   * Specify which data element within the result set to use for sorting. The options  to use as a basis for sorting the results: conversationStart, segmentStart, and segmentEnd. If not specified, the default is conversationStart
   */
  public enum OrderByEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("conversationStart")
    CONVERSATIONSTART("conversationStart"),

    @SerializedName("segmentStart")
    SEGMENTSTART("segmentStart"),

    @SerializedName("segmentEnd")
    SEGMENTEND("segmentEnd");

    private String value;

    OrderByEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("orderBy")
  private OrderByEnum orderBy = null;

  /**
   * Specifies the date and time range of data being queried. Conversations MUST have started within this time range to potentially be included within the result set. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss
   **/
  @ApiModelProperty(value = "Specifies the date and time range of data being queried. Conversations MUST have started within this time range to potentially be included within the result set. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss")
  public String getInterval() {
    return interval;
  }
  public void setInterval(String interval) {
    this.interval = interval;
  }

  /**
   * Filters that target conversation-level data
   **/
  @ApiModelProperty(value = "Filters that target conversation-level data")
  public List<AnalyticsQueryFilter> getConversationFilters() {
    return conversationFilters;
  }
  public void setConversationFilters(List<AnalyticsQueryFilter> conversationFilters) {
    this.conversationFilters = conversationFilters;
  }

  /**
   * Filters that target quality management evaluation-level data
   **/
  @ApiModelProperty(value = "Filters that target quality management evaluation-level data")
  public List<AnalyticsQueryFilter> getEvaluationFilters() {
    return evaluationFilters;
  }
  public void setEvaluationFilters(List<AnalyticsQueryFilter> evaluationFilters) {
    this.evaluationFilters = evaluationFilters;
  }

  /**
   * Filters that target individual segments within a conversation
   **/
  @ApiModelProperty(value = "Filters that target individual segments within a conversation")
  public List<AnalyticsQueryFilter> getSegmentFilters() {
    return segmentFilters;
  }
  public void setSegmentFilters(List<AnalyticsQueryFilter> segmentFilters) {
    this.segmentFilters = segmentFilters;
  }

  /**
   * Include faceted search and aggregate roll-ups describing your search results. This does not function as a filter, but rather, summary data about the data matching your filters
   **/
  @ApiModelProperty(value = "Include faceted search and aggregate roll-ups describing your search results. This does not function as a filter, but rather, summary data about the data matching your filters")
  public List<AnalyticsQueryAggregation> getAggregations() {
    return aggregations;
  }
  public void setAggregations(List<AnalyticsQueryAggregation> aggregations) {
    this.aggregations = aggregations;
  }

  /**
   * Page size and number to control iterating through large result sets. Default page size is 25
   **/
  @ApiModelProperty(value = "Page size and number to control iterating through large result sets. Default page size is 25")
  public PagingSpec getPaging() {
    return paging;
  }
  public void setPaging(PagingSpec paging) {
    this.paging = paging;
  }

  /**
   * Sort the result set in ascending/descending order. Default is ascending
   **/
  @ApiModelProperty(value = "Sort the result set in ascending/descending order. Default is ascending")
  public OrderEnum getOrder() {
    return order;
  }
  public void setOrder(OrderEnum order) {
    this.order = order;
  }

  /**
   * Specify which data element within the result set to use for sorting. The options  to use as a basis for sorting the results: conversationStart, segmentStart, and segmentEnd. If not specified, the default is conversationStart
   **/
  @ApiModelProperty(value = "Specify which data element within the result set to use for sorting. The options  to use as a basis for sorting the results: conversationStart, segmentStart, and segmentEnd. If not specified, the default is conversationStart")
  public OrderByEnum getOrderBy() {
    return orderBy;
  }
  public void setOrderBy(OrderByEnum orderBy) {
    this.orderBy = orderBy;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationQuery conversationQuery = (ConversationQuery) o;
    return Objects.equals(interval, conversationQuery.interval) &&
        Objects.equals(conversationFilters, conversationQuery.conversationFilters) &&
        Objects.equals(evaluationFilters, conversationQuery.evaluationFilters) &&
        Objects.equals(segmentFilters, conversationQuery.segmentFilters) &&
        Objects.equals(aggregations, conversationQuery.aggregations) &&
        Objects.equals(paging, conversationQuery.paging) &&
        Objects.equals(order, conversationQuery.order) &&
        Objects.equals(orderBy, conversationQuery.orderBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, conversationFilters, evaluationFilters, segmentFilters, aggregations, paging, order, orderBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationQuery {\n");
    
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    conversationFilters: ").append(toIndentedString(conversationFilters)).append("\n");
    sb.append("    evaluationFilters: ").append(toIndentedString(evaluationFilters)).append("\n");
    sb.append("    segmentFilters: ").append(toIndentedString(segmentFilters)).append("\n");
    sb.append("    aggregations: ").append(toIndentedString(aggregations)).append("\n");
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
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
