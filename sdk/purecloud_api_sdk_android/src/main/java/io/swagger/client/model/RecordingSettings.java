package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;





public class RecordingSettings   {
  
  @SerializedName("maxSimultaneousStreams")
  private Integer maxSimultaneousStreams = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getMaxSimultaneousStreams() {
    return maxSimultaneousStreams;
  }
  public void setMaxSimultaneousStreams(Integer maxSimultaneousStreams) {
    this.maxSimultaneousStreams = maxSimultaneousStreams;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecordingSettings recordingSettings = (RecordingSettings) o;
    return Objects.equals(maxSimultaneousStreams, recordingSettings.maxSimultaneousStreams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxSimultaneousStreams);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordingSettings {\n");
    
    sb.append("    maxSimultaneousStreams: ").append(toIndentedString(maxSimultaneousStreams)).append("\n");
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
