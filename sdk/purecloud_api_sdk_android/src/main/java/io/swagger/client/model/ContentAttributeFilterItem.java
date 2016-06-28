package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class ContentAttributeFilterItem   {
  
  @SerializedName("id")
  private String id = null;


  /**
   * Gets or Sets operator
   */
  public enum OperatorEnum {
    @SerializedName("IN")
    IN("IN"),

    @SerializedName("RANGE")
    RANGE("RANGE"),

    @SerializedName("EQUALS")
    EQUALS("EQUALS"),

    @SerializedName("NOTEQUALS")
    NOTEQUALS("NOTEQUALS"),

    @SerializedName("LESSTHAN")
    LESSTHAN("LESSTHAN"),

    @SerializedName("LESSTHANEQUALS")
    LESSTHANEQUALS("LESSTHANEQUALS"),

    @SerializedName("GREATERTHAN")
    GREATERTHAN("GREATERTHAN"),

    @SerializedName("GREATERTHANEQUALS")
    GREATERTHANEQUALS("GREATERTHANEQUALS"),

    @SerializedName("CONTAINS")
    CONTAINS("CONTAINS");

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

  @SerializedName("values")
  private List<String> values = new ArrayList<String>();

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
  public OperatorEnum getOperator() {
    return operator;
  }
  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentAttributeFilterItem contentAttributeFilterItem = (ContentAttributeFilterItem) o;
    return Objects.equals(id, contentAttributeFilterItem.id) &&
        Objects.equals(operator, contentAttributeFilterItem.operator) &&
        Objects.equals(values, contentAttributeFilterItem.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, operator, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentAttributeFilterItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
