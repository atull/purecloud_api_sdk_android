package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.DocumentThumbnail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class DownloadResponse  implements Serializable {
  
  @SerializedName("contentLocationUri")
  private String contentLocationUri = null;

  @SerializedName("imageUri")
  private String imageUri = null;

  @SerializedName("thumbnails")
  private List<DocumentThumbnail> thumbnails = new ArrayList<DocumentThumbnail>();

  /**
   **/
  @ApiModelProperty(value = "")
  public String getContentLocationUri() {
    return contentLocationUri;
  }
  public void setContentLocationUri(String contentLocationUri) {
    this.contentLocationUri = contentLocationUri;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getImageUri() {
    return imageUri;
  }
  public void setImageUri(String imageUri) {
    this.imageUri = imageUri;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<DocumentThumbnail> getThumbnails() {
    return thumbnails;
  }
  public void setThumbnails(List<DocumentThumbnail> thumbnails) {
    this.thumbnails = thumbnails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DownloadResponse downloadResponse = (DownloadResponse) o;
    return Objects.equals(contentLocationUri, downloadResponse.contentLocationUri) &&
        Objects.equals(imageUri, downloadResponse.imageUri) &&
        Objects.equals(thumbnails, downloadResponse.thumbnails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentLocationUri, imageUri, thumbnails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DownloadResponse {\n");
    
    sb.append("    contentLocationUri: ").append(toIndentedString(contentLocationUri)).append("\n");
    sb.append("    imageUri: ").append(toIndentedString(imageUri)).append("\n");
    sb.append("    thumbnails: ").append(toIndentedString(thumbnails)).append("\n");
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
