package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class DomainPermissionCollection  implements Serializable {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("domain")
  private String domain = null;

  @SerializedName("permissionMap")
  private Map<String, List<DomainPermission>> permissionMap = new HashMap<String, List<DomainPermission>>();

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
  public String getDomain() {
    return domain;
  }
  public void setDomain(String domain) {
    this.domain = domain;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Map<String, List<DomainPermission>> getPermissionMap() {
    return permissionMap;
  }
  public void setPermissionMap(Map<String, List<DomainPermission>> permissionMap) {
    this.permissionMap = permissionMap;
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
    DomainPermissionCollection domainPermissionCollection = (DomainPermissionCollection) o;
    return Objects.equals(id, domainPermissionCollection.id) &&
        Objects.equals(name, domainPermissionCollection.name) &&
        Objects.equals(domain, domainPermissionCollection.domain) &&
        Objects.equals(permissionMap, domainPermissionCollection.permissionMap) &&
        Objects.equals(selfUri, domainPermissionCollection.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, domain, permissionMap, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainPermissionCollection {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    permissionMap: ").append(toIndentedString(permissionMap)).append("\n");
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
