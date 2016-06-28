package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.BillingAddress;

import com.google.gson.annotations.SerializedName;





public class QuoteCharge   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("sku")
  private String sku = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("chargeType")
  private String chargeType = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("listTotal")
  private String listTotal = null;

  @SerializedName("total")
  private String total = null;

  @SerializedName("listPriceDisplay")
  private String listPriceDisplay = null;

  @SerializedName("discount")
  private String discount = null;

  @SerializedName("effectivePrice")
  private String effectivePrice = null;

  @SerializedName("productShippable")
  private Boolean productShippable = false;

  @SerializedName("shippingAddress")
  private BillingAddress shippingAddress = null;

  @SerializedName("forRelatedPart")
  private String forRelatedPart = null;

  /**
   * The quote charge Id.
   **/
  @ApiModelProperty(required = true, value = "The quote charge Id.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The quote charge SKU.
   **/
  @ApiModelProperty(required = true, value = "The quote charge SKU.")
  public String getSku() {
    return sku;
  }
  public void setSku(String sku) {
    this.sku = sku;
  }

  /**
   * The quote charge name.
   **/
  @ApiModelProperty(required = true, value = "The quote charge name.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The quote charge type.
   **/
  @ApiModelProperty(required = true, value = "The quote charge type.")
  public String getChargeType() {
    return chargeType;
  }
  public void setChargeType(String chargeType) {
    this.chargeType = chargeType;
  }

  /**
   * The quote charge quantity.
   **/
  @ApiModelProperty(required = true, value = "The quote charge quantity.")
  public Integer getQuantity() {
    return quantity;
  }
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  /**
   * The quote charge total price before discounts.
   **/
  @ApiModelProperty(required = true, value = "The quote charge total price before discounts.")
  public String getListTotal() {
    return listTotal;
  }
  public void setListTotal(String listTotal) {
    this.listTotal = listTotal;
  }

  /**
   * The quote charge total price after discounts.
   **/
  @ApiModelProperty(required = true, value = "The quote charge total price after discounts.")
  public String getTotal() {
    return total;
  }
  public void setTotal(String total) {
    this.total = total;
  }

  /**
   * The quote charge list price before discounts.
   **/
  @ApiModelProperty(required = true, value = "The quote charge list price before discounts.")
  public String getListPriceDisplay() {
    return listPriceDisplay;
  }
  public void setListPriceDisplay(String listPriceDisplay) {
    this.listPriceDisplay = listPriceDisplay;
  }

  /**
   * The quote charge discount percent.
   **/
  @ApiModelProperty(required = true, value = "The quote charge discount percent.")
  public String getDiscount() {
    return discount;
  }
  public void setDiscount(String discount) {
    this.discount = discount;
  }

  /**
   * The quote charge list price after discounts.
   **/
  @ApiModelProperty(required = true, value = "The quote charge list price after discounts.")
  public String getEffectivePrice() {
    return effectivePrice;
  }
  public void setEffectivePrice(String effectivePrice) {
    this.effectivePrice = effectivePrice;
  }

  /**
   * Indicates whether the product can be shipped.
   **/
  @ApiModelProperty(required = true, value = "Indicates whether the product can be shipped.")
  public Boolean getProductShippable() {
    return productShippable;
  }
  public void setProductShippable(Boolean productShippable) {
    this.productShippable = productShippable;
  }

  /**
   * The quote shipping address.
   **/
  @ApiModelProperty(required = true, value = "The quote shipping address.")
  public BillingAddress getShippingAddress() {
    return shippingAddress;
  }
  public void setShippingAddress(BillingAddress shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  /**
   * The part number of a part related to the quote charge.
   **/
  @ApiModelProperty(value = "The part number of a part related to the quote charge.")
  public String getForRelatedPart() {
    return forRelatedPart;
  }
  public void setForRelatedPart(String forRelatedPart) {
    this.forRelatedPart = forRelatedPart;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuoteCharge quoteCharge = (QuoteCharge) o;
    return Objects.equals(id, quoteCharge.id) &&
        Objects.equals(sku, quoteCharge.sku) &&
        Objects.equals(name, quoteCharge.name) &&
        Objects.equals(chargeType, quoteCharge.chargeType) &&
        Objects.equals(quantity, quoteCharge.quantity) &&
        Objects.equals(listTotal, quoteCharge.listTotal) &&
        Objects.equals(total, quoteCharge.total) &&
        Objects.equals(listPriceDisplay, quoteCharge.listPriceDisplay) &&
        Objects.equals(discount, quoteCharge.discount) &&
        Objects.equals(effectivePrice, quoteCharge.effectivePrice) &&
        Objects.equals(productShippable, quoteCharge.productShippable) &&
        Objects.equals(shippingAddress, quoteCharge.shippingAddress) &&
        Objects.equals(forRelatedPart, quoteCharge.forRelatedPart);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, sku, name, chargeType, quantity, listTotal, total, listPriceDisplay, discount, effectivePrice, productShippable, shippingAddress, forRelatedPart);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuoteCharge {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    chargeType: ").append(toIndentedString(chargeType)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    listTotal: ").append(toIndentedString(listTotal)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    listPriceDisplay: ").append(toIndentedString(listPriceDisplay)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    effectivePrice: ").append(toIndentedString(effectivePrice)).append("\n");
    sb.append("    productShippable: ").append(toIndentedString(productShippable)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    forRelatedPart: ").append(toIndentedString(forRelatedPart)).append("\n");
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
