package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.AuthzGrantRole;
import io.swagger.client.model.AuthzPermissionContext;
import java.util.Date;

import com.google.gson.annotations.SerializedName;





public class AuthzGrant   {
  
  @SerializedName("permissionContext")
  private AuthzPermissionContext permissionContext = null;

  @SerializedName("role")
  private AuthzGrantRole role = null;

  @SerializedName("grantMadeAt")
  private Date grantMadeAt = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public AuthzPermissionContext getPermissionContext() {
    return permissionContext;
  }
  public void setPermissionContext(AuthzPermissionContext permissionContext) {
    this.permissionContext = permissionContext;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public AuthzGrantRole getRole() {
    return role;
  }
  public void setRole(AuthzGrantRole role) {
    this.role = role;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getGrantMadeAt() {
    return grantMadeAt;
  }
  public void setGrantMadeAt(Date grantMadeAt) {
    this.grantMadeAt = grantMadeAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthzGrant authzGrant = (AuthzGrant) o;
    return Objects.equals(permissionContext, authzGrant.permissionContext) &&
        Objects.equals(role, authzGrant.role) &&
        Objects.equals(grantMadeAt, authzGrant.grantMadeAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissionContext, role, grantMadeAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthzGrant {\n");
    
    sb.append("    permissionContext: ").append(toIndentedString(permissionContext)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    grantMadeAt: ").append(toIndentedString(grantMadeAt)).append("\n");
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
