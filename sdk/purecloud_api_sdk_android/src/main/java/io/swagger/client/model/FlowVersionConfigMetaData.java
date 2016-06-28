package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.User;
import java.util.Date;

import com.google.gson.annotations.SerializedName;




/**
 * Details about a specific Flow Definition version.
 **/
@ApiModel(description = "Details about a specific Flow Definition version.")
public class FlowVersionConfigMetaData   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("versionSpecificComment")
  private String versionSpecificComment = null;

  @SerializedName("flowDefinitionUri")
  private String flowDefinitionUri = null;

  @SerializedName("createdByUser")
  private User createdByUser = null;

  @SerializedName("createdDate")
  private Date createdDate = null;

  @SerializedName("selfUri")
  private String selfUri = null;

  @SerializedName("version")
  private String version = null;

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
   * Checkin comment for this specific flow version.
   **/
  @ApiModelProperty(value = "Checkin comment for this specific flow version.")
  public String getVersionSpecificComment() {
    return versionSpecificComment;
  }
  public void setVersionSpecificComment(String versionSpecificComment) {
    this.versionSpecificComment = versionSpecificComment;
  }

  /**
   * Uri location for the flow definition contents.
   **/
  @ApiModelProperty(required = true, value = "Uri location for the flow definition contents.")
  public String getFlowDefinitionUri() {
    return flowDefinitionUri;
  }
  public void setFlowDefinitionUri(String flowDefinitionUri) {
    this.flowDefinitionUri = flowDefinitionUri;
  }

  /**
   * If known, the user who created this flow version.
   **/
  @ApiModelProperty(value = "If known, the user who created this flow version.")
  public User getCreatedByUser() {
    return createdByUser;
  }
  public void setCreatedByUser(User createdByUser) {
    this.createdByUser = createdByUser;
  }

  /**
   * The date and time that the version was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "The date and time that the version was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }

  /**
   * The URI for this object
   **/
  @ApiModelProperty(value = "The URI for this object")
  public String getSelfUri() {
    return selfUri;
  }

  /**
   * Version of this flow config.
   **/
  @ApiModelProperty(value = "Version of this flow config.")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowVersionConfigMetaData flowVersionConfigMetaData = (FlowVersionConfigMetaData) o;
    return Objects.equals(id, flowVersionConfigMetaData.id) &&
        Objects.equals(name, flowVersionConfigMetaData.name) &&
        Objects.equals(versionSpecificComment, flowVersionConfigMetaData.versionSpecificComment) &&
        Objects.equals(flowDefinitionUri, flowVersionConfigMetaData.flowDefinitionUri) &&
        Objects.equals(createdByUser, flowVersionConfigMetaData.createdByUser) &&
        Objects.equals(createdDate, flowVersionConfigMetaData.createdDate) &&
        Objects.equals(selfUri, flowVersionConfigMetaData.selfUri) &&
        Objects.equals(version, flowVersionConfigMetaData.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, versionSpecificComment, flowDefinitionUri, createdByUser, createdDate, selfUri, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowVersionConfigMetaData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    versionSpecificComment: ").append(toIndentedString(versionSpecificComment)).append("\n");
    sb.append("    flowDefinitionUri: ").append(toIndentedString(flowDefinitionUri)).append("\n");
    sb.append("    createdByUser: ").append(toIndentedString(createdByUser)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
