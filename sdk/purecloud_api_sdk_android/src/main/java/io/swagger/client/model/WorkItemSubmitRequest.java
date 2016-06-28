package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.DataItem;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;




/**
 * Used as the body to the submitWorkItem request.
 **/
@ApiModel(description = "Used as the body to the submitWorkItem request.")
public class WorkItemSubmitRequest   {
  
  @SerializedName("commandId")
  private String commandId = null;

  @SerializedName("dataItems")
  private List<DataItem> dataItems = new ArrayList<DataItem>();

  /**
   * The command associated with the submit request. Often it is the button pressed on the user interface.
   **/
  @ApiModelProperty(required = true, value = "The command associated with the submit request. Often it is the button pressed on the user interface.")
  public String getCommandId() {
    return commandId;
  }
  public void setCommandId(String commandId) {
    this.commandId = commandId;
  }

  /**
   * The data items that should be a part of the submit request.
   **/
  @ApiModelProperty(value = "The data items that should be a part of the submit request.")
  public List<DataItem> getDataItems() {
    return dataItems;
  }
  public void setDataItems(List<DataItem> dataItems) {
    this.dataItems = dataItems;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkItemSubmitRequest workItemSubmitRequest = (WorkItemSubmitRequest) o;
    return Objects.equals(commandId, workItemSubmitRequest.commandId) &&
        Objects.equals(dataItems, workItemSubmitRequest.dataItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commandId, dataItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkItemSubmitRequest {\n");
    
    sb.append("    commandId: ").append(toIndentedString(commandId)).append("\n");
    sb.append("    dataItems: ").append(toIndentedString(dataItems)).append("\n");
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
