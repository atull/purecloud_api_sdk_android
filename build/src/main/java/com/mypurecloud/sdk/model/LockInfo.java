package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.UriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class LockInfo  implements Serializable {
  
  @SerializedName("lockedBy")
  private UriReference lockedBy = null;

  @SerializedName("dateCreated")
  private Date dateCreated = null;

  @SerializedName("dateExpires")
  private Date dateExpires = null;


  /**
   * Gets or Sets action
   */
  public enum ActionEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("UPDATE")
    UPDATE("UPDATE"),

    @SerializedName("DELETE")
    DELETE("DELETE"),

    @SerializedName("COPY")
    COPY("COPY"),

    @SerializedName("MOVE")
    MOVE("MOVE"),

    @SerializedName("REPLACE")
    REPLACE("REPLACE"),

    @SerializedName("THUMBNAIL")
    THUMBNAIL("THUMBNAIL"),

    @SerializedName("TEXT_EXTRACTION")
    TEXT_EXTRACTION("TEXT_EXTRACTION");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("action")
  private ActionEnum action = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public UriReference getLockedBy() {
    return lockedBy;
  }
  public void setLockedBy(UriReference lockedBy) {
    this.lockedBy = lockedBy;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getDateExpires() {
    return dateExpires;
  }
  public void setDateExpires(Date dateExpires) {
    this.dateExpires = dateExpires;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ActionEnum getAction() {
    return action;
  }
  public void setAction(ActionEnum action) {
    this.action = action;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LockInfo lockInfo = (LockInfo) o;
    return Objects.equals(lockedBy, lockInfo.lockedBy) &&
        Objects.equals(dateCreated, lockInfo.dateCreated) &&
        Objects.equals(dateExpires, lockInfo.dateExpires) &&
        Objects.equals(action, lockInfo.action);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lockedBy, dateCreated, dateExpires, action);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LockInfo {\n");
    
    sb.append("    lockedBy: ").append(toIndentedString(lockedBy)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateExpires: ").append(toIndentedString(dateExpires)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
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
