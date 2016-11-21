package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.AcwSettings;
import com.mypurecloud.sdk.model.Bullseye;
import com.mypurecloud.sdk.model.MediaSetting;
import com.mypurecloud.sdk.model.UriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class CreateQueueRequest  implements Serializable {
  
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

  @SerializedName("mediaSettings")
  private Map<String, MediaSetting> mediaSettings = new HashMap<String, MediaSetting>();

  @SerializedName("bullseye")
  private Bullseye bullseye = null;

  @SerializedName("acwSettings")
  private AcwSettings acwSettings = null;


  /**
   * The skill evaluation method to use when routing conversations.
   */
  public enum SkillEvaluationMethodEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("NONE")
    NONE("NONE"),

    @SerializedName("BEST")
    BEST("BEST"),

    @SerializedName("ALL")
    ALL("ALL");

    private String value;

    SkillEvaluationMethodEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("skillEvaluationMethod")
  private SkillEvaluationMethodEnum skillEvaluationMethod = null;

  @SerializedName("queueFlow")
  private UriReference queueFlow = null;

  @SerializedName("callingPartyName")
  private String callingPartyName = null;

  @SerializedName("callingPartyNumber")
  private String callingPartyNumber = null;

  @SerializedName("sourceQueueId")
  private String sourceQueueId = null;

  @SerializedName("memberCount")
  private Integer memberCount = null;

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
   * The media settings for the queue.
   **/
  @ApiModelProperty(required = true, value = "The media settings for the queue.")
  public Map<String, MediaSetting> getMediaSettings() {
    return mediaSettings;
  }
  public void setMediaSettings(Map<String, MediaSetting> mediaSettings) {
    this.mediaSettings = mediaSettings;
  }

  /**
   * The bulls-eye settings for the queue.
   **/
  @ApiModelProperty(value = "The bulls-eye settings for the queue.")
  public Bullseye getBullseye() {
    return bullseye;
  }
  public void setBullseye(Bullseye bullseye) {
    this.bullseye = bullseye;
  }

  /**
   * The ACW settings for the queue.
   **/
  @ApiModelProperty(required = true, value = "The ACW settings for the queue.")
  public AcwSettings getAcwSettings() {
    return acwSettings;
  }
  public void setAcwSettings(AcwSettings acwSettings) {
    this.acwSettings = acwSettings;
  }

  /**
   * The skill evaluation method to use when routing conversations.
   **/
  @ApiModelProperty(required = true, value = "The skill evaluation method to use when routing conversations.")
  public SkillEvaluationMethodEnum getSkillEvaluationMethod() {
    return skillEvaluationMethod;
  }
  public void setSkillEvaluationMethod(SkillEvaluationMethodEnum skillEvaluationMethod) {
    this.skillEvaluationMethod = skillEvaluationMethod;
  }

  /**
   * The in-queue flow to use for conversations waiting in queue.
   **/
  @ApiModelProperty(value = "The in-queue flow to use for conversations waiting in queue.")
  public UriReference getQueueFlow() {
    return queueFlow;
  }
  public void setQueueFlow(UriReference queueFlow) {
    this.queueFlow = queueFlow;
  }

  /**
   * The name to use for caller identification for outbound calls from this queue.
   **/
  @ApiModelProperty(value = "The name to use for caller identification for outbound calls from this queue.")
  public String getCallingPartyName() {
    return callingPartyName;
  }
  public void setCallingPartyName(String callingPartyName) {
    this.callingPartyName = callingPartyName;
  }

  /**
   * The phone number to use for caller identification for outbound calls from this queue.
   **/
  @ApiModelProperty(value = "The phone number to use for caller identification for outbound calls from this queue.")
  public String getCallingPartyNumber() {
    return callingPartyNumber;
  }
  public void setCallingPartyNumber(String callingPartyNumber) {
    this.callingPartyNumber = callingPartyNumber;
  }

  /**
   * The id of an existing queue to copy the settings from when creating a new queue.
   **/
  @ApiModelProperty(value = "The id of an existing queue to copy the settings from when creating a new queue.")
  public String getSourceQueueId() {
    return sourceQueueId;
  }
  public void setSourceQueueId(String sourceQueueId) {
    this.sourceQueueId = sourceQueueId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getMemberCount() {
    return memberCount;
  }
  public void setMemberCount(Integer memberCount) {
    this.memberCount = memberCount;
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
    CreateQueueRequest createQueueRequest = (CreateQueueRequest) o;
    return Objects.equals(id, createQueueRequest.id) &&
        Objects.equals(name, createQueueRequest.name) &&
        Objects.equals(description, createQueueRequest.description) &&
        Objects.equals(version, createQueueRequest.version) &&
        Objects.equals(dateCreated, createQueueRequest.dateCreated) &&
        Objects.equals(dateModified, createQueueRequest.dateModified) &&
        Objects.equals(modifiedBy, createQueueRequest.modifiedBy) &&
        Objects.equals(createdBy, createQueueRequest.createdBy) &&
        Objects.equals(state, createQueueRequest.state) &&
        Objects.equals(modifiedByApp, createQueueRequest.modifiedByApp) &&
        Objects.equals(createdByApp, createQueueRequest.createdByApp) &&
        Objects.equals(mediaSettings, createQueueRequest.mediaSettings) &&
        Objects.equals(bullseye, createQueueRequest.bullseye) &&
        Objects.equals(acwSettings, createQueueRequest.acwSettings) &&
        Objects.equals(skillEvaluationMethod, createQueueRequest.skillEvaluationMethod) &&
        Objects.equals(queueFlow, createQueueRequest.queueFlow) &&
        Objects.equals(callingPartyName, createQueueRequest.callingPartyName) &&
        Objects.equals(callingPartyNumber, createQueueRequest.callingPartyNumber) &&
        Objects.equals(sourceQueueId, createQueueRequest.sourceQueueId) &&
        Objects.equals(memberCount, createQueueRequest.memberCount) &&
        Objects.equals(selfUri, createQueueRequest.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, version, dateCreated, dateModified, modifiedBy, createdBy, state, modifiedByApp, createdByApp, mediaSettings, bullseye, acwSettings, skillEvaluationMethod, queueFlow, callingPartyName, callingPartyNumber, sourceQueueId, memberCount, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateQueueRequest {\n");
    
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
    sb.append("    mediaSettings: ").append(toIndentedString(mediaSettings)).append("\n");
    sb.append("    bullseye: ").append(toIndentedString(bullseye)).append("\n");
    sb.append("    acwSettings: ").append(toIndentedString(acwSettings)).append("\n");
    sb.append("    skillEvaluationMethod: ").append(toIndentedString(skillEvaluationMethod)).append("\n");
    sb.append("    queueFlow: ").append(toIndentedString(queueFlow)).append("\n");
    sb.append("    callingPartyName: ").append(toIndentedString(callingPartyName)).append("\n");
    sb.append("    callingPartyNumber: ").append(toIndentedString(callingPartyNumber)).append("\n");
    sb.append("    sourceQueueId: ").append(toIndentedString(sourceQueueId)).append("\n");
    sb.append("    memberCount: ").append(toIndentedString(memberCount)).append("\n");
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
