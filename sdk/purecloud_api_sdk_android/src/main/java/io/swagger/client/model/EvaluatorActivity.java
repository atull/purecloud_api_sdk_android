package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.User;

import com.google.gson.annotations.SerializedName;





public class EvaluatorActivity   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("evaluator")
  private User evaluator = null;

  @SerializedName("numEvaluationsAssigned")
  private Integer numEvaluationsAssigned = null;

  @SerializedName("numEvaluationsStarted")
  private Integer numEvaluationsStarted = null;

  @SerializedName("numEvaluationsCompleted")
  private Integer numEvaluationsCompleted = null;

  @SerializedName("numCalibrationsAssigned")
  private Integer numCalibrationsAssigned = null;

  @SerializedName("numCalibrationsStarted")
  private Integer numCalibrationsStarted = null;

  @SerializedName("numCalibrationsCompleted")
  private Integer numCalibrationsCompleted = null;

  @SerializedName("selfUri")
  private String selfUri = null;

  /**
   * The globally unique identifier for the object.
   **/
  @ApiModelProperty(value = "The globally unique identifier for the object.")
  public String getId() {
    return id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public User getEvaluator() {
    return evaluator;
  }
  public void setEvaluator(User evaluator) {
    this.evaluator = evaluator;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getNumEvaluationsAssigned() {
    return numEvaluationsAssigned;
  }
  public void setNumEvaluationsAssigned(Integer numEvaluationsAssigned) {
    this.numEvaluationsAssigned = numEvaluationsAssigned;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getNumEvaluationsStarted() {
    return numEvaluationsStarted;
  }
  public void setNumEvaluationsStarted(Integer numEvaluationsStarted) {
    this.numEvaluationsStarted = numEvaluationsStarted;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getNumEvaluationsCompleted() {
    return numEvaluationsCompleted;
  }
  public void setNumEvaluationsCompleted(Integer numEvaluationsCompleted) {
    this.numEvaluationsCompleted = numEvaluationsCompleted;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getNumCalibrationsAssigned() {
    return numCalibrationsAssigned;
  }
  public void setNumCalibrationsAssigned(Integer numCalibrationsAssigned) {
    this.numCalibrationsAssigned = numCalibrationsAssigned;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getNumCalibrationsStarted() {
    return numCalibrationsStarted;
  }
  public void setNumCalibrationsStarted(Integer numCalibrationsStarted) {
    this.numCalibrationsStarted = numCalibrationsStarted;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getNumCalibrationsCompleted() {
    return numCalibrationsCompleted;
  }
  public void setNumCalibrationsCompleted(Integer numCalibrationsCompleted) {
    this.numCalibrationsCompleted = numCalibrationsCompleted;
  }

  /**
   * The URI for this object
   **/
  @ApiModelProperty(value = "The URI for this object")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluatorActivity evaluatorActivity = (EvaluatorActivity) o;
    return Objects.equals(id, evaluatorActivity.id) &&
        Objects.equals(name, evaluatorActivity.name) &&
        Objects.equals(evaluator, evaluatorActivity.evaluator) &&
        Objects.equals(numEvaluationsAssigned, evaluatorActivity.numEvaluationsAssigned) &&
        Objects.equals(numEvaluationsStarted, evaluatorActivity.numEvaluationsStarted) &&
        Objects.equals(numEvaluationsCompleted, evaluatorActivity.numEvaluationsCompleted) &&
        Objects.equals(numCalibrationsAssigned, evaluatorActivity.numCalibrationsAssigned) &&
        Objects.equals(numCalibrationsStarted, evaluatorActivity.numCalibrationsStarted) &&
        Objects.equals(numCalibrationsCompleted, evaluatorActivity.numCalibrationsCompleted) &&
        Objects.equals(selfUri, evaluatorActivity.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, evaluator, numEvaluationsAssigned, numEvaluationsStarted, numEvaluationsCompleted, numCalibrationsAssigned, numCalibrationsStarted, numCalibrationsCompleted, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluatorActivity {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    evaluator: ").append(toIndentedString(evaluator)).append("\n");
    sb.append("    numEvaluationsAssigned: ").append(toIndentedString(numEvaluationsAssigned)).append("\n");
    sb.append("    numEvaluationsStarted: ").append(toIndentedString(numEvaluationsStarted)).append("\n");
    sb.append("    numEvaluationsCompleted: ").append(toIndentedString(numEvaluationsCompleted)).append("\n");
    sb.append("    numCalibrationsAssigned: ").append(toIndentedString(numCalibrationsAssigned)).append("\n");
    sb.append("    numCalibrationsStarted: ").append(toIndentedString(numCalibrationsStarted)).append("\n");
    sb.append("    numCalibrationsCompleted: ").append(toIndentedString(numCalibrationsCompleted)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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
