package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class Condition  implements Serializable {
  

  /**
   * The type of the condition
   */
  public enum TypeEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("wrapupCondition")
    WRAPUPCONDITION("wrapupCondition"),

    @SerializedName("contactAttributeCondition")
    CONTACTATTRIBUTECONDITION("contactAttributeCondition"),

    @SerializedName("phoneNumberCondition")
    PHONENUMBERCONDITION("phoneNumberCondition"),

    @SerializedName("phoneNumberTypeCondition")
    PHONENUMBERTYPECONDITION("phoneNumberTypeCondition"),

    @SerializedName("callAnalysisCondition")
    CALLANALYSISCONDITION("callAnalysisCondition");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("inverted")
  private Boolean inverted = false;

  @SerializedName("attributeName")
  private String attributeName = null;

  @SerializedName("value")
  private String value = null;


  /**
   * Determines the type of the value associated with the condition
   */
  public enum ValueTypeEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("STRING")
    STRING("STRING"),

    @SerializedName("NUMERIC")
    NUMERIC("NUMERIC"),

    @SerializedName("DATETIME")
    DATETIME("DATETIME"),

    @SerializedName("PERIOD")
    PERIOD("PERIOD");

    private String value;

    ValueTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("valueType")
  private ValueTypeEnum valueType = null;


  /**
   * An operation type for condition evaluation
   */
  public enum OperatorEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("EQUALS")
    EQUALS("EQUALS"),

    @SerializedName("LESS_THAN")
    LESS_THAN("LESS_THAN"),

    @SerializedName("LESS_THAN_EQUALS")
    LESS_THAN_EQUALS("LESS_THAN_EQUALS"),

    @SerializedName("GREATER_THAN")
    GREATER_THAN("GREATER_THAN"),

    @SerializedName("GREATER_THAN_EQUALS")
    GREATER_THAN_EQUALS("GREATER_THAN_EQUALS"),

    @SerializedName("CONTAINS")
    CONTAINS("CONTAINS"),

    @SerializedName("BEGINS_WITH")
    BEGINS_WITH("BEGINS_WITH"),

    @SerializedName("ENDS_WITH")
    ENDS_WITH("ENDS_WITH"),

    @SerializedName("BEFORE")
    BEFORE("BEFORE"),

    @SerializedName("AFTER")
    AFTER("AFTER");

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

  @SerializedName("codes")
  private List<String> codes = new ArrayList<String>();

  /**
   * The type of the condition
   **/
  @ApiModelProperty(value = "The type of the condition")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Indicates whether to evaluate for the opposite of the stated condition; default is false
   **/
  @ApiModelProperty(value = "Indicates whether to evaluate for the opposite of the stated condition; default is false")
  public Boolean getInverted() {
    return inverted;
  }
  public void setInverted(Boolean inverted) {
    this.inverted = inverted;
  }

  /**
   * An attribute name associated with the condition (applies only to certain rule conditions)
   **/
  @ApiModelProperty(value = "An attribute name associated with the condition (applies only to certain rule conditions)")
  public String getAttributeName() {
    return attributeName;
  }
  public void setAttributeName(String attributeName) {
    this.attributeName = attributeName;
  }

  /**
   * A value associated with the condition
   **/
  @ApiModelProperty(value = "A value associated with the condition")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * Determines the type of the value associated with the condition
   **/
  @ApiModelProperty(value = "Determines the type of the value associated with the condition")
  public ValueTypeEnum getValueType() {
    return valueType;
  }
  public void setValueType(ValueTypeEnum valueType) {
    this.valueType = valueType;
  }

  /**
   * An operation type for condition evaluation
   **/
  @ApiModelProperty(value = "An operation type for condition evaluation")
  public OperatorEnum getOperator() {
    return operator;
  }
  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }

  /**
   * List of wrap-up code identifiers (used only in conditions of type 'wrapupCondition')
   **/
  @ApiModelProperty(value = "List of wrap-up code identifiers (used only in conditions of type 'wrapupCondition')")
  public List<String> getCodes() {
    return codes;
  }
  public void setCodes(List<String> codes) {
    this.codes = codes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Condition condition = (Condition) o;
    return Objects.equals(type, condition.type) &&
        Objects.equals(inverted, condition.inverted) &&
        Objects.equals(attributeName, condition.attributeName) &&
        Objects.equals(value, condition.value) &&
        Objects.equals(valueType, condition.valueType) &&
        Objects.equals(operator, condition.operator) &&
        Objects.equals(codes, condition.codes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, inverted, attributeName, value, valueType, operator, codes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Condition {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    inverted: ").append(toIndentedString(inverted)).append("\n");
    sb.append("    attributeName: ").append(toIndentedString(attributeName)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    codes: ").append(toIndentedString(codes)).append("\n");
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
