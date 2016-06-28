package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.PINConfiguration;
import java.util.Date;

import com.google.gson.annotations.SerializedName;





public class VoicemailOrganizationPolicy   {
  
  @SerializedName("enabled")
  private Boolean enabled = false;

  @SerializedName("retentionTimeDays")
  private Integer retentionTimeDays = null;

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

  @SerializedName("compressSilence")
  private Boolean compressSilence = false;

  @SerializedName("pinConfiguration")
  private PINConfiguration pinConfiguration = null;

  @SerializedName("quotaSizeBytes")
  private Long quotaSizeBytes = null;

  @SerializedName("createdDate")
  private Date createdDate = null;

  @SerializedName("modifiedDate")
  private Date modifiedDate = null;

  @SerializedName("voicemailExtension")
  private String voicemailExtension = null;

  @SerializedName("pinRequired")
  private Boolean pinRequired = false;

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
  public Integer getRetentionTimeDays() {
    return retentionTimeDays;
  }
  public void setRetentionTimeDays(Integer retentionTimeDays) {
    this.retentionTimeDays = retentionTimeDays;
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
  public Boolean getCompressSilence() {
    return compressSilence;
  }
  public void setCompressSilence(Boolean compressSilence) {
    this.compressSilence = compressSilence;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public PINConfiguration getPinConfiguration() {
    return pinConfiguration;
  }
  public void setPinConfiguration(PINConfiguration pinConfiguration) {
    this.pinConfiguration = pinConfiguration;
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

  /**
   * The extension for voicemail retrieval.  The default value is *86.
   **/
  @ApiModelProperty(value = "The extension for voicemail retrieval.  The default value is *86.")
  public String getVoicemailExtension() {
    return voicemailExtension;
  }
  public void setVoicemailExtension(String voicemailExtension) {
    this.voicemailExtension = voicemailExtension;
  }

  /**
   * If this is true, a PIN is required when accessing a user's voicemail from a phone.
   **/
  @ApiModelProperty(value = "If this is true, a PIN is required when accessing a user's voicemail from a phone.")
  public Boolean getPinRequired() {
    return pinRequired;
  }
  public void setPinRequired(Boolean pinRequired) {
    this.pinRequired = pinRequired;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoicemailOrganizationPolicy voicemailOrganizationPolicy = (VoicemailOrganizationPolicy) o;
    return Objects.equals(enabled, voicemailOrganizationPolicy.enabled) &&
        Objects.equals(retentionTimeDays, voicemailOrganizationPolicy.retentionTimeDays) &&
        Objects.equals(alertTimeoutSeconds, voicemailOrganizationPolicy.alertTimeoutSeconds) &&
        Objects.equals(minimumRecordingTimeSeconds, voicemailOrganizationPolicy.minimumRecordingTimeSeconds) &&
        Objects.equals(maximumRecordingTimeSeconds, voicemailOrganizationPolicy.maximumRecordingTimeSeconds) &&
        Objects.equals(unavailableMessageUri, voicemailOrganizationPolicy.unavailableMessageUri) &&
        Objects.equals(namePromptMessageUri, voicemailOrganizationPolicy.namePromptMessageUri) &&
        Objects.equals(fullMessageUri, voicemailOrganizationPolicy.fullMessageUri) &&
        Objects.equals(compressSilence, voicemailOrganizationPolicy.compressSilence) &&
        Objects.equals(pinConfiguration, voicemailOrganizationPolicy.pinConfiguration) &&
        Objects.equals(quotaSizeBytes, voicemailOrganizationPolicy.quotaSizeBytes) &&
        Objects.equals(createdDate, voicemailOrganizationPolicy.createdDate) &&
        Objects.equals(modifiedDate, voicemailOrganizationPolicy.modifiedDate) &&
        Objects.equals(voicemailExtension, voicemailOrganizationPolicy.voicemailExtension) &&
        Objects.equals(pinRequired, voicemailOrganizationPolicy.pinRequired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, retentionTimeDays, alertTimeoutSeconds, minimumRecordingTimeSeconds, maximumRecordingTimeSeconds, unavailableMessageUri, namePromptMessageUri, fullMessageUri, compressSilence, pinConfiguration, quotaSizeBytes, createdDate, modifiedDate, voicemailExtension, pinRequired);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoicemailOrganizationPolicy {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    retentionTimeDays: ").append(toIndentedString(retentionTimeDays)).append("\n");
    sb.append("    alertTimeoutSeconds: ").append(toIndentedString(alertTimeoutSeconds)).append("\n");
    sb.append("    minimumRecordingTimeSeconds: ").append(toIndentedString(minimumRecordingTimeSeconds)).append("\n");
    sb.append("    maximumRecordingTimeSeconds: ").append(toIndentedString(maximumRecordingTimeSeconds)).append("\n");
    sb.append("    unavailableMessageUri: ").append(toIndentedString(unavailableMessageUri)).append("\n");
    sb.append("    namePromptMessageUri: ").append(toIndentedString(namePromptMessageUri)).append("\n");
    sb.append("    fullMessageUri: ").append(toIndentedString(fullMessageUri)).append("\n");
    sb.append("    compressSilence: ").append(toIndentedString(compressSilence)).append("\n");
    sb.append("    pinConfiguration: ").append(toIndentedString(pinConfiguration)).append("\n");
    sb.append("    quotaSizeBytes: ").append(toIndentedString(quotaSizeBytes)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    voicemailExtension: ").append(toIndentedString(voicemailExtension)).append("\n");
    sb.append("    pinRequired: ").append(toIndentedString(pinRequired)).append("\n");
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
