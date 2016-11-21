package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.OutOfOfficeNotificationUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class OutOfOfficeNotification  implements Serializable {
  
  @SerializedName("user")
  private OutOfOfficeNotificationUser user = null;

  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("startDate")
  private Integer startDate = null;

  @SerializedName("endDate")
  private Integer endDate = null;

  @SerializedName("modifiedDate")
  private Integer modifiedDate = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public OutOfOfficeNotificationUser getUser() {
    return user;
  }
  public void setUser(OutOfOfficeNotificationUser user) {
    this.user = user;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getStartDate() {
    return startDate;
  }
  public void setStartDate(Integer startDate) {
    this.startDate = startDate;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getEndDate() {
    return endDate;
  }
  public void setEndDate(Integer endDate) {
    this.endDate = endDate;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getModifiedDate() {
    return modifiedDate;
  }
  public void setModifiedDate(Integer modifiedDate) {
    this.modifiedDate = modifiedDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutOfOfficeNotification outOfOfficeNotification = (OutOfOfficeNotification) o;
    return Objects.equals(user, outOfOfficeNotification.user) &&
        Objects.equals(active, outOfOfficeNotification.active) &&
        Objects.equals(startDate, outOfOfficeNotification.startDate) &&
        Objects.equals(endDate, outOfOfficeNotification.endDate) &&
        Objects.equals(modifiedDate, outOfOfficeNotification.modifiedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, active, startDate, endDate, modifiedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutOfOfficeNotification {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
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
