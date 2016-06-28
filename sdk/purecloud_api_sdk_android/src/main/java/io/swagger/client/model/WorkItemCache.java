package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.DataItem;
import io.swagger.client.model.User;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class WorkItemCache   {
  
  @SerializedName("workItemExecId")
  private String workItemExecId = null;

  @SerializedName("saveTime")
  private Date saveTime = null;

  @SerializedName("saveUser")
  private User saveUser = null;

  @SerializedName("saveComment")
  private String saveComment = null;

  @SerializedName("dataItems")
  private List<DataItem> dataItems = new ArrayList<DataItem>();

  /**
   * The workItem instance ID that owns this cache.
   **/
  @ApiModelProperty(value = "The workItem instance ID that owns this cache.")
  public String getWorkItemExecId() {
    return workItemExecId;
  }
  public void setWorkItemExecId(String workItemExecId) {
    this.workItemExecId = workItemExecId;
  }

  /**
   * The time that the workItem cache was last saved. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "The time that the workItem cache was last saved. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getSaveTime() {
    return saveTime;
  }
  public void setSaveTime(Date saveTime) {
    this.saveTime = saveTime;
  }

  /**
   * The user that last saved the workItem cache.
   **/
  @ApiModelProperty(value = "The user that last saved the workItem cache.")
  public User getSaveUser() {
    return saveUser;
  }
  public void setSaveUser(User saveUser) {
    this.saveUser = saveUser;
  }

  /**
   * An optional comment made during the last save
   **/
  @ApiModelProperty(value = "An optional comment made during the last save")
  public String getSaveComment() {
    return saveComment;
  }
  public void setSaveComment(String saveComment) {
    this.saveComment = saveComment;
  }

  /**
   * The data items that are present within the cache.
   **/
  @ApiModelProperty(value = "The data items that are present within the cache.")
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
    WorkItemCache workItemCache = (WorkItemCache) o;
    return Objects.equals(workItemExecId, workItemCache.workItemExecId) &&
        Objects.equals(saveTime, workItemCache.saveTime) &&
        Objects.equals(saveUser, workItemCache.saveUser) &&
        Objects.equals(saveComment, workItemCache.saveComment) &&
        Objects.equals(dataItems, workItemCache.dataItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workItemExecId, saveTime, saveUser, saveComment, dataItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkItemCache {\n");
    
    sb.append("    workItemExecId: ").append(toIndentedString(workItemExecId)).append("\n");
    sb.append("    saveTime: ").append(toIndentedString(saveTime)).append("\n");
    sb.append("    saveUser: ").append(toIndentedString(saveUser)).append("\n");
    sb.append("    saveComment: ").append(toIndentedString(saveComment)).append("\n");
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
