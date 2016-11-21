package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.StreetAddress;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class ValidateAddressRequest  implements Serializable {
  
  @SerializedName("address")
  private StreetAddress address = null;

  /**
   * The address that is to be validated.
   **/
  @ApiModelProperty(required = true, value = "The address that is to be validated.")
  public StreetAddress getAddress() {
    return address;
  }
  public void setAddress(StreetAddress address) {
    this.address = address;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateAddressRequest validateAddressRequest = (ValidateAddressRequest) o;
    return Objects.equals(address, validateAddressRequest.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateAddressRequest {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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
