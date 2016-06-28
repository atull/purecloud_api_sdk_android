package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.User;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class TimeOffRequest   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("user")
  private User user = null;

  @SerializedName("isFullDayRequest")
  private Boolean isFullDayRequest = false;

  @SerializedName("markedAsRead")
  private Boolean markedAsRead = false;

  @SerializedName("activityCodeId")
  private String activityCodeId = null;


  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    @SerializedName("PENDING")
    PENDING("PENDING"),

    @SerializedName("APPROVED")
    APPROVED("APPROVED"),

    @SerializedName("DENIED")
    DENIED("DENIED"),

    @SerializedName("CANCELED")
    CANCELED("CANCELED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("partialDayStartDateTimes")
  private List<Date> partialDayStartDateTimes = new ArrayList<Date>();

  @SerializedName("fullDayManagementUnitDates")
  private List<String> fullDayManagementUnitDates = new ArrayList<String>();

  @SerializedName("dailyDurationMinutes")
  private Integer dailyDurationMinutes = null;

  @SerializedName("notes")
  private String notes = null;

  @SerializedName("submittedBy")
  private User submittedBy = null;

  @SerializedName("submittedDate")
  private Date submittedDate = null;

  @SerializedName("reviewedBy")
  private User reviewedBy = null;

  @SerializedName("reviewedDate")
  private Date reviewedDate = null;

  @SerializedName("modifiedBy")
  private User modifiedBy = null;

  @SerializedName("modifiedDate")
  private Date modifiedDate = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("selfUri")
  private String selfUri = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
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
   **/
  @ApiModelProperty(value = "")
  public Boolean getIsFullDayRequest() {
    return isFullDayRequest;
  }
  public void setIsFullDayRequest(Boolean isFullDayRequest) {
    this.isFullDayRequest = isFullDayRequest;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getMarkedAsRead() {
    return markedAsRead;
  }
  public void setMarkedAsRead(Boolean markedAsRead) {
    this.markedAsRead = markedAsRead;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getActivityCodeId() {
    return activityCodeId;
  }
  public void setActivityCodeId(String activityCodeId) {
    this.activityCodeId = activityCodeId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Date> getPartialDayStartDateTimes() {
    return partialDayStartDateTimes;
  }
  public void setPartialDayStartDateTimes(List<Date> partialDayStartDateTimes) {
    this.partialDayStartDateTimes = partialDayStartDateTimes;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getFullDayManagementUnitDates() {
    return fullDayManagementUnitDates;
  }
  public void setFullDayManagementUnitDates(List<String> fullDayManagementUnitDates) {
    this.fullDayManagementUnitDates = fullDayManagementUnitDates;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getDailyDurationMinutes() {
    return dailyDurationMinutes;
  }
  public void setDailyDurationMinutes(Integer dailyDurationMinutes) {
    this.dailyDurationMinutes = dailyDurationMinutes;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public User getSubmittedBy() {
    return submittedBy;
  }
  public void setSubmittedBy(User submittedBy) {
    this.submittedBy = submittedBy;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getSubmittedDate() {
    return submittedDate;
  }
  public void setSubmittedDate(Date submittedDate) {
    this.submittedDate = submittedDate;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public User getReviewedBy() {
    return reviewedBy;
  }
  public void setReviewedBy(User reviewedBy) {
    this.reviewedBy = reviewedBy;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getReviewedDate() {
    return reviewedDate;
  }
  public void setReviewedDate(Date reviewedDate) {
    this.reviewedDate = reviewedDate;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public User getModifiedBy() {
    return modifiedBy;
  }
  public void setModifiedBy(User modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getModifiedDate() {
    return modifiedDate;
  }
  public void setModifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
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
    TimeOffRequest timeOffRequest = (TimeOffRequest) o;
    return Objects.equals(id, timeOffRequest.id) &&
        Objects.equals(user, timeOffRequest.user) &&
        Objects.equals(isFullDayRequest, timeOffRequest.isFullDayRequest) &&
        Objects.equals(markedAsRead, timeOffRequest.markedAsRead) &&
        Objects.equals(activityCodeId, timeOffRequest.activityCodeId) &&
        Objects.equals(status, timeOffRequest.status) &&
        Objects.equals(partialDayStartDateTimes, timeOffRequest.partialDayStartDateTimes) &&
        Objects.equals(fullDayManagementUnitDates, timeOffRequest.fullDayManagementUnitDates) &&
        Objects.equals(dailyDurationMinutes, timeOffRequest.dailyDurationMinutes) &&
        Objects.equals(notes, timeOffRequest.notes) &&
        Objects.equals(submittedBy, timeOffRequest.submittedBy) &&
        Objects.equals(submittedDate, timeOffRequest.submittedDate) &&
        Objects.equals(reviewedBy, timeOffRequest.reviewedBy) &&
        Objects.equals(reviewedDate, timeOffRequest.reviewedDate) &&
        Objects.equals(modifiedBy, timeOffRequest.modifiedBy) &&
        Objects.equals(modifiedDate, timeOffRequest.modifiedDate) &&
        Objects.equals(name, timeOffRequest.name) &&
        Objects.equals(selfUri, timeOffRequest.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, user, isFullDayRequest, markedAsRead, activityCodeId, status, partialDayStartDateTimes, fullDayManagementUnitDates, dailyDurationMinutes, notes, submittedBy, submittedDate, reviewedBy, reviewedDate, modifiedBy, modifiedDate, name, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeOffRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    isFullDayRequest: ").append(toIndentedString(isFullDayRequest)).append("\n");
    sb.append("    markedAsRead: ").append(toIndentedString(markedAsRead)).append("\n");
    sb.append("    activityCodeId: ").append(toIndentedString(activityCodeId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    partialDayStartDateTimes: ").append(toIndentedString(partialDayStartDateTimes)).append("\n");
    sb.append("    fullDayManagementUnitDates: ").append(toIndentedString(fullDayManagementUnitDates)).append("\n");
    sb.append("    dailyDurationMinutes: ").append(toIndentedString(dailyDurationMinutes)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    submittedBy: ").append(toIndentedString(submittedBy)).append("\n");
    sb.append("    submittedDate: ").append(toIndentedString(submittedDate)).append("\n");
    sb.append("    reviewedBy: ").append(toIndentedString(reviewedBy)).append("\n");
    sb.append("    reviewedDate: ").append(toIndentedString(reviewedDate)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
