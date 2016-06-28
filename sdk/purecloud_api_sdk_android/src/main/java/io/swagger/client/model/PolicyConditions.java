package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.DurationCondition;
import io.swagger.client.model.Queue;
import io.swagger.client.model.TimeAllowed;
import io.swagger.client.model.User;
import io.swagger.client.model.WrapupCode;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class PolicyConditions   {
  
  @SerializedName("forUsers")
  private List<User> forUsers = new ArrayList<User>();


  /**
   * Gets or Sets directions
   */
  public enum DirectionsEnum {
    @SerializedName("INBOUND")
    INBOUND("INBOUND"),

    @SerializedName("OUTBOUND")
    OUTBOUND("OUTBOUND");

    private String value;

    DirectionsEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("directions")
  private List<DirectionsEnum> directions = new ArrayList<DirectionsEnum>();

  @SerializedName("dateRanges")
  private List<String> dateRanges = new ArrayList<String>();


  /**
   * Gets or Sets mediaTypes
   */
  public enum MediaTypesEnum {
    @SerializedName("CALL")
    CALL("CALL"),

    @SerializedName("CHAT")
    CHAT("CHAT");

    private String value;

    MediaTypesEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("mediaTypes")
  private List<MediaTypesEnum> mediaTypes = new ArrayList<MediaTypesEnum>();

  @SerializedName("forQueues")
  private List<Queue> forQueues = new ArrayList<Queue>();

  @SerializedName("duration")
  private DurationCondition duration = null;

  @SerializedName("wrapupCodes")
  private List<WrapupCode> wrapupCodes = new ArrayList<WrapupCode>();

  @SerializedName("timeAllowed")
  private TimeAllowed timeAllowed = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<User> getForUsers() {
    return forUsers;
  }
  public void setForUsers(List<User> forUsers) {
    this.forUsers = forUsers;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<DirectionsEnum> getDirections() {
    return directions;
  }
  public void setDirections(List<DirectionsEnum> directions) {
    this.directions = directions;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getDateRanges() {
    return dateRanges;
  }
  public void setDateRanges(List<String> dateRanges) {
    this.dateRanges = dateRanges;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<MediaTypesEnum> getMediaTypes() {
    return mediaTypes;
  }
  public void setMediaTypes(List<MediaTypesEnum> mediaTypes) {
    this.mediaTypes = mediaTypes;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Queue> getForQueues() {
    return forQueues;
  }
  public void setForQueues(List<Queue> forQueues) {
    this.forQueues = forQueues;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public DurationCondition getDuration() {
    return duration;
  }
  public void setDuration(DurationCondition duration) {
    this.duration = duration;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<WrapupCode> getWrapupCodes() {
    return wrapupCodes;
  }
  public void setWrapupCodes(List<WrapupCode> wrapupCodes) {
    this.wrapupCodes = wrapupCodes;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TimeAllowed getTimeAllowed() {
    return timeAllowed;
  }
  public void setTimeAllowed(TimeAllowed timeAllowed) {
    this.timeAllowed = timeAllowed;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolicyConditions policyConditions = (PolicyConditions) o;
    return Objects.equals(forUsers, policyConditions.forUsers) &&
        Objects.equals(directions, policyConditions.directions) &&
        Objects.equals(dateRanges, policyConditions.dateRanges) &&
        Objects.equals(mediaTypes, policyConditions.mediaTypes) &&
        Objects.equals(forQueues, policyConditions.forQueues) &&
        Objects.equals(duration, policyConditions.duration) &&
        Objects.equals(wrapupCodes, policyConditions.wrapupCodes) &&
        Objects.equals(timeAllowed, policyConditions.timeAllowed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(forUsers, directions, dateRanges, mediaTypes, forQueues, duration, wrapupCodes, timeAllowed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyConditions {\n");
    
    sb.append("    forUsers: ").append(toIndentedString(forUsers)).append("\n");
    sb.append("    directions: ").append(toIndentedString(directions)).append("\n");
    sb.append("    dateRanges: ").append(toIndentedString(dateRanges)).append("\n");
    sb.append("    mediaTypes: ").append(toIndentedString(mediaTypes)).append("\n");
    sb.append("    forQueues: ").append(toIndentedString(forQueues)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    wrapupCodes: ").append(toIndentedString(wrapupCodes)).append("\n");
    sb.append("    timeAllowed: ").append(toIndentedString(timeAllowed)).append("\n");
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
