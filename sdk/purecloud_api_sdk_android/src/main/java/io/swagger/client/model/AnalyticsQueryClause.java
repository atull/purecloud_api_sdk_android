package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.AnalyticsQueryPredicate;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class AnalyticsQueryClause   {
  

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    @SerializedName("and")
    AND("and"),

    @SerializedName("or")
    OR("or");

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

  @SerializedName("predicates")
  private List<AnalyticsQueryPredicate> predicates = new ArrayList<AnalyticsQueryPredicate>();

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
   * Like a three-word sentence: (attribute-name) (operator) (target-value). These can be one of three types: dimension, property, metric.
   **/
  @ApiModelProperty(value = "Like a three-word sentence: (attribute-name) (operator) (target-value). These can be one of three types: dimension, property, metric.")
  public List<AnalyticsQueryPredicate> getPredicates() {
    return predicates;
  }
  public void setPredicates(List<AnalyticsQueryPredicate> predicates) {
    this.predicates = predicates;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsQueryClause analyticsQueryClause = (AnalyticsQueryClause) o;
    return Objects.equals(type, analyticsQueryClause.type) &&
        Objects.equals(predicates, analyticsQueryClause.predicates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, predicates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsQueryClause {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    predicates: ").append(toIndentedString(predicates)).append("\n");
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
