package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.FacetResult;
import io.swagger.client.model.LinkedEntityListingFlowDetails;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;




/**
 * Contains the found elements of a search along with the facet result.  All facet results are always returned along with the searchResults regardless of page size/number.
 **/
@ApiModel(description = "Contains the found elements of a search along with the facet result.  All facet results are always returned along with the searchResults regardless of page size/number.")
public class FlowDetailsSearchResult   {
  
  @SerializedName("searchResults")
  private LinkedEntityListingFlowDetails searchResults = null;

  @SerializedName("facetResults")
  private List<FacetResult> facetResults = new ArrayList<FacetResult>();

  /**
   * The actual results from the search
   **/
  @ApiModelProperty(value = "The actual results from the search")
  public LinkedEntityListingFlowDetails getSearchResults() {
    return searchResults;
  }
  public void setSearchResults(LinkedEntityListingFlowDetails searchResults) {
    this.searchResults = searchResults;
  }

  /**
   * The results from the facet requests for this search - note ALL facets will always be returned regardless of page size/starting pagenumber in the searchRequest
   **/
  @ApiModelProperty(value = "The results from the facet requests for this search - note ALL facets will always be returned regardless of page size/starting pagenumber in the searchRequest")
  public List<FacetResult> getFacetResults() {
    return facetResults;
  }
  public void setFacetResults(List<FacetResult> facetResults) {
    this.facetResults = facetResults;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowDetailsSearchResult flowDetailsSearchResult = (FlowDetailsSearchResult) o;
    return Objects.equals(searchResults, flowDetailsSearchResult.searchResults) &&
        Objects.equals(facetResults, flowDetailsSearchResult.facetResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchResults, facetResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowDetailsSearchResult {\n");
    
    sb.append("    searchResults: ").append(toIndentedString(searchResults)).append("\n");
    sb.append("    facetResults: ").append(toIndentedString(facetResults)).append("\n");
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
