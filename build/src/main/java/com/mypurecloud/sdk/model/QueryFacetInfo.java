package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.FacetEntry;
import com.mypurecloud.sdk.model.FacetKeyAttribute;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class QueryFacetInfo  implements Serializable {
  
  @SerializedName("attributes")
  private List<FacetKeyAttribute> attributes = new ArrayList<FacetKeyAttribute>();

  @SerializedName("facets")
  private List<FacetEntry> facets = new ArrayList<FacetEntry>();

  /**
   **/
  @ApiModelProperty(value = "")
  public List<FacetKeyAttribute> getAttributes() {
    return attributes;
  }
  public void setAttributes(List<FacetKeyAttribute> attributes) {
    this.attributes = attributes;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<FacetEntry> getFacets() {
    return facets;
  }
  public void setFacets(List<FacetEntry> facets) {
    this.facets = facets;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryFacetInfo queryFacetInfo = (QueryFacetInfo) o;
    return Objects.equals(attributes, queryFacetInfo.attributes) &&
        Objects.equals(facets, queryFacetInfo.facets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, facets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryFacetInfo {\n");
    
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    facets: ").append(toIndentedString(facets)).append("\n");
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
