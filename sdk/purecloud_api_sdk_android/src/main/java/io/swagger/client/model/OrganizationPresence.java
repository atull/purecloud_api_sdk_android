package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.User;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;





public class OrganizationPresence   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("languageLabels")
  private Map<String, String> languageLabels = new HashMap<String, String>();

  @SerializedName("systemPresence")
  private String systemPresence = null;

  @SerializedName("deactivated")
  private Boolean deactivated = false;

  @SerializedName("primary")
  private Boolean primary = false;

  @SerializedName("createdBy")
  private User createdBy = null;

  @SerializedName("createdDate")
  private Date createdDate = null;

  @SerializedName("modifiedBy")
  private User modifiedBy = null;

  @SerializedName("modifiedDate")
  private Date modifiedDate = null;

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
  public Map<String, String> getLanguageLabels() {
    return languageLabels;
  }
  public void setLanguageLabels(Map<String, String> languageLabels) {
    this.languageLabels = languageLabels;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSystemPresence() {
    return systemPresence;
  }
  public void setSystemPresence(String systemPresence) {
    this.systemPresence = systemPresence;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getDeactivated() {
    return deactivated;
  }
  public void setDeactivated(Boolean deactivated) {
    this.deactivated = deactivated;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getPrimary() {
    return primary;
  }
  public void setPrimary(Boolean primary) {
    this.primary = primary;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public User getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(User createdBy) {
    this.createdBy = createdBy;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public User getModifiedBy() {
    return modifiedBy;
  }
  public void setModifiedBy(User modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getModifiedDate() {
    return modifiedDate;
  }
  public void setModifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
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
    OrganizationPresence organizationPresence = (OrganizationPresence) o;
    return Objects.equals(id, organizationPresence.id) &&
        Objects.equals(name, organizationPresence.name) &&
        Objects.equals(languageLabels, organizationPresence.languageLabels) &&
        Objects.equals(systemPresence, organizationPresence.systemPresence) &&
        Objects.equals(deactivated, organizationPresence.deactivated) &&
        Objects.equals(primary, organizationPresence.primary) &&
        Objects.equals(createdBy, organizationPresence.createdBy) &&
        Objects.equals(createdDate, organizationPresence.createdDate) &&
        Objects.equals(modifiedBy, organizationPresence.modifiedBy) &&
        Objects.equals(modifiedDate, organizationPresence.modifiedDate) &&
        Objects.equals(selfUri, organizationPresence.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, languageLabels, systemPresence, deactivated, primary, createdBy, createdDate, modifiedBy, modifiedDate, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationPresence {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    languageLabels: ").append(toIndentedString(languageLabels)).append("\n");
    sb.append("    systemPresence: ").append(toIndentedString(systemPresence)).append("\n");
    sb.append("    deactivated: ").append(toIndentedString(deactivated)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
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
