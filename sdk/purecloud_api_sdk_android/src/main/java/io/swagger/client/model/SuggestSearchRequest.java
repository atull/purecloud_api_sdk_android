package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.SuggestSearchCriteria;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class SuggestSearchRequest   {
  
  @SerializedName("types")
  private List<String> types = new ArrayList<String>();

  @SerializedName("query")
  private List<SuggestSearchCriteria> query = new ArrayList<SuggestSearchCriteria>();

  /**
   * Resource Domain type
   **/
  @ApiModelProperty(required = true, value = "Resource Domain type")
  public List<String> getTypes() {
    return types;
  }
  public void setTypes(List<String> types) {
    this.types = types;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<SuggestSearchCriteria> getQuery() {
    return query;
  }
  public void setQuery(List<SuggestSearchCriteria> query) {
    this.query = query;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuggestSearchRequest suggestSearchRequest = (SuggestSearchRequest) o;
    return Objects.equals(types, suggestSearchRequest.types) &&
        Objects.equals(query, suggestSearchRequest.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(types, query);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuggestSearchRequest {\n");
    
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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
