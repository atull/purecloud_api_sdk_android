package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Queue;
import io.swagger.client.model.TimeAllowed;
import io.swagger.client.model.User;
import io.swagger.client.model.WrapupCode;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class EmailMediaPolicyConditions   {
  
  @SerializedName("forUsers")
  private List<User> forUsers = new ArrayList<User>();

  @SerializedName("dateRanges")
  private List<String> dateRanges = new ArrayList<String>();

  @SerializedName("forQueues")
  private List<Queue> forQueues = new ArrayList<Queue>();

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
  public List<String> getDateRanges() {
    return dateRanges;
  }
  public void setDateRanges(List<String> dateRanges) {
    this.dateRanges = dateRanges;
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
    EmailMediaPolicyConditions emailMediaPolicyConditions = (EmailMediaPolicyConditions) o;
    return Objects.equals(forUsers, emailMediaPolicyConditions.forUsers) &&
        Objects.equals(dateRanges, emailMediaPolicyConditions.dateRanges) &&
        Objects.equals(forQueues, emailMediaPolicyConditions.forQueues) &&
        Objects.equals(wrapupCodes, emailMediaPolicyConditions.wrapupCodes) &&
        Objects.equals(timeAllowed, emailMediaPolicyConditions.timeAllowed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(forUsers, dateRanges, forQueues, wrapupCodes, timeAllowed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailMediaPolicyConditions {\n");
    
    sb.append("    forUsers: ").append(toIndentedString(forUsers)).append("\n");
    sb.append("    dateRanges: ").append(toIndentedString(dateRanges)).append("\n");
    sb.append("    forQueues: ").append(toIndentedString(forQueues)).append("\n");
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
