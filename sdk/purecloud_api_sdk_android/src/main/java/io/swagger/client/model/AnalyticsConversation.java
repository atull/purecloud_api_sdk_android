package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.AnalyticsEvaluation;
import io.swagger.client.model.AnalyticsParticipant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class AnalyticsConversation   {
  
  @SerializedName("conversationId")
  private String conversationId = null;

  @SerializedName("conversationStart")
  private Date conversationStart = null;

  @SerializedName("participants")
  private List<AnalyticsParticipant> participants = new ArrayList<AnalyticsParticipant>();

  @SerializedName("evaluations")
  private List<AnalyticsEvaluation> evaluations = new ArrayList<AnalyticsEvaluation>();

  /**
   **/
  @ApiModelProperty(value = "")
  public String getConversationId() {
    return conversationId;
  }
  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getConversationStart() {
    return conversationStart;
  }
  public void setConversationStart(Date conversationStart) {
    this.conversationStart = conversationStart;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<AnalyticsParticipant> getParticipants() {
    return participants;
  }
  public void setParticipants(List<AnalyticsParticipant> participants) {
    this.participants = participants;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<AnalyticsEvaluation> getEvaluations() {
    return evaluations;
  }
  public void setEvaluations(List<AnalyticsEvaluation> evaluations) {
    this.evaluations = evaluations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsConversation analyticsConversation = (AnalyticsConversation) o;
    return Objects.equals(conversationId, analyticsConversation.conversationId) &&
        Objects.equals(conversationStart, analyticsConversation.conversationStart) &&
        Objects.equals(participants, analyticsConversation.participants) &&
        Objects.equals(evaluations, analyticsConversation.evaluations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversationId, conversationStart, participants, evaluations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsConversation {\n");
    
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    conversationStart: ").append(toIndentedString(conversationStart)).append("\n");
    sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
    sb.append("    evaluations: ").append(toIndentedString(evaluations)).append("\n");
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
