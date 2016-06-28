package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




/**
 * Information about the work item associated with a history item.
 **/
@ApiModel(description = "Information about the work item associated with a history item.")
public class WorkItem   {
  
  @SerializedName("workItemExecId")
  private String workItemExecId = null;

  @SerializedName("workItemConfigId")
  private String workItemConfigId = null;

  @SerializedName("workItemName")
  private String workItemName = null;

  /**
   * The work item execution id.
   **/
  @ApiModelProperty(required = true, value = "The work item execution id.")
  public String getWorkItemExecId() {
    return workItemExecId;
  }
  public void setWorkItemExecId(String workItemExecId) {
    this.workItemExecId = workItemExecId;
  }

  /**
   * The work item definition id.
   **/
  @ApiModelProperty(required = true, value = "The work item definition id.")
  public String getWorkItemConfigId() {
    return workItemConfigId;
  }
  public void setWorkItemConfigId(String workItemConfigId) {
    this.workItemConfigId = workItemConfigId;
  }

  /**
   * The work item displayable name.
   **/
  @ApiModelProperty(value = "The work item displayable name.")
  public String getWorkItemName() {
    return workItemName;
  }
  public void setWorkItemName(String workItemName) {
    this.workItemName = workItemName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkItem workItem = (WorkItem) o;
    return Objects.equals(workItemExecId, workItem.workItemExecId) &&
        Objects.equals(workItemConfigId, workItem.workItemConfigId) &&
        Objects.equals(workItemName, workItem.workItemName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workItemExecId, workItemConfigId, workItemName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkItem {\n");
    
    sb.append("    workItemExecId: ").append(toIndentedString(workItemExecId)).append("\n");
    sb.append("    workItemConfigId: ").append(toIndentedString(workItemConfigId)).append("\n");
    sb.append("    workItemName: ").append(toIndentedString(workItemName)).append("\n");
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
