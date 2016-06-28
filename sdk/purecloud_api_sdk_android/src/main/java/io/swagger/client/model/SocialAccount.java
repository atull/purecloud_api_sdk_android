package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import com.google.gson.annotations.SerializedName;





public class SocialAccount   {
  
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

  @SerializedName("authorized")
  private Boolean authorized = false;

  @SerializedName("socialHub")
  private String socialHub = null;

  @SerializedName("access_token")
  private String accessToken = null;

  @SerializedName("access_token_secret")
  private String accessTokenSecret = null;

  @SerializedName("twitterId")
  private String twitterId = null;

  @SerializedName("streamingEnabled")
  private Boolean streamingEnabled = false;

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
   * Indicates if this Social Account is available for selection by other entities
   **/
  @ApiModelProperty(value = "Indicates if this Social Account is available for selection by other entities")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  /**
   * True when successfully completing the third-party authorization process
   **/
  @ApiModelProperty(value = "True when successfully completing the third-party authorization process")
  public Boolean getAuthorized() {
    return authorized;
  }
  public void setAuthorized(Boolean authorized) {
    this.authorized = authorized;
  }

  /**
   * Which third party Social Media Hub this account will be communicating through
   **/
  @ApiModelProperty(value = "Which third party Social Media Hub this account will be communicating through")
  public String getSocialHub() {
    return socialHub;
  }
  public void setSocialHub(String socialHub) {
    this.socialHub = socialHub;
  }

  /**
   * Credential provided through the Social Hub's authorization process
   **/
  @ApiModelProperty(required = true, value = "Credential provided through the Social Hub's authorization process")
  public String getAccessToken() {
    return accessToken;
  }
  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  /**
   * Credential provided through the Social Hub's authorization process
   **/
  @ApiModelProperty(required = true, value = "Credential provided through the Social Hub's authorization process")
  public String getAccessTokenSecret() {
    return accessTokenSecret;
  }
  public void setAccessTokenSecret(String accessTokenSecret) {
    this.accessTokenSecret = accessTokenSecret;
  }

  /**
   * The account ID as provided by Twitter during the authorization process
   **/
  @ApiModelProperty(value = "The account ID as provided by Twitter during the authorization process")
  public String getTwitterId() {
    return twitterId;
  }
  public void setTwitterId(String twitterId) {
    this.twitterId = twitterId;
  }

  /**
   * Indicates if a stream should be opened on behalf of the indicated Social Hub account
   **/
  @ApiModelProperty(value = "Indicates if a stream should be opened on behalf of the indicated Social Hub account")
  public Boolean getStreamingEnabled() {
    return streamingEnabled;
  }
  public void setStreamingEnabled(Boolean streamingEnabled) {
    this.streamingEnabled = streamingEnabled;
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
    SocialAccount socialAccount = (SocialAccount) o;
    return Objects.equals(id, socialAccount.id) &&
        Objects.equals(name, socialAccount.name) &&
        Objects.equals(dateCreated, socialAccount.dateCreated) &&
        Objects.equals(dateModified, socialAccount.dateModified) &&
        Objects.equals(enabled, socialAccount.enabled) &&
        Objects.equals(authorized, socialAccount.authorized) &&
        Objects.equals(socialHub, socialAccount.socialHub) &&
        Objects.equals(accessToken, socialAccount.accessToken) &&
        Objects.equals(accessTokenSecret, socialAccount.accessTokenSecret) &&
        Objects.equals(twitterId, socialAccount.twitterId) &&
        Objects.equals(streamingEnabled, socialAccount.streamingEnabled) &&
        Objects.equals(selfUri, socialAccount.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, enabled, authorized, socialHub, accessToken, accessTokenSecret, twitterId, streamingEnabled, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SocialAccount {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    authorized: ").append(toIndentedString(authorized)).append("\n");
    sb.append("    socialHub: ").append(toIndentedString(socialHub)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    accessTokenSecret: ").append(toIndentedString(accessTokenSecret)).append("\n");
    sb.append("    twitterId: ").append(toIndentedString(twitterId)).append("\n");
    sb.append("    streamingEnabled: ").append(toIndentedString(streamingEnabled)).append("\n");
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
