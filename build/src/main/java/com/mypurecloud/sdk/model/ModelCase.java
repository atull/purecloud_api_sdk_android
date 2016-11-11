package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.CaseStatus;
import com.mypurecloud.sdk.model.CaseType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class ModelCase  implements Serializable {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("status")
  private CaseStatus status = null;

  @SerializedName("type")
  private CaseType type = null;

  @SerializedName("description")
  private String description = null;

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
   **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Brief title for the Case
   **/
  @ApiModelProperty(required = true, value = "Brief title for the Case")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Predefined status to be assigned to a case. A list of case statuses will be managed by Case Admin
   **/
  @ApiModelProperty(required = true, value = "Predefined status to be assigned to a case. A list of case statuses will be managed by Case Admin")
  public CaseStatus getStatus() {
    return status;
  }
  public void setStatus(CaseStatus status) {
    this.status = status;
  }

  /**
   * Predefined type to be assigned to a case. A list of case types will be managed by Case Admin
   **/
  @ApiModelProperty(required = true, value = "Predefined type to be assigned to a case. A list of case types will be managed by Case Admin")
  public CaseType getType() {
    return type;
  }
  public void setType(CaseType type) {
    this.type = type;
  }

  /**
   * Detailed description of the case
   **/
  @ApiModelProperty(required = true, value = "Detailed description of the case")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Date when case is created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date when case is created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getDateCreated() {
    return dateCreated;
  }

  /**
   * Date when case is updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date when case is updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
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
    ModelCase _case = (ModelCase) o;
    return Objects.equals(id, _case.id) &&
        Objects.equals(name, _case.name) &&
        Objects.equals(title, _case.title) &&
        Objects.equals(status, _case.status) &&
        Objects.equals(type, _case.type) &&
        Objects.equals(description, _case.description) &&
        Objects.equals(dateCreated, _case.dateCreated) &&
        Objects.equals(dateModified, _case.dateModified) &&
        Objects.equals(selfUri, _case.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, title, status, type, description, dateCreated, dateModified, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelCase {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
