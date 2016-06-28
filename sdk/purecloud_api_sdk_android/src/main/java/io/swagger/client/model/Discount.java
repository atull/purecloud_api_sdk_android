package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;





public class Discount   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("annualPrePay")
  private Boolean annualPrePay = false;

  @SerializedName("discount")
  private String discount = null;

  @SerializedName("maximum")
  private String maximum = null;

  @SerializedName("minimum")
  private String minimum = null;

  @SerializedName("productCategory")
  private String productCategory = null;

  @SerializedName("selfUri")
  private String selfUri = null;

  /**
   * The globally unique identifier for the object.
   **/
  @ApiModelProperty(value = "The globally unique identifier for the object.")
  public String getId() {
    return id;
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
  public Boolean getAnnualPrePay() {
    return annualPrePay;
  }
  public void setAnnualPrePay(Boolean annualPrePay) {
    this.annualPrePay = annualPrePay;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDiscount() {
    return discount;
  }
  public void setDiscount(String discount) {
    this.discount = discount;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getMaximum() {
    return maximum;
  }
  public void setMaximum(String maximum) {
    this.maximum = maximum;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getMinimum() {
    return minimum;
  }
  public void setMinimum(String minimum) {
    this.minimum = minimum;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getProductCategory() {
    return productCategory;
  }
  public void setProductCategory(String productCategory) {
    this.productCategory = productCategory;
  }

  /**
   * The URI for this object
   **/
  @ApiModelProperty(value = "The URI for this object")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Discount discount = (Discount) o;
    return Objects.equals(id, discount.id) &&
        Objects.equals(name, discount.name) &&
        Objects.equals(annualPrePay, discount.annualPrePay) &&
        Objects.equals(discount, discount.discount) &&
        Objects.equals(maximum, discount.maximum) &&
        Objects.equals(minimum, discount.minimum) &&
        Objects.equals(productCategory, discount.productCategory) &&
        Objects.equals(selfUri, discount.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, annualPrePay, discount, maximum, minimum, productCategory, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Discount {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    annualPrePay: ").append(toIndentedString(annualPrePay)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    maximum: ").append(toIndentedString(maximum)).append("\n");
    sb.append("    minimum: ").append(toIndentedString(minimum)).append("\n");
    sb.append("    productCategory: ").append(toIndentedString(productCategory)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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
