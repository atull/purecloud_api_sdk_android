package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class InteractionStatsAlert  implements Serializable {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;


  /**
   * The dimension of concern.
   */
  public enum DimensionEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("queueId")
    QUEUEID("queueId"),

    @SerializedName("userId")
    USERID("userId");

    private String value;

    DimensionEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("dimension")
  private DimensionEnum dimension = null;

  @SerializedName("dimensionValue")
  private String dimensionValue = null;


  /**
   * The metric to be assessed.
   */
  public enum MetricEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("tAbandon")
    TABANDON("tAbandon"),

    @SerializedName("tAnswered")
    TANSWERED("tAnswered"),

    @SerializedName("tTalk")
    TTALK("tTalk"),

    @SerializedName("nOffered")
    NOFFERED("nOffered"),

    @SerializedName("tHandle")
    THANDLE("tHandle"),

    @SerializedName("nTransferred")
    NTRANSFERRED("nTransferred"),

    @SerializedName("oServiceLevel")
    OSERVICELEVEL("oServiceLevel"),

    @SerializedName("tWait")
    TWAIT("tWait"),

    @SerializedName("tHeld")
    THELD("tHeld"),

    @SerializedName("tAcw")
    TACW("tAcw");

    private String value;

    MetricEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("metric")
  private MetricEnum metric = null;


  /**
   * The media type.
   */
  public enum MediaTypeEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("voice")
    VOICE("voice"),

    @SerializedName("chat")
    CHAT("chat"),

    @SerializedName("email")
    EMAIL("email");

    private String value;

    MediaTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("mediaType")
  private MediaTypeEnum mediaType = null;


  /**
   * The comparison descriptor used against the metric's value.
   */
  public enum NumericRangeEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("gt")
    GT("gt"),

    @SerializedName("gte")
    GTE("gte"),

    @SerializedName("lt")
    LT("lt"),

    @SerializedName("lte")
    LTE("lte"),

    @SerializedName("eq")
    EQ("eq"),

    @SerializedName("ne")
    NE("ne");

    private String value;

    NumericRangeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("numericRange")
  private NumericRangeEnum numericRange = null;


  /**
   * The statistic of concern for the metric.
   */
  public enum StatisticEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("count")
    COUNT("count"),

    @SerializedName("min")
    MIN("min"),

    @SerializedName("ratio")
    RATIO("ratio"),

    @SerializedName("max")
    MAX("max");

    private String value;

    StatisticEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("statistic")
  private StatisticEnum statistic = null;

  @SerializedName("value")
  private Double value = null;

  @SerializedName("ruleId")
  private String ruleId = null;

  @SerializedName("unread")
  private Boolean unread = false;

  @SerializedName("startDate")
  private Date startDate = null;

  @SerializedName("endDate")
  private Date endDate = null;

  @SerializedName("notificationUsers")
  private List<User> notificationUsers = new ArrayList<User>();


  /**
   * Gets or Sets alertTypes
   */
  public enum AlertTypesEnum {
    @SerializedName("SMS")
    SMS("SMS"),

    @SerializedName("DEVICE")
    DEVICE("DEVICE"),

    @SerializedName("EMAIL")
    EMAIL("EMAIL");

    private String value;

    AlertTypesEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("alertTypes")
  private List<AlertTypesEnum> alertTypes = new ArrayList<AlertTypesEnum>();

  @SerializedName("ruleUri")
  private String ruleUri = null;

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
   * Name of the rule that generated the alert
   **/
  @ApiModelProperty(required = true, value = "Name of the rule that generated the alert")
  public String getName() {
    return name;
  }

  /**
   * The dimension of concern.
   **/
  @ApiModelProperty(required = true, value = "The dimension of concern.")
  public DimensionEnum getDimension() {
    return dimension;
  }

  /**
   * The value of the dimension.
   **/
  @ApiModelProperty(required = true, value = "The value of the dimension.")
  public String getDimensionValue() {
    return dimensionValue;
  }

  /**
   * The metric to be assessed.
   **/
  @ApiModelProperty(required = true, value = "The metric to be assessed.")
  public MetricEnum getMetric() {
    return metric;
  }

  /**
   * The media type.
   **/
  @ApiModelProperty(required = true, value = "The media type.")
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }

  /**
   * The comparison descriptor used against the metric's value.
   **/
  @ApiModelProperty(required = true, value = "The comparison descriptor used against the metric's value.")
  public NumericRangeEnum getNumericRange() {
    return numericRange;
  }

  /**
   * The statistic of concern for the metric.
   **/
  @ApiModelProperty(required = true, value = "The statistic of concern for the metric.")
  public StatisticEnum getStatistic() {
    return statistic;
  }

  /**
   * The threshold value.
   **/
  @ApiModelProperty(required = true, value = "The threshold value.")
  public Double getValue() {
    return value;
  }

  /**
   * The id of the rule.
   **/
  @ApiModelProperty(required = true, value = "The id of the rule.")
  public String getRuleId() {
    return ruleId;
  }

  /**
   * Indicates if the alert has been read.
   **/
  @ApiModelProperty(required = true, value = "Indicates if the alert has been read.")
  public Boolean getUnread() {
    return unread;
  }
  public void setUnread(Boolean unread) {
    this.unread = unread;
  }

  /**
   * The date/time the alert was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(required = true, value = "The date/time the alert was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getStartDate() {
    return startDate;
  }

  /**
   * The date/time the owning rule exiting in alarm status. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "The date/time the owning rule exiting in alarm status. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getEndDate() {
    return endDate;
  }

  /**
   * The ids of users who were notified of alarm state change.
   **/
  @ApiModelProperty(required = true, value = "The ids of users who were notified of alarm state change.")
  public List<User> getNotificationUsers() {
    return notificationUsers;
  }
  public void setNotificationUsers(List<User> notificationUsers) {
    this.notificationUsers = notificationUsers;
  }

  /**
   * A collection of notification methods. = ['SMS', 'DEVICE', 'EMAIL']
   **/
  @ApiModelProperty(required = true, value = "A collection of notification methods. = ['SMS', 'DEVICE', 'EMAIL']")
  public List<AlertTypesEnum> getAlertTypes() {
    return alertTypes;
  }
  public void setAlertTypes(List<AlertTypesEnum> alertTypes) {
    this.alertTypes = alertTypes;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getRuleUri() {
    return ruleUri;
  }
  public void setRuleUri(String ruleUri) {
    this.ruleUri = ruleUri;
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
    InteractionStatsAlert interactionStatsAlert = (InteractionStatsAlert) o;
    return Objects.equals(id, interactionStatsAlert.id) &&
        Objects.equals(name, interactionStatsAlert.name) &&
        Objects.equals(dimension, interactionStatsAlert.dimension) &&
        Objects.equals(dimensionValue, interactionStatsAlert.dimensionValue) &&
        Objects.equals(metric, interactionStatsAlert.metric) &&
        Objects.equals(mediaType, interactionStatsAlert.mediaType) &&
        Objects.equals(numericRange, interactionStatsAlert.numericRange) &&
        Objects.equals(statistic, interactionStatsAlert.statistic) &&
        Objects.equals(value, interactionStatsAlert.value) &&
        Objects.equals(ruleId, interactionStatsAlert.ruleId) &&
        Objects.equals(unread, interactionStatsAlert.unread) &&
        Objects.equals(startDate, interactionStatsAlert.startDate) &&
        Objects.equals(endDate, interactionStatsAlert.endDate) &&
        Objects.equals(notificationUsers, interactionStatsAlert.notificationUsers) &&
        Objects.equals(alertTypes, interactionStatsAlert.alertTypes) &&
        Objects.equals(ruleUri, interactionStatsAlert.ruleUri) &&
        Objects.equals(selfUri, interactionStatsAlert.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dimension, dimensionValue, metric, mediaType, numericRange, statistic, value, ruleId, unread, startDate, endDate, notificationUsers, alertTypes, ruleUri, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteractionStatsAlert {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
    sb.append("    dimensionValue: ").append(toIndentedString(dimensionValue)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    numericRange: ").append(toIndentedString(numericRange)).append("\n");
    sb.append("    statistic: ").append(toIndentedString(statistic)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
    sb.append("    unread: ").append(toIndentedString(unread)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    notificationUsers: ").append(toIndentedString(notificationUsers)).append("\n");
    sb.append("    alertTypes: ").append(toIndentedString(alertTypes)).append("\n");
    sb.append("    ruleUri: ").append(toIndentedString(ruleUri)).append("\n");
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
