package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.LocationSearchCriteria;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class LocationSearchRequest  implements Serializable {
  

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

  @SerializedName("query")
  private List<LocationSearchCriteria> query = new ArrayList<LocationSearchCriteria>();

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
   **/
  @ApiModelProperty(value = "")
  public List<LocationSearchCriteria> getQuery() {
    return query;
  }
  public void setQuery(List<LocationSearchCriteria> query) {
    this.query = query;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationSearchRequest locationSearchRequest = (LocationSearchRequest) o;
    return Objects.equals(sortOrder, locationSearchRequest.sortOrder) &&
        Objects.equals(sortBy, locationSearchRequest.sortBy) &&
        Objects.equals(pageSize, locationSearchRequest.pageSize) &&
        Objects.equals(pageNumber, locationSearchRequest.pageNumber) &&
        Objects.equals(returnFields, locationSearchRequest.returnFields) &&
        Objects.equals(expand, locationSearchRequest.expand) &&
        Objects.equals(query, locationSearchRequest.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sortOrder, sortBy, pageSize, pageNumber, returnFields, expand, query);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationSearchRequest {\n");
    
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    returnFields: ").append(toIndentedString(returnFields)).append("\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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
