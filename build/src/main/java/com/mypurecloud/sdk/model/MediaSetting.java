package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.ServiceLevel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class MediaSetting  implements Serializable {
  
  @SerializedName("alertingTimeoutSeconds")
  private Integer alertingTimeoutSeconds = null;

  @SerializedName("serviceLevel")
  private ServiceLevel serviceLevel = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getAlertingTimeoutSeconds() {
    return alertingTimeoutSeconds;
  }
  public void setAlertingTimeoutSeconds(Integer alertingTimeoutSeconds) {
    this.alertingTimeoutSeconds = alertingTimeoutSeconds;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ServiceLevel getServiceLevel() {
    return serviceLevel;
  }
  public void setServiceLevel(ServiceLevel serviceLevel) {
    this.serviceLevel = serviceLevel;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaSetting mediaSetting = (MediaSetting) o;
    return Objects.equals(alertingTimeoutSeconds, mediaSetting.alertingTimeoutSeconds) &&
        Objects.equals(serviceLevel, mediaSetting.serviceLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertingTimeoutSeconds, serviceLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaSetting {\n");
    
    sb.append("    alertingTimeoutSeconds: ").append(toIndentedString(alertingTimeoutSeconds)).append("\n");
    sb.append("    serviceLevel: ").append(toIndentedString(serviceLevel)).append("\n");
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
