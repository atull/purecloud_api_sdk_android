package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class Keyword   {
  
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
  public String getPhrase() {
    return phrase;
  }
  public void setPhrase(String phrase) {
    this.phrase = phrase;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getConfidence() {
    return confidence;
  }
  public void setConfidence(Integer confidence) {
    this.confidence = confidence;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getAgentScoreModifier() {
    return agentScoreModifier;
  }
  public void setAgentScoreModifier(Integer agentScoreModifier) {
    this.agentScoreModifier = agentScoreModifier;
  }

  /**
   **/
  @ApiModelProperty(value = "")
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
        Objects.equals(alternateSpellings, keyword.alternateSpellings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, phrase, confidence, agentScoreModifier, customerScoreModifier, alternateSpellings);
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
