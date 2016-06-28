package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Gistener;
import io.swagger.client.model.GroupTag;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class TwitterExpression   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("dateCreated")
  private Date dateCreated = null;

  @SerializedName("dateModified")
  private Date dateModified = null;

  @SerializedName("isDispositioned")
  private Boolean isDispositioned = false;

  @SerializedName("isNoise")
  private Boolean isNoise = false;

  @SerializedName("gistener")
  private Gistener gistener = null;

  @SerializedName("tweetId")
  private String tweetId = null;

  @SerializedName("text")
  private String text = null;

  @SerializedName("tweetCreated")
  private Date tweetCreated = null;

  @SerializedName("isReply")
  private Boolean isReply = false;

  @SerializedName("isRetweet")
  private Boolean isRetweet = false;

  @SerializedName("retweetParentId")
  private String retweetParentId = null;

  @SerializedName("retweetCount")
  private Integer retweetCount = null;

  @SerializedName("isQuotedTweet")
  private Boolean isQuotedTweet = false;

  @SerializedName("quotedParentId")
  private String quotedParentId = null;

  @SerializedName("userId")
  private String userId = null;

  @SerializedName("userName")
  private String userName = null;

  @SerializedName("userScreenName")
  private String userScreenName = null;

  @SerializedName("userTweetCount")
  private Integer userTweetCount = null;

  @SerializedName("userFollowersCount")
  private Integer userFollowersCount = null;

  @SerializedName("groupTags")
  private List<GroupTag> groupTags = new ArrayList<GroupTag>();

  @SerializedName("routed")
  private Boolean routed = false;

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
   * True once the expression has been dispositioned by an agent through the ACD process
   **/
  @ApiModelProperty(value = "True once the expression has been dispositioned by an agent through the ACD process")
  public Boolean getIsDispositioned() {
    return isDispositioned;
  }
  public void setIsDispositioned(Boolean isDispositioned) {
    this.isDispositioned = isDispositioned;
  }

  /**
   * Indicates if a user/agent found this expression to be undesirable
   **/
  @ApiModelProperty(value = "Indicates if a user/agent found this expression to be undesirable")
  public Boolean getIsNoise() {
    return isNoise;
  }
  public void setIsNoise(Boolean isNoise) {
    this.isNoise = isNoise;
  }

  /**
   * The Gistener that generated this expression
   **/
  @ApiModelProperty(required = true, value = "The Gistener that generated this expression")
  public Gistener getGistener() {
    return gistener;
  }
  public void setGistener(Gistener gistener) {
    this.gistener = gistener;
  }

  /**
   * Twitter: the tweet's unique id
   **/
  @ApiModelProperty(required = true, value = "Twitter: the tweet's unique id")
  public String getTweetId() {
    return tweetId;
  }
  public void setTweetId(String tweetId) {
    this.tweetId = tweetId;
  }

  /**
   * Twitter: the tweets full text
   **/
  @ApiModelProperty(required = true, value = "Twitter: the tweets full text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  /**
   * Twitter: the date the tweet was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Twitter: the date the tweet was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getTweetCreated() {
    return tweetCreated;
  }
  public void setTweetCreated(Date tweetCreated) {
    this.tweetCreated = tweetCreated;
  }

  /**
   * Twitter: indicates this tweet as a reply to another tweet
   **/
  @ApiModelProperty(value = "Twitter: indicates this tweet as a reply to another tweet")
  public Boolean getIsReply() {
    return isReply;
  }
  public void setIsReply(Boolean isReply) {
    this.isReply = isReply;
  }

  /**
   * Twitter: indicates this tweet as a 'retweet' of another tweet
   **/
  @ApiModelProperty(value = "Twitter: indicates this tweet as a 'retweet' of another tweet")
  public Boolean getIsRetweet() {
    return isRetweet;
  }
  public void setIsRetweet(Boolean isRetweet) {
    this.isRetweet = isRetweet;
  }

  /**
   * Twitter: when the expression is a retweet, this is Twitter's id of the original tweet
   **/
  @ApiModelProperty(value = "Twitter: when the expression is a retweet, this is Twitter's id of the original tweet")
  public String getRetweetParentId() {
    return retweetParentId;
  }
  public void setRetweetParentId(String retweetParentId) {
    this.retweetParentId = retweetParentId;
  }

  /**
   * Twitter: the number of times the parent tweet was retweeted - at the time this expression was created
   **/
  @ApiModelProperty(value = "Twitter: the number of times the parent tweet was retweeted - at the time this expression was created")
  public Integer getRetweetCount() {
    return retweetCount;
  }
  public void setRetweetCount(Integer retweetCount) {
    this.retweetCount = retweetCount;
  }

  /**
   * Twitter: indicates this expression as a quoted tweet (a tweet with an addendum as the primary text)
   **/
  @ApiModelProperty(value = "Twitter: indicates this expression as a quoted tweet (a tweet with an addendum as the primary text)")
  public Boolean getIsQuotedTweet() {
    return isQuotedTweet;
  }
  public void setIsQuotedTweet(Boolean isQuotedTweet) {
    this.isQuotedTweet = isQuotedTweet;
  }

  /**
   * Twitter: when the expression is a quoted tweet, this is Twitter's id of the original tweet (may not be immediately functional)
   **/
  @ApiModelProperty(value = "Twitter: when the expression is a quoted tweet, this is Twitter's id of the original tweet (may not be immediately functional)")
  public String getQuotedParentId() {
    return quotedParentId;
  }
  public void setQuotedParentId(String quotedParentId) {
    this.quotedParentId = quotedParentId;
  }

  /**
   * Twitter: the expressing user's Twitter id
   **/
  @ApiModelProperty(value = "Twitter: the expressing user's Twitter id")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  /**
   * Twitter: the user's account name for the core service
   **/
  @ApiModelProperty(required = true, value = "Twitter: the user's account name for the core service")
  public String getUserName() {
    return userName;
  }
  public void setUserName(String userName) {
    this.userName = userName;
  }

  /**
   * Twitter: the user's custom 'branding' name (allowed to change over time)
   **/
  @ApiModelProperty(value = "Twitter: the user's custom 'branding' name (allowed to change over time)")
  public String getUserScreenName() {
    return userScreenName;
  }
  public void setUserScreenName(String userScreenName) {
    this.userScreenName = userScreenName;
  }

  /**
   * Twitter: the number of times this user has tweeted (includes all forms of expression replies/quotes/retweets)
   **/
  @ApiModelProperty(value = "Twitter: the number of times this user has tweeted (includes all forms of expression replies/quotes/retweets)")
  public Integer getUserTweetCount() {
    return userTweetCount;
  }
  public void setUserTweetCount(Integer userTweetCount) {
    this.userTweetCount = userTweetCount;
  }

  /**
   * Twitter: the number of followers this user has at the time of this expression
   **/
  @ApiModelProperty(value = "Twitter: the number of followers this user has at the time of this expression")
  public Integer getUserFollowersCount() {
    return userFollowersCount;
  }
  public void setUserFollowersCount(Integer userFollowersCount) {
    this.userFollowersCount = userFollowersCount;
  }

  /**
   * The Group Tags applied by the generating Gistener
   **/
  @ApiModelProperty(value = "The Group Tags applied by the generating Gistener")
  public List<GroupTag> getGroupTags() {
    return groupTags;
  }
  public void setGroupTags(List<GroupTag> groupTags) {
    this.groupTags = groupTags;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getRouted() {
    return routed;
  }
  public void setRouted(Boolean routed) {
    this.routed = routed;
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
    TwitterExpression twitterExpression = (TwitterExpression) o;
    return Objects.equals(id, twitterExpression.id) &&
        Objects.equals(name, twitterExpression.name) &&
        Objects.equals(dateCreated, twitterExpression.dateCreated) &&
        Objects.equals(dateModified, twitterExpression.dateModified) &&
        Objects.equals(isDispositioned, twitterExpression.isDispositioned) &&
        Objects.equals(isNoise, twitterExpression.isNoise) &&
        Objects.equals(gistener, twitterExpression.gistener) &&
        Objects.equals(tweetId, twitterExpression.tweetId) &&
        Objects.equals(text, twitterExpression.text) &&
        Objects.equals(tweetCreated, twitterExpression.tweetCreated) &&
        Objects.equals(isReply, twitterExpression.isReply) &&
        Objects.equals(isRetweet, twitterExpression.isRetweet) &&
        Objects.equals(retweetParentId, twitterExpression.retweetParentId) &&
        Objects.equals(retweetCount, twitterExpression.retweetCount) &&
        Objects.equals(isQuotedTweet, twitterExpression.isQuotedTweet) &&
        Objects.equals(quotedParentId, twitterExpression.quotedParentId) &&
        Objects.equals(userId, twitterExpression.userId) &&
        Objects.equals(userName, twitterExpression.userName) &&
        Objects.equals(userScreenName, twitterExpression.userScreenName) &&
        Objects.equals(userTweetCount, twitterExpression.userTweetCount) &&
        Objects.equals(userFollowersCount, twitterExpression.userFollowersCount) &&
        Objects.equals(groupTags, twitterExpression.groupTags) &&
        Objects.equals(routed, twitterExpression.routed) &&
        Objects.equals(selfUri, twitterExpression.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, isDispositioned, isNoise, gistener, tweetId, text, tweetCreated, isReply, isRetweet, retweetParentId, retweetCount, isQuotedTweet, quotedParentId, userId, userName, userScreenName, userTweetCount, userFollowersCount, groupTags, routed, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TwitterExpression {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    isDispositioned: ").append(toIndentedString(isDispositioned)).append("\n");
    sb.append("    isNoise: ").append(toIndentedString(isNoise)).append("\n");
    sb.append("    gistener: ").append(toIndentedString(gistener)).append("\n");
    sb.append("    tweetId: ").append(toIndentedString(tweetId)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    tweetCreated: ").append(toIndentedString(tweetCreated)).append("\n");
    sb.append("    isReply: ").append(toIndentedString(isReply)).append("\n");
    sb.append("    isRetweet: ").append(toIndentedString(isRetweet)).append("\n");
    sb.append("    retweetParentId: ").append(toIndentedString(retweetParentId)).append("\n");
    sb.append("    retweetCount: ").append(toIndentedString(retweetCount)).append("\n");
    sb.append("    isQuotedTweet: ").append(toIndentedString(isQuotedTweet)).append("\n");
    sb.append("    quotedParentId: ").append(toIndentedString(quotedParentId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    userScreenName: ").append(toIndentedString(userScreenName)).append("\n");
    sb.append("    userTweetCount: ").append(toIndentedString(userTweetCount)).append("\n");
    sb.append("    userFollowersCount: ").append(toIndentedString(userFollowersCount)).append("\n");
    sb.append("    groupTags: ").append(toIndentedString(groupTags)).append("\n");
    sb.append("    routed: ").append(toIndentedString(routed)).append("\n");
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
