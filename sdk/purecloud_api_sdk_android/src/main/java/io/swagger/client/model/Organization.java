package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;





public class Organization   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("thirdPartyOrgId")
  private String thirdPartyOrgId = null;

  @SerializedName("thirdPartyOrgName")
  private String thirdPartyOrgName = null;

  @SerializedName("thirdPartyURI")
  private String thirdPartyURI = null;

  @SerializedName("domain")
  private String domain = null;

  @SerializedName("version")
  private Integer version = null;


  /**
   * Gets or Sets state
   */
  public enum StateEnum {
    @SerializedName("active")
    ACTIVE("active"),

    @SerializedName("inactive")
    INACTIVE("inactive"),

    @SerializedName("deleted")
    DELETED("deleted");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("state")
  private StateEnum state = null;

  @SerializedName("defaultSiteId")
  private String defaultSiteId = null;

  @SerializedName("deletable")
  private Boolean deletable = false;

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
  public String getThirdPartyOrgId() {
    return thirdPartyOrgId;
  }
  public void setThirdPartyOrgId(String thirdPartyOrgId) {
    this.thirdPartyOrgId = thirdPartyOrgId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getThirdPartyOrgName() {
    return thirdPartyOrgName;
  }
  public void setThirdPartyOrgName(String thirdPartyOrgName) {
    this.thirdPartyOrgName = thirdPartyOrgName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getThirdPartyURI() {
    return thirdPartyURI;
  }
  public void setThirdPartyURI(String thirdPartyURI) {
    this.thirdPartyURI = thirdPartyURI;
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
   * The current version of the organization.
   **/
  @ApiModelProperty(required = true, value = "The current version of the organization.")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDefaultSiteId() {
    return defaultSiteId;
  }
  public void setDefaultSiteId(String defaultSiteId) {
    this.defaultSiteId = defaultSiteId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getDeletable() {
    return deletable;
  }
  public void setDeletable(Boolean deletable) {
    this.deletable = deletable;
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
    Organization organization = (Organization) o;
    return Objects.equals(id, organization.id) &&
        Objects.equals(name, organization.name) &&
        Objects.equals(thirdPartyOrgId, organization.thirdPartyOrgId) &&
        Objects.equals(thirdPartyOrgName, organization.thirdPartyOrgName) &&
        Objects.equals(thirdPartyURI, organization.thirdPartyURI) &&
        Objects.equals(domain, organization.domain) &&
        Objects.equals(version, organization.version) &&
        Objects.equals(state, organization.state) &&
        Objects.equals(defaultSiteId, organization.defaultSiteId) &&
        Objects.equals(deletable, organization.deletable) &&
        Objects.equals(selfUri, organization.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, thirdPartyOrgId, thirdPartyOrgName, thirdPartyURI, domain, version, state, defaultSiteId, deletable, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Organization {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    thirdPartyOrgId: ").append(toIndentedString(thirdPartyOrgId)).append("\n");
    sb.append("    thirdPartyOrgName: ").append(toIndentedString(thirdPartyOrgName)).append("\n");
    sb.append("    thirdPartyURI: ").append(toIndentedString(thirdPartyURI)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    defaultSiteId: ").append(toIndentedString(defaultSiteId)).append("\n");
    sb.append("    deletable: ").append(toIndentedString(deletable)).append("\n");
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
