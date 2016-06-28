package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;





public class JsonNode   {
  

  /**
   * Gets or Sets nodeType
   */
  public enum NodeTypeEnum {
    @SerializedName("ARRAY")
    ARRAY("ARRAY"),

    @SerializedName("BINARY")
    BINARY("BINARY"),

    @SerializedName("BOOLEAN")
    BOOLEAN("BOOLEAN"),

    @SerializedName("MISSING")
    MISSING("MISSING"),

    @SerializedName("NULL")
    NULL("NULL"),

    @SerializedName("NUMBER")
    NUMBER("NUMBER"),

    @SerializedName("OBJECT")
    OBJECT("OBJECT"),

    @SerializedName("POJO")
    POJO("POJO"),

    @SerializedName("STRING")
    STRING("STRING");

    private String value;

    NodeTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("nodeType")
  private NodeTypeEnum nodeType = null;

  @SerializedName("float")
  private Boolean _float = false;

  @SerializedName("object")
  private Boolean object = false;

  @SerializedName("boolean")
  private Boolean _boolean = false;

  @SerializedName("number")
  private Boolean number = false;

  @SerializedName("valueNode")
  private Boolean valueNode = false;

  @SerializedName("floatingPointNumber")
  private Boolean floatingPointNumber = false;

  @SerializedName("containerNode")
  private Boolean containerNode = false;

  @SerializedName("missingNode")
  private Boolean missingNode = false;

  @SerializedName("pojo")
  private Boolean pojo = false;

  @SerializedName("integralNumber")
  private Boolean integralNumber = false;

  @SerializedName("short")
  private Boolean _short = false;

  @SerializedName("int")
  private Boolean _int = false;

  @SerializedName("long")
  private Boolean _long = false;

  @SerializedName("double")
  private Boolean _double = false;

  @SerializedName("bigDecimal")
  private Boolean bigDecimal = false;

  @SerializedName("bigInteger")
  private Boolean bigInteger = false;

  @SerializedName("textual")
  private Boolean textual = false;

  @SerializedName("binary")
  private Boolean binary = false;

  @SerializedName("array")
  private Boolean array = false;

  /*@SerializedName("null")
  private Boolean null = false;*/

  /**
   **/
  @ApiModelProperty(value = "")
  public NodeTypeEnum getNodeType() {
    return nodeType;
  }
  public void setNodeType(NodeTypeEnum nodeType) {
    this.nodeType = nodeType;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getFloat() {
    return _float;
  }
  public void setFloat(Boolean _float) {
    this._float = _float;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getObject() {
    return object;
  }
  public void setObject(Boolean object) {
    this.object = object;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getBoolean() {
    return _boolean;
  }
  public void setBoolean(Boolean _boolean) {
    this._boolean = _boolean;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getNumber() {
    return number;
  }
  public void setNumber(Boolean number) {
    this.number = number;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getValueNode() {
    return valueNode;
  }
  public void setValueNode(Boolean valueNode) {
    this.valueNode = valueNode;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getFloatingPointNumber() {
    return floatingPointNumber;
  }
  public void setFloatingPointNumber(Boolean floatingPointNumber) {
    this.floatingPointNumber = floatingPointNumber;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getContainerNode() {
    return containerNode;
  }
  public void setContainerNode(Boolean containerNode) {
    this.containerNode = containerNode;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getMissingNode() {
    return missingNode;
  }
  public void setMissingNode(Boolean missingNode) {
    this.missingNode = missingNode;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getPojo() {
    return pojo;
  }
  public void setPojo(Boolean pojo) {
    this.pojo = pojo;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getIntegralNumber() {
    return integralNumber;
  }
  public void setIntegralNumber(Boolean integralNumber) {
    this.integralNumber = integralNumber;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getShort() {
    return _short;
  }
  public void setShort(Boolean _short) {
    this._short = _short;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getInt() {
    return _int;
  }
  public void setInt(Boolean _int) {
    this._int = _int;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getLong() {
    return _long;
  }
  public void setLong(Boolean _long) {
    this._long = _long;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getDouble() {
    return _double;
  }
  public void setDouble(Boolean _double) {
    this._double = _double;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getBigDecimal() {
    return bigDecimal;
  }
  public void setBigDecimal(Boolean bigDecimal) {
    this.bigDecimal = bigDecimal;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getBigInteger() {
    return bigInteger;
  }
  public void setBigInteger(Boolean bigInteger) {
    this.bigInteger = bigInteger;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getTextual() {
    return textual;
  }
  public void setTextual(Boolean textual) {
    this.textual = textual;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getBinary() {
    return binary;
  }
  public void setBinary(Boolean binary) {
    this.binary = binary;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getArray() {
    return array;
  }
  public void setArray(Boolean array) {
    this.array = array;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getNull() {
    return null;
  }
  /*public void setNull(Boolean null) {
    this.null = null;
  }*/


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonNode jsonNode = (JsonNode) o;
    return Objects.equals(nodeType, jsonNode.nodeType) &&
        Objects.equals(_float, jsonNode._float) &&
        Objects.equals(object, jsonNode.object) &&
        Objects.equals(_boolean, jsonNode._boolean) &&
        Objects.equals(number, jsonNode.number) &&
        Objects.equals(valueNode, jsonNode.valueNode) &&
        Objects.equals(floatingPointNumber, jsonNode.floatingPointNumber) &&
        Objects.equals(containerNode, jsonNode.containerNode) &&
        Objects.equals(missingNode, jsonNode.missingNode) &&
        Objects.equals(pojo, jsonNode.pojo) &&
        Objects.equals(integralNumber, jsonNode.integralNumber) &&
        Objects.equals(_short, jsonNode._short) &&
        Objects.equals(_int, jsonNode._int) &&
        Objects.equals(_long, jsonNode._long) &&
        Objects.equals(_double, jsonNode._double) &&
        Objects.equals(bigDecimal, jsonNode.bigDecimal) &&
        Objects.equals(bigInteger, jsonNode.bigInteger) &&
        Objects.equals(textual, jsonNode.textual) &&
        Objects.equals(binary, jsonNode.binary) &&
        Objects.equals(array, jsonNode.array); /*&&
        Objects.equals(null, jsonNode.null);*/
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeType, _float, object, _boolean, number, valueNode, floatingPointNumber, containerNode, missingNode, pojo, integralNumber, _short, _int, _long, _double, bigDecimal, bigInteger, textual, binary, array, null);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonNode {\n");
    
    sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
    sb.append("    _float: ").append(toIndentedString(_float)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    _boolean: ").append(toIndentedString(_boolean)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    valueNode: ").append(toIndentedString(valueNode)).append("\n");
    sb.append("    floatingPointNumber: ").append(toIndentedString(floatingPointNumber)).append("\n");
    sb.append("    containerNode: ").append(toIndentedString(containerNode)).append("\n");
    sb.append("    missingNode: ").append(toIndentedString(missingNode)).append("\n");
    sb.append("    pojo: ").append(toIndentedString(pojo)).append("\n");
    sb.append("    integralNumber: ").append(toIndentedString(integralNumber)).append("\n");
    sb.append("    _short: ").append(toIndentedString(_short)).append("\n");
    sb.append("    _int: ").append(toIndentedString(_int)).append("\n");
    sb.append("    _long: ").append(toIndentedString(_long)).append("\n");
    sb.append("    _double: ").append(toIndentedString(_double)).append("\n");
    sb.append("    bigDecimal: ").append(toIndentedString(bigDecimal)).append("\n");
    sb.append("    bigInteger: ").append(toIndentedString(bigInteger)).append("\n");
    sb.append("    textual: ").append(toIndentedString(textual)).append("\n");
    sb.append("    binary: ").append(toIndentedString(binary)).append("\n");
    sb.append("    array: ").append(toIndentedString(array)).append("\n");
    sb.append("    null: ").append(toIndentedString(null)).append("\n");
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
