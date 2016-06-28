package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ContentAttributeFilterItem;
import io.swagger.client.model.ContentFacetFilterItem;
import io.swagger.client.model.ContentSortItem;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class ContentQueryRequest   {
  
  @SerializedName("queryPhrase")
  private String queryPhrase = null;

  @SerializedName("pageNumber")
  private Integer pageNumber = null;

  @SerializedName("pageSize")
  private Integer pageSize = null;

  @SerializedName("facetNameRequests")
  private List<String> facetNameRequests = new ArrayList<String>();

  @SerializedName("sort")
  private List<ContentSortItem> sort = new ArrayList<ContentSortItem>();

  @SerializedName("filters")
  private List<ContentFacetFilterItem> filters = new ArrayList<ContentFacetFilterItem>();

  @SerializedName("attributeFilters")
  private List<ContentAttributeFilterItem> attributeFilters = new ArrayList<ContentAttributeFilterItem>();

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
  public List<ContentSortItem> getSort() {
    return sort;
  }
  public void setSort(List<ContentSortItem> sort) {
    this.sort = sort;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<ContentFacetFilterItem> getFilters() {
    return filters;
  }
  public void setFilters(List<ContentFacetFilterItem> filters) {
    this.filters = filters;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<ContentAttributeFilterItem> getAttributeFilters() {
    return attributeFilters;
  }
  public void setAttributeFilters(List<ContentAttributeFilterItem> attributeFilters) {
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
    ContentQueryRequest contentQueryRequest = (ContentQueryRequest) o;
    return Objects.equals(queryPhrase, contentQueryRequest.queryPhrase) &&
        Objects.equals(pageNumber, contentQueryRequest.pageNumber) &&
        Objects.equals(pageSize, contentQueryRequest.pageSize) &&
        Objects.equals(facetNameRequests, contentQueryRequest.facetNameRequests) &&
        Objects.equals(sort, contentQueryRequest.sort) &&
        Objects.equals(filters, contentQueryRequest.filters) &&
        Objects.equals(attributeFilters, contentQueryRequest.attributeFilters) &&
        Objects.equals(includeShares, contentQueryRequest.includeShares);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryPhrase, pageNumber, pageSize, facetNameRequests, sort, filters, attributeFilters, includeShares);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentQueryRequest {\n");
    
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
