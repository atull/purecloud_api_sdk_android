package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.UriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class InboundRoute  implements Serializable {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("pattern")
  private String pattern = null;

  @SerializedName("queue")
  private UriReference queue = null;

  @SerializedName("priority")
  private Integer priority = null;

  @SerializedName("skills")
  private List<UriReference> skills = new ArrayList<UriReference>();

  @SerializedName("language")
  private UriReference language = null;

  @SerializedName("fromName")
  private String fromName = null;

  @SerializedName("fromEmail")
  private String fromEmail = null;

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
   * The search pattern that the mailbox name should match.
   **/
  @ApiModelProperty(value = "The search pattern that the mailbox name should match.")
  public String getPattern() {
    return pattern;
  }
  public void setPattern(String pattern) {
    this.pattern = pattern;
  }

  /**
   * The queue to route the emails to.
   **/
  @ApiModelProperty(value = "The queue to route the emails to.")
  public UriReference getQueue() {
    return queue;
  }
  public void setQueue(UriReference queue) {
    this.queue = queue;
  }

  /**
   * The priority to use for routing.
   **/
  @ApiModelProperty(value = "The priority to use for routing.")
  public Integer getPriority() {
    return priority;
  }
  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  /**
   * The skills to use for routing.
   **/
  @ApiModelProperty(value = "The skills to use for routing.")
  public List<UriReference> getSkills() {
    return skills;
  }
  public void setSkills(List<UriReference> skills) {
    this.skills = skills;
  }

  /**
   * The language to use for routing.
   **/
  @ApiModelProperty(value = "The language to use for routing.")
  public UriReference getLanguage() {
    return language;
  }
  public void setLanguage(UriReference language) {
    this.language = language;
  }

  /**
   * The sender name to use for outgoing replies.
   **/
  @ApiModelProperty(value = "The sender name to use for outgoing replies.")
  public String getFromName() {
    return fromName;
  }
  public void setFromName(String fromName) {
    this.fromName = fromName;
  }

  /**
   * The sender email to use for outgoing replies.
   **/
  @ApiModelProperty(value = "The sender email to use for outgoing replies.")
  public String getFromEmail() {
    return fromEmail;
  }
  public void setFromEmail(String fromEmail) {
    this.fromEmail = fromEmail;
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
    InboundRoute inboundRoute = (InboundRoute) o;
    return Objects.equals(id, inboundRoute.id) &&
        Objects.equals(name, inboundRoute.name) &&
        Objects.equals(pattern, inboundRoute.pattern) &&
        Objects.equals(queue, inboundRoute.queue) &&
        Objects.equals(priority, inboundRoute.priority) &&
        Objects.equals(skills, inboundRoute.skills) &&
        Objects.equals(language, inboundRoute.language) &&
        Objects.equals(fromName, inboundRoute.fromName) &&
        Objects.equals(fromEmail, inboundRoute.fromEmail) &&
        Objects.equals(selfUri, inboundRoute.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, pattern, queue, priority, skills, language, fromName, fromEmail, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InboundRoute {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    skills: ").append(toIndentedString(skills)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    fromName: ").append(toIndentedString(fromName)).append("\n");
    sb.append("    fromEmail: ").append(toIndentedString(fromEmail)).append("\n");
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
