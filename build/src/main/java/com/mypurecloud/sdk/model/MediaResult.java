package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class MediaResult  implements Serializable {
  
  @SerializedName("mediaUri")
  private String mediaUri = null;

  @SerializedName("waveformData")
  private List<Float> waveformData = new ArrayList<Float>();

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
  public List<Float> getWaveformData() {
    return waveformData;
  }
  public void setWaveformData(List<Float> waveformData) {
    this.waveformData = waveformData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaResult mediaResult = (MediaResult) o;
    return Objects.equals(mediaUri, mediaResult.mediaUri) &&
        Objects.equals(waveformData, mediaResult.waveformData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaUri, waveformData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaResult {\n");
    
    sb.append("    mediaUri: ").append(toIndentedString(mediaUri)).append("\n");
    sb.append("    waveformData: ").append(toIndentedString(waveformData)).append("\n");
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
