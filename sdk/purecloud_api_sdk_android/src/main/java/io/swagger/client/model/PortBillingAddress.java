package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;





public class PortBillingAddress   {
  
  @SerializedName("streetAddress")
  private String streetAddress = null;

  @SerializedName("cityProvince")
  private String cityProvince = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("zipPostal")
  private String zipPostal = null;

  @SerializedName("country")
  private String country = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getStreetAddress() {
    return streetAddress;
  }
  public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCityProvince() {
    return cityProvince;
  }
  public void setCityProvince(String cityProvince) {
    this.cityProvince = cityProvince;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getZipPostal() {
    return zipPostal;
  }
  public void setZipPostal(String zipPostal) {
    this.zipPostal = zipPostal;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortBillingAddress portBillingAddress = (PortBillingAddress) o;
    return Objects.equals(streetAddress, portBillingAddress.streetAddress) &&
        Objects.equals(cityProvince, portBillingAddress.cityProvince) &&
        Objects.equals(state, portBillingAddress.state) &&
        Objects.equals(zipPostal, portBillingAddress.zipPostal) &&
        Objects.equals(country, portBillingAddress.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(streetAddress, cityProvince, state, zipPostal, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortBillingAddress {\n");
    
    sb.append("    streetAddress: ").append(toIndentedString(streetAddress)).append("\n");
    sb.append("    cityProvince: ").append(toIndentedString(cityProvince)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zipPostal: ").append(toIndentedString(zipPostal)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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
