package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.BillingAddress;

import com.google.gson.annotations.SerializedName;





public class CustomerAccount   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("isFrozen")
  private Boolean isFrozen = false;

  @SerializedName("orgLegalName")
  private String orgLegalName = null;

  @SerializedName("orgPhone")
  private String orgPhone = null;

  @SerializedName("isTaxExempt")
  private Boolean isTaxExempt = false;

  @SerializedName("billingAddress")
  private BillingAddress billingAddress = null;

  @SerializedName("currency")
  private String currency = null;

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
   * Indicates whether the account is currently frozen for review.
   **/
  @ApiModelProperty(required = true, value = "Indicates whether the account is currently frozen for review.")
  public Boolean getIsFrozen() {
    return isFrozen;
  }
  public void setIsFrozen(Boolean isFrozen) {
    this.isFrozen = isFrozen;
  }

  /**
   * The organization legal name.
   **/
  @ApiModelProperty(required = true, value = "The organization legal name.")
  public String getOrgLegalName() {
    return orgLegalName;
  }
  public void setOrgLegalName(String orgLegalName) {
    this.orgLegalName = orgLegalName;
  }

  /**
   * The organization phone number.
   **/
  @ApiModelProperty(required = true, value = "The organization phone number.")
  public String getOrgPhone() {
    return orgPhone;
  }
  public void setOrgPhone(String orgPhone) {
    this.orgPhone = orgPhone;
  }

  /**
   * Indicates whether the account is tax exempt.
   **/
  @ApiModelProperty(required = true, value = "Indicates whether the account is tax exempt.")
  public Boolean getIsTaxExempt() {
    return isTaxExempt;
  }
  public void setIsTaxExempt(Boolean isTaxExempt) {
    this.isTaxExempt = isTaxExempt;
  }

  /**
   * The account billing address.
   **/
  @ApiModelProperty(required = true, value = "The account billing address.")
  public BillingAddress getBillingAddress() {
    return billingAddress;
  }
  public void setBillingAddress(BillingAddress billingAddress) {
    this.billingAddress = billingAddress;
  }

  /**
   * The account currency.
   **/
  @ApiModelProperty(required = true, value = "The account currency.")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
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
    CustomerAccount customerAccount = (CustomerAccount) o;
    return Objects.equals(id, customerAccount.id) &&
        Objects.equals(name, customerAccount.name) &&
        Objects.equals(isFrozen, customerAccount.isFrozen) &&
        Objects.equals(orgLegalName, customerAccount.orgLegalName) &&
        Objects.equals(orgPhone, customerAccount.orgPhone) &&
        Objects.equals(isTaxExempt, customerAccount.isTaxExempt) &&
        Objects.equals(billingAddress, customerAccount.billingAddress) &&
        Objects.equals(currency, customerAccount.currency) &&
        Objects.equals(selfUri, customerAccount.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, isFrozen, orgLegalName, orgPhone, isTaxExempt, billingAddress, currency, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerAccount {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isFrozen: ").append(toIndentedString(isFrozen)).append("\n");
    sb.append("    orgLegalName: ").append(toIndentedString(orgLegalName)).append("\n");
    sb.append("    orgPhone: ").append(toIndentedString(orgPhone)).append("\n");
    sb.append("    isTaxExempt: ").append(toIndentedString(isTaxExempt)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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
