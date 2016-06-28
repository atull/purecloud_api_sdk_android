package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ErrorDetails;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;





public class ErrorDetails   {
  
  @SerializedName("status")
  private Integer status = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("messageWithParams")
  private String messageWithParams = null;

  @SerializedName("messageParams")
  private Map<String, String> messageParams = new HashMap<String, String>();

  @SerializedName("code")
  private String code = null;

  @SerializedName("contextId")
  private String contextId = null;

  @SerializedName("nested")
  private ErrorDetails nested = null;

  @SerializedName("details")
  private String details = null;

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
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
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
  public ErrorDetails getNested() {
    return nested;
  }
  public void setNested(ErrorDetails nested) {
    this.nested = nested;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDetails() {
    return details;
  }
  public void setDetails(String details) {
    this.details = details;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorDetails errorDetails = (ErrorDetails) o;
    return Objects.equals(status, errorDetails.status) &&
        Objects.equals(message, errorDetails.message) &&
        Objects.equals(messageWithParams, errorDetails.messageWithParams) &&
        Objects.equals(messageParams, errorDetails.messageParams) &&
        Objects.equals(code, errorDetails.code) &&
        Objects.equals(contextId, errorDetails.contextId) &&
        Objects.equals(nested, errorDetails.nested) &&
        Objects.equals(details, errorDetails.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, message, messageWithParams, messageParams, code, contextId, nested, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorDetails {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    messageWithParams: ").append(toIndentedString(messageWithParams)).append("\n");
    sb.append("    messageParams: ").append(toIndentedString(messageParams)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    nested: ").append(toIndentedString(nested)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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
