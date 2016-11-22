package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class CampaignTimeSlot  implements Serializable {
  
  @SerializedName("startTime")
  private String startTime = null;

  @SerializedName("stopTime")
  private String stopTime = null;

  @SerializedName("day")
  private Integer day = null;

  /**
   * interval start time as an ISO-8601 string. For example: HH:mm:ss
   **/
  @ApiModelProperty(value = "interval start time as an ISO-8601 string. For example: HH:mm:ss")
  public String getStartTime() {
    return startTime;
  }
  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  /**
   * interval stop time as an ISO-8601 string. For example: HH:mm:ss
   **/
  @ApiModelProperty(value = "interval stop time as an ISO-8601 string. For example: HH:mm:ss")
  public String getStopTime() {
    return stopTime;
  }
  public void setStopTime(String stopTime) {
    this.stopTime = stopTime;
  }

  /**
   * must be within [1-7], representing Monday through Sunday
   **/
  @ApiModelProperty(required = true, value = "must be within [1-7], representing Monday through Sunday")
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
    CampaignTimeSlot campaignTimeSlot = (CampaignTimeSlot) o;
    return Objects.equals(startTime, campaignTimeSlot.startTime) &&
        Objects.equals(stopTime, campaignTimeSlot.stopTime) &&
        Objects.equals(day, campaignTimeSlot.day);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTime, stopTime, day);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignTimeSlot {\n");
    
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
