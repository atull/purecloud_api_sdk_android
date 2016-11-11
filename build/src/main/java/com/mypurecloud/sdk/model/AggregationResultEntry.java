package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class AggregationResultEntry  implements Serializable {
  
  @SerializedName("count")
  private Long count = null;

  @SerializedName("value")
  private String value = null;

  @SerializedName("gte")
  private BigDecimal gte = null;

  @SerializedName("lt")
  private BigDecimal lt = null;

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
   * For termFrequency aggregations
   **/
  @ApiModelProperty(value = "For termFrequency aggregations")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * For numericRange aggregations
   **/
  @ApiModelProperty(value = "For numericRange aggregations")
  public BigDecimal getGte() {
    return gte;
  }
  public void setGte(BigDecimal gte) {
    this.gte = gte;
  }

  /**
   * For numericRange aggregations
   **/
  @ApiModelProperty(value = "For numericRange aggregations")
  public BigDecimal getLt() {
    return lt;
  }
  public void setLt(BigDecimal lt) {
    this.lt = lt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregationResultEntry aggregationResultEntry = (AggregationResultEntry) o;
    return Objects.equals(count, aggregationResultEntry.count) &&
        Objects.equals(value, aggregationResultEntry.value) &&
        Objects.equals(gte, aggregationResultEntry.gte) &&
        Objects.equals(lt, aggregationResultEntry.lt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, value, gte, lt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregationResultEntry {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    gte: ").append(toIndentedString(gte)).append("\n");
    sb.append("    lt: ").append(toIndentedString(lt)).append("\n");
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
