package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;





public class TrunkRecordingEnabledCount   {
  
  @SerializedName("enabledCount")
  private Integer enabledCount = null;

  @SerializedName("disabledCount")
  private Integer disabledCount = null;

  /**
   * The amount of trunks that have recording enabled
   **/
  @ApiModelProperty(value = "The amount of trunks that have recording enabled")
  public Integer getEnabledCount() {
    return enabledCount;
  }
  public void setEnabledCount(Integer enabledCount) {
    this.enabledCount = enabledCount;
  }

  /**
   * The amount of trunks that do not have recording enabled
   **/
  @ApiModelProperty(value = "The amount of trunks that do not have recording enabled")
  public Integer getDisabledCount() {
    return disabledCount;
  }
  public void setDisabledCount(Integer disabledCount) {
    this.disabledCount = disabledCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrunkRecordingEnabledCount trunkRecordingEnabledCount = (TrunkRecordingEnabledCount) o;
    return Objects.equals(enabledCount, trunkRecordingEnabledCount.enabledCount) &&
        Objects.equals(disabledCount, trunkRecordingEnabledCount.disabledCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabledCount, disabledCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrunkRecordingEnabledCount {\n");
    
    sb.append("    enabledCount: ").append(toIndentedString(enabledCount)).append("\n");
    sb.append("    disabledCount: ").append(toIndentedString(disabledCount)).append("\n");
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
