package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.Contact;
import com.mypurecloud.sdk.model.Edge;
import com.mypurecloud.sdk.model.EdgeAutoUpdateConfig;
import com.mypurecloud.sdk.model.UriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class Site  implements Serializable {
  
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

  @SerializedName("primarySites")
  private List<UriReference> primarySites = new ArrayList<UriReference>();

  @SerializedName("secondarySites")
  private List<UriReference> secondarySites = new ArrayList<UriReference>();

  @SerializedName("primaryEdges")
  private List<Edge> primaryEdges = new ArrayList<Edge>();

  @SerializedName("secondaryEdges")
  private List<Edge> secondaryEdges = new ArrayList<Edge>();

  @SerializedName("addresses")
  private List<Contact> addresses = new ArrayList<Contact>();

  @SerializedName("edges")
  private List<Edge> edges = new ArrayList<Edge>();

  @SerializedName("edgeAutoUpdateConfig")
  private EdgeAutoUpdateConfig edgeAutoUpdateConfig = null;

  @SerializedName("location")
  private UriReference location = null;

  @SerializedName("managed")
  private Boolean managed = false;

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
  public List<UriReference> getPrimarySites() {
    return primarySites;
  }
  public void setPrimarySites(List<UriReference> primarySites) {
    this.primarySites = primarySites;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<UriReference> getSecondarySites() {
    return secondarySites;
  }
  public void setSecondarySites(List<UriReference> secondarySites) {
    this.secondarySites = secondarySites;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Edge> getPrimaryEdges() {
    return primaryEdges;
  }
  public void setPrimaryEdges(List<Edge> primaryEdges) {
    this.primaryEdges = primaryEdges;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Edge> getSecondaryEdges() {
    return secondaryEdges;
  }
  public void setSecondaryEdges(List<Edge> secondaryEdges) {
    this.secondaryEdges = secondaryEdges;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Contact> getAddresses() {
    return addresses;
  }
  public void setAddresses(List<Contact> addresses) {
    this.addresses = addresses;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Edge> getEdges() {
    return edges;
  }
  public void setEdges(List<Edge> edges) {
    this.edges = edges;
  }

  /**
   * Recurrance rule, time zone, and start/end settings for automatic edge updates for this site
   **/
  @ApiModelProperty(value = "Recurrance rule, time zone, and start/end settings for automatic edge updates for this site")
  public EdgeAutoUpdateConfig getEdgeAutoUpdateConfig() {
    return edgeAutoUpdateConfig;
  }
  public void setEdgeAutoUpdateConfig(EdgeAutoUpdateConfig edgeAutoUpdateConfig) {
    this.edgeAutoUpdateConfig = edgeAutoUpdateConfig;
  }

  /**
   * Location
   **/
  @ApiModelProperty(required = true, value = "Location")
  public UriReference getLocation() {
    return location;
  }
  public void setLocation(UriReference location) {
    this.location = location;
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
    Site site = (Site) o;
    return Objects.equals(id, site.id) &&
        Objects.equals(name, site.name) &&
        Objects.equals(description, site.description) &&
        Objects.equals(version, site.version) &&
        Objects.equals(dateCreated, site.dateCreated) &&
        Objects.equals(dateModified, site.dateModified) &&
        Objects.equals(modifiedBy, site.modifiedBy) &&
        Objects.equals(createdBy, site.createdBy) &&
        Objects.equals(state, site.state) &&
        Objects.equals(modifiedByApp, site.modifiedByApp) &&
        Objects.equals(createdByApp, site.createdByApp) &&
        Objects.equals(primarySites, site.primarySites) &&
        Objects.equals(secondarySites, site.secondarySites) &&
        Objects.equals(primaryEdges, site.primaryEdges) &&
        Objects.equals(secondaryEdges, site.secondaryEdges) &&
        Objects.equals(addresses, site.addresses) &&
        Objects.equals(edges, site.edges) &&
        Objects.equals(edgeAutoUpdateConfig, site.edgeAutoUpdateConfig) &&
        Objects.equals(location, site.location) &&
        Objects.equals(managed, site.managed) &&
        Objects.equals(selfUri, site.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, version, dateCreated, dateModified, modifiedBy, createdBy, state, modifiedByApp, createdByApp, primarySites, secondarySites, primaryEdges, secondaryEdges, addresses, edges, edgeAutoUpdateConfig, location, managed, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Site {\n");
    
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
    sb.append("    primarySites: ").append(toIndentedString(primarySites)).append("\n");
    sb.append("    secondarySites: ").append(toIndentedString(secondarySites)).append("\n");
    sb.append("    primaryEdges: ").append(toIndentedString(primaryEdges)).append("\n");
    sb.append("    secondaryEdges: ").append(toIndentedString(secondaryEdges)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    edges: ").append(toIndentedString(edges)).append("\n");
    sb.append("    edgeAutoUpdateConfig: ").append(toIndentedString(edgeAutoUpdateConfig)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    managed: ").append(toIndentedString(managed)).append("\n");
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
