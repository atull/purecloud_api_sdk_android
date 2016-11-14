package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.AttributeFilterItem;
import com.mypurecloud.sdk.model.ContentFilterItem;
import com.mypurecloud.sdk.model.SortItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class QueryRequest  implements Serializable {
  
  @SerializedName("queryPhrase")
  private String queryPhrase = null;

  @SerializedName("pageNumber")
  private Integer pageNumber = null;

  @SerializedName("pageSize")
  private Integer pageSize = null;

  @SerializedName("facetNameRequests")
  private List<String> facetNameRequests = new ArrayList<String>();

  @SerializedName("sort")
  private List<SortItem> sort = new ArrayList<SortItem>();

  @SerializedName("filters")
  private List<ContentFilterItem> filters = new ArrayList<ContentFilterItem>();

  @SerializedName("attributeFilters")
  private List<AttributeFilterItem> attributeFilters = new ArrayList<AttributeFilterItem>();

  @SerializedName("includeShares")
  private Boolean includeShares = false;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getQueryPhrase() {
    return queryPhrase;
  }
  public void setQueryPhrase(String queryPhrase) {
    this.queryPhrase = queryPhrase;
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
  public Integer getPageSize() {
    return pageSize;
  }
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getFacetNameRequests() {
    return facetNameRequests;
  }
  public void setFacetNameRequests(List<String> facetNameRequests) {
    this.facetNameRequests = facetNameRequests;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<SortItem> getSort() {
    return sort;
  }
  public void setSort(List<SortItem> sort) {
    this.sort = sort;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<ContentFilterItem> getFilters() {
    return filters;
  }
  public void setFilters(List<ContentFilterItem> filters) {
    this.filters = filters;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<AttributeFilterItem> getAttributeFilters() {
    return attributeFilters;
  }
  public void setAttributeFilters(List<AttributeFilterItem> attributeFilters) {
    this.attributeFilters = attributeFilters;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getIncludeShares() {
    return includeShares;
  }
  public void setIncludeShares(Boolean includeShares) {
    this.includeShares = includeShares;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryRequest queryRequest = (QueryRequest) o;
    return Objects.equals(queryPhrase, queryRequest.queryPhrase) &&
        Objects.equals(pageNumber, queryRequest.pageNumber) &&
        Objects.equals(pageSize, queryRequest.pageSize) &&
        Objects.equals(facetNameRequests, queryRequest.facetNameRequests) &&
        Objects.equals(sort, queryRequest.sort) &&
        Objects.equals(filters, queryRequest.filters) &&
        Objects.equals(attributeFilters, queryRequest.attributeFilters) &&
        Objects.equals(includeShares, queryRequest.includeShares);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryPhrase, pageNumber, pageSize, facetNameRequests, sort, filters, attributeFilters, includeShares);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryRequest {\n");
    
    sb.append("    queryPhrase: ").append(toIndentedString(queryPhrase)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    facetNameRequests: ").append(toIndentedString(facetNameRequests)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    attributeFilters: ").append(toIndentedString(attributeFilters)).append("\n");
    sb.append("    includeShares: ").append(toIndentedString(includeShares)).append("\n");
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
