package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.UriReference;

import com.google.gson.annotations.SerializedName;





public class CampaignProgress   {
  
  @SerializedName("campaign")
  private UriReference campaign = null;

  @SerializedName("contactList")
  private UriReference contactList = null;

  @SerializedName("numberOfContactsCalled")
  private Long numberOfContactsCalled = null;

  @SerializedName("totalNumberOfContacts")
  private Long totalNumberOfContacts = null;

  @SerializedName("percentage")
  private Long percentage = null;

  /**
   * Identifier of the campaign
   **/
  @ApiModelProperty(required = true, value = "Identifier of the campaign")
  public UriReference getCampaign() {
    return campaign;
  }
  public void setCampaign(UriReference campaign) {
    this.campaign = campaign;
  }

  /**
   * Identifier of the contact list
   **/
  @ApiModelProperty(required = true, value = "Identifier of the contact list")
  public UriReference getContactList() {
    return contactList;
  }
  public void setContactList(UriReference contactList) {
    this.contactList = contactList;
  }

  /**
   * Number of contacts processed during the campaign
   **/
  @ApiModelProperty(value = "Number of contacts processed during the campaign")
  public Long getNumberOfContactsCalled() {
    return numberOfContactsCalled;
  }

  /**
   * Total number of contacts in the campaign
   **/
  @ApiModelProperty(value = "Total number of contacts in the campaign")
  public Long getTotalNumberOfContacts() {
    return totalNumberOfContacts;
  }

  /**
   * Percentage of contacts processed during the campaign
   **/
  @ApiModelProperty(value = "Percentage of contacts processed during the campaign")
  public Long getPercentage() {
    return percentage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignProgress campaignProgress = (CampaignProgress) o;
    return Objects.equals(campaign, campaignProgress.campaign) &&
        Objects.equals(contactList, campaignProgress.contactList) &&
        Objects.equals(numberOfContactsCalled, campaignProgress.numberOfContactsCalled) &&
        Objects.equals(totalNumberOfContacts, campaignProgress.totalNumberOfContacts) &&
        Objects.equals(percentage, campaignProgress.percentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaign, contactList, numberOfContactsCalled, totalNumberOfContacts, percentage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignProgress {\n");
    
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
    sb.append("    contactList: ").append(toIndentedString(contactList)).append("\n");
    sb.append("    numberOfContactsCalled: ").append(toIndentedString(numberOfContactsCalled)).append("\n");
    sb.append("    totalNumberOfContacts: ").append(toIndentedString(totalNumberOfContacts)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
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
