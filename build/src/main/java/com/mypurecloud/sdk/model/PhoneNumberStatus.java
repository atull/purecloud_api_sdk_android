package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class PhoneNumberStatus  implements Serializable {
  
  @SerializedName("callable")
  private Boolean callable = false;

  /**
   * false if the phone number is not callable
   **/
  @ApiModelProperty(value = "false if the phone number is not callable")
  public Boolean getCallable() {
    return callable;
  }
  public void setCallable(Boolean callable) {
    this.callable = callable;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneNumberStatus phoneNumberStatus = (PhoneNumberStatus) o;
    return Objects.equals(callable, phoneNumberStatus.callable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneNumberStatus {\n");
    
    sb.append("    callable: ").append(toIndentedString(callable)).append("\n");
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
