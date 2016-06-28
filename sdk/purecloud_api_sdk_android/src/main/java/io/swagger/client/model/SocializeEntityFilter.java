package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;





public class SocializeEntityFilter   {
  
  @SerializedName("fieldName")
  private String fieldName = null;


  /**
   * The operator to apply when filtering.
   */
  public enum OperatorEnum {
    @SerializedName("EQ")
    EQ("EQ"),

    @SerializedName("NEG_EQ")
    NEG_EQ("NEG_EQ"),

    @SerializedName("CONTAINS")
    CONTAINS("CONTAINS"),

    @SerializedName("NEG_CONTAINS")
    NEG_CONTAINS("NEG_CONTAINS"),

    @SerializedName("STARTS_WITH")
    STARTS_WITH("STARTS_WITH"),

    @SerializedName("NEG_STARTS_WITH")
    NEG_STARTS_WITH("NEG_STARTS_WITH"),

    @SerializedName("ENDS_WITH")
    ENDS_WITH("ENDS_WITH"),

    @SerializedName("NEG_ENDS_WITH")
    NEG_ENDS_WITH("NEG_ENDS_WITH"),

    @SerializedName("BT")
    BT("BT"),

    @SerializedName("GT")
    GT("GT"),

    @SerializedName("LT")
    LT("LT"),

    @SerializedName("GE")
    GE("GE"),

    @SerializedName("LE")
    LE("LE"),

    @SerializedName("IN")
    IN("IN");

    private String value;

    OperatorEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("operator")
  private OperatorEnum operator = null;

  @SerializedName("fieldValue")
  private String fieldValue = null;

  /**
   * The fieldName the filter will be applied to.
   **/
  @ApiModelProperty(value = "The fieldName the filter will be applied to.")
  public String getFieldName() {
    return fieldName;
  }
  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  /**
   * The operator to apply when filtering.
   **/
  @ApiModelProperty(value = "The operator to apply when filtering.")
  public OperatorEnum getOperator() {
    return operator;
  }
  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }

  /**
   * The value to filter on.
   **/
  @ApiModelProperty(value = "The value to filter on.")
  public String getFieldValue() {
    return fieldValue;
  }
  public void setFieldValue(String fieldValue) {
    this.fieldValue = fieldValue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SocializeEntityFilter socializeEntityFilter = (SocializeEntityFilter) o;
    return Objects.equals(fieldName, socializeEntityFilter.fieldName) &&
        Objects.equals(operator, socializeEntityFilter.operator) &&
        Objects.equals(fieldValue, socializeEntityFilter.fieldValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldName, operator, fieldValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SocializeEntityFilter {\n");
    
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    fieldValue: ").append(toIndentedString(fieldValue)).append("\n");
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
