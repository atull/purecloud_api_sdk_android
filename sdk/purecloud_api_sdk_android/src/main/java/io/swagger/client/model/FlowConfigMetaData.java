package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.User;
import io.swagger.client.model.Workspace;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;




/**
 * Details about the current state of a Flow Definition
 **/
@ApiModel(description = "Details about the current state of a Flow Definition")
public class FlowConfigMetaData   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;


  /**
   * Usability of this flow definition. (output only)
   */
  public enum ConfigStateEnum {
    @SerializedName("UNKNOWN")
    UNKNOWN("UNKNOWN"),

    @SerializedName("ACTIVE")
    ACTIVE("ACTIVE"),

    @SerializedName("INACTIVE")
    INACTIVE("INACTIVE"),

    @SerializedName("DELETED")
    DELETED("DELETED");

    private String value;

    ConfigStateEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("configState")
  private ConfigStateEnum configState = null;


  /**
   * Type of flow this definition describes
   */
  public enum FlowTypeEnum {
    @SerializedName("UNKNOWN")
    UNKNOWN("UNKNOWN"),

    @SerializedName("WORKFLOW")
    WORKFLOW("WORKFLOW");

    private String value;

    FlowTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("flowType")
  private FlowTypeEnum flowType = null;

  @SerializedName("lockedByUser")
  private User lockedByUser = null;

  @SerializedName("newestPublishedVersion")
  private String newestPublishedVersion = null;

  @SerializedName("newestVersion")
  private String newestVersion = null;

  @SerializedName("associatedWorkspaces")
  private List<Workspace> associatedWorkspaces = new ArrayList<Workspace>();

  @SerializedName("description")
  private String description = null;

  @SerializedName("hasDraft")
  private Boolean hasDraft = false;

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
   * Usability of this flow definition. (output only)
   **/
  @ApiModelProperty(value = "Usability of this flow definition. (output only)")
  public ConfigStateEnum getConfigState() {
    return configState;
  }
  public void setConfigState(ConfigStateEnum configState) {
    this.configState = configState;
  }

  /**
   * Type of flow this definition describes
   **/
  @ApiModelProperty(required = true, value = "Type of flow this definition describes")
  public FlowTypeEnum getFlowType() {
    return flowType;
  }
  public void setFlowType(FlowTypeEnum flowType) {
    this.flowType = flowType;
  }

  /**
   * If locked for editing, the user who locked this definition, otherwise null
   **/
  @ApiModelProperty(value = "If locked for editing, the user who locked this definition, otherwise null")
  public User getLockedByUser() {
    return lockedByUser;
  }
  public void setLockedByUser(User lockedByUser) {
    this.lockedByUser = lockedByUser;
  }

  /**
   * The most recently published version (output only)
   **/
  @ApiModelProperty(value = "The most recently published version (output only)")
  public String getNewestPublishedVersion() {
    return newestPublishedVersion;
  }
  public void setNewestPublishedVersion(String newestPublishedVersion) {
    this.newestPublishedVersion = newestPublishedVersion;
  }

  /**
   * The most recent version, regardless of published state (output only)
   **/
  @ApiModelProperty(value = "The most recent version, regardless of published state (output only)")
  public String getNewestVersion() {
    return newestVersion;
  }
  public void setNewestVersion(String newestVersion) {
    this.newestVersion = newestVersion;
  }

  /**
   * Workspaces associated with this flow.
   **/
  @ApiModelProperty(value = "Workspaces associated with this flow.")
  public List<Workspace> getAssociatedWorkspaces() {
    return associatedWorkspaces;
  }
  public void setAssociatedWorkspaces(List<Workspace> associatedWorkspaces) {
    this.associatedWorkspaces = associatedWorkspaces;
  }

  /**
   * User notes describing the flow definition.
   **/
  @ApiModelProperty(value = "User notes describing the flow definition.")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Flag if this definition has a draft populated.
   **/
  @ApiModelProperty(value = "Flag if this definition has a draft populated.")
  public Boolean getHasDraft() {
    return hasDraft;
  }
  public void setHasDraft(Boolean hasDraft) {
    this.hasDraft = hasDraft;
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
    FlowConfigMetaData flowConfigMetaData = (FlowConfigMetaData) o;
    return Objects.equals(id, flowConfigMetaData.id) &&
        Objects.equals(name, flowConfigMetaData.name) &&
        Objects.equals(configState, flowConfigMetaData.configState) &&
        Objects.equals(flowType, flowConfigMetaData.flowType) &&
        Objects.equals(lockedByUser, flowConfigMetaData.lockedByUser) &&
        Objects.equals(newestPublishedVersion, flowConfigMetaData.newestPublishedVersion) &&
        Objects.equals(newestVersion, flowConfigMetaData.newestVersion) &&
        Objects.equals(associatedWorkspaces, flowConfigMetaData.associatedWorkspaces) &&
        Objects.equals(description, flowConfigMetaData.description) &&
        Objects.equals(hasDraft, flowConfigMetaData.hasDraft) &&
        Objects.equals(selfUri, flowConfigMetaData.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, configState, flowType, lockedByUser, newestPublishedVersion, newestVersion, associatedWorkspaces, description, hasDraft, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowConfigMetaData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    configState: ").append(toIndentedString(configState)).append("\n");
    sb.append("    flowType: ").append(toIndentedString(flowType)).append("\n");
    sb.append("    lockedByUser: ").append(toIndentedString(lockedByUser)).append("\n");
    sb.append("    newestPublishedVersion: ").append(toIndentedString(newestPublishedVersion)).append("\n");
    sb.append("    newestVersion: ").append(toIndentedString(newestVersion)).append("\n");
    sb.append("    associatedWorkspaces: ").append(toIndentedString(associatedWorkspaces)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    hasDraft: ").append(toIndentedString(hasDraft)).append("\n");
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
