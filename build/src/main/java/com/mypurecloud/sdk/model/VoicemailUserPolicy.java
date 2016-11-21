package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class VoicemailUserPolicy  implements Serializable {
  
  @SerializedName("enabled")
  private Boolean enabled = false;

  @SerializedName("alertTimeoutSeconds")
  private Integer alertTimeoutSeconds = null;

  @SerializedName("minimumRecordingTimeSeconds")
  private Integer minimumRecordingTimeSeconds = null;

  @SerializedName("maximumRecordingTimeSeconds")
  private Integer maximumRecordingTimeSeconds = null;

  @SerializedName("unavailableMessageUri")
  private String unavailableMessageUri = null;

  @SerializedName("namePromptMessageUri")
  private String namePromptMessageUri = null;

  @SerializedName("fullMessageUri")
  private String fullMessageUri = null;

  @SerializedName("pin")
  private String pin = null;

  @SerializedName("quotaSizeBytes")
  private Long quotaSizeBytes = null;

  @SerializedName("createdDate")
  private Date createdDate = null;

  @SerializedName("modifiedDate")
  private Date modifiedDate = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getAlertTimeoutSeconds() {
    return alertTimeoutSeconds;
  }
  public void setAlertTimeoutSeconds(Integer alertTimeoutSeconds) {
    this.alertTimeoutSeconds = alertTimeoutSeconds;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getMinimumRecordingTimeSeconds() {
    return minimumRecordingTimeSeconds;
  }
  public void setMinimumRecordingTimeSeconds(Integer minimumRecordingTimeSeconds) {
    this.minimumRecordingTimeSeconds = minimumRecordingTimeSeconds;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getMaximumRecordingTimeSeconds() {
    return maximumRecordingTimeSeconds;
  }
  public void setMaximumRecordingTimeSeconds(Integer maximumRecordingTimeSeconds) {
    this.maximumRecordingTimeSeconds = maximumRecordingTimeSeconds;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getUnavailableMessageUri() {
    return unavailableMessageUri;
  }
  public void setUnavailableMessageUri(String unavailableMessageUri) {
    this.unavailableMessageUri = unavailableMessageUri;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getNamePromptMessageUri() {
    return namePromptMessageUri;
  }
  public void setNamePromptMessageUri(String namePromptMessageUri) {
    this.namePromptMessageUri = namePromptMessageUri;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getFullMessageUri() {
    return fullMessageUri;
  }
  public void setFullMessageUri(String fullMessageUri) {
    this.fullMessageUri = fullMessageUri;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPin() {
    return pin;
  }
  public void setPin(String pin) {
    this.pin = pin;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getQuotaSizeBytes() {
    return quotaSizeBytes;
  }
  public void setQuotaSizeBytes(Long quotaSizeBytes) {
    this.quotaSizeBytes = quotaSizeBytes;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoicemailUserPolicy voicemailUserPolicy = (VoicemailUserPolicy) o;
    return Objects.equals(enabled, voicemailUserPolicy.enabled) &&
        Objects.equals(alertTimeoutSeconds, voicemailUserPolicy.alertTimeoutSeconds) &&
        Objects.equals(minimumRecordingTimeSeconds, voicemailUserPolicy.minimumRecordingTimeSeconds) &&
        Objects.equals(maximumRecordingTimeSeconds, voicemailUserPolicy.maximumRecordingTimeSeconds) &&
        Objects.equals(unavailableMessageUri, voicemailUserPolicy.unavailableMessageUri) &&
        Objects.equals(namePromptMessageUri, voicemailUserPolicy.namePromptMessageUri) &&
        Objects.equals(fullMessageUri, voicemailUserPolicy.fullMessageUri) &&
        Objects.equals(pin, voicemailUserPolicy.pin) &&
        Objects.equals(quotaSizeBytes, voicemailUserPolicy.quotaSizeBytes) &&
        Objects.equals(createdDate, voicemailUserPolicy.createdDate) &&
        Objects.equals(modifiedDate, voicemailUserPolicy.modifiedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, alertTimeoutSeconds, minimumRecordingTimeSeconds, maximumRecordingTimeSeconds, unavailableMessageUri, namePromptMessageUri, fullMessageUri, pin, quotaSizeBytes, createdDate, modifiedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoicemailUserPolicy {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    alertTimeoutSeconds: ").append(toIndentedString(alertTimeoutSeconds)).append("\n");
    sb.append("    minimumRecordingTimeSeconds: ").append(toIndentedString(minimumRecordingTimeSeconds)).append("\n");
    sb.append("    maximumRecordingTimeSeconds: ").append(toIndentedString(maximumRecordingTimeSeconds)).append("\n");
    sb.append("    unavailableMessageUri: ").append(toIndentedString(unavailableMessageUri)).append("\n");
    sb.append("    namePromptMessageUri: ").append(toIndentedString(namePromptMessageUri)).append("\n");
    sb.append("    fullMessageUri: ").append(toIndentedString(fullMessageUri)).append("\n");
    sb.append("    pin: ").append(toIndentedString(pin)).append("\n");
    sb.append("    quotaSizeBytes: ").append(toIndentedString(quotaSizeBytes)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
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
