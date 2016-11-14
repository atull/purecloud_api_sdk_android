package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class Wrapup  implements Serializable {
  
  @SerializedName("code")
  private String code = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("notes")
  private String notes = null;

  @SerializedName("tags")
  private List<String> tags = new ArrayList<String>();

  @SerializedName("durationSeconds")
  private Integer durationSeconds = null;

  @SerializedName("endTime")
  private Date endTime = null;

  @SerializedName("provisional")
  private Boolean provisional = false;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
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
   **/
  @ApiModelProperty(value = "")
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getTags() {
    return tags;
  }
  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getDurationSeconds() {
    return durationSeconds;
  }
  public void setDurationSeconds(Integer durationSeconds) {
    this.durationSeconds = durationSeconds;
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
  public Boolean getProvisional() {
    return provisional;
  }
  public void setProvisional(Boolean provisional) {
    this.provisional = provisional;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Wrapup wrapup = (Wrapup) o;
    return Objects.equals(code, wrapup.code) &&
        Objects.equals(name, wrapup.name) &&
        Objects.equals(notes, wrapup.notes) &&
        Objects.equals(tags, wrapup.tags) &&
        Objects.equals(durationSeconds, wrapup.durationSeconds) &&
        Objects.equals(endTime, wrapup.endTime) &&
        Objects.equals(provisional, wrapup.provisional);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name, notes, tags, durationSeconds, endTime, provisional);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Wrapup {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    durationSeconds: ").append(toIndentedString(durationSeconds)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    provisional: ").append(toIndentedString(provisional)).append("\n");
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
