package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import com.google.gson.annotations.SerializedName;





public class EdgeAutoUpdateConfig   {
  
  @SerializedName("timeZone")
  private String timeZone = null;

  @SerializedName("rrule")
  private String rrule = null;

  @SerializedName("start")
  private Date start = null;

  @SerializedName("end")
  private Date end = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTimeZone() {
    return timeZone;
  }
  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getRrule() {
    return rrule;
  }
  public void setRrule(String rrule) {
    this.rrule = rrule;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getStart() {
    return start;
  }
  public void setStart(Date start) {
    this.start = start;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getEnd() {
    return end;
  }
  public void setEnd(Date end) {
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
    EdgeAutoUpdateConfig edgeAutoUpdateConfig = (EdgeAutoUpdateConfig) o;
    return Objects.equals(timeZone, edgeAutoUpdateConfig.timeZone) &&
        Objects.equals(rrule, edgeAutoUpdateConfig.rrule) &&
        Objects.equals(start, edgeAutoUpdateConfig.start) &&
        Objects.equals(end, edgeAutoUpdateConfig.end);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeZone, rrule, start, end);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdgeAutoUpdateConfig {\n");
    
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    rrule: ").append(toIndentedString(rrule)).append("\n");
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
