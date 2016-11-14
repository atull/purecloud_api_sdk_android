package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.Keyword;
import com.mypurecloud.sdk.model.Queue;
import com.mypurecloud.sdk.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class KeywordSet  implements Serializable {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("queue")
  private Queue queue = null;

  @SerializedName("queues")
  private List<Queue> queues = new ArrayList<Queue>();

  @SerializedName("language")
  private String language = null;

  @SerializedName("agents")
  private List<User> agents = new ArrayList<User>();

  @SerializedName("keywords")
  private List<Keyword> keywords = new ArrayList<Keyword>();


  /**
   * Gets or Sets participantPurposes
   */
  public enum ParticipantPurposesEnum {
    @SerializedName("AGENT")
    AGENT("AGENT"),

    @SerializedName("CUSTOMER")
    CUSTOMER("CUSTOMER");

    private String value;

    ParticipantPurposesEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("participantPurposes")
  private List<ParticipantPurposesEnum> participantPurposes = new ArrayList<ParticipantPurposesEnum>();

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
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Queue getQueue() {
    return queue;
  }
  public void setQueue(Queue queue) {
    this.queue = queue;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Queue> getQueues() {
    return queues;
  }
  public void setQueues(List<Queue> queues) {
    this.queues = queues;
  }

  /**
   * Language code, such as 'en-US'
   **/
  @ApiModelProperty(required = true, value = "Language code, such as 'en-US'")
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<User> getAgents() {
    return agents;
  }
  public void setAgents(List<User> agents) {
    this.agents = agents;
  }

  /**
   * The list of keywords to be used for keyword spotting.
   **/
  @ApiModelProperty(required = true, value = "The list of keywords to be used for keyword spotting.")
  public List<Keyword> getKeywords() {
    return keywords;
  }
  public void setKeywords(List<Keyword> keywords) {
    this.keywords = keywords;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<ParticipantPurposesEnum> getParticipantPurposes() {
    return participantPurposes;
  }
  public void setParticipantPurposes(List<ParticipantPurposesEnum> participantPurposes) {
    this.participantPurposes = participantPurposes;
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
    KeywordSet keywordSet = (KeywordSet) o;
    return Objects.equals(id, keywordSet.id) &&
        Objects.equals(name, keywordSet.name) &&
        Objects.equals(description, keywordSet.description) &&
        Objects.equals(queue, keywordSet.queue) &&
        Objects.equals(queues, keywordSet.queues) &&
        Objects.equals(language, keywordSet.language) &&
        Objects.equals(agents, keywordSet.agents) &&
        Objects.equals(keywords, keywordSet.keywords) &&
        Objects.equals(participantPurposes, keywordSet.participantPurposes) &&
        Objects.equals(selfUri, keywordSet.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, queue, queues, language, agents, keywords, participantPurposes, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordSet {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    queues: ").append(toIndentedString(queues)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    agents: ").append(toIndentedString(agents)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    participantPurposes: ").append(toIndentedString(participantPurposes)).append("\n");
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
