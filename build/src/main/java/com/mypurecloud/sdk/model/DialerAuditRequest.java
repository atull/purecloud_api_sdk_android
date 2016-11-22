package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.AuditFacet;
import com.mypurecloud.sdk.model.AuditFilter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class DialerAuditRequest  implements Serializable {
  
  @SerializedName("queryPhrase")
  private String queryPhrase = null;

  @SerializedName("queryFields")
  private List<String> queryFields = new ArrayList<String>();

  @SerializedName("facets")
  private List<AuditFacet> facets = new ArrayList<AuditFacet>();

  @SerializedName("filters")
  private List<AuditFilter> filters = new ArrayList<AuditFilter>();

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
  public List<String> getQueryFields() {
    return queryFields;
  }
  public void setQueryFields(List<String> queryFields) {
    this.queryFields = queryFields;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<AuditFacet> getFacets() {
    return facets;
  }
  public void setFacets(List<AuditFacet> facets) {
    this.facets = facets;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<AuditFilter> getFilters() {
    return filters;
  }
  public void setFilters(List<AuditFilter> filters) {
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
    DialerAuditRequest dialerAuditRequest = (DialerAuditRequest) o;
    return Objects.equals(queryPhrase, dialerAuditRequest.queryPhrase) &&
        Objects.equals(queryFields, dialerAuditRequest.queryFields) &&
        Objects.equals(facets, dialerAuditRequest.facets) &&
        Objects.equals(filters, dialerAuditRequest.filters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryPhrase, queryFields, facets, filters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerAuditRequest {\n");
    
    sb.append("    queryPhrase: ").append(toIndentedString(queryPhrase)).append("\n");
    sb.append("    queryFields: ").append(toIndentedString(queryFields)).append("\n");
    sb.append("    facets: ").append(toIndentedString(facets)).append("\n");
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
