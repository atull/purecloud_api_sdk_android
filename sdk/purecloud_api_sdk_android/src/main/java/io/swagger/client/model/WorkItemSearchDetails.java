package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.WorkItemDetails;

import com.google.gson.annotations.SerializedName;




/**
 * WorkItem entry found in result to a search.
 **/
@ApiModel(description = "WorkItem entry found in result to a search.")
public class WorkItemSearchDetails   {
  
  @SerializedName("workItem")
  private WorkItemDetails workItem = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public WorkItemDetails getWorkItem() {
    return workItem;
  }
  public void setWorkItem(WorkItemDetails workItem) {
    this.workItem = workItem;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkItemSearchDetails workItemSearchDetails = (WorkItemSearchDetails) o;
    return Objects.equals(workItem, workItemSearchDetails.workItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workItem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkItemSearchDetails {\n");
    
    sb.append("    workItem: ").append(toIndentedString(workItem)).append("\n");
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
