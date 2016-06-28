package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.UserSearchCriteria;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class UserSearchCriteria   {
  
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
  private List<UserSearchCriteria> group = new ArrayList<UserSearchCriteria>();


  /**
   * Search Type
   */
  public enum TypeEnum {
    @SerializedName("EXACT")
    EXACT("EXACT"),

    @SerializedName("STARTS_WITH")
    STARTS_WITH("STARTS_WITH"),

    @SerializedName("CONTAINS")
    CONTAINS("CONTAINS"),

    @SerializedName("REGEX")
    REGEX("REGEX"),

    @SerializedName("TERM")
    TERM("TERM"),

    @SerializedName("TERMS")
    TERMS("TERMS"),

    @SerializedName("REQUIRED_FIELDS")
    REQUIRED_FIELDS("REQUIRED_FIELDS");

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
  public List<UserSearchCriteria> getGroup() {
    return group;
  }
  public void setGroup(List<UserSearchCriteria> group) {
    this.group = group;
  }

  /**
   * Search Type
   **/
  @ApiModelProperty(required = true, value = "Search Type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserSearchCriteria userSearchCriteria = (UserSearchCriteria) o;
    return Objects.equals(endValue, userSearchCriteria.endValue) &&
        Objects.equals(values, userSearchCriteria.values) &&
        Objects.equals(startValue, userSearchCriteria.startValue) &&
        Objects.equals(fields, userSearchCriteria.fields) &&
        Objects.equals(value, userSearchCriteria.value) &&
        Objects.equals(operator, userSearchCriteria.operator) &&
        Objects.equals(group, userSearchCriteria.group) &&
        Objects.equals(type, userSearchCriteria.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endValue, values, startValue, fields, value, operator, group, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserSearchCriteria {\n");
    
    sb.append("    endValue: ").append(toIndentedString(endValue)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    startValue: ").append(toIndentedString(startValue)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
