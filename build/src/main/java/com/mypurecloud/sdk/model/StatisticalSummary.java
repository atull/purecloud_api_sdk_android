package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class StatisticalSummary  implements Serializable {
  
  @SerializedName("max")
  private BigDecimal max = null;

  @SerializedName("min")
  private BigDecimal min = null;

  @SerializedName("count")
  private Long count = null;

  @SerializedName("sum")
  private BigDecimal sum = null;

  @SerializedName("current")
  private BigDecimal current = null;

  @SerializedName("ratio")
  private BigDecimal ratio = null;

  @SerializedName("numerator")
  private BigDecimal numerator = null;

  @SerializedName("denominator")
  private BigDecimal denominator = null;

  @SerializedName("target")
  private BigDecimal target = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getMax() {
    return max;
  }
  public void setMax(BigDecimal max) {
    this.max = max;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getMin() {
    return min;
  }
  public void setMin(BigDecimal min) {
    this.min = min;
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
  public BigDecimal getSum() {
    return sum;
  }
  public void setSum(BigDecimal sum) {
    this.sum = sum;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getCurrent() {
    return current;
  }
  public void setCurrent(BigDecimal current) {
    this.current = current;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getRatio() {
    return ratio;
  }
  public void setRatio(BigDecimal ratio) {
    this.ratio = ratio;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getNumerator() {
    return numerator;
  }
  public void setNumerator(BigDecimal numerator) {
    this.numerator = numerator;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getDenominator() {
    return denominator;
  }
  public void setDenominator(BigDecimal denominator) {
    this.denominator = denominator;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getTarget() {
    return target;
  }
  public void setTarget(BigDecimal target) {
    this.target = target;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatisticalSummary statisticalSummary = (StatisticalSummary) o;
    return Objects.equals(max, statisticalSummary.max) &&
        Objects.equals(min, statisticalSummary.min) &&
        Objects.equals(count, statisticalSummary.count) &&
        Objects.equals(sum, statisticalSummary.sum) &&
        Objects.equals(current, statisticalSummary.current) &&
        Objects.equals(ratio, statisticalSummary.ratio) &&
        Objects.equals(numerator, statisticalSummary.numerator) &&
        Objects.equals(denominator, statisticalSummary.denominator) &&
        Objects.equals(target, statisticalSummary.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(max, min, count, sum, current, ratio, numerator, denominator, target);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatisticalSummary {\n");
    
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    sum: ").append(toIndentedString(sum)).append("\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    ratio: ").append(toIndentedString(ratio)).append("\n");
    sb.append("    numerator: ").append(toIndentedString(numerator)).append("\n");
    sb.append("    denominator: ").append(toIndentedString(denominator)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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
