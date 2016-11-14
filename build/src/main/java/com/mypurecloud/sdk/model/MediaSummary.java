package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.MediaSummaryDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class MediaSummary  implements Serializable {
  
  @SerializedName("contactCenter")
  private MediaSummaryDetail contactCenter = null;

  @SerializedName("enterprise")
  private MediaSummaryDetail enterprise = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public MediaSummaryDetail getContactCenter() {
    return contactCenter;
  }
  public void setContactCenter(MediaSummaryDetail contactCenter) {
    this.contactCenter = contactCenter;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public MediaSummaryDetail getEnterprise() {
    return enterprise;
  }
  public void setEnterprise(MediaSummaryDetail enterprise) {
    this.enterprise = enterprise;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaSummary mediaSummary = (MediaSummary) o;
    return Objects.equals(contactCenter, mediaSummary.contactCenter) &&
        Objects.equals(enterprise, mediaSummary.enterprise);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactCenter, enterprise);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaSummary {\n");
    
    sb.append("    contactCenter: ").append(toIndentedString(contactCenter)).append("\n");
    sb.append("    enterprise: ").append(toIndentedString(enterprise)).append("\n");
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
