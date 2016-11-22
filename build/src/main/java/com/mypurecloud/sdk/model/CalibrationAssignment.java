package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.EvaluationForm;
import com.mypurecloud.sdk.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class CalibrationAssignment  implements Serializable {
  
  @SerializedName("calibrator")
  private User calibrator = null;

  @SerializedName("evaluators")
  private List<User> evaluators = new ArrayList<User>();

  @SerializedName("evaluationForm")
  private EvaluationForm evaluationForm = null;

  @SerializedName("expertEvaluator")
  private User expertEvaluator = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public User getCalibrator() {
    return calibrator;
  }
  public void setCalibrator(User calibrator) {
    this.calibrator = calibrator;
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
  public EvaluationForm getEvaluationForm() {
    return evaluationForm;
  }
  public void setEvaluationForm(EvaluationForm evaluationForm) {
    this.evaluationForm = evaluationForm;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public User getExpertEvaluator() {
    return expertEvaluator;
  }
  public void setExpertEvaluator(User expertEvaluator) {
    this.expertEvaluator = expertEvaluator;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalibrationAssignment calibrationAssignment = (CalibrationAssignment) o;
    return Objects.equals(calibrator, calibrationAssignment.calibrator) &&
        Objects.equals(evaluators, calibrationAssignment.evaluators) &&
        Objects.equals(evaluationForm, calibrationAssignment.evaluationForm) &&
        Objects.equals(expertEvaluator, calibrationAssignment.expertEvaluator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calibrator, evaluators, evaluationForm, expertEvaluator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalibrationAssignment {\n");
    
    sb.append("    calibrator: ").append(toIndentedString(calibrator)).append("\n");
    sb.append("    evaluators: ").append(toIndentedString(evaluators)).append("\n");
    sb.append("    evaluationForm: ").append(toIndentedString(evaluationForm)).append("\n");
    sb.append("    expertEvaluator: ").append(toIndentedString(expertEvaluator)).append("\n");
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
