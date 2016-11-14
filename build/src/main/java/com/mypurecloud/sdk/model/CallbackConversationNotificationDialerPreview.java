package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.ConversationNotificationDialerPreviewPhoneNumberColumns;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class CallbackConversationNotificationDialerPreview  implements Serializable {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("contactId")
  private String contactId = null;

  @SerializedName("contactListId")
  private String contactListId = null;

  @SerializedName("campaignId")
  private String campaignId = null;

  @SerializedName("phoneNumberColumns")
  private List<ConversationNotificationDialerPreviewPhoneNumberColumns> phoneNumberColumns = new ArrayList<ConversationNotificationDialerPreviewPhoneNumberColumns>();

  @SerializedName("additionalProperties")
  private Object additionalProperties = null;

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
  public List<ConversationNotificationDialerPreviewPhoneNumberColumns> getPhoneNumberColumns() {
    return phoneNumberColumns;
  }
  public void setPhoneNumberColumns(List<ConversationNotificationDialerPreviewPhoneNumberColumns> phoneNumberColumns) {
    this.phoneNumberColumns = phoneNumberColumns;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Object getAdditionalProperties() {
    return additionalProperties;
  }
  public void setAdditionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallbackConversationNotificationDialerPreview callbackConversationNotificationDialerPreview = (CallbackConversationNotificationDialerPreview) o;
    return Objects.equals(id, callbackConversationNotificationDialerPreview.id) &&
        Objects.equals(contactId, callbackConversationNotificationDialerPreview.contactId) &&
        Objects.equals(contactListId, callbackConversationNotificationDialerPreview.contactListId) &&
        Objects.equals(campaignId, callbackConversationNotificationDialerPreview.campaignId) &&
        Objects.equals(phoneNumberColumns, callbackConversationNotificationDialerPreview.phoneNumberColumns) &&
        Objects.equals(additionalProperties, callbackConversationNotificationDialerPreview.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, contactId, contactListId, campaignId, phoneNumberColumns, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallbackConversationNotificationDialerPreview {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    sb.append("    contactListId: ").append(toIndentedString(contactListId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    phoneNumberColumns: ").append(toIndentedString(phoneNumberColumns)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
