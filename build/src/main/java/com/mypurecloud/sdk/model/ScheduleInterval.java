package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class ScheduleInterval  implements Serializable {
  
  @SerializedName("start")
  private String start = null;

  @SerializedName("end")
  private String end = null;

  /**
   * scheduled start time represented as an ISO-8601 string; for example, yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "scheduled start time represented as an ISO-8601 string; for example, yyyy-MM-ddTHH:mm:ss.SSSZ")
  public String getStart() {
    return start;
  }
  public void setStart(String start) {
    this.start = start;
  }

  /**
   * scheduled end time represented as an ISO-8601 string; for example, yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "scheduled end time represented as an ISO-8601 string; for example, yyyy-MM-ddTHH:mm:ss.SSSZ")
  public String getEnd() {
    return end;
  }
  public void setEnd(String end) {
    this.end = end;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleInterval scheduleInterval = (ScheduleInterval) o;
    return Objects.equals(start, scheduleInterval.start) &&
        Objects.equals(end, scheduleInterval.end);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleInterval {\n");
    
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
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
