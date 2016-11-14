package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class CallRecord  implements Serializable {
  
  @SerializedName("lastAttempt")
  private Date lastAttempt = null;

  @SerializedName("lastResult")
  private String lastResult = null;

  /**
   * Timestamp of the last attempt to reach this number. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Timestamp of the last attempt to reach this number. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getLastAttempt() {
    return lastAttempt;
  }

  /**
   * Result of the last attempt to reach this number
   **/
  @ApiModelProperty(value = "Result of the last attempt to reach this number")
  public String getLastResult() {
    return lastResult;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallRecord callRecord = (CallRecord) o;
    return Objects.equals(lastAttempt, callRecord.lastAttempt) &&
        Objects.equals(lastResult, callRecord.lastResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastAttempt, lastResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallRecord {\n");
    
    sb.append("    lastAttempt: ").append(toIndentedString(lastAttempt)).append("\n");
    sb.append("    lastResult: ").append(toIndentedString(lastResult)).append("\n");
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
