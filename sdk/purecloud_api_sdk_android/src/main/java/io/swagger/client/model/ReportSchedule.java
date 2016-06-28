package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ReportRunEntry;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;





public class ReportSchedule   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("quartzCronExpression")
  private String quartzCronExpression = null;

  @SerializedName("nextFireTime")
  private Date nextFireTime = null;

  @SerializedName("dateCreated")
  private Date dateCreated = null;

  @SerializedName("dateModified")
  private Date dateModified = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("timeZone")
  private String timeZone = null;

  @SerializedName("timePeriod")
  private String timePeriod = null;

  @SerializedName("interval")
  private String interval = null;

  @SerializedName("reportFormat")
  private String reportFormat = null;

  @SerializedName("locale")
  private String locale = null;

  @SerializedName("enabled")
  private Boolean enabled = false;

  @SerializedName("reportId")
  private String reportId = null;

  @SerializedName("parameters")
  private Map<String, Object> parameters = new HashMap<String, Object>();

  @SerializedName("lastRun")
  private ReportRunEntry lastRun = null;

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
   * Quartz Cron Expression
   **/
  @ApiModelProperty(required = true, value = "Quartz Cron Expression")
  public String getQuartzCronExpression() {
    return quartzCronExpression;
  }
  public void setQuartzCronExpression(String quartzCronExpression) {
    this.quartzCronExpression = quartzCronExpression;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getNextFireTime() {
    return nextFireTime;
  }
  public void setNextFireTime(Date nextFireTime) {
    this.nextFireTime = nextFireTime;
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
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTimeZone() {
    return timeZone;
  }
  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTimePeriod() {
    return timePeriod;
  }
  public void setTimePeriod(String timePeriod) {
    this.timePeriod = timePeriod;
  }

  /**
   * Interval. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss
   **/
  @ApiModelProperty(value = "Interval. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss")
  public String getInterval() {
    return interval;
  }
  public void setInterval(String interval) {
    this.interval = interval;
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
  public String getLocale() {
    return locale;
  }
  public void setLocale(String locale) {
    this.locale = locale;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  /**
   * Report ID
   **/
  @ApiModelProperty(required = true, value = "Report ID")
  public String getReportId() {
    return reportId;
  }
  public void setReportId(String reportId) {
    this.reportId = reportId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Map<String, Object> getParameters() {
    return parameters;
  }
  public void setParameters(Map<String, Object> parameters) {
    this.parameters = parameters;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ReportRunEntry getLastRun() {
    return lastRun;
  }
  public void setLastRun(ReportRunEntry lastRun) {
    this.lastRun = lastRun;
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
    ReportSchedule reportSchedule = (ReportSchedule) o;
    return Objects.equals(id, reportSchedule.id) &&
        Objects.equals(name, reportSchedule.name) &&
        Objects.equals(quartzCronExpression, reportSchedule.quartzCronExpression) &&
        Objects.equals(nextFireTime, reportSchedule.nextFireTime) &&
        Objects.equals(dateCreated, reportSchedule.dateCreated) &&
        Objects.equals(dateModified, reportSchedule.dateModified) &&
        Objects.equals(description, reportSchedule.description) &&
        Objects.equals(timeZone, reportSchedule.timeZone) &&
        Objects.equals(timePeriod, reportSchedule.timePeriod) &&
        Objects.equals(interval, reportSchedule.interval) &&
        Objects.equals(reportFormat, reportSchedule.reportFormat) &&
        Objects.equals(locale, reportSchedule.locale) &&
        Objects.equals(enabled, reportSchedule.enabled) &&
        Objects.equals(reportId, reportSchedule.reportId) &&
        Objects.equals(parameters, reportSchedule.parameters) &&
        Objects.equals(lastRun, reportSchedule.lastRun) &&
        Objects.equals(selfUri, reportSchedule.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, quartzCronExpression, nextFireTime, dateCreated, dateModified, description, timeZone, timePeriod, interval, reportFormat, locale, enabled, reportId, parameters, lastRun, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportSchedule {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    quartzCronExpression: ").append(toIndentedString(quartzCronExpression)).append("\n");
    sb.append("    nextFireTime: ").append(toIndentedString(nextFireTime)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    timePeriod: ").append(toIndentedString(timePeriod)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    reportFormat: ").append(toIndentedString(reportFormat)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    lastRun: ").append(toIndentedString(lastRun)).append("\n");
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
