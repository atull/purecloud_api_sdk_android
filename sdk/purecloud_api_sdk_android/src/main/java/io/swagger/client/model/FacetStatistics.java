package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import com.google.gson.annotations.SerializedName;





public class FacetStatistics   {
  
  @SerializedName("count")
  private Long count = null;

  @SerializedName("min")
  private Double min = null;

  @SerializedName("max")
  private Double max = null;

  @SerializedName("mean")
  private Double mean = null;

  @SerializedName("stdDeviation")
  private Double stdDeviation = null;

  @SerializedName("dateMin")
  private Date dateMin = null;

  @SerializedName("dateMax")
  private Date dateMax = null;

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
  public Double getMin() {
    return min;
  }
  public void setMin(Double min) {
    this.min = min;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getMax() {
    return max;
  }
  public void setMax(Double max) {
    this.max = max;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getMean() {
    return mean;
  }
  public void setMean(Double mean) {
    this.mean = mean;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getStdDeviation() {
    return stdDeviation;
  }
  public void setStdDeviation(Double stdDeviation) {
    this.stdDeviation = stdDeviation;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getDateMin() {
    return dateMin;
  }
  public void setDateMin(Date dateMin) {
    this.dateMin = dateMin;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getDateMax() {
    return dateMax;
  }
  public void setDateMax(Date dateMax) {
    this.dateMax = dateMax;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FacetStatistics facetStatistics = (FacetStatistics) o;
    return Objects.equals(count, facetStatistics.count) &&
        Objects.equals(min, facetStatistics.min) &&
        Objects.equals(max, facetStatistics.max) &&
        Objects.equals(mean, facetStatistics.mean) &&
        Objects.equals(stdDeviation, facetStatistics.stdDeviation) &&
        Objects.equals(dateMin, facetStatistics.dateMin) &&
        Objects.equals(dateMax, facetStatistics.dateMax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, min, max, mean, stdDeviation, dateMin, dateMax);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacetStatistics {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    mean: ").append(toIndentedString(mean)).append("\n");
    sb.append("    stdDeviation: ").append(toIndentedString(stdDeviation)).append("\n");
    sb.append("    dateMin: ").append(toIndentedString(dateMin)).append("\n");
    sb.append("    dateMax: ").append(toIndentedString(dateMax)).append("\n");
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
