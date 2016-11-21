package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class Segment  implements Serializable {
  
  @SerializedName("startTime")
  private Date startTime = null;

  @SerializedName("endTime")
  private Date endTime = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("howEnded")
  private String howEnded = null;

  @SerializedName("disconnectType")
  private String disconnectType = null;

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getStartTime() {
    return startTime;
  }
  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getEndTime() {
    return endTime;
  }
  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getHowEnded() {
    return howEnded;
  }
  public void setHowEnded(String howEnded) {
    this.howEnded = howEnded;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDisconnectType() {
    return disconnectType;
  }
  public void setDisconnectType(String disconnectType) {
    this.disconnectType = disconnectType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Segment segment = (Segment) o;
    return Objects.equals(startTime, segment.startTime) &&
        Objects.equals(endTime, segment.endTime) &&
        Objects.equals(type, segment.type) &&
        Objects.equals(howEnded, segment.howEnded) &&
        Objects.equals(disconnectType, segment.disconnectType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTime, endTime, type, howEnded, disconnectType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Segment {\n");
    
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    howEnded: ").append(toIndentedString(howEnded)).append("\n");
    sb.append("    disconnectType: ").append(toIndentedString(disconnectType)).append("\n");
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
