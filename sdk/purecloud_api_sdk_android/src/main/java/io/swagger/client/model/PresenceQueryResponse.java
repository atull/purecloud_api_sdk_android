package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.AggregateDataContainer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;





public class PresenceQueryResponse   {
  
  @SerializedName("systemToOrganizationMappings")
  private Map<String, List<String>> systemToOrganizationMappings = new HashMap<String, List<String>>();

  @SerializedName("results")
  private List<AggregateDataContainer> results = new ArrayList<AggregateDataContainer>();

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
  public List<AggregateDataContainer> getResults() {
    return results;
  }
  public void setResults(List<AggregateDataContainer> results) {
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
    PresenceQueryResponse presenceQueryResponse = (PresenceQueryResponse) o;
    return Objects.equals(systemToOrganizationMappings, presenceQueryResponse.systemToOrganizationMappings) &&
        Objects.equals(results, presenceQueryResponse.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(systemToOrganizationMappings, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PresenceQueryResponse {\n");
    
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
