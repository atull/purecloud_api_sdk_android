package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Charge;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class AccountOverview   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("isSuperUser")
  private Boolean isSuperUser = false;

  @SerializedName("hasAccountNumber")
  private Boolean hasAccountNumber = false;

  @SerializedName("usageCharges")
  private List<Charge> usageCharges = new ArrayList<Charge>();

  @SerializedName("domesticChargesTotal")
  private Integer domesticChargesTotal = null;

  @SerializedName("internationalChargesTotal")
  private Integer internationalChargesTotal = null;

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
  public Boolean getIsSuperUser() {
    return isSuperUser;
  }
  public void setIsSuperUser(Boolean isSuperUser) {
    this.isSuperUser = isSuperUser;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getHasAccountNumber() {
    return hasAccountNumber;
  }
  public void setHasAccountNumber(Boolean hasAccountNumber) {
    this.hasAccountNumber = hasAccountNumber;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Charge> getUsageCharges() {
    return usageCharges;
  }
  public void setUsageCharges(List<Charge> usageCharges) {
    this.usageCharges = usageCharges;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getDomesticChargesTotal() {
    return domesticChargesTotal;
  }
  public void setDomesticChargesTotal(Integer domesticChargesTotal) {
    this.domesticChargesTotal = domesticChargesTotal;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getInternationalChargesTotal() {
    return internationalChargesTotal;
  }
  public void setInternationalChargesTotal(Integer internationalChargesTotal) {
    this.internationalChargesTotal = internationalChargesTotal;
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
    AccountOverview accountOverview = (AccountOverview) o;
    return Objects.equals(id, accountOverview.id) &&
        Objects.equals(name, accountOverview.name) &&
        Objects.equals(isSuperUser, accountOverview.isSuperUser) &&
        Objects.equals(hasAccountNumber, accountOverview.hasAccountNumber) &&
        Objects.equals(usageCharges, accountOverview.usageCharges) &&
        Objects.equals(domesticChargesTotal, accountOverview.domesticChargesTotal) &&
        Objects.equals(internationalChargesTotal, accountOverview.internationalChargesTotal) &&
        Objects.equals(selfUri, accountOverview.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, isSuperUser, hasAccountNumber, usageCharges, domesticChargesTotal, internationalChargesTotal, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountOverview {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isSuperUser: ").append(toIndentedString(isSuperUser)).append("\n");
    sb.append("    hasAccountNumber: ").append(toIndentedString(hasAccountNumber)).append("\n");
    sb.append("    usageCharges: ").append(toIndentedString(usageCharges)).append("\n");
    sb.append("    domesticChargesTotal: ").append(toIndentedString(domesticChargesTotal)).append("\n");
    sb.append("    internationalChargesTotal: ").append(toIndentedString(internationalChargesTotal)).append("\n");
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
