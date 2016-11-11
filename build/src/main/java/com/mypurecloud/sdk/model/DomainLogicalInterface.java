package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.DomainCapabilities;
import com.mypurecloud.sdk.model.DomainNetworkAddress;
import com.mypurecloud.sdk.model.DomainNetworkCommandResponse;
import com.mypurecloud.sdk.model.DomainNetworkRoute;
import com.mypurecloud.sdk.model.TrunkBaseAssignment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class DomainLogicalInterface  implements Serializable {
  
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

  @SerializedName("edgeAssignedId")
  private String edgeAssignedId = null;

  @SerializedName("friendlyName")
  private String friendlyName = null;

  @SerializedName("vlanTagId")
  private Integer vlanTagId = null;

  @SerializedName("hardwareAddress")
  private String hardwareAddress = null;

  @SerializedName("physicalAdapterId")
  private String physicalAdapterId = null;

  @SerializedName("ipAddress")
  private String ipAddress = null;

  @SerializedName("gateway")
  private String gateway = null;

  @SerializedName("primaryDns")
  private String primaryDns = null;

  @SerializedName("secondaryDns")
  private String secondaryDns = null;

  @SerializedName("ifStatus")
  private String ifStatus = null;

  @SerializedName("routes")
  private List<DomainNetworkRoute> routes = new ArrayList<DomainNetworkRoute>();

  @SerializedName("addresses")
  private List<DomainNetworkAddress> addresses = new ArrayList<DomainNetworkAddress>();

  @SerializedName("ipv4Capabilities")
  private DomainCapabilities ipv4Capabilities = null;

  @SerializedName("ipv6Capabilities")
  private DomainCapabilities ipv6Capabilities = null;


  /**
   * Gets or Sets currentState
   */
  public enum CurrentStateEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("INIT")
    INIT("INIT"),

    @SerializedName("CREATING")
    CREATING("CREATING"),

    @SerializedName("UPDATING")
    UPDATING("UPDATING"),

    @SerializedName("OK")
    OK("OK"),

    @SerializedName("EXCEPTION")
    EXCEPTION("EXCEPTION"),

    @SerializedName("DELETING")
    DELETING("DELETING");

    private String value;

    CurrentStateEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("currentState")
  private CurrentStateEnum currentState = null;

  @SerializedName("lastModifiedUserId")
  private String lastModifiedUserId = null;

  @SerializedName("lastModifiedCorrelationId")
  private String lastModifiedCorrelationId = null;

  @SerializedName("commandResponses")
  private List<DomainNetworkCommandResponse> commandResponses = new ArrayList<DomainNetworkCommandResponse>();

  @SerializedName("inheritPhoneTrunkBasesIPv4")
  private Boolean inheritPhoneTrunkBasesIPv4 = false;

  @SerializedName("inheritPhoneTrunkBasesIPv6")
  private Boolean inheritPhoneTrunkBasesIPv6 = false;

  @SerializedName("useForInternalEdgeCommunication")
  private Boolean useForInternalEdgeCommunication = false;

  @SerializedName("externalTrunkBaseAssignments")
  private List<TrunkBaseAssignment> externalTrunkBaseAssignments = new ArrayList<TrunkBaseAssignment>();

  @SerializedName("phoneTrunkBaseAssignments")
  private List<TrunkBaseAssignment> phoneTrunkBaseAssignments = new ArrayList<TrunkBaseAssignment>();

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
  public String getEdgeAssignedId() {
    return edgeAssignedId;
  }
  public void setEdgeAssignedId(String edgeAssignedId) {
    this.edgeAssignedId = edgeAssignedId;
  }

  /**
   * Friendly Name
   **/
  @ApiModelProperty(required = true, value = "Friendly Name")
  public String getFriendlyName() {
    return friendlyName;
  }
  public void setFriendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getVlanTagId() {
    return vlanTagId;
  }
  public void setVlanTagId(Integer vlanTagId) {
    this.vlanTagId = vlanTagId;
  }

  /**
   * Hardware Address
   **/
  @ApiModelProperty(required = true, value = "Hardware Address")
  public String getHardwareAddress() {
    return hardwareAddress;
  }
  public void setHardwareAddress(String hardwareAddress) {
    this.hardwareAddress = hardwareAddress;
  }

  /**
   * Physical Adapter Id
   **/
  @ApiModelProperty(required = true, value = "Physical Adapter Id")
  public String getPhysicalAdapterId() {
    return physicalAdapterId;
  }
  public void setPhysicalAdapterId(String physicalAdapterId) {
    this.physicalAdapterId = physicalAdapterId;
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
  public String getGateway() {
    return gateway;
  }
  public void setGateway(String gateway) {
    this.gateway = gateway;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPrimaryDns() {
    return primaryDns;
  }
  public void setPrimaryDns(String primaryDns) {
    this.primaryDns = primaryDns;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSecondaryDns() {
    return secondaryDns;
  }
  public void setSecondaryDns(String secondaryDns) {
    this.secondaryDns = secondaryDns;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getIfStatus() {
    return ifStatus;
  }
  public void setIfStatus(String ifStatus) {
    this.ifStatus = ifStatus;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<DomainNetworkRoute> getRoutes() {
    return routes;
  }
  public void setRoutes(List<DomainNetworkRoute> routes) {
    this.routes = routes;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<DomainNetworkAddress> getAddresses() {
    return addresses;
  }
  public void setAddresses(List<DomainNetworkAddress> addresses) {
    this.addresses = addresses;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public DomainCapabilities getIpv4Capabilities() {
    return ipv4Capabilities;
  }
  public void setIpv4Capabilities(DomainCapabilities ipv4Capabilities) {
    this.ipv4Capabilities = ipv4Capabilities;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public DomainCapabilities getIpv6Capabilities() {
    return ipv6Capabilities;
  }
  public void setIpv6Capabilities(DomainCapabilities ipv6Capabilities) {
    this.ipv6Capabilities = ipv6Capabilities;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public CurrentStateEnum getCurrentState() {
    return currentState;
  }
  public void setCurrentState(CurrentStateEnum currentState) {
    this.currentState = currentState;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getLastModifiedUserId() {
    return lastModifiedUserId;
  }
  public void setLastModifiedUserId(String lastModifiedUserId) {
    this.lastModifiedUserId = lastModifiedUserId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getLastModifiedCorrelationId() {
    return lastModifiedCorrelationId;
  }
  public void setLastModifiedCorrelationId(String lastModifiedCorrelationId) {
    this.lastModifiedCorrelationId = lastModifiedCorrelationId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<DomainNetworkCommandResponse> getCommandResponses() {
    return commandResponses;
  }
  public void setCommandResponses(List<DomainNetworkCommandResponse> commandResponses) {
    this.commandResponses = commandResponses;
  }

  /**
   * The IPv4 phone trunk base assignment will be inherited from the Edge Group.
   **/
  @ApiModelProperty(value = "The IPv4 phone trunk base assignment will be inherited from the Edge Group.")
  public Boolean getInheritPhoneTrunkBasesIPv4() {
    return inheritPhoneTrunkBasesIPv4;
  }
  public void setInheritPhoneTrunkBasesIPv4(Boolean inheritPhoneTrunkBasesIPv4) {
    this.inheritPhoneTrunkBasesIPv4 = inheritPhoneTrunkBasesIPv4;
  }

  /**
   * The IPv6 phone trunk base assignment will be inherited from the Edge Group.
   **/
  @ApiModelProperty(value = "The IPv6 phone trunk base assignment will be inherited from the Edge Group.")
  public Boolean getInheritPhoneTrunkBasesIPv6() {
    return inheritPhoneTrunkBasesIPv6;
  }
  public void setInheritPhoneTrunkBasesIPv6(Boolean inheritPhoneTrunkBasesIPv6) {
    this.inheritPhoneTrunkBasesIPv6 = inheritPhoneTrunkBasesIPv6;
  }

  /**
   * This interface will be used for all internal edge-to-edge communication using settings from the edgeTrunkBaseAssignment on the Edge Group.
   **/
  @ApiModelProperty(value = "This interface will be used for all internal edge-to-edge communication using settings from the edgeTrunkBaseAssignment on the Edge Group.")
  public Boolean getUseForInternalEdgeCommunication() {
    return useForInternalEdgeCommunication;
  }
  public void setUseForInternalEdgeCommunication(Boolean useForInternalEdgeCommunication) {
    this.useForInternalEdgeCommunication = useForInternalEdgeCommunication;
  }

  /**
   * External trunk base settings to use for external communication from this interface.
   **/
  @ApiModelProperty(value = "External trunk base settings to use for external communication from this interface.")
  public List<TrunkBaseAssignment> getExternalTrunkBaseAssignments() {
    return externalTrunkBaseAssignments;
  }
  public void setExternalTrunkBaseAssignments(List<TrunkBaseAssignment> externalTrunkBaseAssignments) {
    this.externalTrunkBaseAssignments = externalTrunkBaseAssignments;
  }

  /**
   * Phone trunk base settings to use for phone communication from this interface.  These settings will be ignored when \"inheritPhoneTrunkBases\" is true.
   **/
  @ApiModelProperty(value = "Phone trunk base settings to use for phone communication from this interface.  These settings will be ignored when \"inheritPhoneTrunkBases\" is true.")
  public List<TrunkBaseAssignment> getPhoneTrunkBaseAssignments() {
    return phoneTrunkBaseAssignments;
  }
  public void setPhoneTrunkBaseAssignments(List<TrunkBaseAssignment> phoneTrunkBaseAssignments) {
    this.phoneTrunkBaseAssignments = phoneTrunkBaseAssignments;
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
    DomainLogicalInterface domainLogicalInterface = (DomainLogicalInterface) o;
    return Objects.equals(id, domainLogicalInterface.id) &&
        Objects.equals(name, domainLogicalInterface.name) &&
        Objects.equals(description, domainLogicalInterface.description) &&
        Objects.equals(version, domainLogicalInterface.version) &&
        Objects.equals(dateCreated, domainLogicalInterface.dateCreated) &&
        Objects.equals(dateModified, domainLogicalInterface.dateModified) &&
        Objects.equals(modifiedBy, domainLogicalInterface.modifiedBy) &&
        Objects.equals(createdBy, domainLogicalInterface.createdBy) &&
        Objects.equals(state, domainLogicalInterface.state) &&
        Objects.equals(modifiedByApp, domainLogicalInterface.modifiedByApp) &&
        Objects.equals(createdByApp, domainLogicalInterface.createdByApp) &&
        Objects.equals(edgeUri, domainLogicalInterface.edgeUri) &&
        Objects.equals(edgeAssignedId, domainLogicalInterface.edgeAssignedId) &&
        Objects.equals(friendlyName, domainLogicalInterface.friendlyName) &&
        Objects.equals(vlanTagId, domainLogicalInterface.vlanTagId) &&
        Objects.equals(hardwareAddress, domainLogicalInterface.hardwareAddress) &&
        Objects.equals(physicalAdapterId, domainLogicalInterface.physicalAdapterId) &&
        Objects.equals(ipAddress, domainLogicalInterface.ipAddress) &&
        Objects.equals(gateway, domainLogicalInterface.gateway) &&
        Objects.equals(primaryDns, domainLogicalInterface.primaryDns) &&
        Objects.equals(secondaryDns, domainLogicalInterface.secondaryDns) &&
        Objects.equals(ifStatus, domainLogicalInterface.ifStatus) &&
        Objects.equals(routes, domainLogicalInterface.routes) &&
        Objects.equals(addresses, domainLogicalInterface.addresses) &&
        Objects.equals(ipv4Capabilities, domainLogicalInterface.ipv4Capabilities) &&
        Objects.equals(ipv6Capabilities, domainLogicalInterface.ipv6Capabilities) &&
        Objects.equals(currentState, domainLogicalInterface.currentState) &&
        Objects.equals(lastModifiedUserId, domainLogicalInterface.lastModifiedUserId) &&
        Objects.equals(lastModifiedCorrelationId, domainLogicalInterface.lastModifiedCorrelationId) &&
        Objects.equals(commandResponses, domainLogicalInterface.commandResponses) &&
        Objects.equals(inheritPhoneTrunkBasesIPv4, domainLogicalInterface.inheritPhoneTrunkBasesIPv4) &&
        Objects.equals(inheritPhoneTrunkBasesIPv6, domainLogicalInterface.inheritPhoneTrunkBasesIPv6) &&
        Objects.equals(useForInternalEdgeCommunication, domainLogicalInterface.useForInternalEdgeCommunication) &&
        Objects.equals(externalTrunkBaseAssignments, domainLogicalInterface.externalTrunkBaseAssignments) &&
        Objects.equals(phoneTrunkBaseAssignments, domainLogicalInterface.phoneTrunkBaseAssignments) &&
        Objects.equals(selfUri, domainLogicalInterface.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, version, dateCreated, dateModified, modifiedBy, createdBy, state, modifiedByApp, createdByApp, edgeUri, edgeAssignedId, friendlyName, vlanTagId, hardwareAddress, physicalAdapterId, ipAddress, gateway, primaryDns, secondaryDns, ifStatus, routes, addresses, ipv4Capabilities, ipv6Capabilities, currentState, lastModifiedUserId, lastModifiedCorrelationId, commandResponses, inheritPhoneTrunkBasesIPv4, inheritPhoneTrunkBasesIPv6, useForInternalEdgeCommunication, externalTrunkBaseAssignments, phoneTrunkBaseAssignments, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainLogicalInterface {\n");
    
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
    sb.append("    edgeAssignedId: ").append(toIndentedString(edgeAssignedId)).append("\n");
    sb.append("    friendlyName: ").append(toIndentedString(friendlyName)).append("\n");
    sb.append("    vlanTagId: ").append(toIndentedString(vlanTagId)).append("\n");
    sb.append("    hardwareAddress: ").append(toIndentedString(hardwareAddress)).append("\n");
    sb.append("    physicalAdapterId: ").append(toIndentedString(physicalAdapterId)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
    sb.append("    primaryDns: ").append(toIndentedString(primaryDns)).append("\n");
    sb.append("    secondaryDns: ").append(toIndentedString(secondaryDns)).append("\n");
    sb.append("    ifStatus: ").append(toIndentedString(ifStatus)).append("\n");
    sb.append("    routes: ").append(toIndentedString(routes)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    ipv4Capabilities: ").append(toIndentedString(ipv4Capabilities)).append("\n");
    sb.append("    ipv6Capabilities: ").append(toIndentedString(ipv6Capabilities)).append("\n");
    sb.append("    currentState: ").append(toIndentedString(currentState)).append("\n");
    sb.append("    lastModifiedUserId: ").append(toIndentedString(lastModifiedUserId)).append("\n");
    sb.append("    lastModifiedCorrelationId: ").append(toIndentedString(lastModifiedCorrelationId)).append("\n");
    sb.append("    commandResponses: ").append(toIndentedString(commandResponses)).append("\n");
    sb.append("    inheritPhoneTrunkBasesIPv4: ").append(toIndentedString(inheritPhoneTrunkBasesIPv4)).append("\n");
    sb.append("    inheritPhoneTrunkBasesIPv6: ").append(toIndentedString(inheritPhoneTrunkBasesIPv6)).append("\n");
    sb.append("    useForInternalEdgeCommunication: ").append(toIndentedString(useForInternalEdgeCommunication)).append("\n");
    sb.append("    externalTrunkBaseAssignments: ").append(toIndentedString(externalTrunkBaseAssignments)).append("\n");
    sb.append("    phoneTrunkBaseAssignments: ").append(toIndentedString(phoneTrunkBaseAssignments)).append("\n");
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
