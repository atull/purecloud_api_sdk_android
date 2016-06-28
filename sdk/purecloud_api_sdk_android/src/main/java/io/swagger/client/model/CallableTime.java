package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.CampaignTimeSlot;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class CallableTime   {
  
  @SerializedName("timeSlots")
  private List<CampaignTimeSlot> timeSlots = new ArrayList<CampaignTimeSlot>();

  @SerializedName("timeZoneId")
  private String timeZoneId = null;

  /**
   * intervals for which it is acceptable to place outbound calls
   **/
  @ApiModelProperty(value = "intervals for which it is acceptable to place outbound calls")
  public List<CampaignTimeSlot> getTimeSlots() {
    return timeSlots;
  }
  public void setTimeSlots(List<CampaignTimeSlot> timeSlots) {
    this.timeSlots = timeSlots;
  }

  /**
   * time zone identifier to be applied to the time slots; for example Africa/Abidjan
   **/
  @ApiModelProperty(required = true, value = "time zone identifier to be applied to the time slots; for example Africa/Abidjan")
  public String getTimeZoneId() {
    return timeZoneId;
  }
  public void setTimeZoneId(String timeZoneId) {
    this.timeZoneId = timeZoneId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallableTime callableTime = (CallableTime) o;
    return Objects.equals(timeSlots, callableTime.timeSlots) &&
        Objects.equals(timeZoneId, callableTime.timeZoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeSlots, timeZoneId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallableTime {\n");
    
    sb.append("    timeSlots: ").append(toIndentedString(timeSlots)).append("\n");
    sb.append("    timeZoneId: ").append(toIndentedString(timeZoneId)).append("\n");
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
