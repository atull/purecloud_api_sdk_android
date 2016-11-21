package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class AgentEvaluatorActivity  implements Serializable {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("agent")
  private User agent = null;

  @SerializedName("evaluator")
  private User evaluator = null;

  @SerializedName("numEvaluations")
  private Integer numEvaluations = null;

  @SerializedName("averageEvaluationScore")
  private Integer averageEvaluationScore = null;

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
  public User getEvaluator() {
    return evaluator;
  }
  public void setEvaluator(User evaluator) {
    this.evaluator = evaluator;
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
    AgentEvaluatorActivity agentEvaluatorActivity = (AgentEvaluatorActivity) o;
    return Objects.equals(id, agentEvaluatorActivity.id) &&
        Objects.equals(name, agentEvaluatorActivity.name) &&
        Objects.equals(agent, agentEvaluatorActivity.agent) &&
        Objects.equals(evaluator, agentEvaluatorActivity.evaluator) &&
        Objects.equals(numEvaluations, agentEvaluatorActivity.numEvaluations) &&
        Objects.equals(averageEvaluationScore, agentEvaluatorActivity.averageEvaluationScore) &&
        Objects.equals(selfUri, agentEvaluatorActivity.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, agent, evaluator, numEvaluations, averageEvaluationScore, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentEvaluatorActivity {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    evaluator: ").append(toIndentedString(evaluator)).append("\n");
    sb.append("    numEvaluations: ").append(toIndentedString(numEvaluations)).append("\n");
    sb.append("    averageEvaluationScore: ").append(toIndentedString(averageEvaluationScore)).append("\n");
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
