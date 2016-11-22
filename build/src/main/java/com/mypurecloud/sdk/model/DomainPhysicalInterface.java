package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.DomainPhysicalCapabilities;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class DomainPhysicalInterface  implements Serializable {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("version")
  private Integer version = null;

  @SerializedName("dateCreated")
  private Date dateCreated = null;

  @SerializedName("dateModified")
  private Date dateModified = null;

  @SerializedName("modifiedBy")
  private String modifiedBy = null;

  @SerializedName("createdBy")
  private String createdBy = null;


  /**
   * Gets or Sets state
   */
  public enum StateEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("active")
    ACTIVE("active"),

    @SerializedName("inactive")
    INACTIVE("inactive"),

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

  @SerializedName("modifiedByApp")
  private String modifiedByApp = null;

  @SerializedName("createdByApp")
  private String createdByApp = null;

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
   * The name of the entity.
   **/
  @ApiModelProperty(required = true, value = "The name of the entity.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
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
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getModifiedBy() {
    return modifiedBy;
  }
  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getModifiedByApp() {
    return modifiedByApp;
  }
  public void setModifiedByApp(String modifiedByApp) {
    this.modifiedByApp = modifiedByApp;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCreatedByApp() {
    return createdByApp;
  }
  public void setCreatedByApp(String createdByApp) {
    this.createdByApp = createdByApp;
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
        Objects.equals(description, domainPhysicalInterface.description) &&
        Objects.equals(version, domainPhysicalInterface.version) &&
        Objects.equals(dateCreated, domainPhysicalInterface.dateCreated) &&
        Objects.equals(dateModified, domainPhysicalInterface.dateModified) &&
        Objects.equals(modifiedBy, domainPhysicalInterface.modifiedBy) &&
        Objects.equals(createdBy, domainPhysicalInterface.createdBy) &&
        Objects.equals(state, domainPhysicalInterface.state) &&
        Objects.equals(modifiedByApp, domainPhysicalInterface.modifiedByApp) &&
        Objects.equals(createdByApp, domainPhysicalInterface.createdByApp) &&
        Objects.equals(edgeUri, domainPhysicalInterface.edgeUri) &&
        Objects.equals(friendlyName, domainPhysicalInterface.friendlyName) &&
        Objects.equals(hardwareAddress, domainPhysicalInterface.hardwareAddress) &&
        Objects.equals(portLabel, domainPhysicalInterface.portLabel) &&
        Objects.equals(physicalCapabilities, domainPhysicalInterface.physicalCapabilities) &&
        Objects.equals(selfUri, domainPhysicalInterface.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, version, dateCreated, dateModified, modifiedBy, createdBy, state, modifiedByApp, createdByApp, edgeUri, friendlyName, hardwareAddress, portLabel, physicalCapabilities, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainPhysicalInterface {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    modifiedByApp: ").append(toIndentedString(modifiedByApp)).append("\n");
    sb.append("    createdByApp: ").append(toIndentedString(createdByApp)).append("\n");
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
