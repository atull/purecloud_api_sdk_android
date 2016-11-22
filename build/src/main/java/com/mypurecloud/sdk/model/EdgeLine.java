package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.Edge;
import com.mypurecloud.sdk.model.EdgeGroup;
import com.mypurecloud.sdk.model.Endpoint;
import com.mypurecloud.sdk.model.UriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class EdgeLine  implements Serializable {
  
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

  @SerializedName("schema")
  private UriReference schema = null;

  @SerializedName("properties")
  private Map<String, Object> properties = new HashMap<String, Object>();

  @SerializedName("edge")
  private Edge edge = null;

  @SerializedName("edgeGroup")
  private EdgeGroup edgeGroup = null;


  /**
   * Gets or Sets lineType
   */
  public enum LineTypeEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("TIE")
    TIE("TIE"),

    @SerializedName("NETWORK")
    NETWORK("NETWORK"),

    @SerializedName("TRUNK")
    TRUNK("TRUNK"),

    @SerializedName("STATION")
    STATION("STATION");

    private String value;

    LineTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("lineType")
  private LineTypeEnum lineType = null;

  @SerializedName("endpoint")
  private Endpoint endpoint = null;

  @SerializedName("ipAddress")
  private String ipAddress = null;

  @SerializedName("logicalInterfaceId")
  private String logicalInterfaceId = null;

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
  public UriReference getSchema() {
    return schema;
  }
  public void setSchema(UriReference schema) {
    this.schema = schema;
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
  public Edge getEdge() {
    return edge;
  }
  public void setEdge(Edge edge) {
    this.edge = edge;
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
  public LineTypeEnum getLineType() {
    return lineType;
  }
  public void setLineType(LineTypeEnum lineType) {
    this.lineType = lineType;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Endpoint getEndpoint() {
    return endpoint;
  }
  public void setEndpoint(Endpoint endpoint) {
    this.endpoint = endpoint;
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
  public String getLogicalInterfaceId() {
    return logicalInterfaceId;
  }
  public void setLogicalInterfaceId(String logicalInterfaceId) {
    this.logicalInterfaceId = logicalInterfaceId;
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
    EdgeLine edgeLine = (EdgeLine) o;
    return Objects.equals(id, edgeLine.id) &&
        Objects.equals(name, edgeLine.name) &&
        Objects.equals(description, edgeLine.description) &&
        Objects.equals(version, edgeLine.version) &&
        Objects.equals(dateCreated, edgeLine.dateCreated) &&
        Objects.equals(dateModified, edgeLine.dateModified) &&
        Objects.equals(modifiedBy, edgeLine.modifiedBy) &&
        Objects.equals(createdBy, edgeLine.createdBy) &&
        Objects.equals(state, edgeLine.state) &&
        Objects.equals(modifiedByApp, edgeLine.modifiedByApp) &&
        Objects.equals(createdByApp, edgeLine.createdByApp) &&
        Objects.equals(schema, edgeLine.schema) &&
        Objects.equals(properties, edgeLine.properties) &&
        Objects.equals(edge, edgeLine.edge) &&
        Objects.equals(edgeGroup, edgeLine.edgeGroup) &&
        Objects.equals(lineType, edgeLine.lineType) &&
        Objects.equals(endpoint, edgeLine.endpoint) &&
        Objects.equals(ipAddress, edgeLine.ipAddress) &&
        Objects.equals(logicalInterfaceId, edgeLine.logicalInterfaceId) &&
        Objects.equals(selfUri, edgeLine.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, version, dateCreated, dateModified, modifiedBy, createdBy, state, modifiedByApp, createdByApp, schema, properties, edge, edgeGroup, lineType, endpoint, ipAddress, logicalInterfaceId, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdgeLine {\n");
    
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
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    edge: ").append(toIndentedString(edge)).append("\n");
    sb.append("    edgeGroup: ").append(toIndentedString(edgeGroup)).append("\n");
    sb.append("    lineType: ").append(toIndentedString(lineType)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    logicalInterfaceId: ").append(toIndentedString(logicalInterfaceId)).append("\n");
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
