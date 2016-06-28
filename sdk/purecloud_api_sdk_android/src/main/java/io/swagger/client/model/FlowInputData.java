package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;




/**
 * launch parameters or initializations for variables in the flow.
 **/
@ApiModel(description = "launch parameters or initializations for variables in the flow.")
public class FlowInputData   {
  
  @SerializedName("linkedDocumentIds")
  private List<String> linkedDocumentIds = new ArrayList<String>();

  /**
   * A list of document IDs to link with the new flow instance.
   **/
  @ApiModelProperty(value = "A list of document IDs to link with the new flow instance.")
  public List<String> getLinkedDocumentIds() {
    return linkedDocumentIds;
  }
  public void setLinkedDocumentIds(List<String> linkedDocumentIds) {
    this.linkedDocumentIds = linkedDocumentIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowInputData flowInputData = (FlowInputData) o;
    return Objects.equals(linkedDocumentIds, flowInputData.linkedDocumentIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkedDocumentIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowInputData {\n");
    
    sb.append("    linkedDocumentIds: ").append(toIndentedString(linkedDocumentIds)).append("\n");
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
