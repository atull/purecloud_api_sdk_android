package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




/**
 * User information for a twitter account
 **/
@ApiModel(description = "User information for a twitter account")
public class TwitterId   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("screenName")
  private String screenName = null;

  @SerializedName("verified")
  private Boolean verified = false;

  @SerializedName("profileUrl")
  private String profileUrl = null;

  /**
   * twitter user.id_str
   **/
  @ApiModelProperty(value = "twitter user.id_str")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * twitter user.name
   **/
  @ApiModelProperty(value = "twitter user.name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * twitter user.screen_name
   **/
  @ApiModelProperty(value = "twitter user.screen_name")
  public String getScreenName() {
    return screenName;
  }
  public void setScreenName(String screenName) {
    this.screenName = screenName;
  }

  /**
   * whether this data has been verified using the twitter API
   **/
  @ApiModelProperty(value = "whether this data has been verified using the twitter API")
  public Boolean getVerified() {
    return verified;
  }

  /**
   * url of user's twitter profile
   **/
  @ApiModelProperty(value = "url of user's twitter profile")
  public String getProfileUrl() {
    return profileUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TwitterId twitterId = (TwitterId) o;
    return Objects.equals(id, twitterId.id) &&
        Objects.equals(name, twitterId.name) &&
        Objects.equals(screenName, twitterId.screenName) &&
        Objects.equals(verified, twitterId.verified) &&
        Objects.equals(profileUrl, twitterId.profileUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, screenName, verified, profileUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TwitterId {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    screenName: ").append(toIndentedString(screenName)).append("\n");
    sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
    sb.append("    profileUrl: ").append(toIndentedString(profileUrl)).append("\n");
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
