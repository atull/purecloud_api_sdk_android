package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.SuggestSearchCriteria;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class SuggestSearchCriteria  implements Serializable {
  
  @SerializedName("endValue")
  private String endValue = null;

  @SerializedName("values")
  private List<String> values = new ArrayList<String>();

  @SerializedName("startValue")
  private String startValue = null;

  @SerializedName("fields")
  private List<String> fields = new ArrayList<String>();

  @SerializedName("value")
  private String value = null;


  /**
   * Gets or Sets operator
   */
  public enum OperatorEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("AND")
    AND("AND"),

    @SerializedName("OR")
    OR("OR"),

    @SerializedName("NOT")
    NOT("NOT");

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

  @SerializedName("group")
  private List<SuggestSearchCriteria> group = new ArrayList<SuggestSearchCriteria>();

  /**
   **/
  @ApiModelProperty(value = "")
  public String getEndValue() {
    return endValue;
  }
  public void setEndValue(String endValue) {
    this.endValue = endValue;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getValues() {
    return values;
  }
  public void setValues(List<String> values) {
    this.values = values;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getStartValue() {
    return startValue;
  }
  public void setStartValue(String startValue) {
    this.startValue = startValue;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getFields() {
    return fields;
  }
  public void setFields(List<String> fields) {
    this.fields = fields;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OperatorEnum getOperator() {
    return operator;
  }
  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<SuggestSearchCriteria> getGroup() {
    return group;
  }
  public void setGroup(List<SuggestSearchCriteria> group) {
    this.group = group;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuggestSearchCriteria suggestSearchCriteria = (SuggestSearchCriteria) o;
    return Objects.equals(endValue, suggestSearchCriteria.endValue) &&
        Objects.equals(values, suggestSearchCriteria.values) &&
        Objects.equals(startValue, suggestSearchCriteria.startValue) &&
        Objects.equals(fields, suggestSearchCriteria.fields) &&
        Objects.equals(value, suggestSearchCriteria.value) &&
        Objects.equals(operator, suggestSearchCriteria.operator) &&
        Objects.equals(group, suggestSearchCriteria.group);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endValue, values, startValue, fields, value, operator, group);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuggestSearchCriteria {\n");
    
    sb.append("    endValue: ").append(toIndentedString(endValue)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    startValue: ").append(toIndentedString(startValue)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
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
