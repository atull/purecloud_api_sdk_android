package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class InteractionStatsRule  implements Serializable {
  
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

  @SerializedName("enabled")
  private Boolean enabled = false;

  @SerializedName("inAlarm")
  private Boolean inAlarm = false;

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
   * Name of the rule
   **/
  @ApiModelProperty(required = true, value = "Name of the rule")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The dimension of concern.
   **/
  @ApiModelProperty(required = true, value = "The dimension of concern.")
  public DimensionEnum getDimension() {
    return dimension;
  }
  public void setDimension(DimensionEnum dimension) {
    this.dimension = dimension;
  }

  /**
   * The value of the dimension.
   **/
  @ApiModelProperty(required = true, value = "The value of the dimension.")
  public String getDimensionValue() {
    return dimensionValue;
  }
  public void setDimensionValue(String dimensionValue) {
    this.dimensionValue = dimensionValue;
  }

  /**
   * The metric to be assessed.
   **/
  @ApiModelProperty(required = true, value = "The metric to be assessed.")
  public MetricEnum getMetric() {
    return metric;
  }
  public void setMetric(MetricEnum metric) {
    this.metric = metric;
  }

  /**
   * The media type.
   **/
  @ApiModelProperty(required = true, value = "The media type.")
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }
  public void setMediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }

  /**
   * The comparison descriptor used against the metric's value.
   **/
  @ApiModelProperty(required = true, value = "The comparison descriptor used against the metric's value.")
  public NumericRangeEnum getNumericRange() {
    return numericRange;
  }
  public void setNumericRange(NumericRangeEnum numericRange) {
    this.numericRange = numericRange;
  }

  /**
   * The statistic of concern for the metric.
   **/
  @ApiModelProperty(required = true, value = "The statistic of concern for the metric.")
  public StatisticEnum getStatistic() {
    return statistic;
  }
  public void setStatistic(StatisticEnum statistic) {
    this.statistic = statistic;
  }

  /**
   * The threshold value.
   **/
  @ApiModelProperty(required = true, value = "The threshold value.")
  public Double getValue() {
    return value;
  }
  public void setValue(Double value) {
    this.value = value;
  }

  /**
   * Indicates if the rule is enabled.
   **/
  @ApiModelProperty(required = true, value = "Indicates if the rule is enabled.")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  /**
   * Indicates if the rule is in alarm state.
   **/
  @ApiModelProperty(value = "Indicates if the rule is in alarm state.")
  public Boolean getInAlarm() {
    return inAlarm;
  }

  /**
   * The ids of users who will be notified of alarm state change.
   **/
  @ApiModelProperty(required = true, value = "The ids of users who will be notified of alarm state change.")
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
    InteractionStatsRule interactionStatsRule = (InteractionStatsRule) o;
    return Objects.equals(id, interactionStatsRule.id) &&
        Objects.equals(name, interactionStatsRule.name) &&
        Objects.equals(dimension, interactionStatsRule.dimension) &&
        Objects.equals(dimensionValue, interactionStatsRule.dimensionValue) &&
        Objects.equals(metric, interactionStatsRule.metric) &&
        Objects.equals(mediaType, interactionStatsRule.mediaType) &&
        Objects.equals(numericRange, interactionStatsRule.numericRange) &&
        Objects.equals(statistic, interactionStatsRule.statistic) &&
        Objects.equals(value, interactionStatsRule.value) &&
        Objects.equals(enabled, interactionStatsRule.enabled) &&
        Objects.equals(inAlarm, interactionStatsRule.inAlarm) &&
        Objects.equals(notificationUsers, interactionStatsRule.notificationUsers) &&
        Objects.equals(alertTypes, interactionStatsRule.alertTypes) &&
        Objects.equals(selfUri, interactionStatsRule.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dimension, dimensionValue, metric, mediaType, numericRange, statistic, value, enabled, inAlarm, notificationUsers, alertTypes, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteractionStatsRule {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
    sb.append("    dimensionValue: ").append(toIndentedString(dimensionValue)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    numericRange: ").append(toIndentedString(numericRange)).append("\n");
    sb.append("    statistic: ").append(toIndentedString(statistic)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    inAlarm: ").append(toIndentedString(inAlarm)).append("\n");
    sb.append("    notificationUsers: ").append(toIndentedString(notificationUsers)).append("\n");
    sb.append("    alertTypes: ").append(toIndentedString(alertTypes)).append("\n");
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
