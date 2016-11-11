package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class FaxStatus  implements Serializable {
  
  @SerializedName("direction")
  private String direction = null;

  @SerializedName("expectedPages")
  private Long expectedPages = null;

  @SerializedName("activePage")
  private Long activePage = null;

  @SerializedName("linesTransmitted")
  private Long linesTransmitted = null;

  @SerializedName("bytesTransmitted")
  private Long bytesTransmitted = null;

  @SerializedName("baudRate")
  private Long baudRate = null;

  @SerializedName("pageErrors")
  private Long pageErrors = null;

  @SerializedName("lineErrors")
  private Long lineErrors = null;

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
  public Long getExpectedPages() {
    return expectedPages;
  }
  public void setExpectedPages(Long expectedPages) {
    this.expectedPages = expectedPages;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getActivePage() {
    return activePage;
  }
  public void setActivePage(Long activePage) {
    this.activePage = activePage;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getLinesTransmitted() {
    return linesTransmitted;
  }
  public void setLinesTransmitted(Long linesTransmitted) {
    this.linesTransmitted = linesTransmitted;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getBytesTransmitted() {
    return bytesTransmitted;
  }
  public void setBytesTransmitted(Long bytesTransmitted) {
    this.bytesTransmitted = bytesTransmitted;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getBaudRate() {
    return baudRate;
  }
  public void setBaudRate(Long baudRate) {
    this.baudRate = baudRate;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getPageErrors() {
    return pageErrors;
  }
  public void setPageErrors(Long pageErrors) {
    this.pageErrors = pageErrors;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getLineErrors() {
    return lineErrors;
  }
  public void setLineErrors(Long lineErrors) {
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
    FaxStatus faxStatus = (FaxStatus) o;
    return Objects.equals(direction, faxStatus.direction) &&
        Objects.equals(expectedPages, faxStatus.expectedPages) &&
        Objects.equals(activePage, faxStatus.activePage) &&
        Objects.equals(linesTransmitted, faxStatus.linesTransmitted) &&
        Objects.equals(bytesTransmitted, faxStatus.bytesTransmitted) &&
        Objects.equals(baudRate, faxStatus.baudRate) &&
        Objects.equals(pageErrors, faxStatus.pageErrors) &&
        Objects.equals(lineErrors, faxStatus.lineErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(direction, expectedPages, activePage, linesTransmitted, bytesTransmitted, baudRate, pageErrors, lineErrors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaxStatus {\n");
    
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    expectedPages: ").append(toIndentedString(expectedPages)).append("\n");
    sb.append("    activePage: ").append(toIndentedString(activePage)).append("\n");
    sb.append("    linesTransmitted: ").append(toIndentedString(linesTransmitted)).append("\n");
    sb.append("    bytesTransmitted: ").append(toIndentedString(bytesTransmitted)).append("\n");
    sb.append("    baudRate: ").append(toIndentedString(baudRate)).append("\n");
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
