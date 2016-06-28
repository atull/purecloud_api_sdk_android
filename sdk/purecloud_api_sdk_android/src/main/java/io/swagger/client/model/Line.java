package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Edge;
import io.swagger.client.model.UriReference;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;





public class Line   {
  
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

  @SerializedName("properties")
  private Map<String, Object> properties = new HashMap<String, Object>();

  @SerializedName("edgeGroup")
  private UriReference edgeGroup = null;

  @SerializedName("template")
  private UriReference template = null;

  @SerializedName("site")
  private UriReference site = null;

  @SerializedName("lineBaseSettings")
  private UriReference lineBaseSettings = null;

  @SerializedName("primaryEdge")
  private Edge primaryEdge = null;

  @SerializedName("secondaryEdge")
  private Edge secondaryEdge = null;

  @SerializedName("loggedInUser")
  private UriReference loggedInUser = null;

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
   **/
  @ApiModelProperty(value = "")
  public Map<String, Object> getProperties() {
    return properties;
  }
  public void setProperties(Map<String, Object> properties) {
    this.properties = properties;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public UriReference getEdgeGroup() {
    return edgeGroup;
  }
  public void setEdgeGroup(UriReference edgeGroup) {
    this.edgeGroup = edgeGroup;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public UriReference getTemplate() {
    return template;
  }
  public void setTemplate(UriReference template) {
    this.template = template;
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
  public UriReference getLineBaseSettings() {
    return lineBaseSettings;
  }
  public void setLineBaseSettings(UriReference lineBaseSettings) {
    this.lineBaseSettings = lineBaseSettings;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Edge getPrimaryEdge() {
    return primaryEdge;
  }
  public void setPrimaryEdge(Edge primaryEdge) {
    this.primaryEdge = primaryEdge;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Edge getSecondaryEdge() {
    return secondaryEdge;
  }
  public void setSecondaryEdge(Edge secondaryEdge) {
    this.secondaryEdge = secondaryEdge;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public UriReference getLoggedInUser() {
    return loggedInUser;
  }
  public void setLoggedInUser(UriReference loggedInUser) {
    this.loggedInUser = loggedInUser;
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
    Line line = (Line) o;
    return Objects.equals(id, line.id) &&
        Objects.equals(name, line.name) &&
        Objects.equals(description, line.description) &&
        Objects.equals(version, line.version) &&
        Objects.equals(dateCreated, line.dateCreated) &&
        Objects.equals(dateModified, line.dateModified) &&
        Objects.equals(modifiedBy, line.modifiedBy) &&
        Objects.equals(createdBy, line.createdBy) &&
        Objects.equals(state, line.state) &&
        Objects.equals(modifiedByApp, line.modifiedByApp) &&
        Objects.equals(createdByApp, line.createdByApp) &&
        Objects.equals(properties, line.properties) &&
        Objects.equals(edgeGroup, line.edgeGroup) &&
        Objects.equals(template, line.template) &&
        Objects.equals(site, line.site) &&
        Objects.equals(lineBaseSettings, line.lineBaseSettings) &&
        Objects.equals(primaryEdge, line.primaryEdge) &&
        Objects.equals(secondaryEdge, line.secondaryEdge) &&
        Objects.equals(loggedInUser, line.loggedInUser) &&
        Objects.equals(selfUri, line.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, version, dateCreated, dateModified, modifiedBy, createdBy, state, modifiedByApp, createdByApp, properties, edgeGroup, template, site, lineBaseSettings, primaryEdge, secondaryEdge, loggedInUser, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Line {\n");
    
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
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    edgeGroup: ").append(toIndentedString(edgeGroup)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
    sb.append("    lineBaseSettings: ").append(toIndentedString(lineBaseSettings)).append("\n");
    sb.append("    primaryEdge: ").append(toIndentedString(primaryEdge)).append("\n");
    sb.append("    secondaryEdge: ").append(toIndentedString(secondaryEdge)).append("\n");
    sb.append("    loggedInUser: ").append(toIndentedString(loggedInUser)).append("\n");
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
