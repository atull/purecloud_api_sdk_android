package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ObservationDataContainer;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class ObservationQueryResponse   {
  
  @SerializedName("results")
  private List<ObservationDataContainer> results = new ArrayList<ObservationDataContainer>();

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
    ObservationQueryResponse observationQueryResponse = (ObservationQueryResponse) o;
    return Objects.equals(results, observationQueryResponse.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservationQueryResponse {\n");
    
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
