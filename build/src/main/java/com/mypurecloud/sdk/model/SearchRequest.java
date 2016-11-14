package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.SearchAggregation;
import com.mypurecloud.sdk.model.SearchCriteria;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class SearchRequest  implements Serializable {
  

  /**
   * Gets or Sets sortOrder
   */
  public enum SortOrderEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("ASC")
    ASC("ASC"),

    @SerializedName("DESC")
    DESC("DESC"),

    @SerializedName("SCORE")
    SCORE("SCORE");

    private String value;

    SortOrderEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("sortOrder")
  private SortOrderEnum sortOrder = null;

  @SerializedName("sortBy")
  private String sortBy = null;

  @SerializedName("pageSize")
  private Integer pageSize = null;

  @SerializedName("pageNumber")
  private Integer pageNumber = null;

  @SerializedName("returnFields")
  private List<String> returnFields = new ArrayList<String>();

  @SerializedName("expand")
  private List<String> expand = new ArrayList<String>();

  @SerializedName("types")
  private List<String> types = new ArrayList<String>();

  @SerializedName("query")
  private List<SearchCriteria> query = new ArrayList<SearchCriteria>();

  @SerializedName("aggregations")
  private List<SearchAggregation> aggregations = new ArrayList<SearchAggregation>();

  /**
   **/
  @ApiModelProperty(value = "")
  public SortOrderEnum getSortOrder() {
    return sortOrder;
  }
  public void setSortOrder(SortOrderEnum sortOrder) {
    this.sortOrder = sortOrder;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSortBy() {
    return sortBy;
  }
  public void setSortBy(String sortBy) {
    this.sortBy = sortBy;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getPageSize() {
    return pageSize;
  }
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getPageNumber() {
    return pageNumber;
  }
  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getReturnFields() {
    return returnFields;
  }
  public void setReturnFields(List<String> returnFields) {
    this.returnFields = returnFields;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getExpand() {
    return expand;
  }
  public void setExpand(List<String> expand) {
    this.expand = expand;
  }

  /**
   * Resource Domain type
   **/
  @ApiModelProperty(required = true, value = "Resource Domain type")
  public List<String> getTypes() {
    return types;
  }
  public void setTypes(List<String> types) {
    this.types = types;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<SearchCriteria> getQuery() {
    return query;
  }
  public void setQuery(List<SearchCriteria> query) {
    this.query = query;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<SearchAggregation> getAggregations() {
    return aggregations;
  }
  public void setAggregations(List<SearchAggregation> aggregations) {
    this.aggregations = aggregations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchRequest searchRequest = (SearchRequest) o;
    return Objects.equals(sortOrder, searchRequest.sortOrder) &&
        Objects.equals(sortBy, searchRequest.sortBy) &&
        Objects.equals(pageSize, searchRequest.pageSize) &&
        Objects.equals(pageNumber, searchRequest.pageNumber) &&
        Objects.equals(returnFields, searchRequest.returnFields) &&
        Objects.equals(expand, searchRequest.expand) &&
        Objects.equals(types, searchRequest.types) &&
        Objects.equals(query, searchRequest.query) &&
        Objects.equals(aggregations, searchRequest.aggregations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sortOrder, sortBy, pageSize, pageNumber, returnFields, expand, types, query, aggregations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchRequest {\n");
    
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    returnFields: ").append(toIndentedString(returnFields)).append("\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    aggregations: ").append(toIndentedString(aggregations)).append("\n");
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
