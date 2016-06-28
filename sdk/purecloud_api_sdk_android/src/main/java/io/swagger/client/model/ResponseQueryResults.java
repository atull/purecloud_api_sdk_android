package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ResponseEntityList;

import com.google.gson.annotations.SerializedName;




/**
 * Used to return response query results
 **/
@ApiModel(description = "Used to return response query results")
public class ResponseQueryResults   {
  
  @SerializedName("results")
  private ResponseEntityList results = null;

  /**
   * Contains the query results
   **/
  @ApiModelProperty(required = true, value = "Contains the query results")
  public ResponseEntityList getResults() {
    return results;
  }
  public void setResults(ResponseEntityList results) {
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
    ResponseQueryResults responseQueryResults = (ResponseQueryResults) o;
    return Objects.equals(results, responseQueryResults.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseQueryResults {\n");
    
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
