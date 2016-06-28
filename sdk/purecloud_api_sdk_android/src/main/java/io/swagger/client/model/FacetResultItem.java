package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Document;
import io.swagger.client.model.FlowConfigId;
import io.swagger.client.model.Queue;
import io.swagger.client.model.User;
import io.swagger.client.model.Workspace;

import com.google.gson.annotations.SerializedName;





public class FacetResultItem   {
  
  @SerializedName("name")
  private String name = null;

  @SerializedName("count")
  private Long count = null;

  @SerializedName("document")
  private Document document = null;

  @SerializedName("user")
  private User user = null;

  @SerializedName("queue")
  private Queue queue = null;

  @SerializedName("flowConfigId")
  private FlowConfigId flowConfigId = null;

  @SerializedName("workspace")
  private Workspace workspace = null;

  /**
   * For TERM facets this will contain the value of the term that was found userid, docid, etc.
   **/
  @ApiModelProperty(value = "For TERM facets this will contain the value of the term that was found userid, docid, etc.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The number of items that matched the facetRequest.
   **/
  @ApiModelProperty(value = "The number of items that matched the facetRequest.")
  public Long getCount() {
    return count;
  }
  public void setCount(Long count) {
    this.count = count;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Document getDocument() {
    return document;
  }
  public void setDocument(Document document) {
    this.document = document;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public User getUser() {
    return user;
  }
  public void setUser(User user) {
    this.user = user;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Queue getQueue() {
    return queue;
  }
  public void setQueue(Queue queue) {
    this.queue = queue;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public FlowConfigId getFlowConfigId() {
    return flowConfigId;
  }
  public void setFlowConfigId(FlowConfigId flowConfigId) {
    this.flowConfigId = flowConfigId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Workspace getWorkspace() {
    return workspace;
  }
  public void setWorkspace(Workspace workspace) {
    this.workspace = workspace;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FacetResultItem facetResultItem = (FacetResultItem) o;
    return Objects.equals(name, facetResultItem.name) &&
        Objects.equals(count, facetResultItem.count) &&
        Objects.equals(document, facetResultItem.document) &&
        Objects.equals(user, facetResultItem.user) &&
        Objects.equals(queue, facetResultItem.queue) &&
        Objects.equals(flowConfigId, facetResultItem.flowConfigId) &&
        Objects.equals(workspace, facetResultItem.workspace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, count, document, user, queue, flowConfigId, workspace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacetResultItem {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    flowConfigId: ").append(toIndentedString(flowConfigId)).append("\n");
    sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
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
