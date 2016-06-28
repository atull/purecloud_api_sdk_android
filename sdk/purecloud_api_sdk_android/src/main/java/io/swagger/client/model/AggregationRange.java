package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;





public class AggregationRange   {
  
  @SerializedName("gte")
  private BigDecimal gte = null;

  @SerializedName("lt")
  private BigDecimal lt = null;

  /**
   * Greater than or equal to
   **/
  @ApiModelProperty(value = "Greater than or equal to")
  public BigDecimal getGte() {
    return gte;
  }
  public void setGte(BigDecimal gte) {
    this.gte = gte;
  }

  /**
   * Less than
   **/
  @ApiModelProperty(value = "Less than")
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
    AggregationRange aggregationRange = (AggregationRange) o;
    return Objects.equals(gte, aggregationRange.gte) &&
        Objects.equals(lt, aggregationRange.lt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gte, lt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregationRange {\n");
    
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
