package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class EdgeLogsJobFile  implements Serializable {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("version")
  private Integer version = null;

  @SerializedName("dateCreated")
  private Date dateCreated = null;

  @SerializedName("dateModified")
  private Date dateModified = null;

  @SerializedName("modifiedBy")
  private String modifiedBy = null;

  @SerializedName("createdBy")
  private String createdBy = null;


  /**
   * Gets or Sets state
   */
  public enum StateEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

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

  @SerializedName("modifiedByApp")
  private String modifiedByApp = null;

  @SerializedName("createdByApp")
  private String createdByApp = null;

  @SerializedName("timeCreated")
  private Date timeCreated = null;

  @SerializedName("timeModified")
  private Date timeModified = null;

  @SerializedName("sizeBytes")
  private Double sizeBytes = null;


  /**
   * The status of the upload of this file from the Edge to the cloud.  Use /upload to start an upload.
   */
  public enum UploadStatusEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("UPLOADING")
    UPLOADING("UPLOADING"),

    @SerializedName("NOT_UPLOADED")
    NOT_UPLOADED("NOT_UPLOADED"),

    @SerializedName("UPLOADED")
    UPLOADED("UPLOADED"),

    @SerializedName("ERROR_ON_UPLOAD")
    ERROR_ON_UPLOAD("ERROR_ON_UPLOAD");

    private String value;

    UploadStatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("uploadStatus")
  private UploadStatusEnum uploadStatus = null;

  @SerializedName("edgePath")
  private String edgePath = null;

  @SerializedName("downloadId")
  private String downloadId = null;

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
   * The name of the entity.
   **/
  @ApiModelProperty(required = true, value = "The name of the entity.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
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
  public String getModifiedBy() {
    return modifiedBy;
  }
  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
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
  public String getModifiedByApp() {
    return modifiedByApp;
  }
  public void setModifiedByApp(String modifiedByApp) {
    this.modifiedByApp = modifiedByApp;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCreatedByApp() {
    return createdByApp;
  }
  public void setCreatedByApp(String createdByApp) {
    this.createdByApp = createdByApp;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getTimeCreated() {
    return timeCreated;
  }
  public void setTimeCreated(Date timeCreated) {
    this.timeCreated = timeCreated;
  }

  /**
   * The time this log file was last modified on the Edge. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "The time this log file was last modified on the Edge. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getTimeModified() {
    return timeModified;
  }
  public void setTimeModified(Date timeModified) {
    this.timeModified = timeModified;
  }

  /**
   * The size of this file in bytes.
   **/
  @ApiModelProperty(value = "The size of this file in bytes.")
  public Double getSizeBytes() {
    return sizeBytes;
  }
  public void setSizeBytes(Double sizeBytes) {
    this.sizeBytes = sizeBytes;
  }

  /**
   * The status of the upload of this file from the Edge to the cloud.  Use /upload to start an upload.
   **/
  @ApiModelProperty(value = "The status of the upload of this file from the Edge to the cloud.  Use /upload to start an upload.")
  public UploadStatusEnum getUploadStatus() {
    return uploadStatus;
  }
  public void setUploadStatus(UploadStatusEnum uploadStatus) {
    this.uploadStatus = uploadStatus;
  }

  /**
   * The path of this file on the Edge.
   **/
  @ApiModelProperty(value = "The path of this file on the Edge.")
  public String getEdgePath() {
    return edgePath;
  }
  public void setEdgePath(String edgePath) {
    this.edgePath = edgePath;
  }

  /**
   * The download ID to use with the downloads API.
   **/
  @ApiModelProperty(value = "The download ID to use with the downloads API.")
  public String getDownloadId() {
    return downloadId;
  }
  public void setDownloadId(String downloadId) {
    this.downloadId = downloadId;
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
    EdgeLogsJobFile edgeLogsJobFile = (EdgeLogsJobFile) o;
    return Objects.equals(id, edgeLogsJobFile.id) &&
        Objects.equals(name, edgeLogsJobFile.name) &&
        Objects.equals(description, edgeLogsJobFile.description) &&
        Objects.equals(version, edgeLogsJobFile.version) &&
        Objects.equals(dateCreated, edgeLogsJobFile.dateCreated) &&
        Objects.equals(dateModified, edgeLogsJobFile.dateModified) &&
        Objects.equals(modifiedBy, edgeLogsJobFile.modifiedBy) &&
        Objects.equals(createdBy, edgeLogsJobFile.createdBy) &&
        Objects.equals(state, edgeLogsJobFile.state) &&
        Objects.equals(modifiedByApp, edgeLogsJobFile.modifiedByApp) &&
        Objects.equals(createdByApp, edgeLogsJobFile.createdByApp) &&
        Objects.equals(timeCreated, edgeLogsJobFile.timeCreated) &&
        Objects.equals(timeModified, edgeLogsJobFile.timeModified) &&
        Objects.equals(sizeBytes, edgeLogsJobFile.sizeBytes) &&
        Objects.equals(uploadStatus, edgeLogsJobFile.uploadStatus) &&
        Objects.equals(edgePath, edgeLogsJobFile.edgePath) &&
        Objects.equals(downloadId, edgeLogsJobFile.downloadId) &&
        Objects.equals(selfUri, edgeLogsJobFile.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, version, dateCreated, dateModified, modifiedBy, createdBy, state, modifiedByApp, createdByApp, timeCreated, timeModified, sizeBytes, uploadStatus, edgePath, downloadId, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdgeLogsJobFile {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    modifiedByApp: ").append(toIndentedString(modifiedByApp)).append("\n");
    sb.append("    createdByApp: ").append(toIndentedString(createdByApp)).append("\n");
    sb.append("    timeCreated: ").append(toIndentedString(timeCreated)).append("\n");
    sb.append("    timeModified: ").append(toIndentedString(timeModified)).append("\n");
    sb.append("    sizeBytes: ").append(toIndentedString(sizeBytes)).append("\n");
    sb.append("    uploadStatus: ").append(toIndentedString(uploadStatus)).append("\n");
    sb.append("    edgePath: ").append(toIndentedString(edgePath)).append("\n");
    sb.append("    downloadId: ").append(toIndentedString(downloadId)).append("\n");
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
