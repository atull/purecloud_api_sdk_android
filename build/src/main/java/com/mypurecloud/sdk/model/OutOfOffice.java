package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class OutOfOffice  implements Serializable {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("user")
  private User user = null;

  @SerializedName("startDate")
  private Date startDate = null;

  @SerializedName("endDate")
  private Date endDate = null;

  @SerializedName("active")
  private Boolean active = false;

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
   **/
  @ApiModelProperty(value = "")
  public User getUser() {
    return user;
  }
  public void setUser(User user) {
    this.user = user;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getEndDate() {
    return endDate;
  }
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
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
    OutOfOffice outOfOffice = (OutOfOffice) o;
    return Objects.equals(id, outOfOffice.id) &&
        Objects.equals(name, outOfOffice.name) &&
        Objects.equals(user, outOfOffice.user) &&
        Objects.equals(startDate, outOfOffice.startDate) &&
        Objects.equals(endDate, outOfOffice.endDate) &&
        Objects.equals(active, outOfOffice.active) &&
        Objects.equals(selfUri, outOfOffice.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, user, startDate, endDate, active, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutOfOffice {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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
