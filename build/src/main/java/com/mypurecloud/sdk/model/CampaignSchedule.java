package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.ScheduleInterval;
import com.mypurecloud.sdk.model.UriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class CampaignSchedule  implements Serializable {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("dateCreated")
  private Date dateCreated = null;

  @SerializedName("dateModified")
  private Date dateModified = null;

  @SerializedName("version")
  private Integer version = null;

  @SerializedName("intervals")
  private List<ScheduleInterval> intervals = new ArrayList<ScheduleInterval>();

  @SerializedName("timeZone")
  private String timeZone = null;

  @SerializedName("campaign")
  private UriReference campaign = null;

  @SerializedName("selfUri")
  private String selfUri = null;

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
   * Creation time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Creation time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getDateCreated() {
    return dateCreated;
  }

  /**
   * Last modified time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Last modified time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getDateModified() {
    return dateModified;
  }

  /**
   * Required for updates, must match the version number of the most recent update
   **/
  @ApiModelProperty(value = "Required for updates, must match the version number of the most recent update")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }

  /**
   * a list of start and end times
   **/
  @ApiModelProperty(required = true, value = "a list of start and end times")
  public List<ScheduleInterval> getIntervals() {
    return intervals;
  }
  public void setIntervals(List<ScheduleInterval> intervals) {
    this.intervals = intervals;
  }

  /**
   * time zone identifier to be applied to the intervals; for example Africa/Abidjan
   **/
  @ApiModelProperty(required = true, value = "time zone identifier to be applied to the intervals; for example Africa/Abidjan")
  public String getTimeZone() {
    return timeZone;
  }
  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  /**
   * identifier of the campaign to be scheduled
   **/
  @ApiModelProperty(required = true, value = "identifier of the campaign to be scheduled")
  public UriReference getCampaign() {
    return campaign;
  }
  public void setCampaign(UriReference campaign) {
    this.campaign = campaign;
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
    CampaignSchedule campaignSchedule = (CampaignSchedule) o;
    return Objects.equals(id, campaignSchedule.id) &&
        Objects.equals(name, campaignSchedule.name) &&
        Objects.equals(dateCreated, campaignSchedule.dateCreated) &&
        Objects.equals(dateModified, campaignSchedule.dateModified) &&
        Objects.equals(version, campaignSchedule.version) &&
        Objects.equals(intervals, campaignSchedule.intervals) &&
        Objects.equals(timeZone, campaignSchedule.timeZone) &&
        Objects.equals(campaign, campaignSchedule.campaign) &&
        Objects.equals(selfUri, campaignSchedule.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, version, intervals, timeZone, campaign, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignSchedule {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    intervals: ").append(toIndentedString(intervals)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
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
