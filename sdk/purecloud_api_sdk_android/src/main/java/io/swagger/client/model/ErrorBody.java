package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Detail;
import io.swagger.client.model.ErrorBody;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;





public class ErrorBody   {
  
  @SerializedName("status")
  private Integer status = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("entityId")
  private String entityId = null;

  @SerializedName("entityName")
  private String entityName = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("messageWithParams")
  private String messageWithParams = null;

  @SerializedName("messageParams")
  private Map<String, String> messageParams = new HashMap<String, String>();

  @SerializedName("contextId")
  private String contextId = null;

  @SerializedName("details")
  private List<Detail> details = new ArrayList<Detail>();

  @SerializedName("errors")
  private List<ErrorBody> errors = new ArrayList<ErrorBody>();

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
  public String getEntityId() {
    return entityId;
  }
  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getEntityName() {
    return entityName;
  }
  public void setEntityName(String entityName) {
    this.entityName = entityName;
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
  public List<Detail> getDetails() {
    return details;
  }
  public void setDetails(List<Detail> details) {
    this.details = details;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<ErrorBody> getErrors() {
    return errors;
  }
  public void setErrors(List<ErrorBody> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorBody errorBody = (ErrorBody) o;
    return Objects.equals(status, errorBody.status) &&
        Objects.equals(code, errorBody.code) &&
        Objects.equals(entityId, errorBody.entityId) &&
        Objects.equals(entityName, errorBody.entityName) &&
        Objects.equals(message, errorBody.message) &&
        Objects.equals(messageWithParams, errorBody.messageWithParams) &&
        Objects.equals(messageParams, errorBody.messageParams) &&
        Objects.equals(contextId, errorBody.contextId) &&
        Objects.equals(details, errorBody.details) &&
        Objects.equals(errors, errorBody.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, code, entityId, entityName, message, messageWithParams, messageParams, contextId, details, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorBody {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    messageWithParams: ").append(toIndentedString(messageWithParams)).append("\n");
    sb.append("    messageParams: ").append(toIndentedString(messageParams)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
