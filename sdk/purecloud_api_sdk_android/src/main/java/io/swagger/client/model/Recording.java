package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Annotation;
import io.swagger.client.model.ChatMessage;
import io.swagger.client.model.MediaResult;
import io.swagger.client.model.RecordingEmailMessage;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;





public class Recording   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("conversationId")
  private String conversationId = null;

  @SerializedName("path")
  private String path = null;

  @SerializedName("startTime")
  private String startTime = null;

  @SerializedName("endTime")
  private String endTime = null;

  @SerializedName("media")
  private String media = null;

  @SerializedName("annotations")
  private List<Annotation> annotations = new ArrayList<Annotation>();

  @SerializedName("transcript")
  private List<ChatMessage> transcript = new ArrayList<ChatMessage>();

  @SerializedName("emailTranscript")
  private List<RecordingEmailMessage> emailTranscript = new ArrayList<RecordingEmailMessage>();


  /**
   * Represents the current file state for a recording. Examples: Uploading, Archived, etc
   */
  public enum FileStateEnum {
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

  @SerializedName("restoreExpirationTime")
  private Date restoreExpirationTime = null;

  @SerializedName("mediaUris")
  private Map<String, MediaResult> mediaUris = new HashMap<String, MediaResult>();

  @SerializedName("estimatedTranscodeTimeMs")
  private Long estimatedTranscodeTimeMs = null;

  @SerializedName("actualTranscodeTimeMs")
  private Long actualTranscodeTimeMs = null;

  @SerializedName("archiveDate")
  private Date archiveDate = null;


  /**
   * The type of archive medium used. Example: CloudArchive
   */
  public enum ArchiveMediumEnum {
    @SerializedName("CLOUDARCHIVE")
    CLOUDARCHIVE("CLOUDARCHIVE");

    private String value;

    ArchiveMediumEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("archiveMedium")
  private ArchiveMediumEnum archiveMedium = null;

  @SerializedName("deleteDate")
  private Date deleteDate = null;

  @SerializedName("maxAllowedRestorationsForOrg")
  private Integer maxAllowedRestorationsForOrg = null;

  @SerializedName("remainingRestorationsAllowedForOrg")
  private Integer remainingRestorationsAllowedForOrg = null;

  @SerializedName("sessionId")
  private String sessionId = null;

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
  public String getConversationId() {
    return conversationId;
  }
  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPath() {
    return path;
  }
  public void setPath(String path) {
    this.path = path;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getStartTime() {
    return startTime;
  }
  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getEndTime() {
    return endTime;
  }
  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  /**
   * The type of media that the recording is.
   **/
  @ApiModelProperty(value = "The type of media that the recording is.")
  public String getMedia() {
    return media;
  }
  public void setMedia(String media) {
    this.media = media;
  }

  /**
   * Annotations that belong to the recording.
   **/
  @ApiModelProperty(value = "Annotations that belong to the recording.")
  public List<Annotation> getAnnotations() {
    return annotations;
  }
  public void setAnnotations(List<Annotation> annotations) {
    this.annotations = annotations;
  }

  /**
   * Represents a chat transcript
   **/
  @ApiModelProperty(value = "Represents a chat transcript")
  public List<ChatMessage> getTranscript() {
    return transcript;
  }
  public void setTranscript(List<ChatMessage> transcript) {
    this.transcript = transcript;
  }

  /**
   * Represents an email transcript
   **/
  @ApiModelProperty(value = "Represents an email transcript")
  public List<RecordingEmailMessage> getEmailTranscript() {
    return emailTranscript;
  }
  public void setEmailTranscript(List<RecordingEmailMessage> emailTranscript) {
    this.emailTranscript = emailTranscript;
  }

  /**
   * Represents the current file state for a recording. Examples: Uploading, Archived, etc
   **/
  @ApiModelProperty(value = "Represents the current file state for a recording. Examples: Uploading, Archived, etc")
  public FileStateEnum getFileState() {
    return fileState;
  }
  public void setFileState(FileStateEnum fileState) {
    this.fileState = fileState;
  }

  /**
   * The amount of time a restored recording will remain restored before being archived again. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "The amount of time a restored recording will remain restored before being archived again. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getRestoreExpirationTime() {
    return restoreExpirationTime;
  }
  public void setRestoreExpirationTime(Date restoreExpirationTime) {
    this.restoreExpirationTime = restoreExpirationTime;
  }

  /**
   * The different mediaUris for the recording.
   **/
  @ApiModelProperty(value = "The different mediaUris for the recording.")
  public Map<String, MediaResult> getMediaUris() {
    return mediaUris;
  }
  public void setMediaUris(Map<String, MediaResult> mediaUris) {
    this.mediaUris = mediaUris;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getEstimatedTranscodeTimeMs() {
    return estimatedTranscodeTimeMs;
  }
  public void setEstimatedTranscodeTimeMs(Long estimatedTranscodeTimeMs) {
    this.estimatedTranscodeTimeMs = estimatedTranscodeTimeMs;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getActualTranscodeTimeMs() {
    return actualTranscodeTimeMs;
  }
  public void setActualTranscodeTimeMs(Long actualTranscodeTimeMs) {
    this.actualTranscodeTimeMs = actualTranscodeTimeMs;
  }

  /**
   * The date the recording will be archived. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "The date the recording will be archived. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getArchiveDate() {
    return archiveDate;
  }
  public void setArchiveDate(Date archiveDate) {
    this.archiveDate = archiveDate;
  }

  /**
   * The type of archive medium used. Example: CloudArchive
   **/
  @ApiModelProperty(value = "The type of archive medium used. Example: CloudArchive")
  public ArchiveMediumEnum getArchiveMedium() {
    return archiveMedium;
  }
  public void setArchiveMedium(ArchiveMediumEnum archiveMedium) {
    this.archiveMedium = archiveMedium;
  }

  /**
   * The date the recording will be deleted. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "The date the recording will be deleted. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getDeleteDate() {
    return deleteDate;
  }
  public void setDeleteDate(Date deleteDate) {
    this.deleteDate = deleteDate;
  }

  /**
   * How many archive restorations the organization is allowed to have.
   **/
  @ApiModelProperty(value = "How many archive restorations the organization is allowed to have.")
  public Integer getMaxAllowedRestorationsForOrg() {
    return maxAllowedRestorationsForOrg;
  }
  public void setMaxAllowedRestorationsForOrg(Integer maxAllowedRestorationsForOrg) {
    this.maxAllowedRestorationsForOrg = maxAllowedRestorationsForOrg;
  }

  /**
   * The remaining archive restorations the organization has.
   **/
  @ApiModelProperty(value = "The remaining archive restorations the organization has.")
  public Integer getRemainingRestorationsAllowedForOrg() {
    return remainingRestorationsAllowedForOrg;
  }
  public void setRemainingRestorationsAllowedForOrg(Integer remainingRestorationsAllowedForOrg) {
    this.remainingRestorationsAllowedForOrg = remainingRestorationsAllowedForOrg;
  }

  /**
   * The session id represents an external resource id, such as email, call, chat, etc
   **/
  @ApiModelProperty(value = "The session id represents an external resource id, such as email, call, chat, etc")
  public String getSessionId() {
    return sessionId;
  }
  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
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
    Recording recording = (Recording) o;
    return Objects.equals(id, recording.id) &&
        Objects.equals(name, recording.name) &&
        Objects.equals(conversationId, recording.conversationId) &&
        Objects.equals(path, recording.path) &&
        Objects.equals(startTime, recording.startTime) &&
        Objects.equals(endTime, recording.endTime) &&
        Objects.equals(media, recording.media) &&
        Objects.equals(annotations, recording.annotations) &&
        Objects.equals(transcript, recording.transcript) &&
        Objects.equals(emailTranscript, recording.emailTranscript) &&
        Objects.equals(fileState, recording.fileState) &&
        Objects.equals(restoreExpirationTime, recording.restoreExpirationTime) &&
        Objects.equals(mediaUris, recording.mediaUris) &&
        Objects.equals(estimatedTranscodeTimeMs, recording.estimatedTranscodeTimeMs) &&
        Objects.equals(actualTranscodeTimeMs, recording.actualTranscodeTimeMs) &&
        Objects.equals(archiveDate, recording.archiveDate) &&
        Objects.equals(archiveMedium, recording.archiveMedium) &&
        Objects.equals(deleteDate, recording.deleteDate) &&
        Objects.equals(maxAllowedRestorationsForOrg, recording.maxAllowedRestorationsForOrg) &&
        Objects.equals(remainingRestorationsAllowedForOrg, recording.remainingRestorationsAllowedForOrg) &&
        Objects.equals(sessionId, recording.sessionId) &&
        Objects.equals(selfUri, recording.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, conversationId, path, startTime, endTime, media, annotations, transcript, emailTranscript, fileState, restoreExpirationTime, mediaUris, estimatedTranscodeTimeMs, actualTranscodeTimeMs, archiveDate, archiveMedium, deleteDate, maxAllowedRestorationsForOrg, remainingRestorationsAllowedForOrg, sessionId, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Recording {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    transcript: ").append(toIndentedString(transcript)).append("\n");
    sb.append("    emailTranscript: ").append(toIndentedString(emailTranscript)).append("\n");
    sb.append("    fileState: ").append(toIndentedString(fileState)).append("\n");
    sb.append("    restoreExpirationTime: ").append(toIndentedString(restoreExpirationTime)).append("\n");
    sb.append("    mediaUris: ").append(toIndentedString(mediaUris)).append("\n");
    sb.append("    estimatedTranscodeTimeMs: ").append(toIndentedString(estimatedTranscodeTimeMs)).append("\n");
    sb.append("    actualTranscodeTimeMs: ").append(toIndentedString(actualTranscodeTimeMs)).append("\n");
    sb.append("    archiveDate: ").append(toIndentedString(archiveDate)).append("\n");
    sb.append("    archiveMedium: ").append(toIndentedString(archiveMedium)).append("\n");
    sb.append("    deleteDate: ").append(toIndentedString(deleteDate)).append("\n");
    sb.append("    maxAllowedRestorationsForOrg: ").append(toIndentedString(maxAllowedRestorationsForOrg)).append("\n");
    sb.append("    remainingRestorationsAllowedForOrg: ").append(toIndentedString(remainingRestorationsAllowedForOrg)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
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
