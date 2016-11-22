package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.DocumentAttribute;
import com.mypurecloud.sdk.model.DocumentThumbnail;
import com.mypurecloud.sdk.model.LockInfo;
import com.mypurecloud.sdk.model.TagValue;
import com.mypurecloud.sdk.model.UriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class Document  implements Serializable {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("changeNumber")
  private Integer changeNumber = null;

  @SerializedName("dateCreated")
  private Date dateCreated = null;

  @SerializedName("dateModified")
  private Date dateModified = null;

  @SerializedName("dateUploaded")
  private Date dateUploaded = null;

  @SerializedName("contentUri")
  private String contentUri = null;

  @SerializedName("workspace")
  private UriReference workspace = null;

  @SerializedName("createdBy")
  private UriReference createdBy = null;

  @SerializedName("uploadedBy")
  private UriReference uploadedBy = null;

  @SerializedName("contentType")
  private String contentType = null;

  @SerializedName("contentLength")
  private Long contentLength = null;


  /**
   * Gets or Sets systemType
   */
  public enum SystemTypeEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("DOCUMENT")
    DOCUMENT("DOCUMENT"),

    @SerializedName("FAX")
    FAX("FAX"),

    @SerializedName("RECORDING")
    RECORDING("RECORDING");

    private String value;

    SystemTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("systemType")
  private SystemTypeEnum systemType = null;

  @SerializedName("filename")
  private String filename = null;

  @SerializedName("pageCount")
  private Long pageCount = null;

  @SerializedName("read")
  private Boolean read = false;

  @SerializedName("callerAddress")
  private String callerAddress = null;

  @SerializedName("receiverAddress")
  private String receiverAddress = null;

  @SerializedName("tags")
  private List<String> tags = new ArrayList<String>();

  @SerializedName("tagValues")
  private List<TagValue> tagValues = new ArrayList<TagValue>();

  @SerializedName("attributes")
  private List<DocumentAttribute> attributes = new ArrayList<DocumentAttribute>();

  @SerializedName("thumbnails")
  private List<DocumentThumbnail> thumbnails = new ArrayList<DocumentThumbnail>();

  @SerializedName("uploadStatus")
  private UriReference uploadStatus = null;

  @SerializedName("uploadDestinationUri")
  private String uploadDestinationUri = null;


  /**
   * Gets or Sets uploadMethod
   */
  public enum UploadMethodEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("SINGLE_PUT")
    SINGLE_PUT("SINGLE_PUT"),

    @SerializedName("MULTIPART_POST")
    MULTIPART_POST("MULTIPART_POST");

    private String value;

    UploadMethodEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("uploadMethod")
  private UploadMethodEnum uploadMethod = null;

  @SerializedName("lockInfo")
  private LockInfo lockInfo = null;

  @SerializedName("acl")
  private List<String> acl = new ArrayList<String>();


  /**
   * Gets or Sets sharingStatus
   */
  public enum SharingStatusEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("NONE")
    NONE("NONE"),

    @SerializedName("LIMITED")
    LIMITED("LIMITED"),

    @SerializedName("PUBLIC")
    PUBLIC("PUBLIC");

    private String value;

    SharingStatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("sharingStatus")
  private SharingStatusEnum sharingStatus = null;

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
   **/
  @ApiModelProperty(value = "")
  public Integer getChangeNumber() {
    return changeNumber;
  }
  public void setChangeNumber(Integer changeNumber) {
    this.changeNumber = changeNumber;
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
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getDateUploaded() {
    return dateUploaded;
  }
  public void setDateUploaded(Date dateUploaded) {
    this.dateUploaded = dateUploaded;
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
  public UriReference getUploadedBy() {
    return uploadedBy;
  }
  public void setUploadedBy(UriReference uploadedBy) {
    this.uploadedBy = uploadedBy;
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
  public SystemTypeEnum getSystemType() {
    return systemType;
  }
  public void setSystemType(SystemTypeEnum systemType) {
    this.systemType = systemType;
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
  public Long getPageCount() {
    return pageCount;
  }
  public void setPageCount(Long pageCount) {
    this.pageCount = pageCount;
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
  public List<String> getTags() {
    return tags;
  }
  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<TagValue> getTagValues() {
    return tagValues;
  }
  public void setTagValues(List<TagValue> tagValues) {
    this.tagValues = tagValues;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<DocumentAttribute> getAttributes() {
    return attributes;
  }
  public void setAttributes(List<DocumentAttribute> attributes) {
    this.attributes = attributes;
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
  public UriReference getUploadStatus() {
    return uploadStatus;
  }
  public void setUploadStatus(UriReference uploadStatus) {
    this.uploadStatus = uploadStatus;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getUploadDestinationUri() {
    return uploadDestinationUri;
  }
  public void setUploadDestinationUri(String uploadDestinationUri) {
    this.uploadDestinationUri = uploadDestinationUri;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public UploadMethodEnum getUploadMethod() {
    return uploadMethod;
  }
  public void setUploadMethod(UploadMethodEnum uploadMethod) {
    this.uploadMethod = uploadMethod;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public LockInfo getLockInfo() {
    return lockInfo;
  }
  public void setLockInfo(LockInfo lockInfo) {
    this.lockInfo = lockInfo;
  }

  /**
   * A list of permitted action rights for the user making the request
   **/
  @ApiModelProperty(value = "A list of permitted action rights for the user making the request")
  public List<String> getAcl() {
    return acl;
  }
  public void setAcl(List<String> acl) {
    this.acl = acl;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public SharingStatusEnum getSharingStatus() {
    return sharingStatus;
  }
  public void setSharingStatus(SharingStatusEnum sharingStatus) {
    this.sharingStatus = sharingStatus;
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
    Document document = (Document) o;
    return Objects.equals(id, document.id) &&
        Objects.equals(name, document.name) &&
        Objects.equals(changeNumber, document.changeNumber) &&
        Objects.equals(dateCreated, document.dateCreated) &&
        Objects.equals(dateModified, document.dateModified) &&
        Objects.equals(dateUploaded, document.dateUploaded) &&
        Objects.equals(contentUri, document.contentUri) &&
        Objects.equals(workspace, document.workspace) &&
        Objects.equals(createdBy, document.createdBy) &&
        Objects.equals(uploadedBy, document.uploadedBy) &&
        Objects.equals(contentType, document.contentType) &&
        Objects.equals(contentLength, document.contentLength) &&
        Objects.equals(systemType, document.systemType) &&
        Objects.equals(filename, document.filename) &&
        Objects.equals(pageCount, document.pageCount) &&
        Objects.equals(read, document.read) &&
        Objects.equals(callerAddress, document.callerAddress) &&
        Objects.equals(receiverAddress, document.receiverAddress) &&
        Objects.equals(tags, document.tags) &&
        Objects.equals(tagValues, document.tagValues) &&
        Objects.equals(attributes, document.attributes) &&
        Objects.equals(thumbnails, document.thumbnails) &&
        Objects.equals(uploadStatus, document.uploadStatus) &&
        Objects.equals(uploadDestinationUri, document.uploadDestinationUri) &&
        Objects.equals(uploadMethod, document.uploadMethod) &&
        Objects.equals(lockInfo, document.lockInfo) &&
        Objects.equals(acl, document.acl) &&
        Objects.equals(sharingStatus, document.sharingStatus) &&
        Objects.equals(sharingUri, document.sharingUri) &&
        Objects.equals(downloadSharingUri, document.downloadSharingUri) &&
        Objects.equals(selfUri, document.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, changeNumber, dateCreated, dateModified, dateUploaded, contentUri, workspace, createdBy, uploadedBy, contentType, contentLength, systemType, filename, pageCount, read, callerAddress, receiverAddress, tags, tagValues, attributes, thumbnails, uploadStatus, uploadDestinationUri, uploadMethod, lockInfo, acl, sharingStatus, sharingUri, downloadSharingUri, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Document {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    changeNumber: ").append(toIndentedString(changeNumber)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    dateUploaded: ").append(toIndentedString(dateUploaded)).append("\n");
    sb.append("    contentUri: ").append(toIndentedString(contentUri)).append("\n");
    sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    uploadedBy: ").append(toIndentedString(uploadedBy)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    contentLength: ").append(toIndentedString(contentLength)).append("\n");
    sb.append("    systemType: ").append(toIndentedString(systemType)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    read: ").append(toIndentedString(read)).append("\n");
    sb.append("    callerAddress: ").append(toIndentedString(callerAddress)).append("\n");
    sb.append("    receiverAddress: ").append(toIndentedString(receiverAddress)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    tagValues: ").append(toIndentedString(tagValues)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    thumbnails: ").append(toIndentedString(thumbnails)).append("\n");
    sb.append("    uploadStatus: ").append(toIndentedString(uploadStatus)).append("\n");
    sb.append("    uploadDestinationUri: ").append(toIndentedString(uploadDestinationUri)).append("\n");
    sb.append("    uploadMethod: ").append(toIndentedString(uploadMethod)).append("\n");
    sb.append("    lockInfo: ").append(toIndentedString(lockInfo)).append("\n");
    sb.append("    acl: ").append(toIndentedString(acl)).append("\n");
    sb.append("    sharingStatus: ").append(toIndentedString(sharingStatus)).append("\n");
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
