package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;





public class ContactCallbackRequest   {
  
  @SerializedName("campaignId")
  private String campaignId = null;

  @SerializedName("contactListId")
  private String contactListId = null;

  @SerializedName("contactId")
  private String contactId = null;

  @SerializedName("phoneColumn")
  private String phoneColumn = null;

  @SerializedName("schedule")
  private String schedule = null;

  /**
   * Campaign identifier
   **/
  @ApiModelProperty(required = true, value = "Campaign identifier")
  public String getCampaignId() {
    return campaignId;
  }
  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }

  /**
   * Contact list identifier
   **/
  @ApiModelProperty(required = true, value = "Contact list identifier")
  public String getContactListId() {
    return contactListId;
  }
  public void setContactListId(String contactListId) {
    this.contactListId = contactListId;
  }

  /**
   * Contact identifier
   **/
  @ApiModelProperty(required = true, value = "Contact identifier")
  public String getContactId() {
    return contactId;
  }
  public void setContactId(String contactId) {
    this.contactId = contactId;
  }

  /**
   * Name of the phone column containing the number to be called
   **/
  @ApiModelProperty(required = true, value = "Name of the phone column containing the number to be called")
  public String getPhoneColumn() {
    return phoneColumn;
  }
  public void setPhoneColumn(String phoneColumn) {
    this.phoneColumn = phoneColumn;
  }

  /**
   * The scheduled time for the callback as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ\", example = \"2016-01-02T16:59:59\"
   **/
  @ApiModelProperty(required = true, value = "The scheduled time for the callback as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ\", example = \"2016-01-02T16:59:59\"")
  public String getSchedule() {
    return schedule;
  }
  public void setSchedule(String schedule) {
    this.schedule = schedule;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactCallbackRequest contactCallbackRequest = (ContactCallbackRequest) o;
    return Objects.equals(campaignId, contactCallbackRequest.campaignId) &&
        Objects.equals(contactListId, contactCallbackRequest.contactListId) &&
        Objects.equals(contactId, contactCallbackRequest.contactId) &&
        Objects.equals(phoneColumn, contactCallbackRequest.phoneColumn) &&
        Objects.equals(schedule, contactCallbackRequest.schedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignId, contactListId, contactId, phoneColumn, schedule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactCallbackRequest {\n");
    
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    contactListId: ").append(toIndentedString(contactListId)).append("\n");
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    sb.append("    phoneColumn: ").append(toIndentedString(phoneColumn)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
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
