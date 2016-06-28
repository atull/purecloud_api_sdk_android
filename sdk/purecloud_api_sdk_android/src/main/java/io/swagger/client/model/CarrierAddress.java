package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;





public class CarrierAddress   {
  
  @SerializedName("streetAddress1")
  private String streetAddress1 = null;

  @SerializedName("streetAddress2")
  private String streetAddress2 = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("zipcode")
  private String zipcode = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getStreetAddress1() {
    return streetAddress1;
  }
  public void setStreetAddress1(String streetAddress1) {
    this.streetAddress1 = streetAddress1;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getStreetAddress2() {
    return streetAddress2;
  }
  public void setStreetAddress2(String streetAddress2) {
    this.streetAddress2 = streetAddress2;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
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
  public String getZipcode() {
    return zipcode;
  }
  public void setZipcode(String zipcode) {
    this.zipcode = zipcode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CarrierAddress carrierAddress = (CarrierAddress) o;
    return Objects.equals(streetAddress1, carrierAddress.streetAddress1) &&
        Objects.equals(streetAddress2, carrierAddress.streetAddress2) &&
        Objects.equals(city, carrierAddress.city) &&
        Objects.equals(state, carrierAddress.state) &&
        Objects.equals(zipcode, carrierAddress.zipcode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(streetAddress1, streetAddress2, city, state, zipcode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarrierAddress {\n");
    
    sb.append("    streetAddress1: ").append(toIndentedString(streetAddress1)).append("\n");
    sb.append("    streetAddress2: ").append(toIndentedString(streetAddress2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zipcode: ").append(toIndentedString(zipcode)).append("\n");
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
