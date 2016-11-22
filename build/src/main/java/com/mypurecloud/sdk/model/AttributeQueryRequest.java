package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


/**
 * Used to query for attributes
 **/
@ApiModel(description = "Used to query for attributes")
public class AttributeQueryRequest  implements Serializable {
  
  @SerializedName("query")
  private String query = null;

  @SerializedName("pageSize")
  private Integer pageSize = null;

  @SerializedName("pageNumber")
  private Integer pageNumber = null;

  /**
   * Query phrase to search attribute by name. If not set will match all.
   **/
  @ApiModelProperty(value = "Query phrase to search attribute by name. If not set will match all.")
  public String getQuery() {
    return query;
  }
  public void setQuery(String query) {
    this.query = query;
  }

  /**
   * The maximum number of hits to return. Default: 25, Maximum: 500.
   **/
  @ApiModelProperty(value = "The maximum number of hits to return. Default: 25, Maximum: 500.")
  public Integer getPageSize() {
    return pageSize;
  }
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  /**
   * The page number to start at. The first page is number 1.
   **/
  @ApiModelProperty(value = "The page number to start at. The first page is number 1.")
  public Integer getPageNumber() {
    return pageNumber;
  }
  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttributeQueryRequest attributeQueryRequest = (AttributeQueryRequest) o;
    return Objects.equals(query, attributeQueryRequest.query) &&
        Objects.equals(pageSize, attributeQueryRequest.pageSize) &&
        Objects.equals(pageNumber, attributeQueryRequest.pageNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, pageSize, pageNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttributeQueryRequest {\n");
    
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
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
