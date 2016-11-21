package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.LocationAddress;
import com.mypurecloud.sdk.model.LocationEmergencyNumber;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class Location  implements Serializable {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("address")
  private LocationAddress address = null;

  @SerializedName("addressVerified")
  private Boolean addressVerified = false;

  @SerializedName("emergencyNumber")
  private LocationEmergencyNumber emergencyNumber = null;


  /**
   * Current activity status of the location.
   */
  public enum StateEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("active")
    ACTIVE("active"),

    @SerializedName("deleted")
    DELETED("deleted");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("state")
  private StateEnum state = null;

  @SerializedName("version")
  private Integer version = null;

  @SerializedName("path")
  private List<String> path = new ArrayList<String>();

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
   **/
  @ApiModelProperty(value = "")
  public LocationAddress getAddress() {
    return address;
  }
  public void setAddress(LocationAddress address) {
    this.address = address;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getAddressVerified() {
    return addressVerified;
  }
  public void setAddressVerified(Boolean addressVerified) {
    this.addressVerified = addressVerified;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public LocationEmergencyNumber getEmergencyNumber() {
    return emergencyNumber;
  }
  public void setEmergencyNumber(LocationEmergencyNumber emergencyNumber) {
    this.emergencyNumber = emergencyNumber;
  }

  /**
   * Current activity status of the location.
   **/
  @ApiModelProperty(value = "Current activity status of the location.")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getPath() {
    return path;
  }
  public void setPath(List<String> path) {
    this.path = path;
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
    Location location = (Location) o;
    return Objects.equals(id, location.id) &&
        Objects.equals(name, location.name) &&
        Objects.equals(address, location.address) &&
        Objects.equals(addressVerified, location.addressVerified) &&
        Objects.equals(emergencyNumber, location.emergencyNumber) &&
        Objects.equals(state, location.state) &&
        Objects.equals(version, location.version) &&
        Objects.equals(path, location.path) &&
        Objects.equals(selfUri, location.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, address, addressVerified, emergencyNumber, state, version, path, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    addressVerified: ").append(toIndentedString(addressVerified)).append("\n");
    sb.append("    emergencyNumber: ").append(toIndentedString(emergencyNumber)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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
