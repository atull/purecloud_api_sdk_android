package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;





public class Account   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("orgLegalName")
  private String orgLegalName = null;

  @SerializedName("billingAddressLine1")
  private String billingAddressLine1 = null;

  @SerializedName("billingAddressLine2")
  private String billingAddressLine2 = null;

  @SerializedName("billingAddressCity")
  private String billingAddressCity = null;

  @SerializedName("billingAddressState")
  private String billingAddressState = null;

  @SerializedName("billingAddressZipCode")
  private String billingAddressZipCode = null;

  @SerializedName("billingAddressCountry")
  private String billingAddressCountry = null;

  @SerializedName("legalAddressLine1")
  private String legalAddressLine1 = null;

  @SerializedName("legalAddressLine2")
  private String legalAddressLine2 = null;

  @SerializedName("legalAddressCity")
  private String legalAddressCity = null;

  @SerializedName("legalAddressState")
  private String legalAddressState = null;

  @SerializedName("legalAddressZipCode")
  private String legalAddressZipCode = null;

  @SerializedName("legalAddressCountry")
  private String legalAddressCountry = null;

  @SerializedName("billingContactFirstName")
  private String billingContactFirstName = null;

  @SerializedName("billingContactLastName")
  private String billingContactLastName = null;

  @SerializedName("billingContactEmail")
  private String billingContactEmail = null;

  @SerializedName("billingContactPhone")
  private String billingContactPhone = null;

  @SerializedName("purchaseOrderNumber")
  private String purchaseOrderNumber = null;

  @SerializedName("isTaxExempt")
  private Boolean isTaxExempt = false;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("paymentTerm")
  private String paymentTerm = null;

  @SerializedName("contractTerm")
  private Integer contractTerm = null;

  @SerializedName("autoRenew")
  private Boolean autoRenew = false;

  @SerializedName("enabled")
  private Boolean enabled = false;

  @SerializedName("minCommitQuantities")
  private Map<String, Integer> minCommitQuantities = new HashMap<String, Integer>();

  @SerializedName("estimatedQuantities")
  private Map<String, Integer> estimatedQuantities = new HashMap<String, Integer>();

  @SerializedName("oneTimeCharges")
  private List<String> oneTimeCharges = new ArrayList<String>();

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
  public String getOrgLegalName() {
    return orgLegalName;
  }
  public void setOrgLegalName(String orgLegalName) {
    this.orgLegalName = orgLegalName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getBillingAddressLine1() {
    return billingAddressLine1;
  }
  public void setBillingAddressLine1(String billingAddressLine1) {
    this.billingAddressLine1 = billingAddressLine1;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getBillingAddressLine2() {
    return billingAddressLine2;
  }
  public void setBillingAddressLine2(String billingAddressLine2) {
    this.billingAddressLine2 = billingAddressLine2;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getBillingAddressCity() {
    return billingAddressCity;
  }
  public void setBillingAddressCity(String billingAddressCity) {
    this.billingAddressCity = billingAddressCity;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getBillingAddressState() {
    return billingAddressState;
  }
  public void setBillingAddressState(String billingAddressState) {
    this.billingAddressState = billingAddressState;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getBillingAddressZipCode() {
    return billingAddressZipCode;
  }
  public void setBillingAddressZipCode(String billingAddressZipCode) {
    this.billingAddressZipCode = billingAddressZipCode;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getBillingAddressCountry() {
    return billingAddressCountry;
  }
  public void setBillingAddressCountry(String billingAddressCountry) {
    this.billingAddressCountry = billingAddressCountry;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getLegalAddressLine1() {
    return legalAddressLine1;
  }
  public void setLegalAddressLine1(String legalAddressLine1) {
    this.legalAddressLine1 = legalAddressLine1;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getLegalAddressLine2() {
    return legalAddressLine2;
  }
  public void setLegalAddressLine2(String legalAddressLine2) {
    this.legalAddressLine2 = legalAddressLine2;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getLegalAddressCity() {
    return legalAddressCity;
  }
  public void setLegalAddressCity(String legalAddressCity) {
    this.legalAddressCity = legalAddressCity;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getLegalAddressState() {
    return legalAddressState;
  }
  public void setLegalAddressState(String legalAddressState) {
    this.legalAddressState = legalAddressState;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getLegalAddressZipCode() {
    return legalAddressZipCode;
  }
  public void setLegalAddressZipCode(String legalAddressZipCode) {
    this.legalAddressZipCode = legalAddressZipCode;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getLegalAddressCountry() {
    return legalAddressCountry;
  }
  public void setLegalAddressCountry(String legalAddressCountry) {
    this.legalAddressCountry = legalAddressCountry;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getBillingContactFirstName() {
    return billingContactFirstName;
  }
  public void setBillingContactFirstName(String billingContactFirstName) {
    this.billingContactFirstName = billingContactFirstName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getBillingContactLastName() {
    return billingContactLastName;
  }
  public void setBillingContactLastName(String billingContactLastName) {
    this.billingContactLastName = billingContactLastName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getBillingContactEmail() {
    return billingContactEmail;
  }
  public void setBillingContactEmail(String billingContactEmail) {
    this.billingContactEmail = billingContactEmail;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getBillingContactPhone() {
    return billingContactPhone;
  }
  public void setBillingContactPhone(String billingContactPhone) {
    this.billingContactPhone = billingContactPhone;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPurchaseOrderNumber() {
    return purchaseOrderNumber;
  }
  public void setPurchaseOrderNumber(String purchaseOrderNumber) {
    this.purchaseOrderNumber = purchaseOrderNumber;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getIsTaxExempt() {
    return isTaxExempt;
  }
  public void setIsTaxExempt(Boolean isTaxExempt) {
    this.isTaxExempt = isTaxExempt;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPaymentTerm() {
    return paymentTerm;
  }
  public void setPaymentTerm(String paymentTerm) {
    this.paymentTerm = paymentTerm;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getContractTerm() {
    return contractTerm;
  }
  public void setContractTerm(Integer contractTerm) {
    this.contractTerm = contractTerm;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getAutoRenew() {
    return autoRenew;
  }
  public void setAutoRenew(Boolean autoRenew) {
    this.autoRenew = autoRenew;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Map<String, Integer> getMinCommitQuantities() {
    return minCommitQuantities;
  }
  public void setMinCommitQuantities(Map<String, Integer> minCommitQuantities) {
    this.minCommitQuantities = minCommitQuantities;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Map<String, Integer> getEstimatedQuantities() {
    return estimatedQuantities;
  }
  public void setEstimatedQuantities(Map<String, Integer> estimatedQuantities) {
    this.estimatedQuantities = estimatedQuantities;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getOneTimeCharges() {
    return oneTimeCharges;
  }
  public void setOneTimeCharges(List<String> oneTimeCharges) {
    this.oneTimeCharges = oneTimeCharges;
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
    Account account = (Account) o;
    return Objects.equals(id, account.id) &&
        Objects.equals(name, account.name) &&
        Objects.equals(orgLegalName, account.orgLegalName) &&
        Objects.equals(billingAddressLine1, account.billingAddressLine1) &&
        Objects.equals(billingAddressLine2, account.billingAddressLine2) &&
        Objects.equals(billingAddressCity, account.billingAddressCity) &&
        Objects.equals(billingAddressState, account.billingAddressState) &&
        Objects.equals(billingAddressZipCode, account.billingAddressZipCode) &&
        Objects.equals(billingAddressCountry, account.billingAddressCountry) &&
        Objects.equals(legalAddressLine1, account.legalAddressLine1) &&
        Objects.equals(legalAddressLine2, account.legalAddressLine2) &&
        Objects.equals(legalAddressCity, account.legalAddressCity) &&
        Objects.equals(legalAddressState, account.legalAddressState) &&
        Objects.equals(legalAddressZipCode, account.legalAddressZipCode) &&
        Objects.equals(legalAddressCountry, account.legalAddressCountry) &&
        Objects.equals(billingContactFirstName, account.billingContactFirstName) &&
        Objects.equals(billingContactLastName, account.billingContactLastName) &&
        Objects.equals(billingContactEmail, account.billingContactEmail) &&
        Objects.equals(billingContactPhone, account.billingContactPhone) &&
        Objects.equals(purchaseOrderNumber, account.purchaseOrderNumber) &&
        Objects.equals(isTaxExempt, account.isTaxExempt) &&
        Objects.equals(currency, account.currency) &&
        Objects.equals(paymentTerm, account.paymentTerm) &&
        Objects.equals(contractTerm, account.contractTerm) &&
        Objects.equals(autoRenew, account.autoRenew) &&
        Objects.equals(enabled, account.enabled) &&
        Objects.equals(minCommitQuantities, account.minCommitQuantities) &&
        Objects.equals(estimatedQuantities, account.estimatedQuantities) &&
        Objects.equals(oneTimeCharges, account.oneTimeCharges) &&
        Objects.equals(selfUri, account.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, orgLegalName, billingAddressLine1, billingAddressLine2, billingAddressCity, billingAddressState, billingAddressZipCode, billingAddressCountry, legalAddressLine1, legalAddressLine2, legalAddressCity, legalAddressState, legalAddressZipCode, legalAddressCountry, billingContactFirstName, billingContactLastName, billingContactEmail, billingContactPhone, purchaseOrderNumber, isTaxExempt, currency, paymentTerm, contractTerm, autoRenew, enabled, minCommitQuantities, estimatedQuantities, oneTimeCharges, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orgLegalName: ").append(toIndentedString(orgLegalName)).append("\n");
    sb.append("    billingAddressLine1: ").append(toIndentedString(billingAddressLine1)).append("\n");
    sb.append("    billingAddressLine2: ").append(toIndentedString(billingAddressLine2)).append("\n");
    sb.append("    billingAddressCity: ").append(toIndentedString(billingAddressCity)).append("\n");
    sb.append("    billingAddressState: ").append(toIndentedString(billingAddressState)).append("\n");
    sb.append("    billingAddressZipCode: ").append(toIndentedString(billingAddressZipCode)).append("\n");
    sb.append("    billingAddressCountry: ").append(toIndentedString(billingAddressCountry)).append("\n");
    sb.append("    legalAddressLine1: ").append(toIndentedString(legalAddressLine1)).append("\n");
    sb.append("    legalAddressLine2: ").append(toIndentedString(legalAddressLine2)).append("\n");
    sb.append("    legalAddressCity: ").append(toIndentedString(legalAddressCity)).append("\n");
    sb.append("    legalAddressState: ").append(toIndentedString(legalAddressState)).append("\n");
    sb.append("    legalAddressZipCode: ").append(toIndentedString(legalAddressZipCode)).append("\n");
    sb.append("    legalAddressCountry: ").append(toIndentedString(legalAddressCountry)).append("\n");
    sb.append("    billingContactFirstName: ").append(toIndentedString(billingContactFirstName)).append("\n");
    sb.append("    billingContactLastName: ").append(toIndentedString(billingContactLastName)).append("\n");
    sb.append("    billingContactEmail: ").append(toIndentedString(billingContactEmail)).append("\n");
    sb.append("    billingContactPhone: ").append(toIndentedString(billingContactPhone)).append("\n");
    sb.append("    purchaseOrderNumber: ").append(toIndentedString(purchaseOrderNumber)).append("\n");
    sb.append("    isTaxExempt: ").append(toIndentedString(isTaxExempt)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    paymentTerm: ").append(toIndentedString(paymentTerm)).append("\n");
    sb.append("    contractTerm: ").append(toIndentedString(contractTerm)).append("\n");
    sb.append("    autoRenew: ").append(toIndentedString(autoRenew)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    minCommitQuantities: ").append(toIndentedString(minCommitQuantities)).append("\n");
    sb.append("    estimatedQuantities: ").append(toIndentedString(estimatedQuantities)).append("\n");
    sb.append("    oneTimeCharges: ").append(toIndentedString(oneTimeCharges)).append("\n");
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
