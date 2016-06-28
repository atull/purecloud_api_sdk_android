package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;





public class TimeSlot   {
  
  @SerializedName("startTime")
  private String startTime = null;

  @SerializedName("stopTime")
  private String stopTime = null;

  @SerializedName("day")
  private Integer day = null;

  /**
   * start time in xx:xx:xx.xxx format
   **/
  @ApiModelProperty(value = "start time in xx:xx:xx.xxx format")
  public String getStartTime() {
    return startTime;
  }
  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  /**
   * stop time in xx:xx:xx.xxx format
   **/
  @ApiModelProperty(value = "stop time in xx:xx:xx.xxx format")
  public String getStopTime() {
    return stopTime;
  }
  public void setStopTime(String stopTime) {
    this.stopTime = stopTime;
  }

  /**
   * Day for this time slot, Monday = 1 ... Sunday = 7
   **/
  @ApiModelProperty(value = "Day for this time slot, Monday = 1 ... Sunday = 7")
  public Integer getDay() {
    return day;
  }
  public void setDay(Integer day) {
    this.day = day;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeSlot timeSlot = (TimeSlot) o;
    return Objects.equals(startTime, timeSlot.startTime) &&
        Objects.equals(stopTime, timeSlot.stopTime) &&
        Objects.equals(day, timeSlot.day);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTime, stopTime, day);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeSlot {\n");
    
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    stopTime: ").append(toIndentedString(stopTime)).append("\n");
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
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
