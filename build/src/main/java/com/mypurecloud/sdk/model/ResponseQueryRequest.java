package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.ResponseFilter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


/**
 * Used to query for responses
 **/
@ApiModel(description = "Used to query for responses")
public class ResponseQueryRequest  implements Serializable {
  
  @SerializedName("queryPhrase")
  private String queryPhrase = null;

  @SerializedName("pageSize")
  private Integer pageSize = null;

  @SerializedName("filters")
  private List<ResponseFilter> filters = new ArrayList<ResponseFilter>();

  /**
   * Query phrase to search response text and name. If not set will match all.
   **/
  @ApiModelProperty(value = "Query phrase to search response text and name. If not set will match all.")
  public String getQueryPhrase() {
    return queryPhrase;
  }
  public void setQueryPhrase(String queryPhrase) {
    this.queryPhrase = queryPhrase;
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
   * Filter the query results.
   **/
  @ApiModelProperty(value = "Filter the query results.")
  public List<ResponseFilter> getFilters() {
    return filters;
  }
  public void setFilters(List<ResponseFilter> filters) {
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
    ResponseQueryRequest responseQueryRequest = (ResponseQueryRequest) o;
    return Objects.equals(queryPhrase, responseQueryRequest.queryPhrase) &&
        Objects.equals(pageSize, responseQueryRequest.pageSize) &&
        Objects.equals(filters, responseQueryRequest.filters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryPhrase, pageSize, filters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseQueryRequest {\n");
    
    sb.append("    queryPhrase: ").append(toIndentedString(queryPhrase)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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
