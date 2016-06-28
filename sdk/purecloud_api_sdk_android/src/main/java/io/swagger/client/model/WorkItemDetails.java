package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.AssociatedDocument;
import io.swagger.client.model.DataValueInfo;
import io.swagger.client.model.FlowConfigId;
import io.swagger.client.model.FlowExecId;
import io.swagger.client.model.Queue;
import io.swagger.client.model.User;
import io.swagger.client.model.WorkItemActions;
import io.swagger.client.model.WorkItemCache;
import io.swagger.client.model.WorkItemDefinition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;




/**
 * Details about a WorkItem
 **/
@ApiModel(description = "Details about a WorkItem")
public class WorkItemDetails   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("workItemDefinition")
  private WorkItemDefinition workItemDefinition = null;

  @SerializedName("flowExecId")
  private FlowExecId flowExecId = null;

  @SerializedName("flowConfigId")
  private FlowConfigId flowConfigId = null;

  @SerializedName("flowCreateTime")
  private Date flowCreateTime = null;

  @SerializedName("createTime")
  private Date createTime = null;

  @SerializedName("owner")
  private User owner = null;

  @SerializedName("offeredToUsers")
  private List<User> offeredToUsers = new ArrayList<User>();

  @SerializedName("offeredToQueues")
  private List<Queue> offeredToQueues = new ArrayList<Queue>();

  @SerializedName("title")
  private String title = null;

  @SerializedName("subtitle")
  private String subtitle = null;

  @SerializedName("associatedDocuments")
  private List<AssociatedDocument> associatedDocuments = new ArrayList<AssociatedDocument>();

  @SerializedName("availableActions")
  private WorkItemActions availableActions = null;

  @SerializedName("dataValueInfo")
  private DataValueInfo dataValueInfo = null;

  @SerializedName("workItemCache")
  private WorkItemCache workItemCache = null;

  @SerializedName("lastOfferedTime")
  private Date lastOfferedTime = null;

  @SerializedName("lastOwnershipUpdateTime")
  private Date lastOwnershipUpdateTime = null;

  @SerializedName("currentTaskStartTime")
  private Date currentTaskStartTime = null;

  @SerializedName("selfUri")
  private String selfUri = null;

  /**
   * The globally unique identifier for the object.
   **/
  @ApiModelProperty(value = "The globally unique identifier for the object.")
  public String getId() {
    return id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public WorkItemDefinition getWorkItemDefinition() {
    return workItemDefinition;
  }
  public void setWorkItemDefinition(WorkItemDefinition workItemDefinition) {
    this.workItemDefinition = workItemDefinition;
  }

  /**
   * The flow instance ID that created this WorkItem
   **/
  @ApiModelProperty(required = true, value = "The flow instance ID that created this WorkItem")
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
   * The time the flow was started. (that created this workitem). Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(required = true, value = "The time the flow was started. (that created this workitem). Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getFlowCreateTime() {
    return flowCreateTime;
  }
  public void setFlowCreateTime(Date flowCreateTime) {
    this.flowCreateTime = flowCreateTime;
  }

  /**
   * The time this workitem was started. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(required = true, value = "The time this workitem was started. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getCreateTime() {
    return createTime;
  }
  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  /**
   * The user currently working on/has responsibility for this WorkItem.  May be null if no owner.
   **/
  @ApiModelProperty(value = "The user currently working on/has responsibility for this WorkItem.  May be null if no owner.")
  public User getOwner() {
    return owner;
  }
  public void setOwner(User owner) {
    this.owner = owner;
  }

  /**
   * List of users that this workItem is offered to.  May be null if only offered to queues.
   **/
  @ApiModelProperty(value = "List of users that this workItem is offered to.  May be null if only offered to queues.")
  public List<User> getOfferedToUsers() {
    return offeredToUsers;
  }
  public void setOfferedToUsers(List<User> offeredToUsers) {
    this.offeredToUsers = offeredToUsers;
  }

  /**
   * List of queues that this workItem is offered to.  May be null if only offered to users.
   **/
  @ApiModelProperty(value = "List of queues that this workItem is offered to.  May be null if only offered to users.")
  public List<Queue> getOfferedToQueues() {
    return offeredToQueues;
  }
  public void setOfferedToQueues(List<Queue> offeredToQueues) {
    this.offeredToQueues = offeredToQueues;
  }

  /**
   * The work item title
   **/
  @ApiModelProperty(value = "The work item title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * The work item's subtitle - 2nd line/description
   **/
  @ApiModelProperty(value = "The work item's subtitle - 2nd line/description")
  public String getSubtitle() {
    return subtitle;
  }
  public void setSubtitle(String subtitle) {
    this.subtitle = subtitle;
  }

  /**
   * The documents associated with this workitem
   **/
  @ApiModelProperty(value = "The documents associated with this workitem")
  public List<AssociatedDocument> getAssociatedDocuments() {
    return associatedDocuments;
  }
  public void setAssociatedDocuments(List<AssociatedDocument> associatedDocuments) {
    this.associatedDocuments = associatedDocuments;
  }

  /**
   * The actions that the user can take on this workitem (submit, transfer, etc).
   **/
  @ApiModelProperty(value = "The actions that the user can take on this workitem (submit, transfer, etc).")
  public WorkItemActions getAvailableActions() {
    return availableActions;
  }
  public void setAvailableActions(WorkItemActions availableActions) {
    this.availableActions = availableActions;
  }

  /**
   * The data items that provide values for any work item form elements, if applicable.
   **/
  @ApiModelProperty(value = "The data items that provide values for any work item form elements, if applicable.")
  public DataValueInfo getDataValueInfo() {
    return dataValueInfo;
  }
  public void setDataValueInfo(DataValueInfo dataValueInfo) {
    this.dataValueInfo = dataValueInfo;
  }

  /**
   * The data items in the current work item cache, if one exists.
   **/
  @ApiModelProperty(value = "The data items in the current work item cache, if one exists.")
  public WorkItemCache getWorkItemCache() {
    return workItemCache;
  }
  public void setWorkItemCache(WorkItemCache workItemCache) {
    this.workItemCache = workItemCache;
  }

  /**
   * The time this work item was last offered to a user or queue. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "The time this work item was last offered to a user or queue. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getLastOfferedTime() {
    return lastOfferedTime;
  }
  public void setLastOfferedTime(Date lastOfferedTime) {
    this.lastOfferedTime = lastOfferedTime;
  }

  /**
   * The most recent time a user assumed ownership of a work item. This may be blank if the work item has no owner. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "The most recent time a user assumed ownership of a work item. This may be blank if the work item has no owner. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getLastOwnershipUpdateTime() {
    return lastOwnershipUpdateTime;
  }
  public void setLastOwnershipUpdateTime(Date lastOwnershipUpdateTime) {
    this.lastOwnershipUpdateTime = lastOwnershipUpdateTime;
  }

  /**
   * This is the time when the current task that started the work item was started. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "This is the time when the current task that started the work item was started. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getCurrentTaskStartTime() {
    return currentTaskStartTime;
  }
  public void setCurrentTaskStartTime(Date currentTaskStartTime) {
    this.currentTaskStartTime = currentTaskStartTime;
  }

  /**
   * The URI for this object
   **/
  @ApiModelProperty(value = "The URI for this object")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkItemDetails workItemDetails = (WorkItemDetails) o;
    return Objects.equals(id, workItemDetails.id) &&
        Objects.equals(name, workItemDetails.name) &&
        Objects.equals(workItemDefinition, workItemDetails.workItemDefinition) &&
        Objects.equals(flowExecId, workItemDetails.flowExecId) &&
        Objects.equals(flowConfigId, workItemDetails.flowConfigId) &&
        Objects.equals(flowCreateTime, workItemDetails.flowCreateTime) &&
        Objects.equals(createTime, workItemDetails.createTime) &&
        Objects.equals(owner, workItemDetails.owner) &&
        Objects.equals(offeredToUsers, workItemDetails.offeredToUsers) &&
        Objects.equals(offeredToQueues, workItemDetails.offeredToQueues) &&
        Objects.equals(title, workItemDetails.title) &&
        Objects.equals(subtitle, workItemDetails.subtitle) &&
        Objects.equals(associatedDocuments, workItemDetails.associatedDocuments) &&
        Objects.equals(availableActions, workItemDetails.availableActions) &&
        Objects.equals(dataValueInfo, workItemDetails.dataValueInfo) &&
        Objects.equals(workItemCache, workItemDetails.workItemCache) &&
        Objects.equals(lastOfferedTime, workItemDetails.lastOfferedTime) &&
        Objects.equals(lastOwnershipUpdateTime, workItemDetails.lastOwnershipUpdateTime) &&
        Objects.equals(currentTaskStartTime, workItemDetails.currentTaskStartTime) &&
        Objects.equals(selfUri, workItemDetails.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, workItemDefinition, flowExecId, flowConfigId, flowCreateTime, createTime, owner, offeredToUsers, offeredToQueues, title, subtitle, associatedDocuments, availableActions, dataValueInfo, workItemCache, lastOfferedTime, lastOwnershipUpdateTime, currentTaskStartTime, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkItemDetails {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    workItemDefinition: ").append(toIndentedString(workItemDefinition)).append("\n");
    sb.append("    flowExecId: ").append(toIndentedString(flowExecId)).append("\n");
    sb.append("    flowConfigId: ").append(toIndentedString(flowConfigId)).append("\n");
    sb.append("    flowCreateTime: ").append(toIndentedString(flowCreateTime)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    offeredToUsers: ").append(toIndentedString(offeredToUsers)).append("\n");
    sb.append("    offeredToQueues: ").append(toIndentedString(offeredToQueues)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    subtitle: ").append(toIndentedString(subtitle)).append("\n");
    sb.append("    associatedDocuments: ").append(toIndentedString(associatedDocuments)).append("\n");
    sb.append("    availableActions: ").append(toIndentedString(availableActions)).append("\n");
    sb.append("    dataValueInfo: ").append(toIndentedString(dataValueInfo)).append("\n");
    sb.append("    workItemCache: ").append(toIndentedString(workItemCache)).append("\n");
    sb.append("    lastOfferedTime: ").append(toIndentedString(lastOfferedTime)).append("\n");
    sb.append("    lastOwnershipUpdateTime: ").append(toIndentedString(lastOwnershipUpdateTime)).append("\n");
    sb.append("    currentTaskStartTime: ").append(toIndentedString(currentTaskStartTime)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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
