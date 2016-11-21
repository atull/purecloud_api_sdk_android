package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class QuestionGroup  implements Serializable {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("defaultAnswersToHighest")
  private Boolean defaultAnswersToHighest = false;

  @SerializedName("defaultAnswersToNA")
  private Boolean defaultAnswersToNA = false;

  @SerializedName("naEnabled")
  private Boolean naEnabled = false;

  @SerializedName("weight")
  private Float weight = null;

  @SerializedName("manualWeight")
  private Boolean manualWeight = false;

  @SerializedName("questions")
  private List<Map<String, Object>> questions = new ArrayList<Map<String, Object>>();

  /**
   **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
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
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getDefaultAnswersToHighest() {
    return defaultAnswersToHighest;
  }
  public void setDefaultAnswersToHighest(Boolean defaultAnswersToHighest) {
    this.defaultAnswersToHighest = defaultAnswersToHighest;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getDefaultAnswersToNA() {
    return defaultAnswersToNA;
  }
  public void setDefaultAnswersToNA(Boolean defaultAnswersToNA) {
    this.defaultAnswersToNA = defaultAnswersToNA;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getNaEnabled() {
    return naEnabled;
  }
  public void setNaEnabled(Boolean naEnabled) {
    this.naEnabled = naEnabled;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Float getWeight() {
    return weight;
  }
  public void setWeight(Float weight) {
    this.weight = weight;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getManualWeight() {
    return manualWeight;
  }
  public void setManualWeight(Boolean manualWeight) {
    this.manualWeight = manualWeight;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Map<String, Object>> getQuestions() {
    return questions;
  }
  public void setQuestions(List<Map<String, Object>> questions) {
    this.questions = questions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuestionGroup questionGroup = (QuestionGroup) o;
    return Objects.equals(id, questionGroup.id) &&
        Objects.equals(name, questionGroup.name) &&
        Objects.equals(type, questionGroup.type) &&
        Objects.equals(defaultAnswersToHighest, questionGroup.defaultAnswersToHighest) &&
        Objects.equals(defaultAnswersToNA, questionGroup.defaultAnswersToNA) &&
        Objects.equals(naEnabled, questionGroup.naEnabled) &&
        Objects.equals(weight, questionGroup.weight) &&
        Objects.equals(manualWeight, questionGroup.manualWeight) &&
        Objects.equals(questions, questionGroup.questions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, defaultAnswersToHighest, defaultAnswersToNA, naEnabled, weight, manualWeight, questions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuestionGroup {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    defaultAnswersToHighest: ").append(toIndentedString(defaultAnswersToHighest)).append("\n");
    sb.append("    defaultAnswersToNA: ").append(toIndentedString(defaultAnswersToNA)).append("\n");
    sb.append("    naEnabled: ").append(toIndentedString(naEnabled)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    manualWeight: ").append(toIndentedString(manualWeight)).append("\n");
    sb.append("    questions: ").append(toIndentedString(questions)).append("\n");
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
