package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.FlowHistoryDataItem;
import io.swagger.client.model.FlowState;
import io.swagger.client.model.Queue;
import io.swagger.client.model.User;
import io.swagger.client.model.WorkItem;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;




/**
 * Information about one flow history item
 **/
@ApiModel(description = "Information about one flow history item")
public class FlowHistoryItem   {
  
  @SerializedName("historyEventTime")
  private Date historyEventTime = null;

  @SerializedName("state")
  private FlowState state = null;

  @SerializedName("workItem")
  private WorkItem workItem = null;

  @SerializedName("user")
  private User user = null;

  @SerializedName("queue")
  private Queue queue = null;

  @SerializedName("historyEventData")
  private List<FlowHistoryDataItem> historyEventData = new ArrayList<FlowHistoryDataItem>();


  /**
   * The type of the history event being reported.
   */
  public enum HistoryEventTypeEnum {
    @SerializedName("FLOW_INSTANCE_START")
    FLOW_INSTANCE_START("FLOW_INSTANCE_START"),

    @SerializedName("FLOW_INSTANCE_GOTO")
    FLOW_INSTANCE_GOTO("FLOW_INSTANCE_GOTO"),

    @SerializedName("FLOW_INSTANCE_TERMINATE")
    FLOW_INSTANCE_TERMINATE("FLOW_INSTANCE_TERMINATE"),

    @SerializedName("FLOW_INSTANCE_END")
    FLOW_INSTANCE_END("FLOW_INSTANCE_END"),

    @SerializedName("TASK_INSTANCE_START")
    TASK_INSTANCE_START("TASK_INSTANCE_START"),

    @SerializedName("TASK_INSTANCE_END")
    TASK_INSTANCE_END("TASK_INSTANCE_END"),

    @SerializedName("WORK_ITEM_INSTANCE_SAVE")
    WORK_ITEM_INSTANCE_SAVE("WORK_ITEM_INSTANCE_SAVE"),

    @SerializedName("WORK_ITEM_INSTANCE_ACQUIRE")
    WORK_ITEM_INSTANCE_ACQUIRE("WORK_ITEM_INSTANCE_ACQUIRE"),

    @SerializedName("WORK_ITEM_INSTANCE_SUBMIT")
    WORK_ITEM_INSTANCE_SUBMIT("WORK_ITEM_INSTANCE_SUBMIT"),

    @SerializedName("WORK_ITEM_INSTANCE_OFFER")
    WORK_ITEM_INSTANCE_OFFER("WORK_ITEM_INSTANCE_OFFER"),

    @SerializedName("WORK_ITEM_INSTANCE_REASSIGN")
    WORK_ITEM_INSTANCE_REASSIGN("WORK_ITEM_INSTANCE_REASSIGN"),

    @SerializedName("FLOW_INSTANCE_ERROR")
    FLOW_INSTANCE_ERROR("FLOW_INSTANCE_ERROR"),

    @SerializedName("FLOW_INSTANCE_RETRY")
    FLOW_INSTANCE_RETRY("FLOW_INSTANCE_RETRY");

    private String value;

    HistoryEventTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("historyEventType")
  private HistoryEventTypeEnum historyEventType = null;

  @SerializedName("success")
  private Boolean success = false;

  /**
   * The time when the history item occurred. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(required = true, value = "The time when the history item occurred. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getHistoryEventTime() {
    return historyEventTime;
  }
  public void setHistoryEventTime(Date historyEventTime) {
    this.historyEventTime = historyEventTime;
  }

  /**
   * The State sequence that applies to the history event, if applicable.
   **/
  @ApiModelProperty(value = "The State sequence that applies to the history event, if applicable.")
  public FlowState getState() {
    return state;
  }
  public void setState(FlowState state) {
    this.state = state;
  }

  /**
   * Information about the work item associated with the history event, if applicable.
   **/
  @ApiModelProperty(value = "Information about the work item associated with the history event, if applicable.")
  public WorkItem getWorkItem() {
    return workItem;
  }
  public void setWorkItem(WorkItem workItem) {
    this.workItem = workItem;
  }

  /**
   * The user associated with this history event, if applicable.
   **/
  @ApiModelProperty(value = "The user associated with this history event, if applicable.")
  public User getUser() {
    return user;
  }
  public void setUser(User user) {
    this.user = user;
  }

  /**
   * The queue associated with this history event, if applicable.
   **/
  @ApiModelProperty(value = "The queue associated with this history event, if applicable.")
  public Queue getQueue() {
    return queue;
  }
  public void setQueue(Queue queue) {
    this.queue = queue;
  }

  /**
   * Data elements associated with this history event.
   **/
  @ApiModelProperty(value = "Data elements associated with this history event.")
  public List<FlowHistoryDataItem> getHistoryEventData() {
    return historyEventData;
  }
  public void setHistoryEventData(List<FlowHistoryDataItem> historyEventData) {
    this.historyEventData = historyEventData;
  }

  /**
   * The type of the history event being reported.
   **/
  @ApiModelProperty(required = true, value = "The type of the history event being reported.")
  public HistoryEventTypeEnum getHistoryEventType() {
    return historyEventType;
  }
  public void setHistoryEventType(HistoryEventTypeEnum historyEventType) {
    this.historyEventType = historyEventType;
  }

  /**
   * Whether or not the flow item was successful (if a 'notification' event this will default to true)
   **/
  @ApiModelProperty(required = true, value = "Whether or not the flow item was successful (if a 'notification' event this will default to true)")
  public Boolean getSuccess() {
    return success;
  }
  public void setSuccess(Boolean success) {
    this.success = success;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowHistoryItem flowHistoryItem = (FlowHistoryItem) o;
    return Objects.equals(historyEventTime, flowHistoryItem.historyEventTime) &&
        Objects.equals(state, flowHistoryItem.state) &&
        Objects.equals(workItem, flowHistoryItem.workItem) &&
        Objects.equals(user, flowHistoryItem.user) &&
        Objects.equals(queue, flowHistoryItem.queue) &&
        Objects.equals(historyEventData, flowHistoryItem.historyEventData) &&
        Objects.equals(historyEventType, flowHistoryItem.historyEventType) &&
        Objects.equals(success, flowHistoryItem.success);
  }

  @Override
  public int hashCode() {
    return Objects.hash(historyEventTime, state, workItem, user, queue, historyEventData, historyEventType, success);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowHistoryItem {\n");
    
    sb.append("    historyEventTime: ").append(toIndentedString(historyEventTime)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    workItem: ").append(toIndentedString(workItem)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    historyEventData: ").append(toIndentedString(historyEventData)).append("\n");
    sb.append("    historyEventType: ").append(toIndentedString(historyEventType)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
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
