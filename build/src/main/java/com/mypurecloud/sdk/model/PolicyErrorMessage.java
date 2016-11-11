package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.UserParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class PolicyErrorMessage  implements Serializable {
  
  @SerializedName("statusCode")
  private Integer statusCode = null;

  @SerializedName("userMessage")
  private Object userMessage = null;

  @SerializedName("userParamsMessage")
  private String userParamsMessage = null;

  @SerializedName("errorCode")
  private String errorCode = null;

  @SerializedName("correlationId")
  private String correlationId = null;

  @SerializedName("userParams")
  private List<UserParam> userParams = new ArrayList<UserParam>();

  @SerializedName("insertDate")
  private Date insertDate = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getStatusCode() {
    return statusCode;
  }
  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Object getUserMessage() {
    return userMessage;
  }
  public void setUserMessage(Object userMessage) {
    this.userMessage = userMessage;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getUserParamsMessage() {
    return userParamsMessage;
  }
  public void setUserParamsMessage(String userParamsMessage) {
    this.userParamsMessage = userParamsMessage;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getErrorCode() {
    return errorCode;
  }
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCorrelationId() {
    return correlationId;
  }
  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<UserParam> getUserParams() {
    return userParams;
  }
  public void setUserParams(List<UserParam> userParams) {
    this.userParams = userParams;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getInsertDate() {
    return insertDate;
  }
  public void setInsertDate(Date insertDate) {
    this.insertDate = insertDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolicyErrorMessage policyErrorMessage = (PolicyErrorMessage) o;
    return Objects.equals(statusCode, policyErrorMessage.statusCode) &&
        Objects.equals(userMessage, policyErrorMessage.userMessage) &&
        Objects.equals(userParamsMessage, policyErrorMessage.userParamsMessage) &&
        Objects.equals(errorCode, policyErrorMessage.errorCode) &&
        Objects.equals(correlationId, policyErrorMessage.correlationId) &&
        Objects.equals(userParams, policyErrorMessage.userParams) &&
        Objects.equals(insertDate, policyErrorMessage.insertDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode, userMessage, userParamsMessage, errorCode, correlationId, userParams, insertDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyErrorMessage {\n");
    
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    userMessage: ").append(toIndentedString(userMessage)).append("\n");
    sb.append("    userParamsMessage: ").append(toIndentedString(userParamsMessage)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    userParams: ").append(toIndentedString(userParams)).append("\n");
    sb.append("    insertDate: ").append(toIndentedString(insertDate)).append("\n");
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
