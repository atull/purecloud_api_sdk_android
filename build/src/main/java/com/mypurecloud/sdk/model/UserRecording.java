package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.Conversation;
import com.mypurecloud.sdk.model.DocumentThumbnail;
import com.mypurecloud.sdk.model.UriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class UserRecording  implements Serializable {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("dateCreated")
  private Date dateCreated = null;

  @SerializedName("dateModified")
  private Date dateModified = null;

  @SerializedName("contentUri")
  private String contentUri = null;

  @SerializedName("workspace")
  private UriReference workspace = null;

  @SerializedName("createdBy")
  private UriReference createdBy = null;

  @SerializedName("conversation")
  private Conversation conversation = null;

  @SerializedName("contentLength")
  private Long contentLength = null;

  @SerializedName("durationMilliseconds")
  private Long durationMilliseconds = null;

  @SerializedName("thumbnails")
  private List<DocumentThumbnail> thumbnails = new ArrayList<DocumentThumbnail>();

  @SerializedName("read")
  private Boolean read = false;

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
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getContentUri() {
    return contentUri;
  }
  public void setContentUri(String contentUri) {
    this.contentUri = contentUri;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public UriReference getWorkspace() {
    return workspace;
  }
  public void setWorkspace(UriReference workspace) {
    this.workspace = workspace;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public UriReference getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(UriReference createdBy) {
    this.createdBy = createdBy;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Conversation getConversation() {
    return conversation;
  }
  public void setConversation(Conversation conversation) {
    this.conversation = conversation;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getContentLength() {
    return contentLength;
  }
  public void setContentLength(Long contentLength) {
    this.contentLength = contentLength;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getDurationMilliseconds() {
    return durationMilliseconds;
  }
  public void setDurationMilliseconds(Long durationMilliseconds) {
    this.durationMilliseconds = durationMilliseconds;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<DocumentThumbnail> getThumbnails() {
    return thumbnails;
  }
  public void setThumbnails(List<DocumentThumbnail> thumbnails) {
    this.thumbnails = thumbnails;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getRead() {
    return read;
  }
  public void setRead(Boolean read) {
    this.read = read;
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
    UserRecording userRecording = (UserRecording) o;
    return Objects.equals(id, userRecording.id) &&
        Objects.equals(name, userRecording.name) &&
        Objects.equals(dateCreated, userRecording.dateCreated) &&
        Objects.equals(dateModified, userRecording.dateModified) &&
        Objects.equals(contentUri, userRecording.contentUri) &&
        Objects.equals(workspace, userRecording.workspace) &&
        Objects.equals(createdBy, userRecording.createdBy) &&
        Objects.equals(conversation, userRecording.conversation) &&
        Objects.equals(contentLength, userRecording.contentLength) &&
        Objects.equals(durationMilliseconds, userRecording.durationMilliseconds) &&
        Objects.equals(thumbnails, userRecording.thumbnails) &&
        Objects.equals(read, userRecording.read) &&
        Objects.equals(selfUri, userRecording.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, contentUri, workspace, createdBy, conversation, contentLength, durationMilliseconds, thumbnails, read, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserRecording {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    contentUri: ").append(toIndentedString(contentUri)).append("\n");
    sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
    sb.append("    contentLength: ").append(toIndentedString(contentLength)).append("\n");
    sb.append("    durationMilliseconds: ").append(toIndentedString(durationMilliseconds)).append("\n");
    sb.append("    thumbnails: ").append(toIndentedString(thumbnails)).append("\n");
    sb.append("    read: ").append(toIndentedString(read)).append("\n");
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
