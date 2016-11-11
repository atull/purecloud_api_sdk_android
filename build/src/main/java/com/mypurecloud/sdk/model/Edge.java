package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.DomainEdgeSoftwareUpdateDto;
import com.mypurecloud.sdk.model.EdgeGroup;
import com.mypurecloud.sdk.model.EdgeInterface;
import com.mypurecloud.sdk.model.UriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class Edge  implements Serializable {
  
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

  @SerializedName("interfaces")
  private List<EdgeInterface> interfaces = new ArrayList<EdgeInterface>();

  @SerializedName("make")
  private String make = null;

  @SerializedName("model")
  private String model = null;

  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("softwareVersion")
  private String softwareVersion = null;

  @SerializedName("softwareVersionTimestamp")
  private String softwareVersionTimestamp = null;

  @SerializedName("softwareVersionPlatform")
  private String softwareVersionPlatform = null;

  @SerializedName("softwareVersionConfiguration")
  private String softwareVersionConfiguration = null;

  @SerializedName("fullSoftwareVersion")
  private String fullSoftwareVersion = null;

  @SerializedName("pairingId")
  private String pairingId = null;

  @SerializedName("fingerprint")
  private String fingerprint = null;

  @SerializedName("fingerprintHint")
  private String fingerprintHint = null;

  @SerializedName("currentVersion")
  private String currentVersion = null;

  @SerializedName("stagedVersion")
  private String stagedVersion = null;

  @SerializedName("patch")
  private String patch = null;


  /**
   * Gets or Sets statusCode
   */
  public enum StatusCodeEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("NEW")
    NEW("NEW"),

    @SerializedName("AWAITING_CONNECTION")
    AWAITING_CONNECTION("AWAITING_CONNECTION"),

    @SerializedName("AWAITING_FINGERPRINT")
    AWAITING_FINGERPRINT("AWAITING_FINGERPRINT"),

    @SerializedName("AWAITING_FINGERPRINT_VERIFICATION")
    AWAITING_FINGERPRINT_VERIFICATION("AWAITING_FINGERPRINT_VERIFICATION"),

    @SerializedName("FINGERPRINT_VERIFIED")
    FINGERPRINT_VERIFIED("FINGERPRINT_VERIFIED"),

    @SerializedName("AWAITING_BOOTSTRAP")
    AWAITING_BOOTSTRAP("AWAITING_BOOTSTRAP"),

    @SerializedName("ACTIVE")
    ACTIVE("ACTIVE"),

    @SerializedName("INACTIVE")
    INACTIVE("INACTIVE"),

    @SerializedName("RMA")
    RMA("RMA"),

    @SerializedName("UNPAIRING")
    UNPAIRING("UNPAIRING"),

    @SerializedName("UNPAIRED")
    UNPAIRED("UNPAIRED");

    private String value;

    StatusCodeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("statusCode")
  private StatusCodeEnum statusCode = null;

  @SerializedName("edgeGroup")
  private EdgeGroup edgeGroup = null;

  @SerializedName("site")
  private UriReference site = null;

  @SerializedName("softwareStatus")
  private DomainEdgeSoftwareUpdateDto softwareStatus = null;


  /**
   * Gets or Sets onlineStatus
   */
  public enum OnlineStatusEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("ONLINE")
    ONLINE("ONLINE"),

    @SerializedName("OFFLINE")
    OFFLINE("OFFLINE");

    private String value;

    OnlineStatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("onlineStatus")
  private OnlineStatusEnum onlineStatus = null;

  @SerializedName("serialNumber")
  private String serialNumber = null;

  @SerializedName("physicalEdge")
  private Boolean physicalEdge = false;

  @SerializedName("managed")
  private Boolean managed = false;


  /**
   * Gets or Sets edgeDeploymentType
   */
  public enum EdgeDeploymentTypeEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("HARDWARE")
    HARDWARE("HARDWARE"),

    @SerializedName("LDM")
    LDM("LDM"),

    @SerializedName("CDM")
    CDM("CDM"),

    @SerializedName("INVALID")
    INVALID("INVALID");

    private String value;

    EdgeDeploymentTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("edgeDeploymentType")
  private EdgeDeploymentTypeEnum edgeDeploymentType = null;

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
  public List<EdgeInterface> getInterfaces() {
    return interfaces;
  }
  public void setInterfaces(List<EdgeInterface> interfaces) {
    this.interfaces = interfaces;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getMake() {
    return make;
  }
  public void setMake(String make) {
    this.make = make;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getApiVersion() {
    return apiVersion;
  }
  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSoftwareVersion() {
    return softwareVersion;
  }
  public void setSoftwareVersion(String softwareVersion) {
    this.softwareVersion = softwareVersion;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSoftwareVersionTimestamp() {
    return softwareVersionTimestamp;
  }
  public void setSoftwareVersionTimestamp(String softwareVersionTimestamp) {
    this.softwareVersionTimestamp = softwareVersionTimestamp;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSoftwareVersionPlatform() {
    return softwareVersionPlatform;
  }
  public void setSoftwareVersionPlatform(String softwareVersionPlatform) {
    this.softwareVersionPlatform = softwareVersionPlatform;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSoftwareVersionConfiguration() {
    return softwareVersionConfiguration;
  }
  public void setSoftwareVersionConfiguration(String softwareVersionConfiguration) {
    this.softwareVersionConfiguration = softwareVersionConfiguration;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getFullSoftwareVersion() {
    return fullSoftwareVersion;
  }
  public void setFullSoftwareVersion(String fullSoftwareVersion) {
    this.fullSoftwareVersion = fullSoftwareVersion;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPairingId() {
    return pairingId;
  }
  public void setPairingId(String pairingId) {
    this.pairingId = pairingId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getFingerprint() {
    return fingerprint;
  }
  public void setFingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getFingerprintHint() {
    return fingerprintHint;
  }
  public void setFingerprintHint(String fingerprintHint) {
    this.fingerprintHint = fingerprintHint;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCurrentVersion() {
    return currentVersion;
  }
  public void setCurrentVersion(String currentVersion) {
    this.currentVersion = currentVersion;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getStagedVersion() {
    return stagedVersion;
  }
  public void setStagedVersion(String stagedVersion) {
    this.stagedVersion = stagedVersion;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPatch() {
    return patch;
  }
  public void setPatch(String patch) {
    this.patch = patch;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public StatusCodeEnum getStatusCode() {
    return statusCode;
  }
  public void setStatusCode(StatusCodeEnum statusCode) {
    this.statusCode = statusCode;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public EdgeGroup getEdgeGroup() {
    return edgeGroup;
  }
  public void setEdgeGroup(EdgeGroup edgeGroup) {
    this.edgeGroup = edgeGroup;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public UriReference getSite() {
    return site;
  }
  public void setSite(UriReference site) {
    this.site = site;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public DomainEdgeSoftwareUpdateDto getSoftwareStatus() {
    return softwareStatus;
  }
  public void setSoftwareStatus(DomainEdgeSoftwareUpdateDto softwareStatus) {
    this.softwareStatus = softwareStatus;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OnlineStatusEnum getOnlineStatus() {
    return onlineStatus;
  }
  public void setOnlineStatus(OnlineStatusEnum onlineStatus) {
    this.onlineStatus = onlineStatus;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSerialNumber() {
    return serialNumber;
  }
  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getPhysicalEdge() {
    return physicalEdge;
  }
  public void setPhysicalEdge(Boolean physicalEdge) {
    this.physicalEdge = physicalEdge;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getManaged() {
    return managed;
  }
  public void setManaged(Boolean managed) {
    this.managed = managed;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public EdgeDeploymentTypeEnum getEdgeDeploymentType() {
    return edgeDeploymentType;
  }
  public void setEdgeDeploymentType(EdgeDeploymentTypeEnum edgeDeploymentType) {
    this.edgeDeploymentType = edgeDeploymentType;
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
    Edge edge = (Edge) o;
    return Objects.equals(id, edge.id) &&
        Objects.equals(name, edge.name) &&
        Objects.equals(description, edge.description) &&
        Objects.equals(version, edge.version) &&
        Objects.equals(dateCreated, edge.dateCreated) &&
        Objects.equals(dateModified, edge.dateModified) &&
        Objects.equals(modifiedBy, edge.modifiedBy) &&
        Objects.equals(createdBy, edge.createdBy) &&
        Objects.equals(state, edge.state) &&
        Objects.equals(modifiedByApp, edge.modifiedByApp) &&
        Objects.equals(createdByApp, edge.createdByApp) &&
        Objects.equals(interfaces, edge.interfaces) &&
        Objects.equals(make, edge.make) &&
        Objects.equals(model, edge.model) &&
        Objects.equals(apiVersion, edge.apiVersion) &&
        Objects.equals(softwareVersion, edge.softwareVersion) &&
        Objects.equals(softwareVersionTimestamp, edge.softwareVersionTimestamp) &&
        Objects.equals(softwareVersionPlatform, edge.softwareVersionPlatform) &&
        Objects.equals(softwareVersionConfiguration, edge.softwareVersionConfiguration) &&
        Objects.equals(fullSoftwareVersion, edge.fullSoftwareVersion) &&
        Objects.equals(pairingId, edge.pairingId) &&
        Objects.equals(fingerprint, edge.fingerprint) &&
        Objects.equals(fingerprintHint, edge.fingerprintHint) &&
        Objects.equals(currentVersion, edge.currentVersion) &&
        Objects.equals(stagedVersion, edge.stagedVersion) &&
        Objects.equals(patch, edge.patch) &&
        Objects.equals(statusCode, edge.statusCode) &&
        Objects.equals(edgeGroup, edge.edgeGroup) &&
        Objects.equals(site, edge.site) &&
        Objects.equals(softwareStatus, edge.softwareStatus) &&
        Objects.equals(onlineStatus, edge.onlineStatus) &&
        Objects.equals(serialNumber, edge.serialNumber) &&
        Objects.equals(physicalEdge, edge.physicalEdge) &&
        Objects.equals(managed, edge.managed) &&
        Objects.equals(edgeDeploymentType, edge.edgeDeploymentType) &&
        Objects.equals(selfUri, edge.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, version, dateCreated, dateModified, modifiedBy, createdBy, state, modifiedByApp, createdByApp, interfaces, make, model, apiVersion, softwareVersion, softwareVersionTimestamp, softwareVersionPlatform, softwareVersionConfiguration, fullSoftwareVersion, pairingId, fingerprint, fingerprintHint, currentVersion, stagedVersion, patch, statusCode, edgeGroup, site, softwareStatus, onlineStatus, serialNumber, physicalEdge, managed, edgeDeploymentType, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Edge {\n");
    
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
    sb.append("    interfaces: ").append(toIndentedString(interfaces)).append("\n");
    sb.append("    make: ").append(toIndentedString(make)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    softwareVersion: ").append(toIndentedString(softwareVersion)).append("\n");
    sb.append("    softwareVersionTimestamp: ").append(toIndentedString(softwareVersionTimestamp)).append("\n");
    sb.append("    softwareVersionPlatform: ").append(toIndentedString(softwareVersionPlatform)).append("\n");
    sb.append("    softwareVersionConfiguration: ").append(toIndentedString(softwareVersionConfiguration)).append("\n");
    sb.append("    fullSoftwareVersion: ").append(toIndentedString(fullSoftwareVersion)).append("\n");
    sb.append("    pairingId: ").append(toIndentedString(pairingId)).append("\n");
    sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
    sb.append("    fingerprintHint: ").append(toIndentedString(fingerprintHint)).append("\n");
    sb.append("    currentVersion: ").append(toIndentedString(currentVersion)).append("\n");
    sb.append("    stagedVersion: ").append(toIndentedString(stagedVersion)).append("\n");
    sb.append("    patch: ").append(toIndentedString(patch)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    edgeGroup: ").append(toIndentedString(edgeGroup)).append("\n");
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
    sb.append("    softwareStatus: ").append(toIndentedString(softwareStatus)).append("\n");
    sb.append("    onlineStatus: ").append(toIndentedString(onlineStatus)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    physicalEdge: ").append(toIndentedString(physicalEdge)).append("\n");
    sb.append("    managed: ").append(toIndentedString(managed)).append("\n");
    sb.append("    edgeDeploymentType: ").append(toIndentedString(edgeDeploymentType)).append("\n");
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
