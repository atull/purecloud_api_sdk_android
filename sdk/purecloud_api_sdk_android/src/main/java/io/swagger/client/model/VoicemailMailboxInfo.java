package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.VoicemailUserPolicy;
import java.util.Date;

import com.google.gson.annotations.SerializedName;





public class VoicemailMailboxInfo   {
  
  @SerializedName("usageSizeBytes")
  private Long usageSizeBytes = null;

  @SerializedName("totalCount")
  private Integer totalCount = null;

  @SerializedName("unreadCount")
  private Integer unreadCount = null;

  @SerializedName("voicemailPolicy")
  private VoicemailUserPolicy voicemailPolicy = null;

  @SerializedName("createdDate")
  private Date createdDate = null;

  @SerializedName("modifiedDate")
  private Date modifiedDate = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getUsageSizeBytes() {
    return usageSizeBytes;
  }
  public void setUsageSizeBytes(Long usageSizeBytes) {
    this.usageSizeBytes = usageSizeBytes;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getTotalCount() {
    return totalCount;
  }
  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getUnreadCount() {
    return unreadCount;
  }
  public void setUnreadCount(Integer unreadCount) {
    this.unreadCount = unreadCount;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public VoicemailUserPolicy getVoicemailPolicy() {
    return voicemailPolicy;
  }
  public void setVoicemailPolicy(VoicemailUserPolicy voicemailPolicy) {
    this.voicemailPolicy = voicemailPolicy;
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
    VoicemailMailboxInfo voicemailMailboxInfo = (VoicemailMailboxInfo) o;
    return Objects.equals(usageSizeBytes, voicemailMailboxInfo.usageSizeBytes) &&
        Objects.equals(totalCount, voicemailMailboxInfo.totalCount) &&
        Objects.equals(unreadCount, voicemailMailboxInfo.unreadCount) &&
        Objects.equals(voicemailPolicy, voicemailMailboxInfo.voicemailPolicy) &&
        Objects.equals(createdDate, voicemailMailboxInfo.createdDate) &&
        Objects.equals(modifiedDate, voicemailMailboxInfo.modifiedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usageSizeBytes, totalCount, unreadCount, voicemailPolicy, createdDate, modifiedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoicemailMailboxInfo {\n");
    
    sb.append("    usageSizeBytes: ").append(toIndentedString(usageSizeBytes)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    unreadCount: ").append(toIndentedString(unreadCount)).append("\n");
    sb.append("    voicemailPolicy: ").append(toIndentedString(voicemailPolicy)).append("\n");
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
