package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.GroupTag;
import io.swagger.client.model.Queue;
import io.swagger.client.model.SocialAccount;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class Gistener   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("dateCreated")
  private Date dateCreated = null;

  @SerializedName("dateModified")
  private Date dateModified = null;

  @SerializedName("enabled")
  private Boolean enabled = false;

  @SerializedName("anyWords")
  private String anyWords = null;

  @SerializedName("allWords")
  private String allWords = null;

  @SerializedName("excludeWords")
  private String excludeWords = null;

  @SerializedName("exactPhrase")
  private String exactPhrase = null;

  @SerializedName("groupTags")
  private List<GroupTag> groupTags = new ArrayList<GroupTag>();

  @SerializedName("socialAccount")
  private SocialAccount socialAccount = null;

  @SerializedName("queue")
  private Queue queue = null;

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
   * Creation date for the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Creation date for the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }

  /**
   * Date the entity was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date the entity was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }

  /**
   * Indicates if this Gistener may be utilized on another entity
   **/
  @ApiModelProperty(value = "Indicates if this Gistener may be utilized on another entity")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  /**
   * A tweet must contain any one of these words
   **/
  @ApiModelProperty(value = "A tweet must contain any one of these words")
  public String getAnyWords() {
    return anyWords;
  }
  public void setAnyWords(String anyWords) {
    this.anyWords = anyWords;
  }

  /**
   * A tweet must contain every one of these words in any order
   **/
  @ApiModelProperty(value = "A tweet must contain every one of these words in any order")
  public String getAllWords() {
    return allWords;
  }
  public void setAllWords(String allWords) {
    this.allWords = allWords;
  }

  /**
   * If a tweet contains any one of these words, it is thrown out
   **/
  @ApiModelProperty(value = "If a tweet contains any one of these words, it is thrown out")
  public String getExcludeWords() {
    return excludeWords;
  }
  public void setExcludeWords(String excludeWords) {
    this.excludeWords = excludeWords;
  }

  /**
   * A tweet must contain this exact quoted phrase
   **/
  @ApiModelProperty(value = "A tweet must contain this exact quoted phrase")
  public String getExactPhrase() {
    return exactPhrase;
  }
  public void setExactPhrase(String exactPhrase) {
    this.exactPhrase = exactPhrase;
  }

  /**
   * The group tags associated with this Gistener
   **/
  @ApiModelProperty(value = "The group tags associated with this Gistener")
  public List<GroupTag> getGroupTags() {
    return groupTags;
  }
  public void setGroupTags(List<GroupTag> groupTags) {
    this.groupTags = groupTags;
  }

  /**
   * The social account associated with this Gistener
   **/
  @ApiModelProperty(required = true, value = "The social account associated with this Gistener")
  public SocialAccount getSocialAccount() {
    return socialAccount;
  }
  public void setSocialAccount(SocialAccount socialAccount) {
    this.socialAccount = socialAccount;
  }

  /**
   * The operator queue the gistener will route to.
   **/
  @ApiModelProperty(required = true, value = "The operator queue the gistener will route to.")
  public Queue getQueue() {
    return queue;
  }
  public void setQueue(Queue queue) {
    this.queue = queue;
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
    Gistener gistener = (Gistener) o;
    return Objects.equals(id, gistener.id) &&
        Objects.equals(name, gistener.name) &&
        Objects.equals(dateCreated, gistener.dateCreated) &&
        Objects.equals(dateModified, gistener.dateModified) &&
        Objects.equals(enabled, gistener.enabled) &&
        Objects.equals(anyWords, gistener.anyWords) &&
        Objects.equals(allWords, gistener.allWords) &&
        Objects.equals(excludeWords, gistener.excludeWords) &&
        Objects.equals(exactPhrase, gistener.exactPhrase) &&
        Objects.equals(groupTags, gistener.groupTags) &&
        Objects.equals(socialAccount, gistener.socialAccount) &&
        Objects.equals(queue, gistener.queue) &&
        Objects.equals(selfUri, gistener.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, enabled, anyWords, allWords, excludeWords, exactPhrase, groupTags, socialAccount, queue, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Gistener {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    anyWords: ").append(toIndentedString(anyWords)).append("\n");
    sb.append("    allWords: ").append(toIndentedString(allWords)).append("\n");
    sb.append("    excludeWords: ").append(toIndentedString(excludeWords)).append("\n");
    sb.append("    exactPhrase: ").append(toIndentedString(exactPhrase)).append("\n");
    sb.append("    groupTags: ").append(toIndentedString(groupTags)).append("\n");
    sb.append("    socialAccount: ").append(toIndentedString(socialAccount)).append("\n");
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
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
