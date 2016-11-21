package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.DomainResourceConditionNode;
import com.mypurecloud.sdk.model.DomainResourceConditionValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class DomainResourceConditionNode  implements Serializable {
  
  @SerializedName("variableName")
  private String variableName = null;


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
  private List<DomainResourceConditionValue> operands = new ArrayList<DomainResourceConditionValue>();


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

  @SerializedName("terms")
  private List<DomainResourceConditionNode> terms = new ArrayList<DomainResourceConditionNode>();

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
  public OperatorEnum getOperator() {
    return operator;
  }
  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<DomainResourceConditionValue> getOperands() {
    return operands;
  }
  public void setOperands(List<DomainResourceConditionValue> operands) {
    this.operands = operands;
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
  public List<DomainResourceConditionNode> getTerms() {
    return terms;
  }
  public void setTerms(List<DomainResourceConditionNode> terms) {
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
    DomainResourceConditionNode domainResourceConditionNode = (DomainResourceConditionNode) o;
    return Objects.equals(variableName, domainResourceConditionNode.variableName) &&
        Objects.equals(operator, domainResourceConditionNode.operator) &&
        Objects.equals(operands, domainResourceConditionNode.operands) &&
        Objects.equals(conjunction, domainResourceConditionNode.conjunction) &&
        Objects.equals(terms, domainResourceConditionNode.terms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(variableName, operator, operands, conjunction, terms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainResourceConditionNode {\n");
    
    sb.append("    variableName: ").append(toIndentedString(variableName)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    operands: ").append(toIndentedString(operands)).append("\n");
    sb.append("    conjunction: ").append(toIndentedString(conjunction)).append("\n");
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
