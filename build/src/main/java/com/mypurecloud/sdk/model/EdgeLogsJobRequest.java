package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class EdgeLogsJobRequest  implements Serializable {
  
  @SerializedName("path")
  private String path = null;

  @SerializedName("query")
  private String query = null;

  @SerializedName("recurse")
  private Boolean recurse = false;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPath() {
    return path;
  }
  public void setPath(String path) {
    this.path = path;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getQuery() {
    return query;
  }
  public void setQuery(String query) {
    this.query = query;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getRecurse() {
    return recurse;
  }
  public void setRecurse(Boolean recurse) {
    this.recurse = recurse;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdgeLogsJobRequest edgeLogsJobRequest = (EdgeLogsJobRequest) o;
    return Objects.equals(path, edgeLogsJobRequest.path) &&
        Objects.equals(query, edgeLogsJobRequest.query) &&
        Objects.equals(recurse, edgeLogsJobRequest.recurse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, query, recurse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdgeLogsJobRequest {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    recurse: ").append(toIndentedString(recurse)).append("\n");
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
