package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.InteractionStatAlertNotificationNotificationUsers;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class InteractionStatRuleNotification  implements Serializable {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;


  /**
   * Gets or Sets dimension
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

  @SerializedName("dimensionValueName")
  private String dimensionValueName = null;


  /**
   * Gets or Sets metric
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
   * Gets or Sets mediaType
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
   * Gets or Sets numericRange
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
   * Gets or Sets statistic
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
  private BigDecimal value = null;

  @SerializedName("inAlarm")
  private Boolean inAlarm = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("notificationUsers")
  private List<InteractionStatAlertNotificationNotificationUsers> notificationUsers = new ArrayList<InteractionStatAlertNotificationNotificationUsers>();


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
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public DimensionEnum getDimension() {
    return dimension;
  }
  public void setDimension(DimensionEnum dimension) {
    this.dimension = dimension;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDimensionValue() {
    return dimensionValue;
  }
  public void setDimensionValue(String dimensionValue) {
    this.dimensionValue = dimensionValue;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDimensionValueName() {
    return dimensionValueName;
  }
  public void setDimensionValueName(String dimensionValueName) {
    this.dimensionValueName = dimensionValueName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public MetricEnum getMetric() {
    return metric;
  }
  public void setMetric(MetricEnum metric) {
    this.metric = metric;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }
  public void setMediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public NumericRangeEnum getNumericRange() {
    return numericRange;
  }
  public void setNumericRange(NumericRangeEnum numericRange) {
    this.numericRange = numericRange;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public StatisticEnum getStatistic() {
    return statistic;
  }
  public void setStatistic(StatisticEnum statistic) {
    this.statistic = statistic;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getValue() {
    return value;
  }
  public void setValue(BigDecimal value) {
    this.value = value;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getInAlarm() {
    return inAlarm;
  }
  public void setInAlarm(Boolean inAlarm) {
    this.inAlarm = inAlarm;
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
   **/
  @ApiModelProperty(value = "")
  public List<InteractionStatAlertNotificationNotificationUsers> getNotificationUsers() {
    return notificationUsers;
  }
  public void setNotificationUsers(List<InteractionStatAlertNotificationNotificationUsers> notificationUsers) {
    this.notificationUsers = notificationUsers;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<AlertTypesEnum> getAlertTypes() {
    return alertTypes;
  }
  public void setAlertTypes(List<AlertTypesEnum> alertTypes) {
    this.alertTypes = alertTypes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InteractionStatRuleNotification interactionStatRuleNotification = (InteractionStatRuleNotification) o;
    return Objects.equals(id, interactionStatRuleNotification.id) &&
        Objects.equals(name, interactionStatRuleNotification.name) &&
        Objects.equals(dimension, interactionStatRuleNotification.dimension) &&
        Objects.equals(dimensionValue, interactionStatRuleNotification.dimensionValue) &&
        Objects.equals(dimensionValueName, interactionStatRuleNotification.dimensionValueName) &&
        Objects.equals(metric, interactionStatRuleNotification.metric) &&
        Objects.equals(mediaType, interactionStatRuleNotification.mediaType) &&
        Objects.equals(numericRange, interactionStatRuleNotification.numericRange) &&
        Objects.equals(statistic, interactionStatRuleNotification.statistic) &&
        Objects.equals(value, interactionStatRuleNotification.value) &&
        Objects.equals(inAlarm, interactionStatRuleNotification.inAlarm) &&
        Objects.equals(enabled, interactionStatRuleNotification.enabled) &&
        Objects.equals(notificationUsers, interactionStatRuleNotification.notificationUsers) &&
        Objects.equals(alertTypes, interactionStatRuleNotification.alertTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dimension, dimensionValue, dimensionValueName, metric, mediaType, numericRange, statistic, value, inAlarm, enabled, notificationUsers, alertTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteractionStatRuleNotification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
    sb.append("    dimensionValue: ").append(toIndentedString(dimensionValue)).append("\n");
    sb.append("    dimensionValueName: ").append(toIndentedString(dimensionValueName)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    numericRange: ").append(toIndentedString(numericRange)).append("\n");
    sb.append("    statistic: ").append(toIndentedString(statistic)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    inAlarm: ").append(toIndentedString(inAlarm)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    notificationUsers: ").append(toIndentedString(notificationUsers)).append("\n");
    sb.append("    alertTypes: ").append(toIndentedString(alertTypes)).append("\n");
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
