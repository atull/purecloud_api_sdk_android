package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class ServiceLevel  implements Serializable {
  
  @SerializedName("percentage")
  private Double percentage = null;

  @SerializedName("durationMs")
  private Long durationMs = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getPercentage() {
    return percentage;
  }
  public void setPercentage(Double percentage) {
    this.percentage = percentage;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getDurationMs() {
    return durationMs;
  }
  public void setDurationMs(Long durationMs) {
    this.durationMs = durationMs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceLevel serviceLevel = (ServiceLevel) o;
    return Objects.equals(percentage, serviceLevel.percentage) &&
        Objects.equals(durationMs, serviceLevel.durationMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(percentage, durationMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceLevel {\n");
    
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    durationMs: ").append(toIndentedString(durationMs)).append("\n");
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
