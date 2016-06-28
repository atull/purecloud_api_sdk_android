package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ChatMessageUser;

import com.google.gson.annotations.SerializedName;





public class ChatMessage   {
  
  @SerializedName("body")
  private String body = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("to")
  private String to = null;

  @SerializedName("from")
  private String from = null;

  @SerializedName("utc")
  private String utc = null;

  @SerializedName("chat")
  private String chat = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("user")
  private ChatMessageUser user = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getBody() {
    return body;
  }
  public void setBody(String body) {
    this.body = body;
  }

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
  public String getTo() {
    return to;
  }
  public void setTo(String to) {
    this.to = to;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getFrom() {
    return from;
  }
  public void setFrom(String from) {
    this.from = from;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getUtc() {
    return utc;
  }
  public void setUtc(String utc) {
    this.utc = utc;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getChat() {
    return chat;
  }
  public void setChat(String chat) {
    this.chat = chat;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ChatMessageUser getUser() {
    return user;
  }
  public void setUser(ChatMessageUser user) {
    this.user = user;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatMessage chatMessage = (ChatMessage) o;
    return Objects.equals(body, chatMessage.body) &&
        Objects.equals(id, chatMessage.id) &&
        Objects.equals(to, chatMessage.to) &&
        Objects.equals(from, chatMessage.from) &&
        Objects.equals(utc, chatMessage.utc) &&
        Objects.equals(chat, chatMessage.chat) &&
        Objects.equals(message, chatMessage.message) &&
        Objects.equals(type, chatMessage.type) &&
        Objects.equals(user, chatMessage.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, id, to, from, utc, chat, message, type, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatMessage {\n");
    
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    utc: ").append(toIndentedString(utc)).append("\n");
    sb.append("    chat: ").append(toIndentedString(chat)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
