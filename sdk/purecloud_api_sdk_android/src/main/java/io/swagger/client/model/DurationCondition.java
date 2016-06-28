package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;





public class DurationCondition   {
  

  /**
   * Gets or Sets durationTarget
   */
  public enum DurationTargetEnum {
    @SerializedName("DURATION")
    DURATION("DURATION"),

    @SerializedName("DURATION_RANGE")
    DURATION_RANGE("DURATION_RANGE");

    private String value;

    DurationTargetEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("durationTarget")
  private DurationTargetEnum durationTarget = null;

  @SerializedName("durationOperator")
  private String durationOperator = null;

  @SerializedName("durationRange")
  private String durationRange = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public DurationTargetEnum getDurationTarget() {
    return durationTarget;
  }
  public void setDurationTarget(DurationTargetEnum durationTarget) {
    this.durationTarget = durationTarget;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDurationOperator() {
    return durationOperator;
  }
  public void setDurationOperator(String durationOperator) {
    this.durationOperator = durationOperator;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDurationRange() {
    return durationRange;
  }
  public void setDurationRange(String durationRange) {
    this.durationRange = durationRange;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DurationCondition durationCondition = (DurationCondition) o;
    return Objects.equals(durationTarget, durationCondition.durationTarget) &&
        Objects.equals(durationOperator, durationCondition.durationOperator) &&
        Objects.equals(durationRange, durationCondition.durationRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(durationTarget, durationOperator, durationRange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DurationCondition {\n");
    
    sb.append("    durationTarget: ").append(toIndentedString(durationTarget)).append("\n");
    sb.append("    durationOperator: ").append(toIndentedString(durationOperator)).append("\n");
    sb.append("    durationRange: ").append(toIndentedString(durationRange)).append("\n");
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
