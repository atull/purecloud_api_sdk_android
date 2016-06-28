package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.QuestionGroupScore;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class EvaluationScoringSet   {
  
  @SerializedName("totalScore")
  private Float totalScore = null;

  @SerializedName("totalCriticalScore")
  private Float totalCriticalScore = null;

  @SerializedName("questionGroupScores")
  private List<QuestionGroupScore> questionGroupScores = new ArrayList<QuestionGroupScore>();

  @SerializedName("anyFailedKillQuestions")
  private Boolean anyFailedKillQuestions = false;

  @SerializedName("comments")
  private String comments = null;

  @SerializedName("agentComments")
  private String agentComments = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Float getTotalScore() {
    return totalScore;
  }
  public void setTotalScore(Float totalScore) {
    this.totalScore = totalScore;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Float getTotalCriticalScore() {
    return totalCriticalScore;
  }
  public void setTotalCriticalScore(Float totalCriticalScore) {
    this.totalCriticalScore = totalCriticalScore;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<QuestionGroupScore> getQuestionGroupScores() {
    return questionGroupScores;
  }
  public void setQuestionGroupScores(List<QuestionGroupScore> questionGroupScores) {
    this.questionGroupScores = questionGroupScores;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getAnyFailedKillQuestions() {
    return anyFailedKillQuestions;
  }
  public void setAnyFailedKillQuestions(Boolean anyFailedKillQuestions) {
    this.anyFailedKillQuestions = anyFailedKillQuestions;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getComments() {
    return comments;
  }
  public void setComments(String comments) {
    this.comments = comments;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getAgentComments() {
    return agentComments;
  }
  public void setAgentComments(String agentComments) {
    this.agentComments = agentComments;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluationScoringSet evaluationScoringSet = (EvaluationScoringSet) o;
    return Objects.equals(totalScore, evaluationScoringSet.totalScore) &&
        Objects.equals(totalCriticalScore, evaluationScoringSet.totalCriticalScore) &&
        Objects.equals(questionGroupScores, evaluationScoringSet.questionGroupScores) &&
        Objects.equals(anyFailedKillQuestions, evaluationScoringSet.anyFailedKillQuestions) &&
        Objects.equals(comments, evaluationScoringSet.comments) &&
        Objects.equals(agentComments, evaluationScoringSet.agentComments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalScore, totalCriticalScore, questionGroupScores, anyFailedKillQuestions, comments, agentComments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluationScoringSet {\n");
    
    sb.append("    totalScore: ").append(toIndentedString(totalScore)).append("\n");
    sb.append("    totalCriticalScore: ").append(toIndentedString(totalCriticalScore)).append("\n");
    sb.append("    questionGroupScores: ").append(toIndentedString(questionGroupScores)).append("\n");
    sb.append("    anyFailedKillQuestions: ").append(toIndentedString(anyFailedKillQuestions)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    agentComments: ").append(toIndentedString(agentComments)).append("\n");
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
