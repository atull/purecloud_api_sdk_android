package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;





public class SystemPromptAsset   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("promptId")
  private String promptId = null;

  @SerializedName("language")
  private String language = null;

  @SerializedName("durationSeconds")
  private Double durationSeconds = null;

  @SerializedName("mediaUri")
  private String mediaUri = null;

  @SerializedName("ttsString")
  private String ttsString = null;

  @SerializedName("uploadUri")
  private String uploadUri = null;


  /**
   * Gets or Sets uploadStatus
   */
  public enum UploadStatusEnum {
    @SerializedName("CREATED")
    CREATED("CREATED"),

    @SerializedName("UPLOADED")
    UPLOADED("UPLOADED"),

    @SerializedName("TRANSCODED")
    TRANSCODED("TRANSCODED");

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

  @SerializedName("hasDefault")
  private Boolean hasDefault = false;

  @SerializedName("languageDefault")
  private Boolean languageDefault = false;

  @SerializedName("tags")
  private Map<String, List<String>> tags = new HashMap<String, List<String>>();

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
  public String getPromptId() {
    return promptId;
  }
  public void setPromptId(String promptId) {
    this.promptId = promptId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getDurationSeconds() {
    return durationSeconds;
  }
  public void setDurationSeconds(Double durationSeconds) {
    this.durationSeconds = durationSeconds;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getMediaUri() {
    return mediaUri;
  }
  public void setMediaUri(String mediaUri) {
    this.mediaUri = mediaUri;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTtsString() {
    return ttsString;
  }
  public void setTtsString(String ttsString) {
    this.ttsString = ttsString;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getUploadUri() {
    return uploadUri;
  }
  public void setUploadUri(String uploadUri) {
    this.uploadUri = uploadUri;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public UploadStatusEnum getUploadStatus() {
    return uploadStatus;
  }
  public void setUploadStatus(UploadStatusEnum uploadStatus) {
    this.uploadStatus = uploadStatus;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getHasDefault() {
    return hasDefault;
  }
  public void setHasDefault(Boolean hasDefault) {
    this.hasDefault = hasDefault;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getLanguageDefault() {
    return languageDefault;
  }
  public void setLanguageDefault(Boolean languageDefault) {
    this.languageDefault = languageDefault;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Map<String, List<String>> getTags() {
    return tags;
  }
  public void setTags(Map<String, List<String>> tags) {
    this.tags = tags;
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
    SystemPromptAsset systemPromptAsset = (SystemPromptAsset) o;
    return Objects.equals(id, systemPromptAsset.id) &&
        Objects.equals(name, systemPromptAsset.name) &&
        Objects.equals(promptId, systemPromptAsset.promptId) &&
        Objects.equals(language, systemPromptAsset.language) &&
        Objects.equals(durationSeconds, systemPromptAsset.durationSeconds) &&
        Objects.equals(mediaUri, systemPromptAsset.mediaUri) &&
        Objects.equals(ttsString, systemPromptAsset.ttsString) &&
        Objects.equals(uploadUri, systemPromptAsset.uploadUri) &&
        Objects.equals(uploadStatus, systemPromptAsset.uploadStatus) &&
        Objects.equals(hasDefault, systemPromptAsset.hasDefault) &&
        Objects.equals(languageDefault, systemPromptAsset.languageDefault) &&
        Objects.equals(tags, systemPromptAsset.tags) &&
        Objects.equals(selfUri, systemPromptAsset.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, promptId, language, durationSeconds, mediaUri, ttsString, uploadUri, uploadStatus, hasDefault, languageDefault, tags, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemPromptAsset {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    promptId: ").append(toIndentedString(promptId)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    durationSeconds: ").append(toIndentedString(durationSeconds)).append("\n");
    sb.append("    mediaUri: ").append(toIndentedString(mediaUri)).append("\n");
    sb.append("    ttsString: ").append(toIndentedString(ttsString)).append("\n");
    sb.append("    uploadUri: ").append(toIndentedString(uploadUri)).append("\n");
    sb.append("    uploadStatus: ").append(toIndentedString(uploadStatus)).append("\n");
    sb.append("    hasDefault: ").append(toIndentedString(hasDefault)).append("\n");
    sb.append("    languageDefault: ").append(toIndentedString(languageDefault)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
