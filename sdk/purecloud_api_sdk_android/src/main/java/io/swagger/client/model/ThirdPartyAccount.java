package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Invoice;
import io.swagger.client.model.ThirdPartySubscription;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class ThirdPartyAccount   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("accountNumber")
  private String accountNumber = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("invoices")
  private List<Invoice> invoices = new ArrayList<Invoice>();

  @SerializedName("subscriptions")
  private List<ThirdPartySubscription> subscriptions = new ArrayList<ThirdPartySubscription>();

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
  public String getAccountNumber() {
    return accountNumber;
  }
  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
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
  public List<Invoice> getInvoices() {
    return invoices;
  }
  public void setInvoices(List<Invoice> invoices) {
    this.invoices = invoices;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<ThirdPartySubscription> getSubscriptions() {
    return subscriptions;
  }
  public void setSubscriptions(List<ThirdPartySubscription> subscriptions) {
    this.subscriptions = subscriptions;
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
    ThirdPartyAccount thirdPartyAccount = (ThirdPartyAccount) o;
    return Objects.equals(id, thirdPartyAccount.id) &&
        Objects.equals(name, thirdPartyAccount.name) &&
        Objects.equals(accountNumber, thirdPartyAccount.accountNumber) &&
        Objects.equals(currency, thirdPartyAccount.currency) &&
        Objects.equals(invoices, thirdPartyAccount.invoices) &&
        Objects.equals(subscriptions, thirdPartyAccount.subscriptions) &&
        Objects.equals(selfUri, thirdPartyAccount.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, accountNumber, currency, invoices, subscriptions, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThirdPartyAccount {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    invoices: ").append(toIndentedString(invoices)).append("\n");
    sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
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
