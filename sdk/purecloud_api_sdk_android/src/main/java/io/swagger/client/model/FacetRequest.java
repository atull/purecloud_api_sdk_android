package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




/**
 * Used as part of a searchRequest or reportRequest to denote which facets to generate from the search results.  For RANGE facets, one of rangeFrom or rangeTo (or both) MUST be set
 **/
@ApiModel(description = "Used as part of a searchRequest or reportRequest to denote which facets to generate from the search results.  For RANGE facets, one of rangeFrom or rangeTo (or both) MUST be set")
public class FacetRequest   {
  
  @SerializedName("name")
  private String name = null;


  /**
   * Which facet request type
   */
  public enum FacetRequestQueryTypeEnum {
    @SerializedName("TERM")
    TERM("TERM"),

    @SerializedName("RANGE")
    RANGE("RANGE");

    private String value;

    FacetRequestQueryTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("facetRequestQueryType")
  private FacetRequestQueryTypeEnum facetRequestQueryType = null;

  @SerializedName("fieldName")
  private String fieldName = null;


  /**
   * the fieldtype of the field to perform the facet request on.
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

  @SerializedName("rangeFrom")
  private String rangeFrom = null;

  @SerializedName("rangeTo")
  private String rangeTo = null;

  @SerializedName("maxFacetCount")
  private Integer maxFacetCount = null;

  /**
   * name of the facet request that will be returned with the result set
   **/
  @ApiModelProperty(required = true, value = "name of the facet request that will be returned with the result set")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Which facet request type
   **/
  @ApiModelProperty(required = true, value = "Which facet request type")
  public FacetRequestQueryTypeEnum getFacetRequestQueryType() {
    return facetRequestQueryType;
  }
  public void setFacetRequestQueryType(FacetRequestQueryTypeEnum facetRequestQueryType) {
    this.facetRequestQueryType = facetRequestQueryType;
  }

  /**
   * The fieldName to perform the facet request on.
   **/
  @ApiModelProperty(required = true, value = "The fieldName to perform the facet request on.")
  public String getFieldName() {
    return fieldName;
  }
  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  /**
   * the fieldtype of the field to perform the facet request on.
   **/
  @ApiModelProperty(value = "the fieldtype of the field to perform the facet request on.")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * For RANGE requests populate this field to specify the beginning of a limit (leave blank for openended).  Note this value is inclusive of the results.  (EG if the value is 1, 1 will be included in the range.)
   **/
  @ApiModelProperty(value = "For RANGE requests populate this field to specify the beginning of a limit (leave blank for openended).  Note this value is inclusive of the results.  (EG if the value is 1, 1 will be included in the range.)")
  public String getRangeFrom() {
    return rangeFrom;
  }
  public void setRangeFrom(String rangeFrom) {
    this.rangeFrom = rangeFrom;
  }

  /**
   * For RANGE requests populate this field to specify the end of a limit (leave blank for openended).  Note this value is EXCLUSIVE of the result (EG if this value was 5, only values LESS THAN 5 will be included in the count.)
   **/
  @ApiModelProperty(value = "For RANGE requests populate this field to specify the end of a limit (leave blank for openended).  Note this value is EXCLUSIVE of the result (EG if this value was 5, only values LESS THAN 5 will be included in the count.)")
  public String getRangeTo() {
    return rangeTo;
  }
  public void setRangeTo(String rangeTo) {
    this.rangeTo = rangeTo;
  }

  /**
   * Limits/expands the number of facet entries returned (default 500)
   **/
  @ApiModelProperty(value = "Limits/expands the number of facet entries returned (default 500)")
  public Integer getMaxFacetCount() {
    return maxFacetCount;
  }
  public void setMaxFacetCount(Integer maxFacetCount) {
    this.maxFacetCount = maxFacetCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FacetRequest facetRequest = (FacetRequest) o;
    return Objects.equals(name, facetRequest.name) &&
        Objects.equals(facetRequestQueryType, facetRequest.facetRequestQueryType) &&
        Objects.equals(fieldName, facetRequest.fieldName) &&
        Objects.equals(type, facetRequest.type) &&
        Objects.equals(rangeFrom, facetRequest.rangeFrom) &&
        Objects.equals(rangeTo, facetRequest.rangeTo) &&
        Objects.equals(maxFacetCount, facetRequest.maxFacetCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, facetRequestQueryType, fieldName, type, rangeFrom, rangeTo, maxFacetCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacetRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    facetRequestQueryType: ").append(toIndentedString(facetRequestQueryType)).append("\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    rangeFrom: ").append(toIndentedString(rangeFrom)).append("\n");
    sb.append("    rangeTo: ").append(toIndentedString(rangeTo)).append("\n");
    sb.append("    maxFacetCount: ").append(toIndentedString(maxFacetCount)).append("\n");
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
