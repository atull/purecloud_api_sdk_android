package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.TrunkBase;
import com.mypurecloud.sdk.model.TrunkBaseAssignment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class EdgeGroup  implements Serializable {
  
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

  @SerializedName("managed")
  private Boolean managed = false;

  @SerializedName("edgeTrunkBaseAssignment")
  private TrunkBaseAssignment edgeTrunkBaseAssignment = null;

  @SerializedName("phoneTrunkBases")
  private List<TrunkBase> phoneTrunkBases = new ArrayList<TrunkBase>();

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
   * Is this edge group being managed remotely.
   **/
  @ApiModelProperty(value = "Is this edge group being managed remotely.")
  public Boolean getManaged() {
    return managed;
  }
  public void setManaged(Boolean managed) {
    this.managed = managed;
  }

  /**
   * A trunk base settings assignment of trunkType \"EDGE\" to use for edge-to-edge communication.
   **/
  @ApiModelProperty(required = true, value = "A trunk base settings assignment of trunkType \"EDGE\" to use for edge-to-edge communication.")
  public TrunkBaseAssignment getEdgeTrunkBaseAssignment() {
    return edgeTrunkBaseAssignment;
  }
  public void setEdgeTrunkBaseAssignment(TrunkBaseAssignment edgeTrunkBaseAssignment) {
    this.edgeTrunkBaseAssignment = edgeTrunkBaseAssignment;
  }

  /**
   * Trunk base settings of trunkType \"PHONE\" to inherit to edge logical interface for phone communication.
   **/
  @ApiModelProperty(value = "Trunk base settings of trunkType \"PHONE\" to inherit to edge logical interface for phone communication.")
  public List<TrunkBase> getPhoneTrunkBases() {
    return phoneTrunkBases;
  }
  public void setPhoneTrunkBases(List<TrunkBase> phoneTrunkBases) {
    this.phoneTrunkBases = phoneTrunkBases;
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
    EdgeGroup edgeGroup = (EdgeGroup) o;
    return Objects.equals(id, edgeGroup.id) &&
        Objects.equals(name, edgeGroup.name) &&
        Objects.equals(description, edgeGroup.description) &&
        Objects.equals(version, edgeGroup.version) &&
        Objects.equals(dateCreated, edgeGroup.dateCreated) &&
        Objects.equals(dateModified, edgeGroup.dateModified) &&
        Objects.equals(modifiedBy, edgeGroup.modifiedBy) &&
        Objects.equals(createdBy, edgeGroup.createdBy) &&
        Objects.equals(state, edgeGroup.state) &&
        Objects.equals(modifiedByApp, edgeGroup.modifiedByApp) &&
        Objects.equals(createdByApp, edgeGroup.createdByApp) &&
        Objects.equals(managed, edgeGroup.managed) &&
        Objects.equals(edgeTrunkBaseAssignment, edgeGroup.edgeTrunkBaseAssignment) &&
        Objects.equals(phoneTrunkBases, edgeGroup.phoneTrunkBases) &&
        Objects.equals(selfUri, edgeGroup.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, version, dateCreated, dateModified, modifiedBy, createdBy, state, modifiedByApp, createdByApp, managed, edgeTrunkBaseAssignment, phoneTrunkBases, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdgeGroup {\n");
    
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
    sb.append("    managed: ").append(toIndentedString(managed)).append("\n");
    sb.append("    edgeTrunkBaseAssignment: ").append(toIndentedString(edgeTrunkBaseAssignment)).append("\n");
    sb.append("    phoneTrunkBases: ").append(toIndentedString(phoneTrunkBases)).append("\n");
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
