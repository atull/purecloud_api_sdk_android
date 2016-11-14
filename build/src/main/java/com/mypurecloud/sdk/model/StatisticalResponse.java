package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.AggregateMetricData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class StatisticalResponse  implements Serializable {
  
  @SerializedName("interval")
  private String interval = null;

  @SerializedName("metrics")
  private List<AggregateMetricData> metrics = new ArrayList<AggregateMetricData>();

  /**
   **/
  @ApiModelProperty(value = "")
  public String getInterval() {
    return interval;
  }
  public void setInterval(String interval) {
    this.interval = interval;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<AggregateMetricData> getMetrics() {
    return metrics;
  }
  public void setMetrics(List<AggregateMetricData> metrics) {
    this.metrics = metrics;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatisticalResponse statisticalResponse = (StatisticalResponse) o;
    return Objects.equals(interval, statisticalResponse.interval) &&
        Objects.equals(metrics, statisticalResponse.metrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, metrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatisticalResponse {\n");
    
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
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
