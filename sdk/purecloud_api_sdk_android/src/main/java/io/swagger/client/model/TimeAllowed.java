package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.TimeSlot;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class TimeAllowed   {
  
  @SerializedName("timeSlots")
  private List<TimeSlot> timeSlots = new ArrayList<TimeSlot>();

  @SerializedName("timeZoneId")
  private String timeZoneId = null;

  @SerializedName("empty")
  private Boolean empty = false;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<TimeSlot> getTimeSlots() {
    return timeSlots;
  }
  public void setTimeSlots(List<TimeSlot> timeSlots) {
    this.timeSlots = timeSlots;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTimeZoneId() {
    return timeZoneId;
  }
  public void setTimeZoneId(String timeZoneId) {
    this.timeZoneId = timeZoneId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getEmpty() {
    return empty;
  }
  public void setEmpty(Boolean empty) {
    this.empty = empty;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeAllowed timeAllowed = (TimeAllowed) o;
    return Objects.equals(timeSlots, timeAllowed.timeSlots) &&
        Objects.equals(timeZoneId, timeAllowed.timeZoneId) &&
        Objects.equals(empty, timeAllowed.empty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeSlots, timeZoneId, empty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeAllowed {\n");
    
    sb.append("    timeSlots: ").append(toIndentedString(timeSlots)).append("\n");
    sb.append("    timeZoneId: ").append(toIndentedString(timeZoneId)).append("\n");
    sb.append("    empty: ").append(toIndentedString(empty)).append("\n");
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
