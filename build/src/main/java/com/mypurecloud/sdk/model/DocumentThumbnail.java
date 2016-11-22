package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class DocumentThumbnail  implements Serializable {
  
  @SerializedName("resolution")
  private String resolution = null;

  @SerializedName("imageUri")
  private String imageUri = null;

  @SerializedName("height")
  private Integer height = null;

  @SerializedName("width")
  private Integer width = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getResolution() {
    return resolution;
  }
  public void setResolution(String resolution) {
    this.resolution = resolution;
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
  public Integer getHeight() {
    return height;
  }
  public void setHeight(Integer height) {
    this.height = height;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getWidth() {
    return width;
  }
  public void setWidth(Integer width) {
    this.width = width;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentThumbnail documentThumbnail = (DocumentThumbnail) o;
    return Objects.equals(resolution, documentThumbnail.resolution) &&
        Objects.equals(imageUri, documentThumbnail.imageUri) &&
        Objects.equals(height, documentThumbnail.height) &&
        Objects.equals(width, documentThumbnail.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resolution, imageUri, height, width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentThumbnail {\n");
    
    sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
    sb.append("    imageUri: ").append(toIndentedString(imageUri)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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
