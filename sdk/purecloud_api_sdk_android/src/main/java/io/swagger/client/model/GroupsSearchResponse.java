package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Group;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class GroupsSearchResponse   {
  
  @SerializedName("total")
  private Long total = null;

  @SerializedName("pageCount")
  private Integer pageCount = null;

  @SerializedName("pageSize")
  private Integer pageSize = null;

  @SerializedName("pageNumber")
  private Integer pageNumber = null;

  @SerializedName("previousPage")
  private String previousPage = null;

  @SerializedName("currentPage")
  private String currentPage = null;

  @SerializedName("nextPage")
  private String nextPage = null;

  @SerializedName("types")
  private List<String> types = new ArrayList<String>();

  @SerializedName("results")
  private List<Group> results = new ArrayList<Group>();

  @SerializedName("aggregations")
  private List<Group> aggregations = new ArrayList<Group>();

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getTotal() {
    return total;
  }
  public void setTotal(Long total) {
    this.total = total;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getPageCount() {
    return pageCount;
  }
  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
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
  public String getPreviousPage() {
    return previousPage;
  }
  public void setPreviousPage(String previousPage) {
    this.previousPage = previousPage;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCurrentPage() {
    return currentPage;
  }
  public void setCurrentPage(String currentPage) {
    this.currentPage = currentPage;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getNextPage() {
    return nextPage;
  }
  public void setNextPage(String nextPage) {
    this.nextPage = nextPage;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getTypes() {
    return types;
  }
  public void setTypes(List<String> types) {
    this.types = types;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Group> getResults() {
    return results;
  }
  public void setResults(List<Group> results) {
    this.results = results;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Group> getAggregations() {
    return aggregations;
  }
  public void setAggregations(List<Group> aggregations) {
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
    GroupsSearchResponse groupsSearchResponse = (GroupsSearchResponse) o;
    return Objects.equals(total, groupsSearchResponse.total) &&
        Objects.equals(pageCount, groupsSearchResponse.pageCount) &&
        Objects.equals(pageSize, groupsSearchResponse.pageSize) &&
        Objects.equals(pageNumber, groupsSearchResponse.pageNumber) &&
        Objects.equals(previousPage, groupsSearchResponse.previousPage) &&
        Objects.equals(currentPage, groupsSearchResponse.currentPage) &&
        Objects.equals(nextPage, groupsSearchResponse.nextPage) &&
        Objects.equals(types, groupsSearchResponse.types) &&
        Objects.equals(results, groupsSearchResponse.results) &&
        Objects.equals(aggregations, groupsSearchResponse.aggregations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, pageCount, pageSize, pageNumber, previousPage, currentPage, nextPage, types, results, aggregations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupsSearchResponse {\n");
    
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    previousPage: ").append(toIndentedString(previousPage)).append("\n");
    sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
    sb.append("    nextPage: ").append(toIndentedString(nextPage)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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
