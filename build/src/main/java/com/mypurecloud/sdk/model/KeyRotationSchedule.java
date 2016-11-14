package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class KeyRotationSchedule  implements Serializable {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;


  /**
   * Value to set schedule to
   */
  public enum PeriodEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("DISABLED")
    DISABLED("DISABLED"),

    @SerializedName("DAILY")
    DAILY("DAILY"),

    @SerializedName("WEEKLY")
    WEEKLY("WEEKLY"),

    @SerializedName("MONTHLY")
    MONTHLY("MONTHLY"),

    @SerializedName("YEARLY")
    YEARLY("YEARLY");

    private String value;

    PeriodEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("period")
  private PeriodEnum period = null;

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
   * Value to set schedule to
   **/
  @ApiModelProperty(required = true, value = "Value to set schedule to")
  public PeriodEnum getPeriod() {
    return period;
  }
  public void setPeriod(PeriodEnum period) {
    this.period = period;
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
    KeyRotationSchedule keyRotationSchedule = (KeyRotationSchedule) o;
    return Objects.equals(id, keyRotationSchedule.id) &&
        Objects.equals(name, keyRotationSchedule.name) &&
        Objects.equals(period, keyRotationSchedule.period) &&
        Objects.equals(selfUri, keyRotationSchedule.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, period, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyRotationSchedule {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
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
