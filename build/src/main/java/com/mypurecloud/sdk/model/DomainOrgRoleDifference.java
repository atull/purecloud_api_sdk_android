package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.DomainOrganizationRole;
import com.mypurecloud.sdk.model.DomainPermissionPolicy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class DomainOrgRoleDifference  implements Serializable {
  
  @SerializedName("removedPermissionPolicies")
  private List<DomainPermissionPolicy> removedPermissionPolicies = new ArrayList<DomainPermissionPolicy>();

  @SerializedName("addedPermissionPolicies")
  private List<DomainPermissionPolicy> addedPermissionPolicies = new ArrayList<DomainPermissionPolicy>();

  @SerializedName("samePermissionPolicies")
  private List<DomainPermissionPolicy> samePermissionPolicies = new ArrayList<DomainPermissionPolicy>();

  @SerializedName("userOrgRole")
  private DomainOrganizationRole userOrgRole = null;

  @SerializedName("roleFromDefault")
  private DomainOrganizationRole roleFromDefault = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<DomainPermissionPolicy> getRemovedPermissionPolicies() {
    return removedPermissionPolicies;
  }
  public void setRemovedPermissionPolicies(List<DomainPermissionPolicy> removedPermissionPolicies) {
    this.removedPermissionPolicies = removedPermissionPolicies;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<DomainPermissionPolicy> getAddedPermissionPolicies() {
    return addedPermissionPolicies;
  }
  public void setAddedPermissionPolicies(List<DomainPermissionPolicy> addedPermissionPolicies) {
    this.addedPermissionPolicies = addedPermissionPolicies;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<DomainPermissionPolicy> getSamePermissionPolicies() {
    return samePermissionPolicies;
  }
  public void setSamePermissionPolicies(List<DomainPermissionPolicy> samePermissionPolicies) {
    this.samePermissionPolicies = samePermissionPolicies;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public DomainOrganizationRole getUserOrgRole() {
    return userOrgRole;
  }
  public void setUserOrgRole(DomainOrganizationRole userOrgRole) {
    this.userOrgRole = userOrgRole;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public DomainOrganizationRole getRoleFromDefault() {
    return roleFromDefault;
  }
  public void setRoleFromDefault(DomainOrganizationRole roleFromDefault) {
    this.roleFromDefault = roleFromDefault;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomainOrgRoleDifference domainOrgRoleDifference = (DomainOrgRoleDifference) o;
    return Objects.equals(removedPermissionPolicies, domainOrgRoleDifference.removedPermissionPolicies) &&
        Objects.equals(addedPermissionPolicies, domainOrgRoleDifference.addedPermissionPolicies) &&
        Objects.equals(samePermissionPolicies, domainOrgRoleDifference.samePermissionPolicies) &&
        Objects.equals(userOrgRole, domainOrgRoleDifference.userOrgRole) &&
        Objects.equals(roleFromDefault, domainOrgRoleDifference.roleFromDefault);
  }

  @Override
  public int hashCode() {
    return Objects.hash(removedPermissionPolicies, addedPermissionPolicies, samePermissionPolicies, userOrgRole, roleFromDefault);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainOrgRoleDifference {\n");
    
    sb.append("    removedPermissionPolicies: ").append(toIndentedString(removedPermissionPolicies)).append("\n");
    sb.append("    addedPermissionPolicies: ").append(toIndentedString(addedPermissionPolicies)).append("\n");
    sb.append("    samePermissionPolicies: ").append(toIndentedString(samePermissionPolicies)).append("\n");
    sb.append("    userOrgRole: ").append(toIndentedString(userOrgRole)).append("\n");
    sb.append("    roleFromDefault: ").append(toIndentedString(roleFromDefault)).append("\n");
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
