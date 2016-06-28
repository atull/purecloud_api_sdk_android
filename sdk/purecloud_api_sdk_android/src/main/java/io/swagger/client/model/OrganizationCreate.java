package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




/**
 * Creating an Organization
 **/
@ApiModel(description = "Creating an Organization")
public class OrganizationCreate   {
  
  @SerializedName("name")
  private String name = null;

  @SerializedName("adminUsername")
  private String adminUsername = null;

  @SerializedName("adminPassword")
  private String adminPassword = null;

  @SerializedName("domain")
  private String domain = null;

  @SerializedName("thirdPartyOrgName")
  private String thirdPartyOrgName = null;

  @SerializedName("deletable")
  private Boolean deletable = false;

  /**
   * Display name for this organization.
   **/
  @ApiModelProperty(required = true, value = "Display name for this organization.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Administrator username for this organization in the form of an email address.
   **/
  @ApiModelProperty(required = true, value = "Administrator username for this organization in the form of an email address.")
  public String getAdminUsername() {
    return adminUsername;
  }
  public void setAdminUsername(String adminUsername) {
    this.adminUsername = adminUsername;
  }

  /**
   * Administrator password for this organization.
   **/
  @ApiModelProperty(required = true, value = "Administrator password for this organization.")
  public String getAdminPassword() {
    return adminPassword;
  }
  public void setAdminPassword(String adminPassword) {
    this.adminPassword = adminPassword;
  }

  /**
   * Fully qualified domain name for this organization (Ex. example.com).
   **/
  @ApiModelProperty(required = true, value = "Fully qualified domain name for this organization (Ex. example.com).")
  public String getDomain() {
    return domain;
  }
  public void setDomain(String domain) {
    this.domain = domain;
  }

  /**
   * Organization name which does not contain special characters like spaces.
   **/
  @ApiModelProperty(required = true, value = "Organization name which does not contain special characters like spaces.")
  public String getThirdPartyOrgName() {
    return thirdPartyOrgName;
  }
  public void setThirdPartyOrgName(String thirdPartyOrgName) {
    this.thirdPartyOrgName = thirdPartyOrgName;
  }

  /**
   * Deletable property for this organization.
   **/
  @ApiModelProperty(value = "Deletable property for this organization.")
  public Boolean getDeletable() {
    return deletable;
  }
  public void setDeletable(Boolean deletable) {
    this.deletable = deletable;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationCreate organizationCreate = (OrganizationCreate) o;
    return Objects.equals(name, organizationCreate.name) &&
        Objects.equals(adminUsername, organizationCreate.adminUsername) &&
        Objects.equals(adminPassword, organizationCreate.adminPassword) &&
        Objects.equals(domain, organizationCreate.domain) &&
        Objects.equals(thirdPartyOrgName, organizationCreate.thirdPartyOrgName) &&
        Objects.equals(deletable, organizationCreate.deletable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, adminUsername, adminPassword, domain, thirdPartyOrgName, deletable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationCreate {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    adminUsername: ").append(toIndentedString(adminUsername)).append("\n");
    sb.append("    adminPassword: ").append(toIndentedString(adminPassword)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    thirdPartyOrgName: ").append(toIndentedString(thirdPartyOrgName)).append("\n");
    sb.append("    deletable: ").append(toIndentedString(deletable)).append("\n");
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
