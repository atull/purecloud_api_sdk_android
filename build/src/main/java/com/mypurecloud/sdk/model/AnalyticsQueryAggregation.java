package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.AggregationRange;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class AnalyticsQueryAggregation  implements Serializable {
  

  /**
   * Optional type, can usually be inferred
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

  @SerializedName("size")
  private Integer size = null;

  @SerializedName("ranges")
  private List<AggregationRange> ranges = new ArrayList<AggregationRange>();

  /**
   * Optional type, can usually be inferred
   **/
  @ApiModelProperty(value = "Optional type, can usually be inferred")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * For use with termFrequency aggregations
   **/
  @ApiModelProperty(value = "For use with termFrequency aggregations")
  public String getDimension() {
    return dimension;
  }
  public void setDimension(String dimension) {
    this.dimension = dimension;
  }

  /**
   * For use with numericRange aggregations
   **/
  @ApiModelProperty(value = "For use with numericRange aggregations")
  public String getMetric() {
    return metric;
  }
  public void setMetric(String metric) {
    this.metric = metric;
  }

  /**
   * For use with termFrequency aggregations
   **/
  @ApiModelProperty(value = "For use with termFrequency aggregations")
  public Integer getSize() {
    return size;
  }
  public void setSize(Integer size) {
    this.size = size;
  }

  /**
   * For use with numericRange aggregations
   **/
  @ApiModelProperty(value = "For use with numericRange aggregations")
  public List<AggregationRange> getRanges() {
    return ranges;
  }
  public void setRanges(List<AggregationRange> ranges) {
    this.ranges = ranges;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsQueryAggregation analyticsQueryAggregation = (AnalyticsQueryAggregation) o;
    return Objects.equals(type, analyticsQueryAggregation.type) &&
        Objects.equals(dimension, analyticsQueryAggregation.dimension) &&
        Objects.equals(metric, analyticsQueryAggregation.metric) &&
        Objects.equals(size, analyticsQueryAggregation.size) &&
        Objects.equals(ranges, analyticsQueryAggregation.ranges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, dimension, metric, size, ranges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsQueryAggregation {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    ranges: ").append(toIndentedString(ranges)).append("\n");
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
