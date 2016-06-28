package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.CalibrationAssignment;
import io.swagger.client.model.EvaluationAssignment;
import io.swagger.client.model.InitiateScreenRecording;
import io.swagger.client.model.MeteredEvaluationAssignment;
import io.swagger.client.model.RetentionDuration;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class PolicyActions   {
  
  @SerializedName("retainRecording")
  private Boolean retainRecording = false;

  @SerializedName("deleteRecording")
  private Boolean deleteRecording = false;

  @SerializedName("alwaysDelete")
  private Boolean alwaysDelete = false;

  @SerializedName("assignEvaluations")
  private List<EvaluationAssignment> assignEvaluations = new ArrayList<EvaluationAssignment>();

  @SerializedName("assignMeteredEvaluations")
  private List<MeteredEvaluationAssignment> assignMeteredEvaluations = new ArrayList<MeteredEvaluationAssignment>();

  @SerializedName("assignCalibrations")
  private List<CalibrationAssignment> assignCalibrations = new ArrayList<CalibrationAssignment>();

  @SerializedName("retentionDuration")
  private RetentionDuration retentionDuration = null;

  @SerializedName("initiateScreenRecording")
  private InitiateScreenRecording initiateScreenRecording = null;

  /**
   * true to retain the recording associated with the conversation. Default = true
   **/
  @ApiModelProperty(value = "true to retain the recording associated with the conversation. Default = true")
  public Boolean getRetainRecording() {
    return retainRecording;
  }
  public void setRetainRecording(Boolean retainRecording) {
    this.retainRecording = retainRecording;
  }

  /**
   * true to delete the recording associated with the conversation. If retainRecording = true, this will be ignored. Default = false
   **/
  @ApiModelProperty(value = "true to delete the recording associated with the conversation. If retainRecording = true, this will be ignored. Default = false")
  public Boolean getDeleteRecording() {
    return deleteRecording;
  }
  public void setDeleteRecording(Boolean deleteRecording) {
    this.deleteRecording = deleteRecording;
  }

  /**
   * true to delete the recording associated with the conversation regardless of the values of retainRecording or deleteRecording. Default = false
   **/
  @ApiModelProperty(value = "true to delete the recording associated with the conversation regardless of the values of retainRecording or deleteRecording. Default = false")
  public Boolean getAlwaysDelete() {
    return alwaysDelete;
  }
  public void setAlwaysDelete(Boolean alwaysDelete) {
    this.alwaysDelete = alwaysDelete;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<EvaluationAssignment> getAssignEvaluations() {
    return assignEvaluations;
  }
  public void setAssignEvaluations(List<EvaluationAssignment> assignEvaluations) {
    this.assignEvaluations = assignEvaluations;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<MeteredEvaluationAssignment> getAssignMeteredEvaluations() {
    return assignMeteredEvaluations;
  }
  public void setAssignMeteredEvaluations(List<MeteredEvaluationAssignment> assignMeteredEvaluations) {
    this.assignMeteredEvaluations = assignMeteredEvaluations;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<CalibrationAssignment> getAssignCalibrations() {
    return assignCalibrations;
  }
  public void setAssignCalibrations(List<CalibrationAssignment> assignCalibrations) {
    this.assignCalibrations = assignCalibrations;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public RetentionDuration getRetentionDuration() {
    return retentionDuration;
  }
  public void setRetentionDuration(RetentionDuration retentionDuration) {
    this.retentionDuration = retentionDuration;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public InitiateScreenRecording getInitiateScreenRecording() {
    return initiateScreenRecording;
  }
  public void setInitiateScreenRecording(InitiateScreenRecording initiateScreenRecording) {
    this.initiateScreenRecording = initiateScreenRecording;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolicyActions policyActions = (PolicyActions) o;
    return Objects.equals(retainRecording, policyActions.retainRecording) &&
        Objects.equals(deleteRecording, policyActions.deleteRecording) &&
        Objects.equals(alwaysDelete, policyActions.alwaysDelete) &&
        Objects.equals(assignEvaluations, policyActions.assignEvaluations) &&
        Objects.equals(assignMeteredEvaluations, policyActions.assignMeteredEvaluations) &&
        Objects.equals(assignCalibrations, policyActions.assignCalibrations) &&
        Objects.equals(retentionDuration, policyActions.retentionDuration) &&
        Objects.equals(initiateScreenRecording, policyActions.initiateScreenRecording);
  }

  @Override
  public int hashCode() {
    return Objects.hash(retainRecording, deleteRecording, alwaysDelete, assignEvaluations, assignMeteredEvaluations, assignCalibrations, retentionDuration, initiateScreenRecording);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyActions {\n");
    
    sb.append("    retainRecording: ").append(toIndentedString(retainRecording)).append("\n");
    sb.append("    deleteRecording: ").append(toIndentedString(deleteRecording)).append("\n");
    sb.append("    alwaysDelete: ").append(toIndentedString(alwaysDelete)).append("\n");
    sb.append("    assignEvaluations: ").append(toIndentedString(assignEvaluations)).append("\n");
    sb.append("    assignMeteredEvaluations: ").append(toIndentedString(assignMeteredEvaluations)).append("\n");
    sb.append("    assignCalibrations: ").append(toIndentedString(assignCalibrations)).append("\n");
    sb.append("    retentionDuration: ").append(toIndentedString(retentionDuration)).append("\n");
    sb.append("    initiateScreenRecording: ").append(toIndentedString(initiateScreenRecording)).append("\n");
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
