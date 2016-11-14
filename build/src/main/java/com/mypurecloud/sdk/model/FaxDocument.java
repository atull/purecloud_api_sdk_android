package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.DocumentThumbnail;
import com.mypurecloud.sdk.model.UriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class FaxDocument  implements Serializable {
  
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

  @SerializedName("contentType")
  private String contentType = null;

  @SerializedName("contentLength")
  private Long contentLength = null;

  @SerializedName("filename")
  private String filename = null;

  @SerializedName("read")
  private Boolean read = false;

  @SerializedName("pageCount")
  private Long pageCount = null;

  @SerializedName("callerAddress")
  private String callerAddress = null;

  @SerializedName("receiverAddress")
  private String receiverAddress = null;

  @SerializedName("thumbnails")
  private List<DocumentThumbnail> thumbnails = new ArrayList<DocumentThumbnail>();

  @SerializedName("sharingUri")
  private String sharingUri = null;

  @SerializedName("downloadSharingUri")
  private String downloadSharingUri = null;

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
  public String getContentType() {
    return contentType;
  }
  public void setContentType(String contentType) {
    this.contentType = contentType;
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
  public String getFilename() {
    return filename;
  }
  public void setFilename(String filename) {
    this.filename = filename;
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
   **/
  @ApiModelProperty(value = "")
  public Long getPageCount() {
    return pageCount;
  }
  public void setPageCount(Long pageCount) {
    this.pageCount = pageCount;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCallerAddress() {
    return callerAddress;
  }
  public void setCallerAddress(String callerAddress) {
    this.callerAddress = callerAddress;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getReceiverAddress() {
    return receiverAddress;
  }
  public void setReceiverAddress(String receiverAddress) {
    this.receiverAddress = receiverAddress;
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
  public String getSharingUri() {
    return sharingUri;
  }
  public void setSharingUri(String sharingUri) {
    this.sharingUri = sharingUri;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDownloadSharingUri() {
    return downloadSharingUri;
  }
  public void setDownloadSharingUri(String downloadSharingUri) {
    this.downloadSharingUri = downloadSharingUri;
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
    FaxDocument faxDocument = (FaxDocument) o;
    return Objects.equals(id, faxDocument.id) &&
        Objects.equals(name, faxDocument.name) &&
        Objects.equals(dateCreated, faxDocument.dateCreated) &&
        Objects.equals(dateModified, faxDocument.dateModified) &&
        Objects.equals(contentUri, faxDocument.contentUri) &&
        Objects.equals(workspace, faxDocument.workspace) &&
        Objects.equals(createdBy, faxDocument.createdBy) &&
        Objects.equals(contentType, faxDocument.contentType) &&
        Objects.equals(contentLength, faxDocument.contentLength) &&
        Objects.equals(filename, faxDocument.filename) &&
        Objects.equals(read, faxDocument.read) &&
        Objects.equals(pageCount, faxDocument.pageCount) &&
        Objects.equals(callerAddress, faxDocument.callerAddress) &&
        Objects.equals(receiverAddress, faxDocument.receiverAddress) &&
        Objects.equals(thumbnails, faxDocument.thumbnails) &&
        Objects.equals(sharingUri, faxDocument.sharingUri) &&
        Objects.equals(downloadSharingUri, faxDocument.downloadSharingUri) &&
        Objects.equals(selfUri, faxDocument.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, contentUri, workspace, createdBy, contentType, contentLength, filename, read, pageCount, callerAddress, receiverAddress, thumbnails, sharingUri, downloadSharingUri, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaxDocument {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    contentUri: ").append(toIndentedString(contentUri)).append("\n");
    sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    contentLength: ").append(toIndentedString(contentLength)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    read: ").append(toIndentedString(read)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    callerAddress: ").append(toIndentedString(callerAddress)).append("\n");
    sb.append("    receiverAddress: ").append(toIndentedString(receiverAddress)).append("\n");
    sb.append("    thumbnails: ").append(toIndentedString(thumbnails)).append("\n");
    sb.append("    sharingUri: ").append(toIndentedString(sharingUri)).append("\n");
    sb.append("    downloadSharingUri: ").append(toIndentedString(downloadSharingUri)).append("\n");
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
