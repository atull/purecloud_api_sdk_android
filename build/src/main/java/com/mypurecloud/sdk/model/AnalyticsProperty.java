package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class AnalyticsProperty  implements Serializable {
  

  /**
   * Indicates what the data type is (e.g. integer vs string) and therefore how to evaluate what would constitute a match
   */
  public enum PropertyTypeEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("bool")
    BOOL("bool"),

    @SerializedName("integer")
    INTEGER("integer"),

    @SerializedName("real")
    REAL("real"),

    @SerializedName("date")
    DATE("date"),

    @SerializedName("string")
    STRING("string"),

    @SerializedName("uuid")
    UUID("uuid");

    private String value;

    PropertyTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("propertyType")
  private PropertyTypeEnum propertyType = null;

  @SerializedName("property")
  private String property = null;

  @SerializedName("value")
  private String value = null;

  /**
   * Indicates what the data type is (e.g. integer vs string) and therefore how to evaluate what would constitute a match
   **/
  @ApiModelProperty(required = true, value = "Indicates what the data type is (e.g. integer vs string) and therefore how to evaluate what would constitute a match")
  public PropertyTypeEnum getPropertyType() {
    return propertyType;
  }
  public void setPropertyType(PropertyTypeEnum propertyType) {
    this.propertyType = propertyType;
  }

  /**
   * User-defined rather than intrinsic system-observed values. These are tagged onto segments by other components within PureCloud or by API users directly.  This is the name of the user-defined property.
   **/
  @ApiModelProperty(required = true, value = "User-defined rather than intrinsic system-observed values. These are tagged onto segments by other components within PureCloud or by API users directly.  This is the name of the user-defined property.")
  public String getProperty() {
    return property;
  }
  public void setProperty(String property) {
    this.property = property;
  }

  /**
   * What property value to match against
   **/
  @ApiModelProperty(required = true, value = "What property value to match against")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsProperty analyticsProperty = (AnalyticsProperty) o;
    return Objects.equals(propertyType, analyticsProperty.propertyType) &&
        Objects.equals(property, analyticsProperty.property) &&
        Objects.equals(value, analyticsProperty.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertyType, property, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsProperty {\n");
    
    sb.append("    propertyType: ").append(toIndentedString(propertyType)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
