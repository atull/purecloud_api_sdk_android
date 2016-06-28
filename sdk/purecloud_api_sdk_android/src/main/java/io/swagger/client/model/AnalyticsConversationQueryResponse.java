package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.AggregationResult;
import io.swagger.client.model.AnalyticsConversation;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class AnalyticsConversationQueryResponse   {
  
  @SerializedName("conversations")
  private List<AnalyticsConversation> conversations = new ArrayList<AnalyticsConversation>();

  @SerializedName("aggregations")
  private List<AggregationResult> aggregations = new ArrayList<AggregationResult>();

  /**
   **/
  @ApiModelProperty(value = "")
  public List<AnalyticsConversation> getConversations() {
    return conversations;
  }
  public void setConversations(List<AnalyticsConversation> conversations) {
    this.conversations = conversations;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<AggregationResult> getAggregations() {
    return aggregations;
  }
  public void setAggregations(List<AggregationResult> aggregations) {
    this.aggregations = aggregations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsConversationQueryResponse analyticsConversationQueryResponse = (AnalyticsConversationQueryResponse) o;
    return Objects.equals(conversations, analyticsConversationQueryResponse.conversations) &&
        Objects.equals(aggregations, analyticsConversationQueryResponse.aggregations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversations, aggregations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsConversationQueryResponse {\n");
    
    sb.append("    conversations: ").append(toIndentedString(conversations)).append("\n");
    sb.append("    aggregations: ").append(toIndentedString(aggregations)).append("\n");
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
