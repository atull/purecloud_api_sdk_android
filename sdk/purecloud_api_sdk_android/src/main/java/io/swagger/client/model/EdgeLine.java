package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Edge;
import io.swagger.client.model.EdgeGroup;
import io.swagger.client.model.Endpoint;
import io.swagger.client.model.UriReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;





public class EdgeLine   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

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
    return Objects.hash(id, name, schema, properties, edge, edgeGroup, lineType, endpoint, ipAddress, logicalInterfaceId, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdgeLine {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
