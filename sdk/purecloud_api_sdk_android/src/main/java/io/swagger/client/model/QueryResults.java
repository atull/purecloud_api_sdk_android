package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.DomainEntityListingQueryResult;
import io.swagger.client.model.QueryFacetInfo;

import com.google.gson.annotations.SerializedName;





public class QueryResults   {
  
  @SerializedName("results")
  private DomainEntityListingQueryResult results = null;

  @SerializedName("facetInfo")
  private QueryFacetInfo facetInfo = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public DomainEntityListingQueryResult getResults() {
    return results;
  }
  public void setResults(DomainEntityListingQueryResult results) {
    this.results = results;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public QueryFacetInfo getFacetInfo() {
    return facetInfo;
  }
  public void setFacetInfo(QueryFacetInfo facetInfo) {
    this.facetInfo = facetInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryResults queryResults = (QueryResults) o;
    return Objects.equals(results, queryResults.results) &&
        Objects.equals(facetInfo, queryResults.facetInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, facetInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryResults {\n");
    
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    facetInfo: ").append(toIndentedString(facetInfo)).append("\n");
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
