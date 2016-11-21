package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.ObservationDataContainer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class QualifierMappingObservationQueryResponse  implements Serializable {
  
  @SerializedName("systemToOrganizationMappings")
  private Map<String, List<String>> systemToOrganizationMappings = new HashMap<String, List<String>>();

  @SerializedName("results")
  private List<ObservationDataContainer> results = new ArrayList<ObservationDataContainer>();

  /**
   * A mapping from system presence to a list of organization presence ids
   **/
  @ApiModelProperty(value = "A mapping from system presence to a list of organization presence ids")
  public Map<String, List<String>> getSystemToOrganizationMappings() {
    return systemToOrganizationMappings;
  }
  public void setSystemToOrganizationMappings(Map<String, List<String>> systemToOrganizationMappings) {
    this.systemToOrganizationMappings = systemToOrganizationMappings;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<ObservationDataContainer> getResults() {
    return results;
  }
  public void setResults(List<ObservationDataContainer> results) {
    this.results = results;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QualifierMappingObservationQueryResponse qualifierMappingObservationQueryResponse = (QualifierMappingObservationQueryResponse) o;
    return Objects.equals(systemToOrganizationMappings, qualifierMappingObservationQueryResponse.systemToOrganizationMappings) &&
        Objects.equals(results, qualifierMappingObservationQueryResponse.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(systemToOrganizationMappings, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QualifierMappingObservationQueryResponse {\n");
    
    sb.append("    systemToOrganizationMappings: ").append(toIndentedString(systemToOrganizationMappings)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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
