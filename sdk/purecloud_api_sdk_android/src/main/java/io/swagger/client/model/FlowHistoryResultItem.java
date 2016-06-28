package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.BackendFlowAvailableActions;
import io.swagger.client.model.FlowDetails;
import io.swagger.client.model.FlowHistoryItem;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;




/**
 * Information about one flow history item
 **/
@ApiModel(description = "Information about one flow history item")
public class FlowHistoryResultItem   {
  
  @SerializedName("flowInstance")
  private FlowDetails flowInstance = null;

  @SerializedName("availableActions")
  private BackendFlowAvailableActions availableActions = null;

  @SerializedName("historyItems")
  private List<FlowHistoryItem> historyItems = new ArrayList<FlowHistoryItem>();

  /**
   * The flow instance information that applies to the history events.
   **/
  @ApiModelProperty(required = true, value = "The flow instance information that applies to the history events.")
  public FlowDetails getFlowInstance() {
    return flowInstance;
  }
  public void setFlowInstance(FlowDetails flowInstance) {
    this.flowInstance = flowInstance;
  }

  /**
   * The actions available for operating in the flow, with respect to your authorization identity.
   **/
  @ApiModelProperty(value = "The actions available for operating in the flow, with respect to your authorization identity.")
  public BackendFlowAvailableActions getAvailableActions() {
    return availableActions;
  }
  public void setAvailableActions(BackendFlowAvailableActions availableActions) {
    this.availableActions = availableActions;
  }

  /**
   * The ordered list of history events for this flow.
   **/
  @ApiModelProperty(value = "The ordered list of history events for this flow.")
  public List<FlowHistoryItem> getHistoryItems() {
    return historyItems;
  }
  public void setHistoryItems(List<FlowHistoryItem> historyItems) {
    this.historyItems = historyItems;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowHistoryResultItem flowHistoryResultItem = (FlowHistoryResultItem) o;
    return Objects.equals(flowInstance, flowHistoryResultItem.flowInstance) &&
        Objects.equals(availableActions, flowHistoryResultItem.availableActions) &&
        Objects.equals(historyItems, flowHistoryResultItem.historyItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flowInstance, availableActions, historyItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowHistoryResultItem {\n");
    
    sb.append("    flowInstance: ").append(toIndentedString(flowInstance)).append("\n");
    sb.append("    availableActions: ").append(toIndentedString(availableActions)).append("\n");
    sb.append("    historyItems: ").append(toIndentedString(historyItems)).append("\n");
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
