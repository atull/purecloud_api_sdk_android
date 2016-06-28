package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.BatchItem;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class BatchCommand   {
  
  @SerializedName("items")
  private List<BatchItem> items = new ArrayList<BatchItem>();

  @SerializedName("commandId")
  private String commandId = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<BatchItem> getItems() {
    return items;
  }
  public void setItems(List<BatchItem> items) {
    this.items = items;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCommandId() {
    return commandId;
  }
  public void setCommandId(String commandId) {
    this.commandId = commandId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchCommand batchCommand = (BatchCommand) o;
    return Objects.equals(items, batchCommand.items) &&
        Objects.equals(commandId, batchCommand.commandId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, commandId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchCommand {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    commandId: ").append(toIndentedString(commandId)).append("\n");
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
