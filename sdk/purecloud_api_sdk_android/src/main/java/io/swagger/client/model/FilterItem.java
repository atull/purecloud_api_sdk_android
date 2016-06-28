package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.FilterItem;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class FilterItem   {
  
  @SerializedName("name")
  private String name = null;


  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    @SerializedName("NUMBER")
    NUMBER("NUMBER"),

    @SerializedName("STRING")
    STRING("STRING"),

    @SerializedName("DATE")
    DATE("DATE"),

    @SerializedName("BOOLEAN")
    BOOLEAN("BOOLEAN"),

    @SerializedName("LIST")
    LIST("LIST"),

    @SerializedName("GROUP")
    GROUP("GROUP");

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

    @SerializedName("ORGROUP")
    ORGROUP("ORGROUP"),

    @SerializedName("ANDGROUP")
    ANDGROUP("ANDGROUP"),

    @SerializedName("NOTGROUP")
    NOTGROUP("NOTGROUP");

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

  @SerializedName("filters")
  private List<FilterItem> filters = new ArrayList<FilterItem>();

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
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
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

  /**
   **/
  @ApiModelProperty(value = "")
  public List<FilterItem> getFilters() {
    return filters;
  }
  public void setFilters(List<FilterItem> filters) {
    this.filters = filters;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilterItem filterItem = (FilterItem) o;
    return Objects.equals(name, filterItem.name) &&
        Objects.equals(type, filterItem.type) &&
        Objects.equals(operator, filterItem.operator) &&
        Objects.equals(values, filterItem.values) &&
        Objects.equals(filters, filterItem.filters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, operator, values, filters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterItem {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
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
