package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class AnalyticsEvaluation  implements Serializable {
  
  @SerializedName("evaluationId")
  private String evaluationId = null;

  @SerializedName("evaluatorId")
  private String evaluatorId = null;

  @SerializedName("userId")
  private String userId = null;

  @SerializedName("eventTime")
  private String eventTime = null;

  @SerializedName("queueId")
  private String queueId = null;

  @SerializedName("formId")
  private String formId = null;

  @SerializedName("contextId")
  private String contextId = null;

  @SerializedName("formName")
  private String formName = null;

  @SerializedName("getoTotalScore")
  private Long getoTotalScore = null;

  @SerializedName("getoTotalCriticalScore")
  private Long getoTotalCriticalScore = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getEvaluationId() {
    return evaluationId;
  }
  public void setEvaluationId(String evaluationId) {
    this.evaluationId = evaluationId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getEvaluatorId() {
    return evaluatorId;
  }
  public void setEvaluatorId(String evaluatorId) {
    this.evaluatorId = evaluatorId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getEventTime() {
    return eventTime;
  }
  public void setEventTime(String eventTime) {
    this.eventTime = eventTime;
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
  public String getFormId() {
    return formId;
  }
  public void setFormId(String formId) {
    this.formId = formId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getContextId() {
    return contextId;
  }
  public void setContextId(String contextId) {
    this.contextId = contextId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getFormName() {
    return formName;
  }
  public void setFormName(String formName) {
    this.formName = formName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getGetoTotalScore() {
    return getoTotalScore;
  }
  public void setGetoTotalScore(Long getoTotalScore) {
    this.getoTotalScore = getoTotalScore;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getGetoTotalCriticalScore() {
    return getoTotalCriticalScore;
  }
  public void setGetoTotalCriticalScore(Long getoTotalCriticalScore) {
    this.getoTotalCriticalScore = getoTotalCriticalScore;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsEvaluation analyticsEvaluation = (AnalyticsEvaluation) o;
    return Objects.equals(evaluationId, analyticsEvaluation.evaluationId) &&
        Objects.equals(evaluatorId, analyticsEvaluation.evaluatorId) &&
        Objects.equals(userId, analyticsEvaluation.userId) &&
        Objects.equals(eventTime, analyticsEvaluation.eventTime) &&
        Objects.equals(queueId, analyticsEvaluation.queueId) &&
        Objects.equals(formId, analyticsEvaluation.formId) &&
        Objects.equals(contextId, analyticsEvaluation.contextId) &&
        Objects.equals(formName, analyticsEvaluation.formName) &&
        Objects.equals(getoTotalScore, analyticsEvaluation.getoTotalScore) &&
        Objects.equals(getoTotalCriticalScore, analyticsEvaluation.getoTotalCriticalScore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evaluationId, evaluatorId, userId, eventTime, queueId, formId, contextId, formName, getoTotalScore, getoTotalCriticalScore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsEvaluation {\n");
    
    sb.append("    evaluationId: ").append(toIndentedString(evaluationId)).append("\n");
    sb.append("    evaluatorId: ").append(toIndentedString(evaluatorId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    formId: ").append(toIndentedString(formId)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    formName: ").append(toIndentedString(formName)).append("\n");
    sb.append("    getoTotalScore: ").append(toIndentedString(getoTotalScore)).append("\n");
    sb.append("    getoTotalCriticalScore: ").append(toIndentedString(getoTotalCriticalScore)).append("\n");
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
