package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.UriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class EdgeInterface  implements Serializable {
  
  @SerializedName("type")
  private String type = null;

  @SerializedName("ipAddress")
  private String ipAddress = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("macAddress")
  private String macAddress = null;

  @SerializedName("ifName")
  private String ifName = null;

  @SerializedName("endpoints")
  private List<UriReference> endpoints = new ArrayList<UriReference>();


  /**
   * Gets or Sets lineTypes
   */
  public enum LineTypesEnum {
    @SerializedName("TIE")
    TIE("TIE"),

    @SerializedName("NETWORK")
    NETWORK("NETWORK"),

    @SerializedName("TRUNK")
    TRUNK("TRUNK"),

    @SerializedName("STATION")
    STATION("STATION");

    private String value;

    LineTypesEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("lineTypes")
  private List<LineTypesEnum> lineTypes = new ArrayList<LineTypesEnum>();

  @SerializedName("addressFamilyId")
  private String addressFamilyId = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getIpAddress() {
    return ipAddress;
  }
  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
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
   **/
  @ApiModelProperty(value = "")
  public String getMacAddress() {
    return macAddress;
  }
  public void setMacAddress(String macAddress) {
    this.macAddress = macAddress;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getIfName() {
    return ifName;
  }
  public void setIfName(String ifName) {
    this.ifName = ifName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<UriReference> getEndpoints() {
    return endpoints;
  }
  public void setEndpoints(List<UriReference> endpoints) {
    this.endpoints = endpoints;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<LineTypesEnum> getLineTypes() {
    return lineTypes;
  }
  public void setLineTypes(List<LineTypesEnum> lineTypes) {
    this.lineTypes = lineTypes;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getAddressFamilyId() {
    return addressFamilyId;
  }
  public void setAddressFamilyId(String addressFamilyId) {
    this.addressFamilyId = addressFamilyId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdgeInterface edgeInterface = (EdgeInterface) o;
    return Objects.equals(type, edgeInterface.type) &&
        Objects.equals(ipAddress, edgeInterface.ipAddress) &&
        Objects.equals(name, edgeInterface.name) &&
        Objects.equals(macAddress, edgeInterface.macAddress) &&
        Objects.equals(ifName, edgeInterface.ifName) &&
        Objects.equals(endpoints, edgeInterface.endpoints) &&
        Objects.equals(lineTypes, edgeInterface.lineTypes) &&
        Objects.equals(addressFamilyId, edgeInterface.addressFamilyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, ipAddress, name, macAddress, ifName, endpoints, lineTypes, addressFamilyId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdgeInterface {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
    sb.append("    ifName: ").append(toIndentedString(ifName)).append("\n");
    sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
    sb.append("    lineTypes: ").append(toIndentedString(lineTypes)).append("\n");
    sb.append("    addressFamilyId: ").append(toIndentedString(addressFamilyId)).append("\n");
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
