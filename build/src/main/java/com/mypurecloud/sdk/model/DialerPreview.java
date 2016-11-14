package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.PhoneNumberColumn;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class DialerPreview  implements Serializable {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("contactId")
  private String contactId = null;

  @SerializedName("contactListId")
  private String contactListId = null;

  @SerializedName("campaignId")
  private String campaignId = null;

  @SerializedName("phoneNumberColumns")
  private List<PhoneNumberColumn> phoneNumberColumns = new ArrayList<PhoneNumberColumn>();

  /**
   **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getContactId() {
    return contactId;
  }
  public void setContactId(String contactId) {
    this.contactId = contactId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getContactListId() {
    return contactListId;
  }
  public void setContactListId(String contactListId) {
    this.contactListId = contactListId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCampaignId() {
    return campaignId;
  }
  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<PhoneNumberColumn> getPhoneNumberColumns() {
    return phoneNumberColumns;
  }
  public void setPhoneNumberColumns(List<PhoneNumberColumn> phoneNumberColumns) {
    this.phoneNumberColumns = phoneNumberColumns;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DialerPreview dialerPreview = (DialerPreview) o;
    return Objects.equals(id, dialerPreview.id) &&
        Objects.equals(contactId, dialerPreview.contactId) &&
        Objects.equals(contactListId, dialerPreview.contactListId) &&
        Objects.equals(campaignId, dialerPreview.campaignId) &&
        Objects.equals(phoneNumberColumns, dialerPreview.phoneNumberColumns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, contactId, contactListId, campaignId, phoneNumberColumns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerPreview {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    sb.append("    contactListId: ").append(toIndentedString(contactListId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    phoneNumberColumns: ").append(toIndentedString(phoneNumberColumns)).append("\n");
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
