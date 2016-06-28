package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.UriReference;
import java.util.Date;

import com.google.gson.annotations.SerializedName;





public class Trunk   {
  
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


  /**
   * The type of this trunk.
   */
  public enum TrunkTypeEnum {
    @SerializedName("EXTERNAL")
    EXTERNAL("EXTERNAL"),

    @SerializedName("PHONE")
    PHONE("PHONE"),

    @SerializedName("EDGE")
    EDGE("EDGE");

    private String value;

    TrunkTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("trunkType")
  private TrunkTypeEnum trunkType = null;

  @SerializedName("edge")
  private UriReference edge = null;

  @SerializedName("trunkBase")
  private UriReference trunkBase = null;

  @SerializedName("trunkMetabase")
  private UriReference trunkMetabase = null;

  @SerializedName("edgeGroup")
  private UriReference edgeGroup = null;

  @SerializedName("enabled")
  private Boolean enabled = false;

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
   * The type of this trunk.
   **/
  @ApiModelProperty(value = "The type of this trunk.")
  public TrunkTypeEnum getTrunkType() {
    return trunkType;
  }
  public void setTrunkType(TrunkTypeEnum trunkType) {
    this.trunkType = trunkType;
  }

  /**
   * The Edge using this trunk.
   **/
  @ApiModelProperty(value = "The Edge using this trunk.")
  public UriReference getEdge() {
    return edge;
  }
  public void setEdge(UriReference edge) {
    this.edge = edge;
  }

  /**
   * The trunk base configuration used on this trunk.
   **/
  @ApiModelProperty(value = "The trunk base configuration used on this trunk.")
  public UriReference getTrunkBase() {
    return trunkBase;
  }
  public void setTrunkBase(UriReference trunkBase) {
    this.trunkBase = trunkBase;
  }

  /**
   * The metabase used to create this trunk.
   **/
  @ApiModelProperty(value = "The metabase used to create this trunk.")
  public UriReference getTrunkMetabase() {
    return trunkMetabase;
  }
  public void setTrunkMetabase(UriReference trunkMetabase) {
    this.trunkMetabase = trunkMetabase;
  }

  /**
   * The edge group associated with this trunk.
   **/
  @ApiModelProperty(value = "The edge group associated with this trunk.")
  public UriReference getEdgeGroup() {
    return edgeGroup;
  }
  public void setEdgeGroup(UriReference edgeGroup) {
    this.edgeGroup = edgeGroup;
  }

  /**
   * True if this trunk is in-service.  This comes from the trunk_enabled property of the referenced trunk base.
   **/
  @ApiModelProperty(value = "True if this trunk is in-service.  This comes from the trunk_enabled property of the referenced trunk base.")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
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
    Trunk trunk = (Trunk) o;
    return Objects.equals(id, trunk.id) &&
        Objects.equals(name, trunk.name) &&
        Objects.equals(description, trunk.description) &&
        Objects.equals(version, trunk.version) &&
        Objects.equals(dateCreated, trunk.dateCreated) &&
        Objects.equals(dateModified, trunk.dateModified) &&
        Objects.equals(modifiedBy, trunk.modifiedBy) &&
        Objects.equals(createdBy, trunk.createdBy) &&
        Objects.equals(state, trunk.state) &&
        Objects.equals(modifiedByApp, trunk.modifiedByApp) &&
        Objects.equals(createdByApp, trunk.createdByApp) &&
        Objects.equals(trunkType, trunk.trunkType) &&
        Objects.equals(edge, trunk.edge) &&
        Objects.equals(trunkBase, trunk.trunkBase) &&
        Objects.equals(trunkMetabase, trunk.trunkMetabase) &&
        Objects.equals(edgeGroup, trunk.edgeGroup) &&
        Objects.equals(enabled, trunk.enabled) &&
        Objects.equals(selfUri, trunk.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, version, dateCreated, dateModified, modifiedBy, createdBy, state, modifiedByApp, createdByApp, trunkType, edge, trunkBase, trunkMetabase, edgeGroup, enabled, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Trunk {\n");
    
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
    sb.append("    trunkType: ").append(toIndentedString(trunkType)).append("\n");
    sb.append("    edge: ").append(toIndentedString(edge)).append("\n");
    sb.append("    trunkBase: ").append(toIndentedString(trunkBase)).append("\n");
    sb.append("    trunkMetabase: ").append(toIndentedString(trunkMetabase)).append("\n");
    sb.append("    edgeGroup: ").append(toIndentedString(edgeGroup)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
