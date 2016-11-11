package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class ProvisionInfo  implements Serializable {
  
  @SerializedName("time")
  private Date time = null;

  @SerializedName("source")
  private String source = null;

  @SerializedName("errorInfo")
  private String errorInfo = null;

  /**
   * The time at which this phone was provisioned. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "The time at which this phone was provisioned. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getTime() {
    return time;
  }
  public void setTime(Date time) {
    this.time = time;
  }

  /**
   * The source of the provisioning
   **/
  @ApiModelProperty(value = "The source of the provisioning")
  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }

  /**
   * The error information from the provision process, if any
   **/
  @ApiModelProperty(value = "The error information from the provision process, if any")
  public String getErrorInfo() {
    return errorInfo;
  }
  public void setErrorInfo(String errorInfo) {
    this.errorInfo = errorInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProvisionInfo provisionInfo = (ProvisionInfo) o;
    return Objects.equals(time, provisionInfo.time) &&
        Objects.equals(source, provisionInfo.source) &&
        Objects.equals(errorInfo, provisionInfo.errorInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, source, errorInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvisionInfo {\n");
    
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
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
