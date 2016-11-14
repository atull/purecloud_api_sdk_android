package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class CallConversationNotificationFaxStatus  implements Serializable {
  
  @SerializedName("direction")
  private String direction = null;

  @SerializedName("expectedPages")
  private Integer expectedPages = null;

  @SerializedName("activePage")
  private Integer activePage = null;

  @SerializedName("linesTransmitted")
  private Integer linesTransmitted = null;

  @SerializedName("bytesTransmitted")
  private Integer bytesTransmitted = null;

  @SerializedName("dataRate")
  private Integer dataRate = null;

  @SerializedName("pageErrors")
  private Integer pageErrors = null;

  @SerializedName("lineErrors")
  private Integer lineErrors = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDirection() {
    return direction;
  }
  public void setDirection(String direction) {
    this.direction = direction;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getExpectedPages() {
    return expectedPages;
  }
  public void setExpectedPages(Integer expectedPages) {
    this.expectedPages = expectedPages;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getActivePage() {
    return activePage;
  }
  public void setActivePage(Integer activePage) {
    this.activePage = activePage;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getLinesTransmitted() {
    return linesTransmitted;
  }
  public void setLinesTransmitted(Integer linesTransmitted) {
    this.linesTransmitted = linesTransmitted;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getBytesTransmitted() {
    return bytesTransmitted;
  }
  public void setBytesTransmitted(Integer bytesTransmitted) {
    this.bytesTransmitted = bytesTransmitted;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getDataRate() {
    return dataRate;
  }
  public void setDataRate(Integer dataRate) {
    this.dataRate = dataRate;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getPageErrors() {
    return pageErrors;
  }
  public void setPageErrors(Integer pageErrors) {
    this.pageErrors = pageErrors;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getLineErrors() {
    return lineErrors;
  }
  public void setLineErrors(Integer lineErrors) {
    this.lineErrors = lineErrors;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallConversationNotificationFaxStatus callConversationNotificationFaxStatus = (CallConversationNotificationFaxStatus) o;
    return Objects.equals(direction, callConversationNotificationFaxStatus.direction) &&
        Objects.equals(expectedPages, callConversationNotificationFaxStatus.expectedPages) &&
        Objects.equals(activePage, callConversationNotificationFaxStatus.activePage) &&
        Objects.equals(linesTransmitted, callConversationNotificationFaxStatus.linesTransmitted) &&
        Objects.equals(bytesTransmitted, callConversationNotificationFaxStatus.bytesTransmitted) &&
        Objects.equals(dataRate, callConversationNotificationFaxStatus.dataRate) &&
        Objects.equals(pageErrors, callConversationNotificationFaxStatus.pageErrors) &&
        Objects.equals(lineErrors, callConversationNotificationFaxStatus.lineErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(direction, expectedPages, activePage, linesTransmitted, bytesTransmitted, dataRate, pageErrors, lineErrors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallConversationNotificationFaxStatus {\n");
    
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    expectedPages: ").append(toIndentedString(expectedPages)).append("\n");
    sb.append("    activePage: ").append(toIndentedString(activePage)).append("\n");
    sb.append("    linesTransmitted: ").append(toIndentedString(linesTransmitted)).append("\n");
    sb.append("    bytesTransmitted: ").append(toIndentedString(bytesTransmitted)).append("\n");
    sb.append("    dataRate: ").append(toIndentedString(dataRate)).append("\n");
    sb.append("    pageErrors: ").append(toIndentedString(pageErrors)).append("\n");
    sb.append("    lineErrors: ").append(toIndentedString(lineErrors)).append("\n");
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
