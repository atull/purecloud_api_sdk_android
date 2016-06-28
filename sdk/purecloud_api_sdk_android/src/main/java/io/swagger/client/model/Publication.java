package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import com.google.gson.annotations.SerializedName;





public class Publication   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("dateCreated")
  private Date dateCreated = null;

  @SerializedName("dateModified")
  private Date dateModified = null;

  @SerializedName("tweetText")
  private String tweetText = null;

  @SerializedName("rawTweetText")
  private String rawTweetText = null;

  @SerializedName("approved")
  private Boolean approved = false;

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
   * The text of the tweet.
   **/
  @ApiModelProperty(required = true, value = "The text of the tweet.")
  public String getTweetText() {
    return tweetText;
  }
  public void setTweetText(String tweetText) {
    this.tweetText = tweetText;
  }

  /**
   * The raw text of the tweet
   **/
  @ApiModelProperty(value = "The raw text of the tweet")
  public String getRawTweetText() {
    return rawTweetText;
  }
  public void setRawTweetText(String rawTweetText) {
    this.rawTweetText = rawTweetText;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getApproved() {
    return approved;
  }
  public void setApproved(Boolean approved) {
    this.approved = approved;
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
    Publication publication = (Publication) o;
    return Objects.equals(id, publication.id) &&
        Objects.equals(name, publication.name) &&
        Objects.equals(dateCreated, publication.dateCreated) &&
        Objects.equals(dateModified, publication.dateModified) &&
        Objects.equals(tweetText, publication.tweetText) &&
        Objects.equals(rawTweetText, publication.rawTweetText) &&
        Objects.equals(approved, publication.approved) &&
        Objects.equals(selfUri, publication.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, tweetText, rawTweetText, approved, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Publication {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    tweetText: ").append(toIndentedString(tweetText)).append("\n");
    sb.append("    rawTweetText: ").append(toIndentedString(rawTweetText)).append("\n");
    sb.append("    approved: ").append(toIndentedString(approved)).append("\n");
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
