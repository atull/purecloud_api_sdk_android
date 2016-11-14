package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class Attachment  implements Serializable {
  
  @SerializedName("attachmentId")
  private String attachmentId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("contentUri")
  private String contentUri = null;

  @SerializedName("contentType")
  private String contentType = null;

  @SerializedName("contentLength")
  private Integer contentLength = null;

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
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getContentUri() {
    return contentUri;
  }
  public void setContentUri(String contentUri) {
    this.contentUri = contentUri;
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
    Attachment attachment = (Attachment) o;
    return Objects.equals(attachmentId, attachment.attachmentId) &&
        Objects.equals(name, attachment.name) &&
        Objects.equals(contentUri, attachment.contentUri) &&
        Objects.equals(contentType, attachment.contentType) &&
        Objects.equals(contentLength, attachment.contentLength);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachmentId, name, contentUri, contentType, contentLength);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attachment {\n");
    
    sb.append("    attachmentId: ").append(toIndentedString(attachmentId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    contentUri: ").append(toIndentedString(contentUri)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
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
