package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.FacetResultItem;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;




/**
 * Used as part of the searchResult to return facet results to the caller
 **/
@ApiModel(description = "Used as part of the searchResult to return facet results to the caller")
public class FacetResult   {
  
  @SerializedName("requestName")
  private String requestName = null;

  @SerializedName("requestFieldName")
  private String requestFieldName = null;


  /**
   * data type of the field being returned (if this is a mixed field this will be unknown)
   */
  public enum FieldTypeEnum {
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

    FieldTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("fieldType")
  private FieldTypeEnum fieldType = null;


  /**
   * the facet request type that was made.
   */
  public enum RequestTypeEnum {
    @SerializedName("TERM")
    TERM("TERM"),

    @SerializedName("RANGE")
    RANGE("RANGE");

    private String value;

    RequestTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("requestType")
  private RequestTypeEnum requestType = null;

  @SerializedName("results")
  private List<FacetResultItem> results = new ArrayList<FacetResultItem>();

  /**
   * This was the name passed in as part of the facetRequest
   **/
  @ApiModelProperty(value = "This was the name passed in as part of the facetRequest")
  public String getRequestName() {
    return requestName;
  }
  public void setRequestName(String requestName) {
    this.requestName = requestName;
  }

  /**
   * The field name that the facet was requested for.
   **/
  @ApiModelProperty(value = "The field name that the facet was requested for.")
  public String getRequestFieldName() {
    return requestFieldName;
  }
  public void setRequestFieldName(String requestFieldName) {
    this.requestFieldName = requestFieldName;
  }

  /**
   * data type of the field being returned (if this is a mixed field this will be unknown)
   **/
  @ApiModelProperty(value = "data type of the field being returned (if this is a mixed field this will be unknown)")
  public FieldTypeEnum getFieldType() {
    return fieldType;
  }
  public void setFieldType(FieldTypeEnum fieldType) {
    this.fieldType = fieldType;
  }

  /**
   * the facet request type that was made.
   **/
  @ApiModelProperty(value = "the facet request type that was made.")
  public RequestTypeEnum getRequestType() {
    return requestType;
  }
  public void setRequestType(RequestTypeEnum requestType) {
    this.requestType = requestType;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<FacetResultItem> getResults() {
    return results;
  }
  public void setResults(List<FacetResultItem> results) {
    this.results = results;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FacetResult facetResult = (FacetResult) o;
    return Objects.equals(requestName, facetResult.requestName) &&
        Objects.equals(requestFieldName, facetResult.requestFieldName) &&
        Objects.equals(fieldType, facetResult.fieldType) &&
        Objects.equals(requestType, facetResult.requestType) &&
        Objects.equals(results, facetResult.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestName, requestFieldName, fieldType, requestType, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacetResult {\n");
    
    sb.append("    requestName: ").append(toIndentedString(requestName)).append("\n");
    sb.append("    requestFieldName: ").append(toIndentedString(requestFieldName)).append("\n");
    sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
    sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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
