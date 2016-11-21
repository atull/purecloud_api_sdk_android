package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class SearchAggregation  implements Serializable {
  
  @SerializedName("field")
  private String field = null;

  @SerializedName("name")
  private String name = null;


  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("COUNT")
    COUNT("COUNT"),

    @SerializedName("SUM")
    SUM("SUM"),

    @SerializedName("AVERAGE")
    AVERAGE("AVERAGE"),

    @SerializedName("CONTAINS")
    CONTAINS("CONTAINS"),

    @SerializedName("STARTS_WITH")
    STARTS_WITH("STARTS_WITH"),

    @SerializedName("ENDS_WITH")
    ENDS_WITH("ENDS_WITH");

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

  @SerializedName("value")
  private String value = null;

  @SerializedName("size")
  private Integer size = null;


  /**
   * Gets or Sets order
   */
  public enum OrderEnum {
    @SerializedName("VALUE_DESC")
    VALUE_DESC("VALUE_DESC"),

    @SerializedName("VALUE_ASC")
    VALUE_ASC("VALUE_ASC"),

    @SerializedName("COUNT_DESC")
    COUNT_DESC("COUNT_DESC"),

    @SerializedName("COUNT_ASC")
    COUNT_ASC("COUNT_ASC");

    private String value;

    OrderEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("order")
  private List<OrderEnum> order = new ArrayList<OrderEnum>();

  /**
   **/
  @ApiModelProperty(value = "")
  public String getField() {
    return field;
  }
  public void setField(String field) {
    this.field = field;
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
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
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
  public Integer getSize() {
    return size;
  }
  public void setSize(Integer size) {
    this.size = size;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<OrderEnum> getOrder() {
    return order;
  }
  public void setOrder(List<OrderEnum> order) {
    this.order = order;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchAggregation searchAggregation = (SearchAggregation) o;
    return Objects.equals(field, searchAggregation.field) &&
        Objects.equals(name, searchAggregation.name) &&
        Objects.equals(type, searchAggregation.type) &&
        Objects.equals(value, searchAggregation.value) &&
        Objects.equals(size, searchAggregation.size) &&
        Objects.equals(order, searchAggregation.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, name, type, value, size, order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchAggregation {\n");
    
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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
