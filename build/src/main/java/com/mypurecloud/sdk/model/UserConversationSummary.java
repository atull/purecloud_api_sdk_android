package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.MediaSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class UserConversationSummary  implements Serializable {
  
  @SerializedName("userId")
  private String userId = null;

  @SerializedName("call")
  private MediaSummary call = null;

  @SerializedName("callback")
  private MediaSummary callback = null;

  @SerializedName("email")
  private MediaSummary email = null;

  @SerializedName("chat")
  private MediaSummary chat = null;

  @SerializedName("socialExpression")
  private MediaSummary socialExpression = null;

  @SerializedName("video")
  private MediaSummary video = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public MediaSummary getCall() {
    return call;
  }
  public void setCall(MediaSummary call) {
    this.call = call;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public MediaSummary getCallback() {
    return callback;
  }
  public void setCallback(MediaSummary callback) {
    this.callback = callback;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public MediaSummary getEmail() {
    return email;
  }
  public void setEmail(MediaSummary email) {
    this.email = email;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public MediaSummary getChat() {
    return chat;
  }
  public void setChat(MediaSummary chat) {
    this.chat = chat;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public MediaSummary getSocialExpression() {
    return socialExpression;
  }
  public void setSocialExpression(MediaSummary socialExpression) {
    this.socialExpression = socialExpression;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public MediaSummary getVideo() {
    return video;
  }
  public void setVideo(MediaSummary video) {
    this.video = video;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserConversationSummary userConversationSummary = (UserConversationSummary) o;
    return Objects.equals(userId, userConversationSummary.userId) &&
        Objects.equals(call, userConversationSummary.call) &&
        Objects.equals(callback, userConversationSummary.callback) &&
        Objects.equals(email, userConversationSummary.email) &&
        Objects.equals(chat, userConversationSummary.chat) &&
        Objects.equals(socialExpression, userConversationSummary.socialExpression) &&
        Objects.equals(video, userConversationSummary.video);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, call, callback, email, chat, socialExpression, video);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserConversationSummary {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    call: ").append(toIndentedString(call)).append("\n");
    sb.append("    callback: ").append(toIndentedString(callback)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    chat: ").append(toIndentedString(chat)).append("\n");
    sb.append("    socialExpression: ").append(toIndentedString(socialExpression)).append("\n");
    sb.append("    video: ").append(toIndentedString(video)).append("\n");
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
