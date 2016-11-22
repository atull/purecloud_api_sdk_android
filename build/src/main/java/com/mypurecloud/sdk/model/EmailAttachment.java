package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class EmailAttachment  implements Serializable {
  
  @SerializedName("name")
  private String name = null;

  @SerializedName("contentPath")
  private String contentPath = null;

  @SerializedName("contentType")
  private String contentType = null;

  @SerializedName("attachmentId")
  private String attachmentId = null;

  @SerializedName("contentLength")
  private Integer contentLength = null;

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
  public String getContentPath() {
    return contentPath;
  }
  public void setContentPath(String contentPath) {
    this.contentPath = contentPath;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getContentType() {
    return contentType;
  }
  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getAttachmentId() {
    return attachmentId;
  }
  public void setAttachmentId(String attachmentId) {
    this.attachmentId = attachmentId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getContentLength() {
    return contentLength;
  }
  public void setContentLength(Integer contentLength) {
    this.contentLength = contentLength;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailAttachment emailAttachment = (EmailAttachment) o;
    return Objects.equals(name, emailAttachment.name) &&
        Objects.equals(contentPath, emailAttachment.contentPath) &&
        Objects.equals(contentType, emailAttachment.contentType) &&
        Objects.equals(attachmentId, emailAttachment.attachmentId) &&
        Objects.equals(contentLength, emailAttachment.contentLength);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, contentPath, contentType, attachmentId, contentLength);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailAttachment {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    contentPath: ").append(toIndentedString(contentPath)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    attachmentId: ").append(toIndentedString(attachmentId)).append("\n");
    sb.append("    contentLength: ").append(toIndentedString(contentLength)).append("\n");
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
