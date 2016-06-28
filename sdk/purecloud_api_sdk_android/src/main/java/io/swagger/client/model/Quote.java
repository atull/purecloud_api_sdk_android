package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.QuoteCharge;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class Quote   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("purchaseOrder")
  private String purchaseOrder = null;


  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    @SerializedName("NEW_SUBSCRIPTION")
    NEW_SUBSCRIPTION("NEW_SUBSCRIPTION"),

    @SerializedName("AMENDMENT")
    AMENDMENT("AMENDMENT");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;


  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    @SerializedName("IN_PROGRESS")
    IN_PROGRESS("IN_PROGRESS"),

    @SerializedName("SUBMITTED")
    SUBMITTED("SUBMITTED"),

    @SerializedName("FROZEN")
    FROZEN("FROZEN");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("createdDate")
  private Date createdDate = null;

  @SerializedName("lastUpdatedDate")
  private Date lastUpdatedDate = null;

  @SerializedName("billingContactEmail")
  private String billingContactEmail = null;

  @SerializedName("billingContactFirstName")
  private String billingContactFirstName = null;

  @SerializedName("billingContactLastName")
  private String billingContactLastName = null;

  @SerializedName("billingContactPhone")
  private String billingContactPhone = null;

  @SerializedName("includeVoiceCharges")
  private Boolean includeVoiceCharges = false;

  @SerializedName("charges")
  private List<QuoteCharge> charges = new ArrayList<QuoteCharge>();

  @SerializedName("edgeControlModel")
  private String edgeControlModel = null;

  @SerializedName("referralCodes")
  private List<String> referralCodes = new ArrayList<String>();

  @SerializedName("discountCodes")
  private List<String> discountCodes = new ArrayList<String>();

  @SerializedName("salesPartnerCode")
  private String salesPartnerCode = null;

  @SerializedName("isAnnualPrepay")
  private Boolean isAnnualPrepay = false;

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
  public String getPurchaseOrder() {
    return purchaseOrder;
  }
  public void setPurchaseOrder(String purchaseOrder) {
    this.purchaseOrder = purchaseOrder;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
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
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getLastUpdatedDate() {
    return lastUpdatedDate;
  }
  public void setLastUpdatedDate(Date lastUpdatedDate) {
    this.lastUpdatedDate = lastUpdatedDate;
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
  public String getBillingContactPhone() {
    return billingContactPhone;
  }
  public void setBillingContactPhone(String billingContactPhone) {
    this.billingContactPhone = billingContactPhone;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getIncludeVoiceCharges() {
    return includeVoiceCharges;
  }
  public void setIncludeVoiceCharges(Boolean includeVoiceCharges) {
    this.includeVoiceCharges = includeVoiceCharges;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<QuoteCharge> getCharges() {
    return charges;
  }
  public void setCharges(List<QuoteCharge> charges) {
    this.charges = charges;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getEdgeControlModel() {
    return edgeControlModel;
  }
  public void setEdgeControlModel(String edgeControlModel) {
    this.edgeControlModel = edgeControlModel;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getReferralCodes() {
    return referralCodes;
  }
  public void setReferralCodes(List<String> referralCodes) {
    this.referralCodes = referralCodes;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getDiscountCodes() {
    return discountCodes;
  }
  public void setDiscountCodes(List<String> discountCodes) {
    this.discountCodes = discountCodes;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSalesPartnerCode() {
    return salesPartnerCode;
  }
  public void setSalesPartnerCode(String salesPartnerCode) {
    this.salesPartnerCode = salesPartnerCode;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getIsAnnualPrepay() {
    return isAnnualPrepay;
  }
  public void setIsAnnualPrepay(Boolean isAnnualPrepay) {
    this.isAnnualPrepay = isAnnualPrepay;
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
    Quote quote = (Quote) o;
    return Objects.equals(id, quote.id) &&
        Objects.equals(name, quote.name) &&
        Objects.equals(purchaseOrder, quote.purchaseOrder) &&
        Objects.equals(type, quote.type) &&
        Objects.equals(status, quote.status) &&
        Objects.equals(currency, quote.currency) &&
        Objects.equals(createdDate, quote.createdDate) &&
        Objects.equals(lastUpdatedDate, quote.lastUpdatedDate) &&
        Objects.equals(billingContactEmail, quote.billingContactEmail) &&
        Objects.equals(billingContactFirstName, quote.billingContactFirstName) &&
        Objects.equals(billingContactLastName, quote.billingContactLastName) &&
        Objects.equals(billingContactPhone, quote.billingContactPhone) &&
        Objects.equals(includeVoiceCharges, quote.includeVoiceCharges) &&
        Objects.equals(charges, quote.charges) &&
        Objects.equals(edgeControlModel, quote.edgeControlModel) &&
        Objects.equals(referralCodes, quote.referralCodes) &&
        Objects.equals(discountCodes, quote.discountCodes) &&
        Objects.equals(salesPartnerCode, quote.salesPartnerCode) &&
        Objects.equals(isAnnualPrepay, quote.isAnnualPrepay) &&
        Objects.equals(selfUri, quote.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, purchaseOrder, type, status, currency, createdDate, lastUpdatedDate, billingContactEmail, billingContactFirstName, billingContactLastName, billingContactPhone, includeVoiceCharges, charges, edgeControlModel, referralCodes, discountCodes, salesPartnerCode, isAnnualPrepay, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Quote {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    purchaseOrder: ").append(toIndentedString(purchaseOrder)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    lastUpdatedDate: ").append(toIndentedString(lastUpdatedDate)).append("\n");
    sb.append("    billingContactEmail: ").append(toIndentedString(billingContactEmail)).append("\n");
    sb.append("    billingContactFirstName: ").append(toIndentedString(billingContactFirstName)).append("\n");
    sb.append("    billingContactLastName: ").append(toIndentedString(billingContactLastName)).append("\n");
    sb.append("    billingContactPhone: ").append(toIndentedString(billingContactPhone)).append("\n");
    sb.append("    includeVoiceCharges: ").append(toIndentedString(includeVoiceCharges)).append("\n");
    sb.append("    charges: ").append(toIndentedString(charges)).append("\n");
    sb.append("    edgeControlModel: ").append(toIndentedString(edgeControlModel)).append("\n");
    sb.append("    referralCodes: ").append(toIndentedString(referralCodes)).append("\n");
    sb.append("    discountCodes: ").append(toIndentedString(discountCodes)).append("\n");
    sb.append("    salesPartnerCode: ").append(toIndentedString(salesPartnerCode)).append("\n");
    sb.append("    isAnnualPrepay: ").append(toIndentedString(isAnnualPrepay)).append("\n");
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
