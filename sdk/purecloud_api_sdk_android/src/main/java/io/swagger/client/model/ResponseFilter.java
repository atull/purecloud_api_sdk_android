package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;




/**
 * Used to filter response queries
 **/
@ApiModel(description = "Used to filter response queries")
public class ResponseFilter   {
  
  @SerializedName("name")
  private String name = null;


  /**
   * Filter operation: IN, EQUALS, NOTEQUALS.
   */
  public enum OperatorEnum {
    @SerializedName("IN")
    IN("IN"),

    @SerializedName("EQUALS")
    EQUALS("EQUALS"),

    @SerializedName("NOTEQUALS")
    NOTEQUALS("NOTEQUALS");

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
   * Field to filter on. Allowed values are 'name' and 'libraryId.
   **/
  @ApiModelProperty(required = true, value = "Field to filter on. Allowed values are 'name' and 'libraryId.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Filter operation: IN, EQUALS, NOTEQUALS.
   **/
  @ApiModelProperty(required = true, value = "Filter operation: IN, EQUALS, NOTEQUALS.")
  public OperatorEnum getOperator() {
    return operator;
  }
  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }

  /**
   * Values to filter on.
   **/
  @ApiModelProperty(required = true, value = "Values to filter on.")
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
    ResponseFilter responseFilter = (ResponseFilter) o;
    return Objects.equals(name, responseFilter.name) &&
        Objects.equals(operator, responseFilter.operator) &&
        Objects.equals(values, responseFilter.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, operator, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseFilter {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
