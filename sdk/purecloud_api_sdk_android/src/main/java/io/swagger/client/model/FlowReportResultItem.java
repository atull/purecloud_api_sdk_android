package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.AssociatedDocument;
import io.swagger.client.model.ErrorBody;
import io.swagger.client.model.FlowConfigId;
import io.swagger.client.model.FlowExecId;
import io.swagger.client.model.User;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;




/**
 * Report for one active (running) process found in result to a report request.
 **/
@ApiModel(description = "Report for one active (running) process found in result to a report request.")
public class FlowReportResultItem   {
  
  @SerializedName("flowExecId")
  private FlowExecId flowExecId = null;

  @SerializedName("flowConfigId")
  private FlowConfigId flowConfigId = null;

  @SerializedName("flowInstanceName")
  private String flowInstanceName = null;

  @SerializedName("associatedDocument")
  private AssociatedDocument associatedDocument = null;


  /**
   * The flow's running status, which indicates whether the flow is running normally or in error, etc;
   */
  public enum FlowStatusEnum {
    @SerializedName("UNKNOWN")
    UNKNOWN("UNKNOWN"),

    @SerializedName("RUNNING")
    RUNNING("RUNNING"),

    @SerializedName("ERROR")
    ERROR("ERROR"),

    @SerializedName("TERMINATED")
    TERMINATED("TERMINATED"),

    @SerializedName("COMPLETED")
    COMPLETED("COMPLETED");

    private String value;

    FlowStatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("flowStatus")
  private FlowStatusEnum flowStatus = null;

  @SerializedName("currentState")
  private String currentState = null;

  @SerializedName("startDateTime")
  private Date startDateTime = null;

  @SerializedName("endDateTime")
  private Date endDateTime = null;

  @SerializedName("workItemUserAssignees")
  private List<User> workItemUserAssignees = new ArrayList<User>();

  @SerializedName("completedUser")
  private User completedUser = null;

  @SerializedName("completionReason")
  private String completionReason = null;

  @SerializedName("flowErrorInfo")
  private ErrorBody flowErrorInfo = null;

  /**
   * The flow instance ID for this process
   **/
  @ApiModelProperty(required = true, value = "The flow instance ID for this process")
  public FlowExecId getFlowExecId() {
    return flowExecId;
  }
  public void setFlowExecId(FlowExecId flowExecId) {
    this.flowExecId = flowExecId;
  }

  /**
   * The flow config ID that this workitem was created from.
   **/
  @ApiModelProperty(required = true, value = "The flow config ID that this workitem was created from.")
  public FlowConfigId getFlowConfigId() {
    return flowConfigId;
  }
  public void setFlowConfigId(FlowConfigId flowConfigId) {
    this.flowConfigId = flowConfigId;
  }

  /**
   * The instance name for this flow in relation to its primary document.  If the flow is not a document-centric type, this value will be empty.
   **/
  @ApiModelProperty(value = "The instance name for this flow in relation to its primary document.  If the flow is not a document-centric type, this value will be empty.")
  public String getFlowInstanceName() {
    return flowInstanceName;
  }
  public void setFlowInstanceName(String flowInstanceName) {
    this.flowInstanceName = flowInstanceName;
  }

  /**
   * the document for this flow (if this flow was launched via a document)
   **/
  @ApiModelProperty(value = "the document for this flow (if this flow was launched via a document)")
  public AssociatedDocument getAssociatedDocument() {
    return associatedDocument;
  }
  public void setAssociatedDocument(AssociatedDocument associatedDocument) {
    this.associatedDocument = associatedDocument;
  }

  /**
   * The flow's running status, which indicates whether the flow is running normally or in error, etc;
   **/
  @ApiModelProperty(value = "The flow's running status, which indicates whether the flow is running normally or in error, etc;")
  public FlowStatusEnum getFlowStatus() {
    return flowStatus;
  }
  public void setFlowStatus(FlowStatusEnum flowStatus) {
    this.flowStatus = flowStatus;
  }

  /**
   * The current state of the flow (EG what action is being processed)
   **/
  @ApiModelProperty(required = true, value = "The current state of the flow (EG what action is being processed)")
  public String getCurrentState() {
    return currentState;
  }
  public void setCurrentState(String currentState) {
    this.currentState = currentState;
  }

  /**
   * The time the flow was started. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(required = true, value = "The time the flow was started. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getStartDateTime() {
    return startDateTime;
  }
  public void setStartDateTime(Date startDateTime) {
    this.startDateTime = startDateTime;
  }

  /**
   * The time the flow ended. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "The time the flow ended. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getEndDateTime() {
    return endDateTime;
  }
  public void setEndDateTime(Date endDateTime) {
    this.endDateTime = endDateTime;
  }

  /**
   * List of users currently assigned to a workItem
   **/
  @ApiModelProperty(value = "List of users currently assigned to a workItem")
  public List<User> getWorkItemUserAssignees() {
    return workItemUserAssignees;
  }
  public void setWorkItemUserAssignees(List<User> workItemUserAssignees) {
    this.workItemUserAssignees = workItemUserAssignees;
  }

  /**
   * User that completed the flow
   **/
  @ApiModelProperty(value = "User that completed the flow")
  public User getCompletedUser() {
    return completedUser;
  }
  public void setCompletedUser(User completedUser) {
    this.completedUser = completedUser;
  }

  /**
   * Reason for completion
   **/
  @ApiModelProperty(value = "Reason for completion")
  public String getCompletionReason() {
    return completionReason;
  }
  public void setCompletionReason(String completionReason) {
    this.completionReason = completionReason;
  }

  /**
   * Additional information if the flow is in error
   **/
  @ApiModelProperty(value = "Additional information if the flow is in error")
  public ErrorBody getFlowErrorInfo() {
    return flowErrorInfo;
  }
  public void setFlowErrorInfo(ErrorBody flowErrorInfo) {
    this.flowErrorInfo = flowErrorInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowReportResultItem flowReportResultItem = (FlowReportResultItem) o;
    return Objects.equals(flowExecId, flowReportResultItem.flowExecId) &&
        Objects.equals(flowConfigId, flowReportResultItem.flowConfigId) &&
        Objects.equals(flowInstanceName, flowReportResultItem.flowInstanceName) &&
        Objects.equals(associatedDocument, flowReportResultItem.associatedDocument) &&
        Objects.equals(flowStatus, flowReportResultItem.flowStatus) &&
        Objects.equals(currentState, flowReportResultItem.currentState) &&
        Objects.equals(startDateTime, flowReportResultItem.startDateTime) &&
        Objects.equals(endDateTime, flowReportResultItem.endDateTime) &&
        Objects.equals(workItemUserAssignees, flowReportResultItem.workItemUserAssignees) &&
        Objects.equals(completedUser, flowReportResultItem.completedUser) &&
        Objects.equals(completionReason, flowReportResultItem.completionReason) &&
        Objects.equals(flowErrorInfo, flowReportResultItem.flowErrorInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flowExecId, flowConfigId, flowInstanceName, associatedDocument, flowStatus, currentState, startDateTime, endDateTime, workItemUserAssignees, completedUser, completionReason, flowErrorInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowReportResultItem {\n");
    
    sb.append("    flowExecId: ").append(toIndentedString(flowExecId)).append("\n");
    sb.append("    flowConfigId: ").append(toIndentedString(flowConfigId)).append("\n");
    sb.append("    flowInstanceName: ").append(toIndentedString(flowInstanceName)).append("\n");
    sb.append("    associatedDocument: ").append(toIndentedString(associatedDocument)).append("\n");
    sb.append("    flowStatus: ").append(toIndentedString(flowStatus)).append("\n");
    sb.append("    currentState: ").append(toIndentedString(currentState)).append("\n");
    sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
    sb.append("    endDateTime: ").append(toIndentedString(endDateTime)).append("\n");
    sb.append("    workItemUserAssignees: ").append(toIndentedString(workItemUserAssignees)).append("\n");
    sb.append("    completedUser: ").append(toIndentedString(completedUser)).append("\n");
    sb.append("    completionReason: ").append(toIndentedString(completionReason)).append("\n");
    sb.append("    flowErrorInfo: ").append(toIndentedString(flowErrorInfo)).append("\n");
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
