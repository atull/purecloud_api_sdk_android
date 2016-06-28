package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.FlowVersion;
import io.swagger.client.model.UriReference;

import com.google.gson.annotations.SerializedName;





public class Flow   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;


  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    @SerializedName("INBOUNDCALL")
    INBOUNDCALL("INBOUNDCALL"),

    @SerializedName("OUTBOUNDCALL")
    OUTBOUNDCALL("OUTBOUNDCALL"),

    @SerializedName("INQUEUECALL")
    INQUEUECALL("INQUEUECALL"),

    @SerializedName("SPEECH")
    SPEECH("SPEECH"),

    @SerializedName("SUBFLOWCALL")
    SUBFLOWCALL("SUBFLOWCALL");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("lockedUser")
  private UriReference lockedUser = null;

  @SerializedName("active")
  private Boolean active = false;

  @SerializedName("deleted")
  private Boolean deleted = false;

  @SerializedName("publishedVersion")
  private FlowVersion publishedVersion = null;

  @SerializedName("checkedInVersion")
  private FlowVersion checkedInVersion = null;

  @SerializedName("savedVersion")
  private FlowVersion savedVersion = null;

  @SerializedName("system")
  private Boolean system = false;


  /**
   * Gets or Sets publishStatus
   */
  public enum PublishStatusEnum {
    @SerializedName("STARTED")
    STARTED("STARTED"),

    @SerializedName("PENDING_VXMLGEN")
    PENDING_VXMLGEN("PENDING_VXMLGEN"),

    @SerializedName("PENDING_EDGE_CONFIG")
    PENDING_EDGE_CONFIG("PENDING_EDGE_CONFIG"),

    @SerializedName("SUCCESS")
    SUCCESS("SUCCESS"),

    @SerializedName("FAILURE")
    FAILURE("FAILURE");

    private String value;

    PublishStatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("publishStatus")
  private PublishStatusEnum publishStatus = null;

  @SerializedName("publishedBy")
  private UriReference publishedBy = null;

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
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public UriReference getLockedUser() {
    return lockedUser;
  }
  public void setLockedUser(UriReference lockedUser) {
    this.lockedUser = lockedUser;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getDeleted() {
    return deleted;
  }
  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public FlowVersion getPublishedVersion() {
    return publishedVersion;
  }
  public void setPublishedVersion(FlowVersion publishedVersion) {
    this.publishedVersion = publishedVersion;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public FlowVersion getCheckedInVersion() {
    return checkedInVersion;
  }
  public void setCheckedInVersion(FlowVersion checkedInVersion) {
    this.checkedInVersion = checkedInVersion;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public FlowVersion getSavedVersion() {
    return savedVersion;
  }
  public void setSavedVersion(FlowVersion savedVersion) {
    this.savedVersion = savedVersion;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getSystem() {
    return system;
  }
  public void setSystem(Boolean system) {
    this.system = system;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public PublishStatusEnum getPublishStatus() {
    return publishStatus;
  }
  public void setPublishStatus(PublishStatusEnum publishStatus) {
    this.publishStatus = publishStatus;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public UriReference getPublishedBy() {
    return publishedBy;
  }
  public void setPublishedBy(UriReference publishedBy) {
    this.publishedBy = publishedBy;
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
    Flow flow = (Flow) o;
    return Objects.equals(id, flow.id) &&
        Objects.equals(name, flow.name) &&
        Objects.equals(description, flow.description) &&
        Objects.equals(type, flow.type) &&
        Objects.equals(lockedUser, flow.lockedUser) &&
        Objects.equals(active, flow.active) &&
        Objects.equals(deleted, flow.deleted) &&
        Objects.equals(publishedVersion, flow.publishedVersion) &&
        Objects.equals(checkedInVersion, flow.checkedInVersion) &&
        Objects.equals(savedVersion, flow.savedVersion) &&
        Objects.equals(system, flow.system) &&
        Objects.equals(publishStatus, flow.publishStatus) &&
        Objects.equals(publishedBy, flow.publishedBy) &&
        Objects.equals(selfUri, flow.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, type, lockedUser, active, deleted, publishedVersion, checkedInVersion, savedVersion, system, publishStatus, publishedBy, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Flow {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    lockedUser: ").append(toIndentedString(lockedUser)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    publishedVersion: ").append(toIndentedString(publishedVersion)).append("\n");
    sb.append("    checkedInVersion: ").append(toIndentedString(checkedInVersion)).append("\n");
    sb.append("    savedVersion: ").append(toIndentedString(savedVersion)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
    sb.append("    publishStatus: ").append(toIndentedString(publishStatus)).append("\n");
    sb.append("    publishedBy: ").append(toIndentedString(publishedBy)).append("\n");
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
