package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ResourceConditionNode;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class ResourcePermissionPolicy   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("domain")
  private String domain = null;

  @SerializedName("entityName")
  private String entityName = null;

  @SerializedName("policyName")
  private String policyName = null;

  @SerializedName("policyDescription")
  private String policyDescription = null;

  @SerializedName("actionSetKey")
  private String actionSetKey = null;

  @SerializedName("resourceConditionNode")
  private ResourceConditionNode resourceConditionNode = null;

  @SerializedName("namedResources")
  private List<String> namedResources = new ArrayList<String>();

  @SerializedName("resourceCondition")
  private String resourceCondition = null;

  @SerializedName("actionSet")
  private List<String> actionSet = new ArrayList<String>();

  /**
   **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDomain() {
    return domain;
  }
  public void setDomain(String domain) {
    this.domain = domain;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getEntityName() {
    return entityName;
  }
  public void setEntityName(String entityName) {
    this.entityName = entityName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPolicyName() {
    return policyName;
  }
  public void setPolicyName(String policyName) {
    this.policyName = policyName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPolicyDescription() {
    return policyDescription;
  }
  public void setPolicyDescription(String policyDescription) {
    this.policyDescription = policyDescription;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getActionSetKey() {
    return actionSetKey;
  }
  public void setActionSetKey(String actionSetKey) {
    this.actionSetKey = actionSetKey;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ResourceConditionNode getResourceConditionNode() {
    return resourceConditionNode;
  }
  public void setResourceConditionNode(ResourceConditionNode resourceConditionNode) {
    this.resourceConditionNode = resourceConditionNode;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getNamedResources() {
    return namedResources;
  }
  public void setNamedResources(List<String> namedResources) {
    this.namedResources = namedResources;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getResourceCondition() {
    return resourceCondition;
  }
  public void setResourceCondition(String resourceCondition) {
    this.resourceCondition = resourceCondition;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getActionSet() {
    return actionSet;
  }
  public void setActionSet(List<String> actionSet) {
    this.actionSet = actionSet;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourcePermissionPolicy resourcePermissionPolicy = (ResourcePermissionPolicy) o;
    return Objects.equals(id, resourcePermissionPolicy.id) &&
        Objects.equals(domain, resourcePermissionPolicy.domain) &&
        Objects.equals(entityName, resourcePermissionPolicy.entityName) &&
        Objects.equals(policyName, resourcePermissionPolicy.policyName) &&
        Objects.equals(policyDescription, resourcePermissionPolicy.policyDescription) &&
        Objects.equals(actionSetKey, resourcePermissionPolicy.actionSetKey) &&
        Objects.equals(resourceConditionNode, resourcePermissionPolicy.resourceConditionNode) &&
        Objects.equals(namedResources, resourcePermissionPolicy.namedResources) &&
        Objects.equals(resourceCondition, resourcePermissionPolicy.resourceCondition) &&
        Objects.equals(actionSet, resourcePermissionPolicy.actionSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, domain, entityName, policyName, policyDescription, actionSetKey, resourceConditionNode, namedResources, resourceCondition, actionSet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourcePermissionPolicy {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
    sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
    sb.append("    policyDescription: ").append(toIndentedString(policyDescription)).append("\n");
    sb.append("    actionSetKey: ").append(toIndentedString(actionSetKey)).append("\n");
    sb.append("    resourceConditionNode: ").append(toIndentedString(resourceConditionNode)).append("\n");
    sb.append("    namedResources: ").append(toIndentedString(namedResources)).append("\n");
    sb.append("    resourceCondition: ").append(toIndentedString(resourceCondition)).append("\n");
    sb.append("    actionSet: ").append(toIndentedString(actionSet)).append("\n");
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
