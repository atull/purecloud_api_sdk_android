package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class ReportRunEntry  implements Serializable {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("reportId")
  private String reportId = null;

  @SerializedName("runTime")
  private Date runTime = null;


  /**
   * Gets or Sets runStatus
   */
  public enum RunStatusEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("RUNNING")
    RUNNING("RUNNING"),

    @SerializedName("COMPLETED")
    COMPLETED("COMPLETED"),

    @SerializedName("COMPLETED_WITH_ERRORS")
    COMPLETED_WITH_ERRORS("COMPLETED_WITH_ERRORS");

    private String value;

    RunStatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("runStatus")
  private RunStatusEnum runStatus = null;

  @SerializedName("errorMessage")
  private String errorMessage = null;

  @SerializedName("runDurationMsec")
  private Long runDurationMsec = null;

  @SerializedName("reportUrl")
  private String reportUrl = null;

  @SerializedName("reportFormat")
  private String reportFormat = null;

  @SerializedName("scheduleUri")
  private String scheduleUri = null;

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
  public String getReportId() {
    return reportId;
  }
  public void setReportId(String reportId) {
    this.reportId = reportId;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getRunTime() {
    return runTime;
  }
  public void setRunTime(Date runTime) {
    this.runTime = runTime;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public RunStatusEnum getRunStatus() {
    return runStatus;
  }
  public void setRunStatus(RunStatusEnum runStatus) {
    this.runStatus = runStatus;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getErrorMessage() {
    return errorMessage;
  }
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getRunDurationMsec() {
    return runDurationMsec;
  }
  public void setRunDurationMsec(Long runDurationMsec) {
    this.runDurationMsec = runDurationMsec;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getReportUrl() {
    return reportUrl;
  }
  public void setReportUrl(String reportUrl) {
    this.reportUrl = reportUrl;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getReportFormat() {
    return reportFormat;
  }
  public void setReportFormat(String reportFormat) {
    this.reportFormat = reportFormat;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getScheduleUri() {
    return scheduleUri;
  }
  public void setScheduleUri(String scheduleUri) {
    this.scheduleUri = scheduleUri;
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
    ReportRunEntry reportRunEntry = (ReportRunEntry) o;
    return Objects.equals(id, reportRunEntry.id) &&
        Objects.equals(name, reportRunEntry.name) &&
        Objects.equals(reportId, reportRunEntry.reportId) &&
        Objects.equals(runTime, reportRunEntry.runTime) &&
        Objects.equals(runStatus, reportRunEntry.runStatus) &&
        Objects.equals(errorMessage, reportRunEntry.errorMessage) &&
        Objects.equals(runDurationMsec, reportRunEntry.runDurationMsec) &&
        Objects.equals(reportUrl, reportRunEntry.reportUrl) &&
        Objects.equals(reportFormat, reportRunEntry.reportFormat) &&
        Objects.equals(scheduleUri, reportRunEntry.scheduleUri) &&
        Objects.equals(selfUri, reportRunEntry.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, reportId, runTime, runStatus, errorMessage, runDurationMsec, reportUrl, reportFormat, scheduleUri, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportRunEntry {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
    sb.append("    runTime: ").append(toIndentedString(runTime)).append("\n");
    sb.append("    runStatus: ").append(toIndentedString(runStatus)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    runDurationMsec: ").append(toIndentedString(runDurationMsec)).append("\n");
    sb.append("    reportUrl: ").append(toIndentedString(reportUrl)).append("\n");
    sb.append("    reportFormat: ").append(toIndentedString(reportFormat)).append("\n");
    sb.append("    scheduleUri: ").append(toIndentedString(scheduleUri)).append("\n");
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
