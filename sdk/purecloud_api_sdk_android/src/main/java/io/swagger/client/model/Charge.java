package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;





public class Charge   {
  
  @SerializedName("licenseCount")
  private Integer licenseCount = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("price")
  private BigDecimal price = null;

  @SerializedName("unitOfMeasure")
  private String unitOfMeasure = null;

  @SerializedName("billingPeriod")
  private String billingPeriod = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("includedUnits")
  private Integer includedUnits = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getLicenseCount() {
    return licenseCount;
  }
  public void setLicenseCount(Integer licenseCount) {
    this.licenseCount = licenseCount;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getPrice() {
    return price;
  }
  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getUnitOfMeasure() {
    return unitOfMeasure;
  }
  public void setUnitOfMeasure(String unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getBillingPeriod() {
    return billingPeriod;
  }
  public void setBillingPeriod(String billingPeriod) {
    this.billingPeriod = billingPeriod;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getQuantity() {
    return quantity;
  }
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getIncludedUnits() {
    return includedUnits;
  }
  public void setIncludedUnits(Integer includedUnits) {
    this.includedUnits = includedUnits;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Charge charge = (Charge) o;
    return Objects.equals(licenseCount, charge.licenseCount) &&
        Objects.equals(name, charge.name) &&
        Objects.equals(description, charge.description) &&
        Objects.equals(price, charge.price) &&
        Objects.equals(unitOfMeasure, charge.unitOfMeasure) &&
        Objects.equals(billingPeriod, charge.billingPeriod) &&
        Objects.equals(quantity, charge.quantity) &&
        Objects.equals(includedUnits, charge.includedUnits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(licenseCount, name, description, price, unitOfMeasure, billingPeriod, quantity, includedUnits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Charge {\n");
    
    sb.append("    licenseCount: ").append(toIndentedString(licenseCount)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    unitOfMeasure: ").append(toIndentedString(unitOfMeasure)).append("\n");
    sb.append("    billingPeriod: ").append(toIndentedString(billingPeriod)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    includedUnits: ").append(toIndentedString(includedUnits)).append("\n");
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
