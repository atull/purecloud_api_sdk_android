package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.EvaluationForm;
import io.swagger.client.model.TimeInterval;
import io.swagger.client.model.User;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class MeteredEvaluationAssignment   {
  
  @SerializedName("evaluationContextId")
  private String evaluationContextId = null;

  @SerializedName("evaluators")
  private List<User> evaluators = new ArrayList<User>();

  @SerializedName("maxNumberEvaluations")
  private Integer maxNumberEvaluations = null;

  @SerializedName("evaluationForm")
  private EvaluationForm evaluationForm = null;

  @SerializedName("assignToActiveUser")
  private Boolean assignToActiveUser = false;

  @SerializedName("timeInterval")
  private TimeInterval timeInterval = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getEvaluationContextId() {
    return evaluationContextId;
  }
  public void setEvaluationContextId(String evaluationContextId) {
    this.evaluationContextId = evaluationContextId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<User> getEvaluators() {
    return evaluators;
  }
  public void setEvaluators(List<User> evaluators) {
    this.evaluators = evaluators;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getMaxNumberEvaluations() {
    return maxNumberEvaluations;
  }
  public void setMaxNumberEvaluations(Integer maxNumberEvaluations) {
    this.maxNumberEvaluations = maxNumberEvaluations;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public EvaluationForm getEvaluationForm() {
    return evaluationForm;
  }
  public void setEvaluationForm(EvaluationForm evaluationForm) {
    this.evaluationForm = evaluationForm;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getAssignToActiveUser() {
    return assignToActiveUser;
  }
  public void setAssignToActiveUser(Boolean assignToActiveUser) {
    this.assignToActiveUser = assignToActiveUser;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TimeInterval getTimeInterval() {
    return timeInterval;
  }
  public void setTimeInterval(TimeInterval timeInterval) {
    this.timeInterval = timeInterval;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeteredEvaluationAssignment meteredEvaluationAssignment = (MeteredEvaluationAssignment) o;
    return Objects.equals(evaluationContextId, meteredEvaluationAssignment.evaluationContextId) &&
        Objects.equals(evaluators, meteredEvaluationAssignment.evaluators) &&
        Objects.equals(maxNumberEvaluations, meteredEvaluationAssignment.maxNumberEvaluations) &&
        Objects.equals(evaluationForm, meteredEvaluationAssignment.evaluationForm) &&
        Objects.equals(assignToActiveUser, meteredEvaluationAssignment.assignToActiveUser) &&
        Objects.equals(timeInterval, meteredEvaluationAssignment.timeInterval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evaluationContextId, evaluators, maxNumberEvaluations, evaluationForm, assignToActiveUser, timeInterval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeteredEvaluationAssignment {\n");
    
    sb.append("    evaluationContextId: ").append(toIndentedString(evaluationContextId)).append("\n");
    sb.append("    evaluators: ").append(toIndentedString(evaluators)).append("\n");
    sb.append("    maxNumberEvaluations: ").append(toIndentedString(maxNumberEvaluations)).append("\n");
    sb.append("    evaluationForm: ").append(toIndentedString(evaluationForm)).append("\n");
    sb.append("    assignToActiveUser: ").append(toIndentedString(assignToActiveUser)).append("\n");
    sb.append("    timeInterval: ").append(toIndentedString(timeInterval)).append("\n");
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
