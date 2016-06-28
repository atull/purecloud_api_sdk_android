package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.CallMediaPolicy;
import io.swagger.client.model.ChatMediaPolicy;
import io.swagger.client.model.EmailMediaPolicy;

import com.google.gson.annotations.SerializedName;





public class MediaPolicies   {
  
  @SerializedName("callPolicy")
  private CallMediaPolicy callPolicy = null;

  @SerializedName("chatPolicy")
  private ChatMediaPolicy chatPolicy = null;

  @SerializedName("emailPolicy")
  private EmailMediaPolicy emailPolicy = null;

  /**
   * Conditions and actions for calls
   **/
  @ApiModelProperty(value = "Conditions and actions for calls")
  public CallMediaPolicy getCallPolicy() {
    return callPolicy;
  }
  public void setCallPolicy(CallMediaPolicy callPolicy) {
    this.callPolicy = callPolicy;
  }

  /**
   * Conditions and actions for chats
   **/
  @ApiModelProperty(value = "Conditions and actions for chats")
  public ChatMediaPolicy getChatPolicy() {
    return chatPolicy;
  }
  public void setChatPolicy(ChatMediaPolicy chatPolicy) {
    this.chatPolicy = chatPolicy;
  }

  /**
   * Conditions and actions for emails
   **/
  @ApiModelProperty(value = "Conditions and actions for emails")
  public EmailMediaPolicy getEmailPolicy() {
    return emailPolicy;
  }
  public void setEmailPolicy(EmailMediaPolicy emailPolicy) {
    this.emailPolicy = emailPolicy;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaPolicies mediaPolicies = (MediaPolicies) o;
    return Objects.equals(callPolicy, mediaPolicies.callPolicy) &&
        Objects.equals(chatPolicy, mediaPolicies.chatPolicy) &&
        Objects.equals(emailPolicy, mediaPolicies.emailPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callPolicy, chatPolicy, emailPolicy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaPolicies {\n");
    
    sb.append("    callPolicy: ").append(toIndentedString(callPolicy)).append("\n");
    sb.append("    chatPolicy: ").append(toIndentedString(chatPolicy)).append("\n");
    sb.append("    emailPolicy: ").append(toIndentedString(emailPolicy)).append("\n");
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
