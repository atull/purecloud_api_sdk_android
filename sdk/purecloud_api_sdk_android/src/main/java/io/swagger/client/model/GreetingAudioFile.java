package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;





public class GreetingAudioFile   {
  
  @SerializedName("durationMilliseconds")
  private Long durationMilliseconds = null;

  @SerializedName("sizeBytes")
  private Long sizeBytes = null;

  @SerializedName("selfUri")
  private String selfUri = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getDurationMilliseconds() {
    return durationMilliseconds;
  }
  public void setDurationMilliseconds(Long durationMilliseconds) {
    this.durationMilliseconds = durationMilliseconds;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getSizeBytes() {
    return sizeBytes;
  }
  public void setSizeBytes(Long sizeBytes) {
    this.sizeBytes = sizeBytes;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSelfUri() {
    return selfUri;
  }
  public void setSelfUri(String selfUri) {
    this.selfUri = selfUri;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GreetingAudioFile greetingAudioFile = (GreetingAudioFile) o;
    return Objects.equals(durationMilliseconds, greetingAudioFile.durationMilliseconds) &&
        Objects.equals(sizeBytes, greetingAudioFile.sizeBytes) &&
        Objects.equals(selfUri, greetingAudioFile.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(durationMilliseconds, sizeBytes, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GreetingAudioFile {\n");
    
    sb.append("    durationMilliseconds: ").append(toIndentedString(durationMilliseconds)).append("\n");
    sb.append("    sizeBytes: ").append(toIndentedString(sizeBytes)).append("\n");
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
