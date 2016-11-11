package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.DomainPermissionPolicy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class DomainOrganizationRole  implements Serializable {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("defaultRoleId")
  private String defaultRoleId = null;

  @SerializedName("permissions")
  private List<String> permissions = new ArrayList<String>();

  @SerializedName("permissionPolicies")
  private List<DomainPermissionPolicy> permissionPolicies = new ArrayList<DomainPermissionPolicy>();

  @SerializedName("userCount")
  private Integer userCount = null;

  @SerializedName("roleNeedsUpdate")
  private Boolean roleNeedsUpdate = false;

  @SerializedName("default")
  private Boolean _default = false;

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
  public String getDefaultRoleId() {
    return defaultRoleId;
  }
  public void setDefaultRoleId(String defaultRoleId) {
    this.defaultRoleId = defaultRoleId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getPermissions() {
    return permissions;
  }
  public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<DomainPermissionPolicy> getPermissionPolicies() {
    return permissionPolicies;
  }
  public void setPermissionPolicies(List<DomainPermissionPolicy> permissionPolicies) {
    this.permissionPolicies = permissionPolicies;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getUserCount() {
    return userCount;
  }
  public void setUserCount(Integer userCount) {
    this.userCount = userCount;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getRoleNeedsUpdate() {
    return roleNeedsUpdate;
  }
  public void setRoleNeedsUpdate(Boolean roleNeedsUpdate) {
    this.roleNeedsUpdate = roleNeedsUpdate;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getDefault() {
    return _default;
  }
  public void setDefault(Boolean _default) {
    this._default = _default;
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
    DomainOrganizationRole domainOrganizationRole = (DomainOrganizationRole) o;
    return Objects.equals(id, domainOrganizationRole.id) &&
        Objects.equals(name, domainOrganizationRole.name) &&
        Objects.equals(description, domainOrganizationRole.description) &&
        Objects.equals(defaultRoleId, domainOrganizationRole.defaultRoleId) &&
        Objects.equals(permissions, domainOrganizationRole.permissions) &&
        Objects.equals(permissionPolicies, domainOrganizationRole.permissionPolicies) &&
        Objects.equals(userCount, domainOrganizationRole.userCount) &&
        Objects.equals(roleNeedsUpdate, domainOrganizationRole.roleNeedsUpdate) &&
        Objects.equals(_default, domainOrganizationRole._default) &&
        Objects.equals(selfUri, domainOrganizationRole.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, defaultRoleId, permissions, permissionPolicies, userCount, roleNeedsUpdate, _default, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainOrganizationRole {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    defaultRoleId: ").append(toIndentedString(defaultRoleId)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    permissionPolicies: ").append(toIndentedString(permissionPolicies)).append("\n");
    sb.append("    userCount: ").append(toIndentedString(userCount)).append("\n");
    sb.append("    roleNeedsUpdate: ").append(toIndentedString(roleNeedsUpdate)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
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
