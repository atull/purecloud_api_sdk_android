package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.TimeOffRequest;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class TimeOffRequestList   {
  
  @SerializedName("timeOffRequests")
  private List<TimeOffRequest> timeOffRequests = new ArrayList<TimeOffRequest>();

  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("selfUri")
  private String selfUri = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<TimeOffRequest> getTimeOffRequests() {
    return timeOffRequests;
  }
  public void setTimeOffRequests(List<TimeOffRequest> timeOffRequests) {
    this.timeOffRequests = timeOffRequests;
  }

  /**
   * The globally unique identifier for the object.
   **/
  @ApiModelProperty(value = "The globally unique identifier for the object.")
  public String getId() {
    return id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The URI for this object
   **/
  @ApiModelProperty(value = "The URI for this object")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeOffRequestList timeOffRequestList = (TimeOffRequestList) o;
    return Objects.equals(timeOffRequests, timeOffRequestList.timeOffRequests) &&
        Objects.equals(id, timeOffRequestList.id) &&
        Objects.equals(name, timeOffRequestList.name) &&
        Objects.equals(selfUri, timeOffRequestList.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeOffRequests, id, name, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeOffRequestList {\n");
    
    sb.append("    timeOffRequests: ").append(toIndentedString(timeOffRequests)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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
