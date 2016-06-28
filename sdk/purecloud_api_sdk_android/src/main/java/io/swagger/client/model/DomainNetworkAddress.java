package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;





public class DomainNetworkAddress   {
  
  @SerializedName("type")
  private String type = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("persistent")
  private Boolean persistent = false;

  @SerializedName("family")
  private Integer family = null;

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
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getPersistent() {
    return persistent;
  }
  public void setPersistent(Boolean persistent) {
    this.persistent = persistent;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getFamily() {
    return family;
  }
  public void setFamily(Integer family) {
    this.family = family;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomainNetworkAddress domainNetworkAddress = (DomainNetworkAddress) o;
    return Objects.equals(type, domainNetworkAddress.type) &&
        Objects.equals(address, domainNetworkAddress.address) &&
        Objects.equals(persistent, domainNetworkAddress.persistent) &&
        Objects.equals(family, domainNetworkAddress.family);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, address, persistent, family);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainNetworkAddress {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    persistent: ").append(toIndentedString(persistent)).append("\n");
    sb.append("    family: ").append(toIndentedString(family)).append("\n");
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
