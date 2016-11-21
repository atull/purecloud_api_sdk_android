package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class StreetAddress  implements Serializable {
  
  @SerializedName("country")
  private String country = null;

  @SerializedName("A1")
  private String a1 = null;

  @SerializedName("A3")
  private String a3 = null;

  @SerializedName("RD")
  private String RD = null;

  @SerializedName("HNO")
  private String HNO = null;

  @SerializedName("LOC")
  private String LOC = null;

  @SerializedName("NAM")
  private String NAM = null;

  @SerializedName("PC")
  private String PC = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getA1() {
    return a1;
  }
  public void setA1(String a1) {
    this.a1 = a1;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getA3() {
    return a3;
  }
  public void setA3(String a3) {
    this.a3 = a3;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getRD() {
    return RD;
  }
  public void setRD(String RD) {
    this.RD = RD;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getHNO() {
    return HNO;
  }
  public void setHNO(String HNO) {
    this.HNO = HNO;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getLOC() {
    return LOC;
  }
  public void setLOC(String LOC) {
    this.LOC = LOC;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getNAM() {
    return NAM;
  }
  public void setNAM(String NAM) {
    this.NAM = NAM;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPC() {
    return PC;
  }
  public void setPC(String PC) {
    this.PC = PC;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreetAddress streetAddress = (StreetAddress) o;
    return Objects.equals(country, streetAddress.country) &&
        Objects.equals(a1, streetAddress.a1) &&
        Objects.equals(a3, streetAddress.a3) &&
        Objects.equals(RD, streetAddress.RD) &&
        Objects.equals(HNO, streetAddress.HNO) &&
        Objects.equals(LOC, streetAddress.LOC) &&
        Objects.equals(NAM, streetAddress.NAM) &&
        Objects.equals(PC, streetAddress.PC);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, a1, a3, RD, HNO, LOC, NAM, PC);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreetAddress {\n");
    
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    a1: ").append(toIndentedString(a1)).append("\n");
    sb.append("    a3: ").append(toIndentedString(a3)).append("\n");
    sb.append("    RD: ").append(toIndentedString(RD)).append("\n");
    sb.append("    HNO: ").append(toIndentedString(HNO)).append("\n");
    sb.append("    LOC: ").append(toIndentedString(LOC)).append("\n");
    sb.append("    NAM: ").append(toIndentedString(NAM)).append("\n");
    sb.append("    PC: ").append(toIndentedString(PC)).append("\n");
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
