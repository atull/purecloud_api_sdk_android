package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class ConversationNotificationAddress  implements Serializable {
  
  @SerializedName("name")
  private String name = null;

  @SerializedName("nameRaw")
  private String nameRaw = null;

  @SerializedName("addressNormalized")
  private String addressNormalized = null;

  @SerializedName("addressRaw")
  private String addressRaw = null;

  @SerializedName("addressDisplayable")
  private String addressDisplayable = null;

  @SerializedName("additionalProperties")
  private Object additionalProperties = null;

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
  public String getNameRaw() {
    return nameRaw;
  }
  public void setNameRaw(String nameRaw) {
    this.nameRaw = nameRaw;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getAddressNormalized() {
    return addressNormalized;
  }
  public void setAddressNormalized(String addressNormalized) {
    this.addressNormalized = addressNormalized;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getAddressRaw() {
    return addressRaw;
  }
  public void setAddressRaw(String addressRaw) {
    this.addressRaw = addressRaw;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getAddressDisplayable() {
    return addressDisplayable;
  }
  public void setAddressDisplayable(String addressDisplayable) {
    this.addressDisplayable = addressDisplayable;
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
    ConversationNotificationAddress conversationNotificationAddress = (ConversationNotificationAddress) o;
    return Objects.equals(name, conversationNotificationAddress.name) &&
        Objects.equals(nameRaw, conversationNotificationAddress.nameRaw) &&
        Objects.equals(addressNormalized, conversationNotificationAddress.addressNormalized) &&
        Objects.equals(addressRaw, conversationNotificationAddress.addressRaw) &&
        Objects.equals(addressDisplayable, conversationNotificationAddress.addressDisplayable) &&
        Objects.equals(additionalProperties, conversationNotificationAddress.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, nameRaw, addressNormalized, addressRaw, addressDisplayable, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationNotificationAddress {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameRaw: ").append(toIndentedString(nameRaw)).append("\n");
    sb.append("    addressNormalized: ").append(toIndentedString(addressNormalized)).append("\n");
    sb.append("    addressRaw: ").append(toIndentedString(addressRaw)).append("\n");
    sb.append("    addressDisplayable: ").append(toIndentedString(addressDisplayable)).append("\n");
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
