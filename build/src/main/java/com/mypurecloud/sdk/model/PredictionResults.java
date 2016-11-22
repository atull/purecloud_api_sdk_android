package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class PredictionResults  implements Serializable {
  

  /**
   * Indicates the estimated wait time Formula
   */
  public enum FormulaEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("BEST")
    BEST("BEST"),

    @SerializedName("SIMPLE")
    SIMPLE("SIMPLE"),

    @SerializedName("ABANDON")
    ABANDON("ABANDON"),

    @SerializedName("PATIENCEABANDON")
    PATIENCEABANDON("PATIENCEABANDON");

    private String value;

    FormulaEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("formula")
  private FormulaEnum formula = null;

  @SerializedName("estimatedWaitTimeSeconds")
  private Integer estimatedWaitTimeSeconds = null;

  /**
   * Indicates the estimated wait time Formula
   **/
  @ApiModelProperty(required = true, value = "Indicates the estimated wait time Formula")
  public FormulaEnum getFormula() {
    return formula;
  }
  public void setFormula(FormulaEnum formula) {
    this.formula = formula;
  }

  /**
   * Estimated wait time in seconds
   **/
  @ApiModelProperty(required = true, value = "Estimated wait time in seconds")
  public Integer getEstimatedWaitTimeSeconds() {
    return estimatedWaitTimeSeconds;
  }
  public void setEstimatedWaitTimeSeconds(Integer estimatedWaitTimeSeconds) {
    this.estimatedWaitTimeSeconds = estimatedWaitTimeSeconds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PredictionResults predictionResults = (PredictionResults) o;
    return Objects.equals(formula, predictionResults.formula) &&
        Objects.equals(estimatedWaitTimeSeconds, predictionResults.estimatedWaitTimeSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formula, estimatedWaitTimeSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PredictionResults {\n");
    
    sb.append("    formula: ").append(toIndentedString(formula)).append("\n");
    sb.append("    estimatedWaitTimeSeconds: ").append(toIndentedString(estimatedWaitTimeSeconds)).append("\n");
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
