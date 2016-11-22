package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.AggregationResultEntry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class AggregationResult  implements Serializable {
  

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("termFrequency")
    TERMFREQUENCY("termFrequency"),

    @SerializedName("numericRange")
    NUMERICRANGE("numericRange");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("dimension")
  private String dimension = null;

  @SerializedName("metric")
  private String metric = null;

  @SerializedName("count")
  private Long count = null;

  @SerializedName("results")
  private List<AggregationResultEntry> results = new ArrayList<AggregationResultEntry>();

  /**
   **/
  @ApiModelProperty(value = "")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * For termFrequency aggregations
   **/
  @ApiModelProperty(value = "For termFrequency aggregations")
  public String getDimension() {
    return dimension;
  }
  public void setDimension(String dimension) {
    this.dimension = dimension;
  }

  /**
   * For numericRange aggregations
   **/
  @ApiModelProperty(value = "For numericRange aggregations")
  public String getMetric() {
    return metric;
  }
  public void setMetric(String metric) {
    this.metric = metric;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getCount() {
    return count;
  }
  public void setCount(Long count) {
    this.count = count;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<AggregationResultEntry> getResults() {
    return results;
  }
  public void setResults(List<AggregationResultEntry> results) {
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
    AggregationResult aggregationResult = (AggregationResult) o;
    return Objects.equals(type, aggregationResult.type) &&
        Objects.equals(dimension, aggregationResult.dimension) &&
        Objects.equals(metric, aggregationResult.metric) &&
        Objects.equals(count, aggregationResult.count) &&
        Objects.equals(results, aggregationResult.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, dimension, metric, count, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregationResult {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
