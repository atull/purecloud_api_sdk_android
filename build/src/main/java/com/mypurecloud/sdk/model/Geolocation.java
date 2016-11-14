package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class Geolocation  implements Serializable {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("primary")
  private Boolean primary = false;

  @SerializedName("latitude")
  private Double latitude = null;

  @SerializedName("longitude")
  private Double longitude = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("region")
  private String region = null;

  @SerializedName("city")
  private String city = null;

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
   * A string used to describe the type of client the geolocation is being updated from e.g. ios, android, web, etc.
   **/
  @ApiModelProperty(value = "A string used to describe the type of client the geolocation is being updated from e.g. ios, android, web, etc.")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * A boolean used to tell whether or not to set this geolocation client as the primary on a PATCH
   **/
  @ApiModelProperty(value = "A boolean used to tell whether or not to set this geolocation client as the primary on a PATCH")
  public Boolean getPrimary() {
    return primary;
  }
  public void setPrimary(Boolean primary) {
    this.primary = primary;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getLatitude() {
    return latitude;
  }
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getLongitude() {
    return longitude;
  }
  public void setLongitude(Double longitude) {
    this.longitude = longitude;
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

  /**
   **/
  @ApiModelProperty(value = "")
  public String getRegion() {
    return region;
  }
  public void setRegion(String region) {
    this.region = region;
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
    Geolocation geolocation = (Geolocation) o;
    return Objects.equals(id, geolocation.id) &&
        Objects.equals(name, geolocation.name) &&
        Objects.equals(type, geolocation.type) &&
        Objects.equals(primary, geolocation.primary) &&
        Objects.equals(latitude, geolocation.latitude) &&
        Objects.equals(longitude, geolocation.longitude) &&
        Objects.equals(country, geolocation.country) &&
        Objects.equals(region, geolocation.region) &&
        Objects.equals(city, geolocation.city) &&
        Objects.equals(selfUri, geolocation.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, primary, latitude, longitude, country, region, city, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Geolocation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
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
