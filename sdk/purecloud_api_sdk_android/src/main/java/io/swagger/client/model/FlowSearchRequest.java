package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.FacetRequest;
import io.swagger.client.model.FilterItem;
import io.swagger.client.model.SortField;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;




/**
 * Used to perform a search on various data stored in search engines
 **/
@ApiModel(description = "Used to perform a search on various data stored in search engines")
public class FlowSearchRequest   {
  
  @SerializedName("searchPhrase")
  private String searchPhrase = null;

  @SerializedName("pageNumber")
  private Integer pageNumber = null;

  @SerializedName("pageSize")
  private Integer pageSize = null;

  @SerializedName("searchFields")
  private List<String> searchFields = new ArrayList<String>();

  @SerializedName("facetRequests")
  private List<FacetRequest> facetRequests = new ArrayList<FacetRequest>();

  @SerializedName("sort")
  private List<SortField> sort = new ArrayList<SortField>();

  @SerializedName("filters")
  private List<FilterItem> filters = new ArrayList<FilterItem>();

  /**
   * The search text to look for
   **/
  @ApiModelProperty(value = "The search text to look for")
  public String getSearchPhrase() {
    return searchPhrase;
  }
  public void setSearchPhrase(String searchPhrase) {
    this.searchPhrase = searchPhrase;
  }

  /**
   * The pageNumber to get results from (EG If there are 100 results with a pageSize of 10 and pageNumber is 3 then 10 results will be returned starting with index #31
   **/
  @ApiModelProperty(value = "The pageNumber to get results from (EG If there are 100 results with a pageSize of 10 and pageNumber is 3 then 10 results will be returned starting with index #31")
  public Integer getPageNumber() {
    return pageNumber;
  }
  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  /**
   * Number of entries to return/calculate per page.
   **/
  @ApiModelProperty(value = "Number of entries to return/calculate per page.")
  public Integer getPageSize() {
    return pageSize;
  }
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  /**
   * The fields to limit the searchPhrase search to
   **/
  @ApiModelProperty(value = "The fields to limit the searchPhrase search to")
  public List<String> getSearchFields() {
    return searchFields;
  }
  public void setSearchFields(List<String> searchFields) {
    this.searchFields = searchFields;
  }

  /**
   * List of facet requests to generate summary views from the search result set (if any)
   **/
  @ApiModelProperty(value = "List of facet requests to generate summary views from the search result set (if any)")
  public List<FacetRequest> getFacetRequests() {
    return facetRequests;
  }
  public void setFacetRequests(List<FacetRequest> facetRequests) {
    this.facetRequests = facetRequests;
  }

  /**
   * sort the results on a field(s)
   **/
  @ApiModelProperty(value = "sort the results on a field(s)")
  public List<SortField> getSort() {
    return sort;
  }
  public void setSort(List<SortField> sort) {
    this.sort = sort;
  }

  /**
   * You can also restrict the search to particular field values and ranges
   **/
  @ApiModelProperty(value = "You can also restrict the search to particular field values and ranges")
  public List<FilterItem> getFilters() {
    return filters;
  }
  public void setFilters(List<FilterItem> filters) {
    this.filters = filters;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowSearchRequest flowSearchRequest = (FlowSearchRequest) o;
    return Objects.equals(searchPhrase, flowSearchRequest.searchPhrase) &&
        Objects.equals(pageNumber, flowSearchRequest.pageNumber) &&
        Objects.equals(pageSize, flowSearchRequest.pageSize) &&
        Objects.equals(searchFields, flowSearchRequest.searchFields) &&
        Objects.equals(facetRequests, flowSearchRequest.facetRequests) &&
        Objects.equals(sort, flowSearchRequest.sort) &&
        Objects.equals(filters, flowSearchRequest.filters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchPhrase, pageNumber, pageSize, searchFields, facetRequests, sort, filters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowSearchRequest {\n");
    
    sb.append("    searchPhrase: ").append(toIndentedString(searchPhrase)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    searchFields: ").append(toIndentedString(searchFields)).append("\n");
    sb.append("    facetRequests: ").append(toIndentedString(facetRequests)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
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
