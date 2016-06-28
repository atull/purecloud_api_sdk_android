package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Conversation;
import io.swagger.client.model.Evaluation;
import io.swagger.client.model.EvaluationForm;
import io.swagger.client.model.User;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class Calibration   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("calibrator")
  private User calibrator = null;

  @SerializedName("agent")
  private User agent = null;

  @SerializedName("conversation")
  private Conversation conversation = null;

  @SerializedName("evaluationForm")
  private EvaluationForm evaluationForm = null;

  @SerializedName("contextId")
  private String contextId = null;

  @SerializedName("averageScore")
  private Integer averageScore = null;

  @SerializedName("highScore")
  private Integer highScore = null;

  @SerializedName("lowScore")
  private Integer lowScore = null;

  @SerializedName("createdDate")
  private Date createdDate = null;

  @SerializedName("evaluations")
  private List<Evaluation> evaluations = new ArrayList<Evaluation>();

  @SerializedName("evaluators")
  private List<User> evaluators = new ArrayList<User>();

  @SerializedName("scoringIndex")
  private Evaluation scoringIndex = null;

  @SerializedName("expertEvaluator")
  private User expertEvaluator = null;

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
  public User getCalibrator() {
    return calibrator;
  }
  public void setCalibrator(User calibrator) {
    this.calibrator = calibrator;
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
  public Conversation getConversation() {
    return conversation;
  }
  public void setConversation(Conversation conversation) {
    this.conversation = conversation;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public EvaluationForm getEvaluationForm() {
    return evaluationForm;
  }
  public void setEvaluationForm(EvaluationForm evaluationForm) {
    this.evaluationForm = evaluationForm;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getContextId() {
    return contextId;
  }
  public void setContextId(String contextId) {
    this.contextId = contextId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getAverageScore() {
    return averageScore;
  }
  public void setAverageScore(Integer averageScore) {
    this.averageScore = averageScore;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getHighScore() {
    return highScore;
  }
  public void setHighScore(Integer highScore) {
    this.highScore = highScore;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getLowScore() {
    return lowScore;
  }
  public void setLowScore(Integer lowScore) {
    this.lowScore = lowScore;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Evaluation> getEvaluations() {
    return evaluations;
  }
  public void setEvaluations(List<Evaluation> evaluations) {
    this.evaluations = evaluations;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<User> getEvaluators() {
    return evaluators;
  }
  public void setEvaluators(List<User> evaluators) {
    this.evaluators = evaluators;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Evaluation getScoringIndex() {
    return scoringIndex;
  }
  public void setScoringIndex(Evaluation scoringIndex) {
    this.scoringIndex = scoringIndex;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public User getExpertEvaluator() {
    return expertEvaluator;
  }
  public void setExpertEvaluator(User expertEvaluator) {
    this.expertEvaluator = expertEvaluator;
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
    Calibration calibration = (Calibration) o;
    return Objects.equals(id, calibration.id) &&
        Objects.equals(name, calibration.name) &&
        Objects.equals(calibrator, calibration.calibrator) &&
        Objects.equals(agent, calibration.agent) &&
        Objects.equals(conversation, calibration.conversation) &&
        Objects.equals(evaluationForm, calibration.evaluationForm) &&
        Objects.equals(contextId, calibration.contextId) &&
        Objects.equals(averageScore, calibration.averageScore) &&
        Objects.equals(highScore, calibration.highScore) &&
        Objects.equals(lowScore, calibration.lowScore) &&
        Objects.equals(createdDate, calibration.createdDate) &&
        Objects.equals(evaluations, calibration.evaluations) &&
        Objects.equals(evaluators, calibration.evaluators) &&
        Objects.equals(scoringIndex, calibration.scoringIndex) &&
        Objects.equals(expertEvaluator, calibration.expertEvaluator) &&
        Objects.equals(selfUri, calibration.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, calibrator, agent, conversation, evaluationForm, contextId, averageScore, highScore, lowScore, createdDate, evaluations, evaluators, scoringIndex, expertEvaluator, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Calibration {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    calibrator: ").append(toIndentedString(calibrator)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
    sb.append("    evaluationForm: ").append(toIndentedString(evaluationForm)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    averageScore: ").append(toIndentedString(averageScore)).append("\n");
    sb.append("    highScore: ").append(toIndentedString(highScore)).append("\n");
    sb.append("    lowScore: ").append(toIndentedString(lowScore)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    evaluations: ").append(toIndentedString(evaluations)).append("\n");
    sb.append("    evaluators: ").append(toIndentedString(evaluators)).append("\n");
    sb.append("    scoringIndex: ").append(toIndentedString(scoringIndex)).append("\n");
    sb.append("    expertEvaluator: ").append(toIndentedString(expertEvaluator)).append("\n");
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
