package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;





public class AccountStatus   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("orgName")
  private String orgName = null;

  @SerializedName("configured")
  private Boolean configured = false;

  @SerializedName("adminUIURL")
  private String adminUIURL = null;

  @SerializedName("thirdPartyAccountId")
  private String thirdPartyAccountId = null;

  @SerializedName("thirdPartySubscriptionId")
  private String thirdPartySubscriptionId = null;

  @SerializedName("thirdPartySubscriptionNonAcbId")
  private String thirdPartySubscriptionNonAcbId = null;

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
  public String getOrgName() {
    return orgName;
  }
  public void setOrgName(String orgName) {
    this.orgName = orgName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getConfigured() {
    return configured;
  }
  public void setConfigured(Boolean configured) {
    this.configured = configured;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getAdminUIURL() {
    return adminUIURL;
  }
  public void setAdminUIURL(String adminUIURL) {
    this.adminUIURL = adminUIURL;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getThirdPartyAccountId() {
    return thirdPartyAccountId;
  }
  public void setThirdPartyAccountId(String thirdPartyAccountId) {
    this.thirdPartyAccountId = thirdPartyAccountId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getThirdPartySubscriptionId() {
    return thirdPartySubscriptionId;
  }
  public void setThirdPartySubscriptionId(String thirdPartySubscriptionId) {
    this.thirdPartySubscriptionId = thirdPartySubscriptionId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getThirdPartySubscriptionNonAcbId() {
    return thirdPartySubscriptionNonAcbId;
  }
  public void setThirdPartySubscriptionNonAcbId(String thirdPartySubscriptionNonAcbId) {
    this.thirdPartySubscriptionNonAcbId = thirdPartySubscriptionNonAcbId;
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
    AccountStatus accountStatus = (AccountStatus) o;
    return Objects.equals(id, accountStatus.id) &&
        Objects.equals(name, accountStatus.name) &&
        Objects.equals(orgName, accountStatus.orgName) &&
        Objects.equals(configured, accountStatus.configured) &&
        Objects.equals(adminUIURL, accountStatus.adminUIURL) &&
        Objects.equals(thirdPartyAccountId, accountStatus.thirdPartyAccountId) &&
        Objects.equals(thirdPartySubscriptionId, accountStatus.thirdPartySubscriptionId) &&
        Objects.equals(thirdPartySubscriptionNonAcbId, accountStatus.thirdPartySubscriptionNonAcbId) &&
        Objects.equals(selfUri, accountStatus.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, orgName, configured, adminUIURL, thirdPartyAccountId, thirdPartySubscriptionId, thirdPartySubscriptionNonAcbId, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountStatus {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
    sb.append("    configured: ").append(toIndentedString(configured)).append("\n");
    sb.append("    adminUIURL: ").append(toIndentedString(adminUIURL)).append("\n");
    sb.append("    thirdPartyAccountId: ").append(toIndentedString(thirdPartyAccountId)).append("\n");
    sb.append("    thirdPartySubscriptionId: ").append(toIndentedString(thirdPartySubscriptionId)).append("\n");
    sb.append("    thirdPartySubscriptionNonAcbId: ").append(toIndentedString(thirdPartySubscriptionNonAcbId)).append("\n");
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
