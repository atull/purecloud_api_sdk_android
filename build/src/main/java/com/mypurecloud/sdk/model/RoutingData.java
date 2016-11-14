package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class RoutingData  implements Serializable {
  
  @SerializedName("queueId")
  private String queueId = null;

  @SerializedName("languageId")
  private String languageId = null;

  @SerializedName("priority")
  private Integer priority = null;

  @SerializedName("skillIds")
  private List<String> skillIds = new ArrayList<String>();

  @SerializedName("preferredAgentIds")
  private List<String> preferredAgentIds = new ArrayList<String>();

  /**
   * The identifier of the routing queue
   **/
  @ApiModelProperty(required = true, value = "The identifier of the routing queue")
  public String getQueueId() {
    return queueId;
  }
  public void setQueueId(String queueId) {
    this.queueId = queueId;
  }

  /**
   * The identifier of a language to be considered in routing
   **/
  @ApiModelProperty(value = "The identifier of a language to be considered in routing")
  public String getLanguageId() {
    return languageId;
  }
  public void setLanguageId(String languageId) {
    this.languageId = languageId;
  }

  /**
   * The priority for routing
   **/
  @ApiModelProperty(value = "The priority for routing")
  public Integer getPriority() {
    return priority;
  }
  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  /**
   * A list of skill identifiers to be considered in routing
   **/
  @ApiModelProperty(value = "A list of skill identifiers to be considered in routing")
  public List<String> getSkillIds() {
    return skillIds;
  }
  public void setSkillIds(List<String> skillIds) {
    this.skillIds = skillIds;
  }

  /**
   * A list of agents to be preferred in routing
   **/
  @ApiModelProperty(value = "A list of agents to be preferred in routing")
  public List<String> getPreferredAgentIds() {
    return preferredAgentIds;
  }
  public void setPreferredAgentIds(List<String> preferredAgentIds) {
    this.preferredAgentIds = preferredAgentIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoutingData routingData = (RoutingData) o;
    return Objects.equals(queueId, routingData.queueId) &&
        Objects.equals(languageId, routingData.languageId) &&
        Objects.equals(priority, routingData.priority) &&
        Objects.equals(skillIds, routingData.skillIds) &&
        Objects.equals(preferredAgentIds, routingData.preferredAgentIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queueId, languageId, priority, skillIds, preferredAgentIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoutingData {\n");
    
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    languageId: ").append(toIndentedString(languageId)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    skillIds: ").append(toIndentedString(skillIds)).append("\n");
    sb.append("    preferredAgentIds: ").append(toIndentedString(preferredAgentIds)).append("\n");
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
