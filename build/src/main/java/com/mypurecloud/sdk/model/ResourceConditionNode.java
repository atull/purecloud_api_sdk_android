package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.ResourceConditionNode;
import com.mypurecloud.sdk.model.ResourceConditionValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class ResourceConditionNode  implements Serializable {
  
  @SerializedName("variableName")
  private String variableName = null;


  /**
   * Gets or Sets conjunction
   */
  public enum ConjunctionEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("AND")
    AND("AND"),

    @SerializedName("OR")
    OR("OR");

    private String value;

    ConjunctionEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("conjunction")
  private ConjunctionEnum conjunction = null;


  /**
   * Gets or Sets operator
   */
  public enum OperatorEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("EQ")
    EQ("EQ"),

    @SerializedName("IN")
    IN("IN"),

    @SerializedName("GE")
    GE("GE"),

    @SerializedName("GT")
    GT("GT"),

    @SerializedName("LE")
    LE("LE"),

    @SerializedName("LT")
    LT("LT");

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

  @SerializedName("operands")
  private List<ResourceConditionValue> operands = new ArrayList<ResourceConditionValue>();

  @SerializedName("terms")
  private List<ResourceConditionNode> terms = new ArrayList<ResourceConditionNode>();

  /**
   **/
  @ApiModelProperty(value = "")
  public String getVariableName() {
    return variableName;
  }
  public void setVariableName(String variableName) {
    this.variableName = variableName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConjunctionEnum getConjunction() {
    return conjunction;
  }
  public void setConjunction(ConjunctionEnum conjunction) {
    this.conjunction = conjunction;
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
  public List<ResourceConditionValue> getOperands() {
    return operands;
  }
  public void setOperands(List<ResourceConditionValue> operands) {
    this.operands = operands;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<ResourceConditionNode> getTerms() {
    return terms;
  }
  public void setTerms(List<ResourceConditionNode> terms) {
    this.terms = terms;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceConditionNode resourceConditionNode = (ResourceConditionNode) o;
    return Objects.equals(variableName, resourceConditionNode.variableName) &&
        Objects.equals(conjunction, resourceConditionNode.conjunction) &&
        Objects.equals(operator, resourceConditionNode.operator) &&
        Objects.equals(operands, resourceConditionNode.operands) &&
        Objects.equals(terms, resourceConditionNode.terms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(variableName, conjunction, operator, operands, terms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceConditionNode {\n");
    
    sb.append("    variableName: ").append(toIndentedString(variableName)).append("\n");
    sb.append("    conjunction: ").append(toIndentedString(conjunction)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    operands: ").append(toIndentedString(operands)).append("\n");
    sb.append("    terms: ").append(toIndentedString(terms)).append("\n");
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
