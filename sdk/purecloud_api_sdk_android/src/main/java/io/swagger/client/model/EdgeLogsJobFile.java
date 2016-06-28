package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import com.google.gson.annotations.SerializedName;





public class EdgeLogsJobFile   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

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
    return Objects.hash(id, name, timeCreated, timeModified, sizeBytes, uploadStatus, edgePath, downloadId, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdgeLogsJobFile {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
