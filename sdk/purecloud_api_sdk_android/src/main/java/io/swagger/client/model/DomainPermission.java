package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;





public class DomainPermission   {
  
  @SerializedName("domain")
  private String domain = null;

  @SerializedName("entityType")
  private String entityType = null;

  @SerializedName("action")
  private String action = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("allowsConditions")
  private Boolean allowsConditions = false;

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
  public String getEntityType() {
    return entityType;
  }
  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getAction() {
    return action;
  }
  public void setAction(String action) {
    this.action = action;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getLabel() {
    return label;
  }
  public void setLabel(String label) {
    this.label = label;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getAllowsConditions() {
    return allowsConditions;
  }
  public void setAllowsConditions(Boolean allowsConditions) {
    this.allowsConditions = allowsConditions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomainPermission domainPermission = (DomainPermission) o;
    return Objects.equals(domain, domainPermission.domain) &&
        Objects.equals(entityType, domainPermission.entityType) &&
        Objects.equals(action, domainPermission.action) &&
        Objects.equals(label, domainPermission.label) &&
        Objects.equals(allowsConditions, domainPermission.allowsConditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domain, entityType, action, label, allowsConditions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainPermission {\n");
    
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    allowsConditions: ").append(toIndentedString(allowsConditions)).append("\n");
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
