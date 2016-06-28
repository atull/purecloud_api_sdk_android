package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.DomainPhysicalCapabilities;

import com.google.gson.annotations.SerializedName;





public class DomainPhysicalInterface   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("edgeUri")
  private String edgeUri = null;

  @SerializedName("friendlyName")
  private String friendlyName = null;

  @SerializedName("hardwareAddress")
  private String hardwareAddress = null;

  @SerializedName("portLabel")
  private String portLabel = null;

  @SerializedName("physicalCapabilities")
  private DomainPhysicalCapabilities physicalCapabilities = null;

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
  public String getEdgeUri() {
    return edgeUri;
  }
  public void setEdgeUri(String edgeUri) {
    this.edgeUri = edgeUri;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getFriendlyName() {
    return friendlyName;
  }
  public void setFriendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getHardwareAddress() {
    return hardwareAddress;
  }
  public void setHardwareAddress(String hardwareAddress) {
    this.hardwareAddress = hardwareAddress;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPortLabel() {
    return portLabel;
  }
  public void setPortLabel(String portLabel) {
    this.portLabel = portLabel;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public DomainPhysicalCapabilities getPhysicalCapabilities() {
    return physicalCapabilities;
  }
  public void setPhysicalCapabilities(DomainPhysicalCapabilities physicalCapabilities) {
    this.physicalCapabilities = physicalCapabilities;
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
    DomainPhysicalInterface domainPhysicalInterface = (DomainPhysicalInterface) o;
    return Objects.equals(id, domainPhysicalInterface.id) &&
        Objects.equals(name, domainPhysicalInterface.name) &&
        Objects.equals(edgeUri, domainPhysicalInterface.edgeUri) &&
        Objects.equals(friendlyName, domainPhysicalInterface.friendlyName) &&
        Objects.equals(hardwareAddress, domainPhysicalInterface.hardwareAddress) &&
        Objects.equals(portLabel, domainPhysicalInterface.portLabel) &&
        Objects.equals(physicalCapabilities, domainPhysicalInterface.physicalCapabilities) &&
        Objects.equals(selfUri, domainPhysicalInterface.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, edgeUri, friendlyName, hardwareAddress, portLabel, physicalCapabilities, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainPhysicalInterface {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    edgeUri: ").append(toIndentedString(edgeUri)).append("\n");
    sb.append("    friendlyName: ").append(toIndentedString(friendlyName)).append("\n");
    sb.append("    hardwareAddress: ").append(toIndentedString(hardwareAddress)).append("\n");
    sb.append("    portLabel: ").append(toIndentedString(portLabel)).append("\n");
    sb.append("    physicalCapabilities: ").append(toIndentedString(physicalCapabilities)).append("\n");
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
