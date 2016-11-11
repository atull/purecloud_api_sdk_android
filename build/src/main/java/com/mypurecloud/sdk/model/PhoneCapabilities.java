package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class PhoneCapabilities  implements Serializable {
  
  @SerializedName("provisions")
  private Boolean provisions = false;

  @SerializedName("registers")
  private Boolean registers = false;

  @SerializedName("dualRegisters")
  private Boolean dualRegisters = false;

  @SerializedName("hardwareIdType")
  private String hardwareIdType = null;

  @SerializedName("allowReboot")
  private Boolean allowReboot = false;

  @SerializedName("noRebalance")
  private Boolean noRebalance = false;

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getProvisions() {
    return provisions;
  }
  public void setProvisions(Boolean provisions) {
    this.provisions = provisions;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getRegisters() {
    return registers;
  }
  public void setRegisters(Boolean registers) {
    this.registers = registers;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getDualRegisters() {
    return dualRegisters;
  }
  public void setDualRegisters(Boolean dualRegisters) {
    this.dualRegisters = dualRegisters;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getHardwareIdType() {
    return hardwareIdType;
  }
  public void setHardwareIdType(String hardwareIdType) {
    this.hardwareIdType = hardwareIdType;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getAllowReboot() {
    return allowReboot;
  }
  public void setAllowReboot(Boolean allowReboot) {
    this.allowReboot = allowReboot;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getNoRebalance() {
    return noRebalance;
  }
  public void setNoRebalance(Boolean noRebalance) {
    this.noRebalance = noRebalance;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneCapabilities phoneCapabilities = (PhoneCapabilities) o;
    return Objects.equals(provisions, phoneCapabilities.provisions) &&
        Objects.equals(registers, phoneCapabilities.registers) &&
        Objects.equals(dualRegisters, phoneCapabilities.dualRegisters) &&
        Objects.equals(hardwareIdType, phoneCapabilities.hardwareIdType) &&
        Objects.equals(allowReboot, phoneCapabilities.allowReboot) &&
        Objects.equals(noRebalance, phoneCapabilities.noRebalance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(provisions, registers, dualRegisters, hardwareIdType, allowReboot, noRebalance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneCapabilities {\n");
    
    sb.append("    provisions: ").append(toIndentedString(provisions)).append("\n");
    sb.append("    registers: ").append(toIndentedString(registers)).append("\n");
    sb.append("    dualRegisters: ").append(toIndentedString(dualRegisters)).append("\n");
    sb.append("    hardwareIdType: ").append(toIndentedString(hardwareIdType)).append("\n");
    sb.append("    allowReboot: ").append(toIndentedString(allowReboot)).append("\n");
    sb.append("    noRebalance: ").append(toIndentedString(noRebalance)).append("\n");
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
