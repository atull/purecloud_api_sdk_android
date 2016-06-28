package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;





public class PromptAsset   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("promptId")
  private String promptId = null;

  @SerializedName("language")
  private String language = null;

  @SerializedName("mediaUri")
  private String mediaUri = null;

  @SerializedName("ttsString")
  private String ttsString = null;

  @SerializedName("uploadStatus")
  private String uploadStatus = null;

  @SerializedName("uploadUri")
  private String uploadUri = null;

  @SerializedName("languageDefault")
  private Boolean languageDefault = false;

  @SerializedName("tags")
  private Map<String, List<String>> tags = new HashMap<String, List<String>>();

  @SerializedName("durationSeconds")
  private Double durationSeconds = null;

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
  public String getUploadStatus() {
    return uploadStatus;
  }
  public void setUploadStatus(String uploadStatus) {
    this.uploadStatus = uploadStatus;
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
   **/
  @ApiModelProperty(value = "")
  public Double getDurationSeconds() {
    return durationSeconds;
  }
  public void setDurationSeconds(Double durationSeconds) {
    this.durationSeconds = durationSeconds;
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
    PromptAsset promptAsset = (PromptAsset) o;
    return Objects.equals(id, promptAsset.id) &&
        Objects.equals(name, promptAsset.name) &&
        Objects.equals(promptId, promptAsset.promptId) &&
        Objects.equals(language, promptAsset.language) &&
        Objects.equals(mediaUri, promptAsset.mediaUri) &&
        Objects.equals(ttsString, promptAsset.ttsString) &&
        Objects.equals(uploadStatus, promptAsset.uploadStatus) &&
        Objects.equals(uploadUri, promptAsset.uploadUri) &&
        Objects.equals(languageDefault, promptAsset.languageDefault) &&
        Objects.equals(tags, promptAsset.tags) &&
        Objects.equals(durationSeconds, promptAsset.durationSeconds) &&
        Objects.equals(selfUri, promptAsset.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, promptId, language, mediaUri, ttsString, uploadStatus, uploadUri, languageDefault, tags, durationSeconds, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromptAsset {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    promptId: ").append(toIndentedString(promptId)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    mediaUri: ").append(toIndentedString(mediaUri)).append("\n");
    sb.append("    ttsString: ").append(toIndentedString(ttsString)).append("\n");
    sb.append("    uploadStatus: ").append(toIndentedString(uploadStatus)).append("\n");
    sb.append("    uploadUri: ").append(toIndentedString(uploadUri)).append("\n");
    sb.append("    languageDefault: ").append(toIndentedString(languageDefault)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    durationSeconds: ").append(toIndentedString(durationSeconds)).append("\n");
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
