package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class CaseStatus  implements Serializable {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("order")
  private Integer order = null;

  @SerializedName("isActive")
  private Boolean isActive = false;

  @SerializedName("isDefault")
  private Boolean isDefault = false;

  @SerializedName("dateCreated")
  private Date dateCreated = null;

  @SerializedName("dateModified")
  private Date dateModified = null;

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
   * Name of the case status
   **/
  @ApiModelProperty(required = true, value = "Name of the case status")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Detailed description of the case status
   **/
  @ApiModelProperty(value = "Detailed description of the case status")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Display order of the case status. Possible values 1 - 1000.
   **/
  @ApiModelProperty(value = "Display order of the case status. Possible values 1 - 1000.")
  public Integer getOrder() {
    return order;
  }
  public void setOrder(Integer order) {
    this.order = order;
  }

  /**
   * Active/Inactive flag of the case status
   **/
  @ApiModelProperty(value = "Active/Inactive flag of the case status")
  public Boolean getIsActive() {
    return isActive;
  }
  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  /**
   * Default case status. An organization can have a set of default statuses which cannot be delete or modified. Only custom cases can be modified
   **/
  @ApiModelProperty(value = "Default case status. An organization can have a set of default statuses which cannot be delete or modified. Only custom cases can be modified")
  public Boolean getIsDefault() {
    return isDefault;
  }
  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  /**
   * Date when case status is created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date when case status is created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getDateCreated() {
    return dateCreated;
  }

  /**
   * Date when case status is updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date when case status is updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getDateModified() {
    return dateModified;
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
    CaseStatus caseStatus = (CaseStatus) o;
    return Objects.equals(id, caseStatus.id) &&
        Objects.equals(name, caseStatus.name) &&
        Objects.equals(description, caseStatus.description) &&
        Objects.equals(order, caseStatus.order) &&
        Objects.equals(isActive, caseStatus.isActive) &&
        Objects.equals(isDefault, caseStatus.isDefault) &&
        Objects.equals(dateCreated, caseStatus.dateCreated) &&
        Objects.equals(dateModified, caseStatus.dateModified) &&
        Objects.equals(selfUri, caseStatus.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, order, isActive, isDefault, dateCreated, dateModified, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseStatus {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
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
