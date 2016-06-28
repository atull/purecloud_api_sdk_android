package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.AgentEvaluatorActivity;
import io.swagger.client.model.User;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class AgentActivity   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("agent")
  private User agent = null;

  @SerializedName("numEvaluations")
  private Integer numEvaluations = null;

  @SerializedName("averageEvaluationScore")
  private Integer averageEvaluationScore = null;

  @SerializedName("agentEvaluatorActivityList")
  private List<AgentEvaluatorActivity> agentEvaluatorActivityList = new ArrayList<AgentEvaluatorActivity>();

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
  public User getAgent() {
    return agent;
  }
  public void setAgent(User agent) {
    this.agent = agent;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getNumEvaluations() {
    return numEvaluations;
  }
  public void setNumEvaluations(Integer numEvaluations) {
    this.numEvaluations = numEvaluations;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getAverageEvaluationScore() {
    return averageEvaluationScore;
  }
  public void setAverageEvaluationScore(Integer averageEvaluationScore) {
    this.averageEvaluationScore = averageEvaluationScore;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<AgentEvaluatorActivity> getAgentEvaluatorActivityList() {
    return agentEvaluatorActivityList;
  }
  public void setAgentEvaluatorActivityList(List<AgentEvaluatorActivity> agentEvaluatorActivityList) {
    this.agentEvaluatorActivityList = agentEvaluatorActivityList;
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
    AgentActivity agentActivity = (AgentActivity) o;
    return Objects.equals(id, agentActivity.id) &&
        Objects.equals(name, agentActivity.name) &&
        Objects.equals(agent, agentActivity.agent) &&
        Objects.equals(numEvaluations, agentActivity.numEvaluations) &&
        Objects.equals(averageEvaluationScore, agentActivity.averageEvaluationScore) &&
        Objects.equals(agentEvaluatorActivityList, agentActivity.agentEvaluatorActivityList) &&
        Objects.equals(selfUri, agentActivity.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, agent, numEvaluations, averageEvaluationScore, agentEvaluatorActivityList, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentActivity {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    numEvaluations: ").append(toIndentedString(numEvaluations)).append("\n");
    sb.append("    averageEvaluationScore: ").append(toIndentedString(averageEvaluationScore)).append("\n");
    sb.append("    agentEvaluatorActivityList: ").append(toIndentedString(agentEvaluatorActivityList)).append("\n");
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
