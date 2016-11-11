package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.Endpoint;
import com.mypurecloud.sdk.model.Recording;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class OrphanRecording  implements Serializable {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("createdTime")
  private Date createdTime = null;

  @SerializedName("recoveredTime")
  private Date recoveredTime = null;


  /**
   * Gets or Sets providerType
   */
  public enum ProviderTypeEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("EDGE")
    EDGE("EDGE"),

    @SerializedName("CHAT")
    CHAT("CHAT"),

    @SerializedName("EMAIL")
    EMAIL("EMAIL");

    private String value;

    ProviderTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("providerType")
  private ProviderTypeEnum providerType = null;

  @SerializedName("mediaSizeBytes")
  private Long mediaSizeBytes = null;


  /**
   * Gets or Sets mediaType
   */
  public enum MediaTypeEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("CALL")
    CALL("CALL"),

    @SerializedName("CHAT")
    CHAT("CHAT"),

    @SerializedName("EMAIL")
    EMAIL("EMAIL");

    private String value;

    MediaTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("mediaType")
  private MediaTypeEnum mediaType = null;


  /**
   * Gets or Sets fileState
   */
  public enum FileStateEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("ARCHIVED")
    ARCHIVED("ARCHIVED"),

    @SerializedName("AVAILABLE")
    AVAILABLE("AVAILABLE"),

    @SerializedName("DELETED")
    DELETED("DELETED"),

    @SerializedName("RESTORED")
    RESTORED("RESTORED"),

    @SerializedName("RESTORING")
    RESTORING("RESTORING"),

    @SerializedName("UPLOADING")
    UPLOADING("UPLOADING");

    private String value;

    FileStateEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("fileState")
  private FileStateEnum fileState = null;

  @SerializedName("providerEndpoint")
  private Endpoint providerEndpoint = null;

  @SerializedName("recording")
  private Recording recording = null;

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
  public Date getCreatedTime() {
    return createdTime;
  }
  public void setCreatedTime(Date createdTime) {
    this.createdTime = createdTime;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getRecoveredTime() {
    return recoveredTime;
  }
  public void setRecoveredTime(Date recoveredTime) {
    this.recoveredTime = recoveredTime;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ProviderTypeEnum getProviderType() {
    return providerType;
  }
  public void setProviderType(ProviderTypeEnum providerType) {
    this.providerType = providerType;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getMediaSizeBytes() {
    return mediaSizeBytes;
  }
  public void setMediaSizeBytes(Long mediaSizeBytes) {
    this.mediaSizeBytes = mediaSizeBytes;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }
  public void setMediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public FileStateEnum getFileState() {
    return fileState;
  }
  public void setFileState(FileStateEnum fileState) {
    this.fileState = fileState;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Endpoint getProviderEndpoint() {
    return providerEndpoint;
  }
  public void setProviderEndpoint(Endpoint providerEndpoint) {
    this.providerEndpoint = providerEndpoint;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Recording getRecording() {
    return recording;
  }
  public void setRecording(Recording recording) {
    this.recording = recording;
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
    OrphanRecording orphanRecording = (OrphanRecording) o;
    return Objects.equals(id, orphanRecording.id) &&
        Objects.equals(name, orphanRecording.name) &&
        Objects.equals(createdTime, orphanRecording.createdTime) &&
        Objects.equals(recoveredTime, orphanRecording.recoveredTime) &&
        Objects.equals(providerType, orphanRecording.providerType) &&
        Objects.equals(mediaSizeBytes, orphanRecording.mediaSizeBytes) &&
        Objects.equals(mediaType, orphanRecording.mediaType) &&
        Objects.equals(fileState, orphanRecording.fileState) &&
        Objects.equals(providerEndpoint, orphanRecording.providerEndpoint) &&
        Objects.equals(recording, orphanRecording.recording) &&
        Objects.equals(selfUri, orphanRecording.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, createdTime, recoveredTime, providerType, mediaSizeBytes, mediaType, fileState, providerEndpoint, recording, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrphanRecording {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    recoveredTime: ").append(toIndentedString(recoveredTime)).append("\n");
    sb.append("    providerType: ").append(toIndentedString(providerType)).append("\n");
    sb.append("    mediaSizeBytes: ").append(toIndentedString(mediaSizeBytes)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    fileState: ").append(toIndentedString(fileState)).append("\n");
    sb.append("    providerEndpoint: ").append(toIndentedString(providerEndpoint)).append("\n");
    sb.append("    recording: ").append(toIndentedString(recording)).append("\n");
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
