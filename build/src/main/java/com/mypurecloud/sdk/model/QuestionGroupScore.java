package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.QuestionScore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class QuestionGroupScore  implements Serializable {
  
  @SerializedName("questionGroupId")
  private String questionGroupId = null;

  @SerializedName("totalScore")
  private Float totalScore = null;

  @SerializedName("maxTotalScore")
  private Float maxTotalScore = null;

  @SerializedName("totalCriticalScore")
  private Float totalCriticalScore = null;

  @SerializedName("maxTotalCriticalScore")
  private Float maxTotalCriticalScore = null;

  @SerializedName("totalScoreUnweighted")
  private Float totalScoreUnweighted = null;

  @SerializedName("maxTotalScoreUnweighted")
  private Float maxTotalScoreUnweighted = null;

  @SerializedName("totalCriticalScoreUnweighted")
  private Float totalCriticalScoreUnweighted = null;

  @SerializedName("maxTotalCriticalScoreUnweighted")
  private Float maxTotalCriticalScoreUnweighted = null;

  @SerializedName("markedNA")
  private Boolean markedNA = false;

  @SerializedName("questionScores")
  private List<QuestionScore> questionScores = new ArrayList<QuestionScore>();

  /**
   **/
  @ApiModelProperty(value = "")
  public String getQuestionGroupId() {
    return questionGroupId;
  }
  public void setQuestionGroupId(String questionGroupId) {
    this.questionGroupId = questionGroupId;
  }

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
  public Float getMaxTotalScore() {
    return maxTotalScore;
  }
  public void setMaxTotalScore(Float maxTotalScore) {
    this.maxTotalScore = maxTotalScore;
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
  public Float getMaxTotalCriticalScore() {
    return maxTotalCriticalScore;
  }
  public void setMaxTotalCriticalScore(Float maxTotalCriticalScore) {
    this.maxTotalCriticalScore = maxTotalCriticalScore;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Float getTotalScoreUnweighted() {
    return totalScoreUnweighted;
  }
  public void setTotalScoreUnweighted(Float totalScoreUnweighted) {
    this.totalScoreUnweighted = totalScoreUnweighted;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Float getMaxTotalScoreUnweighted() {
    return maxTotalScoreUnweighted;
  }
  public void setMaxTotalScoreUnweighted(Float maxTotalScoreUnweighted) {
    this.maxTotalScoreUnweighted = maxTotalScoreUnweighted;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Float getTotalCriticalScoreUnweighted() {
    return totalCriticalScoreUnweighted;
  }
  public void setTotalCriticalScoreUnweighted(Float totalCriticalScoreUnweighted) {
    this.totalCriticalScoreUnweighted = totalCriticalScoreUnweighted;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Float getMaxTotalCriticalScoreUnweighted() {
    return maxTotalCriticalScoreUnweighted;
  }
  public void setMaxTotalCriticalScoreUnweighted(Float maxTotalCriticalScoreUnweighted) {
    this.maxTotalCriticalScoreUnweighted = maxTotalCriticalScoreUnweighted;
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
  public List<QuestionScore> getQuestionScores() {
    return questionScores;
  }
  public void setQuestionScores(List<QuestionScore> questionScores) {
    this.questionScores = questionScores;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuestionGroupScore questionGroupScore = (QuestionGroupScore) o;
    return Objects.equals(questionGroupId, questionGroupScore.questionGroupId) &&
        Objects.equals(totalScore, questionGroupScore.totalScore) &&
        Objects.equals(maxTotalScore, questionGroupScore.maxTotalScore) &&
        Objects.equals(totalCriticalScore, questionGroupScore.totalCriticalScore) &&
        Objects.equals(maxTotalCriticalScore, questionGroupScore.maxTotalCriticalScore) &&
        Objects.equals(totalScoreUnweighted, questionGroupScore.totalScoreUnweighted) &&
        Objects.equals(maxTotalScoreUnweighted, questionGroupScore.maxTotalScoreUnweighted) &&
        Objects.equals(totalCriticalScoreUnweighted, questionGroupScore.totalCriticalScoreUnweighted) &&
        Objects.equals(maxTotalCriticalScoreUnweighted, questionGroupScore.maxTotalCriticalScoreUnweighted) &&
        Objects.equals(markedNA, questionGroupScore.markedNA) &&
        Objects.equals(questionScores, questionGroupScore.questionScores);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questionGroupId, totalScore, maxTotalScore, totalCriticalScore, maxTotalCriticalScore, totalScoreUnweighted, maxTotalScoreUnweighted, totalCriticalScoreUnweighted, maxTotalCriticalScoreUnweighted, markedNA, questionScores);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuestionGroupScore {\n");
    
    sb.append("    questionGroupId: ").append(toIndentedString(questionGroupId)).append("\n");
    sb.append("    totalScore: ").append(toIndentedString(totalScore)).append("\n");
    sb.append("    maxTotalScore: ").append(toIndentedString(maxTotalScore)).append("\n");
    sb.append("    totalCriticalScore: ").append(toIndentedString(totalCriticalScore)).append("\n");
    sb.append("    maxTotalCriticalScore: ").append(toIndentedString(maxTotalCriticalScore)).append("\n");
    sb.append("    totalScoreUnweighted: ").append(toIndentedString(totalScoreUnweighted)).append("\n");
    sb.append("    maxTotalScoreUnweighted: ").append(toIndentedString(maxTotalScoreUnweighted)).append("\n");
    sb.append("    totalCriticalScoreUnweighted: ").append(toIndentedString(totalCriticalScoreUnweighted)).append("\n");
    sb.append("    maxTotalCriticalScoreUnweighted: ").append(toIndentedString(maxTotalCriticalScoreUnweighted)).append("\n");
    sb.append("    markedNA: ").append(toIndentedString(markedNA)).append("\n");
    sb.append("    questionScores: ").append(toIndentedString(questionScores)).append("\n");
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
