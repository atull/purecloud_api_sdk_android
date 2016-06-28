package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Site;
import io.swagger.client.model.UriReference;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class OutboundRoute   {
  
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

  @SerializedName("site")
  private Site site = null;

  @SerializedName("classificationTypes")
  private List<String> classificationTypes = new ArrayList<String>();

  @SerializedName("enabled")
  private Boolean enabled = false;


  /**
   * Gets or Sets distribution
   */
  public enum DistributionEnum {
    @SerializedName("SEQUENTIAL")
    SEQUENTIAL("SEQUENTIAL"),

    @SerializedName("RANDOM")
    RANDOM("RANDOM");

    private String value;

    DistributionEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("distribution")
  private DistributionEnum distribution = null;

  @SerializedName("managed")
  private Boolean managed = false;

  @SerializedName("externalTrunkBases")
  private List<UriReference> externalTrunkBases = new ArrayList<UriReference>();

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
   * Site
   **/
  @ApiModelProperty(required = true, value = "Site")
  public Site getSite() {
    return site;
  }
  public void setSite(Site site) {
    this.site = site;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getClassificationTypes() {
    return classificationTypes;
  }
  public void setClassificationTypes(List<String> classificationTypes) {
    this.classificationTypes = classificationTypes;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public DistributionEnum getDistribution() {
    return distribution;
  }
  public void setDistribution(DistributionEnum distribution) {
    this.distribution = distribution;
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
   * Trunk base settings of trunkType \"EXTERNAL\".  This base must also be set on an edge logical interface for correct routing.
   **/
  @ApiModelProperty(value = "Trunk base settings of trunkType \"EXTERNAL\".  This base must also be set on an edge logical interface for correct routing.")
  public List<UriReference> getExternalTrunkBases() {
    return externalTrunkBases;
  }
  public void setExternalTrunkBases(List<UriReference> externalTrunkBases) {
    this.externalTrunkBases = externalTrunkBases;
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
    OutboundRoute outboundRoute = (OutboundRoute) o;
    return Objects.equals(id, outboundRoute.id) &&
        Objects.equals(name, outboundRoute.name) &&
        Objects.equals(description, outboundRoute.description) &&
        Objects.equals(version, outboundRoute.version) &&
        Objects.equals(dateCreated, outboundRoute.dateCreated) &&
        Objects.equals(dateModified, outboundRoute.dateModified) &&
        Objects.equals(modifiedBy, outboundRoute.modifiedBy) &&
        Objects.equals(createdBy, outboundRoute.createdBy) &&
        Objects.equals(state, outboundRoute.state) &&
        Objects.equals(modifiedByApp, outboundRoute.modifiedByApp) &&
        Objects.equals(createdByApp, outboundRoute.createdByApp) &&
        Objects.equals(site, outboundRoute.site) &&
        Objects.equals(classificationTypes, outboundRoute.classificationTypes) &&
        Objects.equals(enabled, outboundRoute.enabled) &&
        Objects.equals(distribution, outboundRoute.distribution) &&
        Objects.equals(managed, outboundRoute.managed) &&
        Objects.equals(externalTrunkBases, outboundRoute.externalTrunkBases) &&
        Objects.equals(selfUri, outboundRoute.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, version, dateCreated, dateModified, modifiedBy, createdBy, state, modifiedByApp, createdByApp, site, classificationTypes, enabled, distribution, managed, externalTrunkBases, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutboundRoute {\n");
    
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
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
    sb.append("    classificationTypes: ").append(toIndentedString(classificationTypes)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    distribution: ").append(toIndentedString(distribution)).append("\n");
    sb.append("    managed: ").append(toIndentedString(managed)).append("\n");
    sb.append("    externalTrunkBases: ").append(toIndentedString(externalTrunkBases)).append("\n");
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
