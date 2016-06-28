package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;





public class NumericRange   {
  
  @SerializedName("gt")
  private BigDecimal gt = null;

  @SerializedName("gte")
  private BigDecimal gte = null;

  @SerializedName("lt")
  private BigDecimal lt = null;

  @SerializedName("lte")
  private BigDecimal lte = null;

  /**
   * Greater than
   **/
  @ApiModelProperty(value = "Greater than")
  public BigDecimal getGt() {
    return gt;
  }
  public void setGt(BigDecimal gt) {
    this.gt = gt;
  }

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

  /**
   * Less than or equal to
   **/
  @ApiModelProperty(value = "Less than or equal to")
  public BigDecimal getLte() {
    return lte;
  }
  public void setLte(BigDecimal lte) {
    this.lte = lte;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NumericRange numericRange = (NumericRange) o;
    return Objects.equals(gt, numericRange.gt) &&
        Objects.equals(gte, numericRange.gte) &&
        Objects.equals(lt, numericRange.lt) &&
        Objects.equals(lte, numericRange.lte);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gt, gte, lt, lte);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumericRange {\n");
    
    sb.append("    gt: ").append(toIndentedString(gt)).append("\n");
    sb.append("    gte: ").append(toIndentedString(gte)).append("\n");
    sb.append("    lt: ").append(toIndentedString(lt)).append("\n");
    sb.append("    lte: ").append(toIndentedString(lte)).append("\n");
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
