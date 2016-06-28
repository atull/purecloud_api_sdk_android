package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.CallRecord;
import io.swagger.client.model.PhoneNumberStatus;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;





public class DialerContact   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("contactListId")
  private String contactListId = null;

  @SerializedName("data")
  private Map<String, Object> data = new HashMap<String, Object>();

  @SerializedName("callRecords")
  private Map<String, CallRecord> callRecords = new HashMap<String, CallRecord>();

  @SerializedName("callable")
  private Boolean callable = false;

  @SerializedName("phoneNumberStatus")
  private Map<String, PhoneNumberStatus> phoneNumberStatus = new HashMap<String, PhoneNumberStatus>();

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
   * Identifier of the contact list containing this contact
   **/
  @ApiModelProperty(required = true, value = "Identifier of the contact list containing this contact")
  public String getContactListId() {
    return contactListId;
  }
  public void setContactListId(String contactListId) {
    this.contactListId = contactListId;
  }

  /**
   * A map of the contact's data attributes and values
   **/
  @ApiModelProperty(value = "A map of the contact's data attributes and values")
  public Map<String, Object> getData() {
    return data;
  }
  public void setData(Map<String, Object> data) {
    this.data = data;
  }

  /**
   * A map of call records for the contact phone columns
   **/
  @ApiModelProperty(value = "A map of call records for the contact phone columns")
  public Map<String, CallRecord> getCallRecords() {
    return callRecords;
  }
  public void setCallRecords(Map<String, CallRecord> callRecords) {
    this.callRecords = callRecords;
  }

  /**
   * false if the contact is not to be called
   **/
  @ApiModelProperty(value = "false if the contact is not to be called")
  public Boolean getCallable() {
    return callable;
  }
  public void setCallable(Boolean callable) {
    this.callable = callable;
  }

  /**
   * A map of statuses for the contact phone columns
   **/
  @ApiModelProperty(value = "A map of statuses for the contact phone columns")
  public Map<String, PhoneNumberStatus> getPhoneNumberStatus() {
    return phoneNumberStatus;
  }
  public void setPhoneNumberStatus(Map<String, PhoneNumberStatus> phoneNumberStatus) {
    this.phoneNumberStatus = phoneNumberStatus;
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
    DialerContact dialerContact = (DialerContact) o;
    return Objects.equals(id, dialerContact.id) &&
        Objects.equals(name, dialerContact.name) &&
        Objects.equals(contactListId, dialerContact.contactListId) &&
        Objects.equals(data, dialerContact.data) &&
        Objects.equals(callRecords, dialerContact.callRecords) &&
        Objects.equals(callable, dialerContact.callable) &&
        Objects.equals(phoneNumberStatus, dialerContact.phoneNumberStatus) &&
        Objects.equals(selfUri, dialerContact.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, contactListId, data, callRecords, callable, phoneNumberStatus, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerContact {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    contactListId: ").append(toIndentedString(contactListId)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    callRecords: ").append(toIndentedString(callRecords)).append("\n");
    sb.append("    callable: ").append(toIndentedString(callable)).append("\n");
    sb.append("    phoneNumberStatus: ").append(toIndentedString(phoneNumberStatus)).append("\n");
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
