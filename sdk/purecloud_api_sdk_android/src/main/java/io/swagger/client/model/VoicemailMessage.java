package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Conversation;
import io.swagger.client.model.User;
import java.util.Date;

import com.google.gson.annotations.SerializedName;





public class VoicemailMessage   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("conversation")
  private Conversation conversation = null;

  @SerializedName("read")
  private Boolean read = false;

  @SerializedName("audioRecordingDurationSeconds")
  private Integer audioRecordingDurationSeconds = null;

  @SerializedName("audioRecordingSizeBytes")
  private Long audioRecordingSizeBytes = null;

  @SerializedName("createdDate")
  private Date createdDate = null;

  @SerializedName("modifiedDate")
  private Date modifiedDate = null;

  @SerializedName("callerAddress")
  private String callerAddress = null;

  @SerializedName("callerName")
  private String callerName = null;

  @SerializedName("callerUser")
  private User callerUser = null;

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
  public Conversation getConversation() {
    return conversation;
  }
  public void setConversation(Conversation conversation) {
    this.conversation = conversation;
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
  public Integer getAudioRecordingDurationSeconds() {
    return audioRecordingDurationSeconds;
  }
  public void setAudioRecordingDurationSeconds(Integer audioRecordingDurationSeconds) {
    this.audioRecordingDurationSeconds = audioRecordingDurationSeconds;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getAudioRecordingSizeBytes() {
    return audioRecordingSizeBytes;
  }
  public void setAudioRecordingSizeBytes(Long audioRecordingSizeBytes) {
    this.audioRecordingSizeBytes = audioRecordingSizeBytes;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getModifiedDate() {
    return modifiedDate;
  }
  public void setModifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
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
  public String getCallerName() {
    return callerName;
  }
  public void setCallerName(String callerName) {
    this.callerName = callerName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public User getCallerUser() {
    return callerUser;
  }
  public void setCallerUser(User callerUser) {
    this.callerUser = callerUser;
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
    VoicemailMessage voicemailMessage = (VoicemailMessage) o;
    return Objects.equals(id, voicemailMessage.id) &&
        Objects.equals(conversation, voicemailMessage.conversation) &&
        Objects.equals(read, voicemailMessage.read) &&
        Objects.equals(audioRecordingDurationSeconds, voicemailMessage.audioRecordingDurationSeconds) &&
        Objects.equals(audioRecordingSizeBytes, voicemailMessage.audioRecordingSizeBytes) &&
        Objects.equals(createdDate, voicemailMessage.createdDate) &&
        Objects.equals(modifiedDate, voicemailMessage.modifiedDate) &&
        Objects.equals(callerAddress, voicemailMessage.callerAddress) &&
        Objects.equals(callerName, voicemailMessage.callerName) &&
        Objects.equals(callerUser, voicemailMessage.callerUser) &&
        Objects.equals(selfUri, voicemailMessage.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, conversation, read, audioRecordingDurationSeconds, audioRecordingSizeBytes, createdDate, modifiedDate, callerAddress, callerName, callerUser, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoicemailMessage {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
    sb.append("    read: ").append(toIndentedString(read)).append("\n");
    sb.append("    audioRecordingDurationSeconds: ").append(toIndentedString(audioRecordingDurationSeconds)).append("\n");
    sb.append("    audioRecordingSizeBytes: ").append(toIndentedString(audioRecordingSizeBytes)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    callerAddress: ").append(toIndentedString(callerAddress)).append("\n");
    sb.append("    callerName: ").append(toIndentedString(callerName)).append("\n");
    sb.append("    callerUser: ").append(toIndentedString(callerUser)).append("\n");
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
