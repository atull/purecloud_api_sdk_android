package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.AggregateDataContainer;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class AggregateQueryResponse   {
  
  @SerializedName("results")
  private List<AggregateDataContainer> results = new ArrayList<AggregateDataContainer>();

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
    AggregateQueryResponse aggregateQueryResponse = (AggregateQueryResponse) o;
    return Objects.equals(results, aggregateQueryResponse.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregateQueryResponse {\n");
    
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
