package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class QuestionScore  implements Serializable {
  
  @SerializedName("questionId")
  private String questionId = null;

  @SerializedName("answerId")
  private String answerId = null;

  @SerializedName("score")
  private Integer score = null;

  @SerializedName("markedNA")
  private Boolean markedNA = false;

  @SerializedName("failedKillQuestion")
  private Boolean failedKillQuestion = false;

  @SerializedName("comments")
  private String comments = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getQuestionId() {
    return questionId;
  }
  public void setQuestionId(String questionId) {
    this.questionId = questionId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getAnswerId() {
    return answerId;
  }
  public void setAnswerId(String answerId) {
    this.answerId = answerId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getScore() {
    return score;
  }
  public void setScore(Integer score) {
    this.score = score;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getMarkedNA() {
    return markedNA;
  }
  public void setMarkedNA(Boolean markedNA) {
    this.markedNA = markedNA;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getFailedKillQuestion() {
    return failedKillQuestion;
  }
  public void setFailedKillQuestion(Boolean failedKillQuestion) {
    this.failedKillQuestion = failedKillQuestion;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuestionScore questionScore = (QuestionScore) o;
    return Objects.equals(questionId, questionScore.questionId) &&
        Objects.equals(answerId, questionScore.answerId) &&
        Objects.equals(score, questionScore.score) &&
        Objects.equals(markedNA, questionScore.markedNA) &&
        Objects.equals(failedKillQuestion, questionScore.failedKillQuestion) &&
        Objects.equals(comments, questionScore.comments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questionId, answerId, score, markedNA, failedKillQuestion, comments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuestionScore {\n");
    
    sb.append("    questionId: ").append(toIndentedString(questionId)).append("\n");
    sb.append("    answerId: ").append(toIndentedString(answerId)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    markedNA: ").append(toIndentedString(markedNA)).append("\n");
    sb.append("    failedKillQuestion: ").append(toIndentedString(failedKillQuestion)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
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
