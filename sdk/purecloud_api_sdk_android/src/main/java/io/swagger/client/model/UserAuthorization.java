package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.DomainRole;
import io.swagger.client.model.ResourcePermissionPolicy;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class UserAuthorization   {
  
  @SerializedName("roles")
  private List<DomainRole> roles = new ArrayList<DomainRole>();

  @SerializedName("permissions")
  private List<String> permissions = new ArrayList<String>();

  @SerializedName("permissionPolicies")
  private List<ResourcePermissionPolicy> permissionPolicies = new ArrayList<ResourcePermissionPolicy>();

  /**
   **/
  @ApiModelProperty(value = "")
  public List<DomainRole> getRoles() {
    return roles;
  }
  public void setRoles(List<DomainRole> roles) {
    this.roles = roles;
  }

  /**
   * A collection of the permissions granted by all assigned roles
   **/
  @ApiModelProperty(value = "A collection of the permissions granted by all assigned roles")
  public List<String> getPermissions() {
    return permissions;
  }
  public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
  }

  /**
   * The policies configured for assigned permissions.
   **/
  @ApiModelProperty(value = "The policies configured for assigned permissions.")
  public List<ResourcePermissionPolicy> getPermissionPolicies() {
    return permissionPolicies;
  }
  public void setPermissionPolicies(List<ResourcePermissionPolicy> permissionPolicies) {
    this.permissionPolicies = permissionPolicies;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAuthorization userAuthorization = (UserAuthorization) o;
    return Objects.equals(roles, userAuthorization.roles) &&
        Objects.equals(permissions, userAuthorization.permissions) &&
        Objects.equals(permissionPolicies, userAuthorization.permissionPolicies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roles, permissions, permissionPolicies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAuthorization {\n");
    
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    permissionPolicies: ").append(toIndentedString(permissionPolicies)).append("\n");
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
