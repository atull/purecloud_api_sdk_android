package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class Keyword  implements Serializable {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("phrase")
  private String phrase = null;

  @SerializedName("confidence")
  private Integer confidence = null;

  @SerializedName("agentScoreModifier")
  private Integer agentScoreModifier = null;

  @SerializedName("customerScoreModifier")
  private Integer customerScoreModifier = null;

  @SerializedName("alternateSpellings")
  private List<String> alternateSpellings = new ArrayList<String>();

  @SerializedName("spotabilityIndex")
  private Double spotabilityIndex = null;

  @SerializedName("marginOfError")
  private Double marginOfError = null;

  @SerializedName("pronunciation")
  private String pronunciation = null;

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
   * The word or phrase which is being looked for with speech recognition.
   **/
  @ApiModelProperty(required = true, value = "The word or phrase which is being looked for with speech recognition.")
  public String getPhrase() {
    return phrase;
  }
  public void setPhrase(String phrase) {
    this.phrase = phrase;
  }

  /**
   * A sensitivity threshold that can be increased to lower false positives or decreased to reduce false negatives.
   **/
  @ApiModelProperty(required = true, value = "A sensitivity threshold that can be increased to lower false positives or decreased to reduce false negatives.")
  public Integer getConfidence() {
    return confidence;
  }
  public void setConfidence(Integer confidence) {
    this.confidence = confidence;
  }

  /**
   * A modifier to the evaluation score when the phrase is spotted in the agent channel
   **/
  @ApiModelProperty(required = true, value = "A modifier to the evaluation score when the phrase is spotted in the agent channel")
  public Integer getAgentScoreModifier() {
    return agentScoreModifier;
  }
  public void setAgentScoreModifier(Integer agentScoreModifier) {
    this.agentScoreModifier = agentScoreModifier;
  }

  /**
   * A modifier to the evaluation score when the phrase is spotted in the customer channel
   **/
  @ApiModelProperty(required = true, value = "A modifier to the evaluation score when the phrase is spotted in the customer channel")
  public Integer getCustomerScoreModifier() {
    return customerScoreModifier;
  }
  public void setCustomerScoreModifier(Integer customerScoreModifier) {
    this.customerScoreModifier = customerScoreModifier;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getAlternateSpellings() {
    return alternateSpellings;
  }
  public void setAlternateSpellings(List<String> alternateSpellings) {
    this.alternateSpellings = alternateSpellings;
  }

  /**
   * A prediction of how easy it is to unambiguously spot the keyword within its language based on spelling.
   **/
  @ApiModelProperty(value = "A prediction of how easy it is to unambiguously spot the keyword within its language based on spelling.")
  public Double getSpotabilityIndex() {
    return spotabilityIndex;
  }
  public void setSpotabilityIndex(Double spotabilityIndex) {
    this.spotabilityIndex = spotabilityIndex;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getMarginOfError() {
    return marginOfError;
  }
  public void setMarginOfError(Double marginOfError) {
    this.marginOfError = marginOfError;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPronunciation() {
    return pronunciation;
  }
  public void setPronunciation(String pronunciation) {
    this.pronunciation = pronunciation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Keyword keyword = (Keyword) o;
    return Objects.equals(id, keyword.id) &&
        Objects.equals(name, keyword.name) &&
        Objects.equals(phrase, keyword.phrase) &&
        Objects.equals(confidence, keyword.confidence) &&
        Objects.equals(agentScoreModifier, keyword.agentScoreModifier) &&
        Objects.equals(customerScoreModifier, keyword.customerScoreModifier) &&
        Objects.equals(alternateSpellings, keyword.alternateSpellings) &&
        Objects.equals(spotabilityIndex, keyword.spotabilityIndex) &&
        Objects.equals(marginOfError, keyword.marginOfError) &&
        Objects.equals(pronunciation, keyword.pronunciation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, phrase, confidence, agentScoreModifier, customerScoreModifier, alternateSpellings, spotabilityIndex, marginOfError, pronunciation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Keyword {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phrase: ").append(toIndentedString(phrase)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    agentScoreModifier: ").append(toIndentedString(agentScoreModifier)).append("\n");
    sb.append("    customerScoreModifier: ").append(toIndentedString(customerScoreModifier)).append("\n");
    sb.append("    alternateSpellings: ").append(toIndentedString(alternateSpellings)).append("\n");
    sb.append("    spotabilityIndex: ").append(toIndentedString(spotabilityIndex)).append("\n");
    sb.append("    marginOfError: ").append(toIndentedString(marginOfError)).append("\n");
    sb.append("    pronunciation: ").append(toIndentedString(pronunciation)).append("\n");
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
