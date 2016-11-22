package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.PredictionResults;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class EstimatedWaitTimePredictions  implements Serializable {
  
  @SerializedName("results")
  private List<PredictionResults> results = new ArrayList<PredictionResults>();

  /**
   * Returned upon a successful estimated wait time request.
   **/
  @ApiModelProperty(required = true, value = "Returned upon a successful estimated wait time request.")
  public List<PredictionResults> getResults() {
    return results;
  }
  public void setResults(List<PredictionResults> results) {
    this.results = results;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EstimatedWaitTimePredictions estimatedWaitTimePredictions = (EstimatedWaitTimePredictions) o;
    return Objects.equals(results, estimatedWaitTimePredictions.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EstimatedWaitTimePredictions {\n");
    
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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
