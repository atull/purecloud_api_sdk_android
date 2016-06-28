package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.DomainResourceConditionNode;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class DomainPermissionPolicy   {
  
  @SerializedName("domain")
  private String domain = null;

  @SerializedName("entityName")
  private String entityName = null;

  @SerializedName("policyName")
  private String policyName = null;

  @SerializedName("policyDescription")
  private String policyDescription = null;

  @SerializedName("actionSet")
  private List<String> actionSet = new ArrayList<String>();

  @SerializedName("namedResources")
  private List<String> namedResources = new ArrayList<String>();

  @SerializedName("allowConditions")
  private Boolean allowConditions = false;

  @SerializedName("resourceConditionNode")
  private DomainResourceConditionNode resourceConditionNode = null;

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
  public List<String> getActionSet() {
    return actionSet;
  }
  public void setActionSet(List<String> actionSet) {
    this.actionSet = actionSet;
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
  public Boolean getAllowConditions() {
    return allowConditions;
  }
  public void setAllowConditions(Boolean allowConditions) {
    this.allowConditions = allowConditions;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public DomainResourceConditionNode getResourceConditionNode() {
    return resourceConditionNode;
  }
  public void setResourceConditionNode(DomainResourceConditionNode resourceConditionNode) {
    this.resourceConditionNode = resourceConditionNode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomainPermissionPolicy domainPermissionPolicy = (DomainPermissionPolicy) o;
    return Objects.equals(domain, domainPermissionPolicy.domain) &&
        Objects.equals(entityName, domainPermissionPolicy.entityName) &&
        Objects.equals(policyName, domainPermissionPolicy.policyName) &&
        Objects.equals(policyDescription, domainPermissionPolicy.policyDescription) &&
        Objects.equals(actionSet, domainPermissionPolicy.actionSet) &&
        Objects.equals(namedResources, domainPermissionPolicy.namedResources) &&
        Objects.equals(allowConditions, domainPermissionPolicy.allowConditions) &&
        Objects.equals(resourceConditionNode, domainPermissionPolicy.resourceConditionNode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domain, entityName, policyName, policyDescription, actionSet, namedResources, allowConditions, resourceConditionNode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainPermissionPolicy {\n");
    
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
    sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
    sb.append("    policyDescription: ").append(toIndentedString(policyDescription)).append("\n");
    sb.append("    actionSet: ").append(toIndentedString(actionSet)).append("\n");
    sb.append("    namedResources: ").append(toIndentedString(namedResources)).append("\n");
    sb.append("    allowConditions: ").append(toIndentedString(allowConditions)).append("\n");
    sb.append("    resourceConditionNode: ").append(toIndentedString(resourceConditionNode)).append("\n");
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
