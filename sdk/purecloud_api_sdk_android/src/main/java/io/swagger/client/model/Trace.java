package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import com.google.gson.annotations.SerializedName;





public class Trace   {
  
  @SerializedName("topic")
  private String topic = null;

  @SerializedName("timestamp")
  private Date timestamp = null;


  /**
   * Gets or Sets level
   */
  public enum LevelEnum {
    @SerializedName("ERROR")
    ERROR("ERROR"),

    @SerializedName("WARN")
    WARN("WARN"),

    @SerializedName("INFO")
    INFO("INFO"),

    @SerializedName("DEBUG")
    DEBUG("DEBUG");

    private String value;

    LevelEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("level")
  private LevelEnum level = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("details")
  private Object details = null;

  @SerializedName("timestampString")
  private String timestampString = null;

  @SerializedName("detailsString")
  private String detailsString = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTopic() {
    return topic;
  }
  public void setTopic(String topic) {
    this.topic = topic;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public LevelEnum getLevel() {
    return level;
  }
  public void setLevel(LevelEnum level) {
    this.level = level;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Object getDetails() {
    return details;
  }
  public void setDetails(Object details) {
    this.details = details;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTimestampString() {
    return timestampString;
  }
  public void setTimestampString(String timestampString) {
    this.timestampString = timestampString;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDetailsString() {
    return detailsString;
  }
  public void setDetailsString(String detailsString) {
    this.detailsString = detailsString;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Trace trace = (Trace) o;
    return Objects.equals(topic, trace.topic) &&
        Objects.equals(timestamp, trace.timestamp) &&
        Objects.equals(level, trace.level) &&
        Objects.equals(message, trace.message) &&
        Objects.equals(details, trace.details) &&
        Objects.equals(timestampString, trace.timestampString) &&
        Objects.equals(detailsString, trace.detailsString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topic, timestamp, level, message, details, timestampString, detailsString);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Trace {\n");
    
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    timestampString: ").append(toIndentedString(timestampString)).append("\n");
    sb.append("    detailsString: ").append(toIndentedString(detailsString)).append("\n");
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
