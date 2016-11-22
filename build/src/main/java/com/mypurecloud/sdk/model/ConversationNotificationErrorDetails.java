package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class ConversationNotificationErrorDetails  implements Serializable {
  
  @SerializedName("status")
  private Integer status = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("messageWithParams")
  private String messageWithParams = null;

  @SerializedName("messageParams")
  private Map<String, String> messageParams = new HashMap<String, String>();

  @SerializedName("contextId")
  private String contextId = null;

  @SerializedName("uri")
  private String uri = null;

  @SerializedName("additionalProperties")
  private Object additionalProperties = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
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
  public String getMessageWithParams() {
    return messageWithParams;
  }
  public void setMessageWithParams(String messageWithParams) {
    this.messageWithParams = messageWithParams;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Map<String, String> getMessageParams() {
    return messageParams;
  }
  public void setMessageParams(Map<String, String> messageParams) {
    this.messageParams = messageParams;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getContextId() {
    return contextId;
  }
  public void setContextId(String contextId) {
    this.contextId = contextId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getUri() {
    return uri;
  }
  public void setUri(String uri) {
    this.uri = uri;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Object getAdditionalProperties() {
    return additionalProperties;
  }
  public void setAdditionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationNotificationErrorDetails conversationNotificationErrorDetails = (ConversationNotificationErrorDetails) o;
    return Objects.equals(status, conversationNotificationErrorDetails.status) &&
        Objects.equals(code, conversationNotificationErrorDetails.code) &&
        Objects.equals(message, conversationNotificationErrorDetails.message) &&
        Objects.equals(messageWithParams, conversationNotificationErrorDetails.messageWithParams) &&
        Objects.equals(messageParams, conversationNotificationErrorDetails.messageParams) &&
        Objects.equals(contextId, conversationNotificationErrorDetails.contextId) &&
        Objects.equals(uri, conversationNotificationErrorDetails.uri) &&
        Objects.equals(additionalProperties, conversationNotificationErrorDetails.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, code, message, messageWithParams, messageParams, contextId, uri, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationNotificationErrorDetails {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    messageWithParams: ").append(toIndentedString(messageWithParams)).append("\n");
    sb.append("    messageParams: ").append(toIndentedString(messageParams)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
