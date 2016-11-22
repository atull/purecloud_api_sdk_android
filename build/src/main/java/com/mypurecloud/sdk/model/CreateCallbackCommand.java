package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.RoutingData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class CreateCallbackCommand  implements Serializable {
  
  @SerializedName("scriptId")
  private String scriptId = null;

  @SerializedName("queueId")
  private String queueId = null;

  @SerializedName("routingData")
  private RoutingData routingData = null;

  @SerializedName("callbackUserName")
  private String callbackUserName = null;

  @SerializedName("callbackNumbers")
  private List<String> callbackNumbers = new ArrayList<String>();

  @SerializedName("callbackScheduledTime")
  private Date callbackScheduledTime = null;

  @SerializedName("countryCode")
  private String countryCode = null;

  @SerializedName("isAutomated")
  private Boolean isAutomated = false;

  @SerializedName("automatedCallbackConfigId")
  private String automatedCallbackConfigId = null;

  @SerializedName("data")
  private Map<String, String> data = new HashMap<String, String>();

  /**
   * The identifier of the script to be used for the callback
   **/
  @ApiModelProperty(value = "The identifier of the script to be used for the callback")
  public String getScriptId() {
    return scriptId;
  }
  public void setScriptId(String scriptId) {
    this.scriptId = scriptId;
  }

  /**
   * The identifier of the queue to be used for the callback. Either queueId or routingData is required.
   **/
  @ApiModelProperty(value = "The identifier of the queue to be used for the callback. Either queueId or routingData is required.")
  public String getQueueId() {
    return queueId;
  }
  public void setQueueId(String queueId) {
    this.queueId = queueId;
  }

  /**
   * The routing data to be used for the callback. Either queueId or routingData is required.
   **/
  @ApiModelProperty(value = "The routing data to be used for the callback. Either queueId or routingData is required.")
  public RoutingData getRoutingData() {
    return routingData;
  }
  public void setRoutingData(RoutingData routingData) {
    this.routingData = routingData;
  }

  /**
   * The name of the party to be called back.
   **/
  @ApiModelProperty(value = "The name of the party to be called back.")
  public String getCallbackUserName() {
    return callbackUserName;
  }
  public void setCallbackUserName(String callbackUserName) {
    this.callbackUserName = callbackUserName;
  }

  /**
   * A list of phone numbers for the callback.
   **/
  @ApiModelProperty(required = true, value = "A list of phone numbers for the callback.")
  public List<String> getCallbackNumbers() {
    return callbackNumbers;
  }
  public void setCallbackNumbers(List<String> callbackNumbers) {
    this.callbackNumbers = callbackNumbers;
  }

  /**
   * The scheduled date-time for the callback as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "The scheduled date-time for the callback as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getCallbackScheduledTime() {
    return callbackScheduledTime;
  }
  public void setCallbackScheduledTime(Date callbackScheduledTime) {
    this.callbackScheduledTime = callbackScheduledTime;
  }

  /**
   * The country code to be associated with the callback numbers.
   **/
  @ApiModelProperty(value = "The country code to be associated with the callback numbers.")
  public String getCountryCode() {
    return countryCode;
  }
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  /**
   * Whether or not to automatically place a call for this callback.
   **/
  @ApiModelProperty(value = "Whether or not to automatically place a call for this callback.")
  public Boolean getIsAutomated() {
    return isAutomated;
  }
  public void setIsAutomated(Boolean isAutomated) {
    this.isAutomated = isAutomated;
  }

  /**
   * The id of the configuration to handle the response (e.g. live voice, machine) from automatically placing a call for a callback.
   **/
  @ApiModelProperty(value = "The id of the configuration to handle the response (e.g. live voice, machine) from automatically placing a call for a callback.")
  public String getAutomatedCallbackConfigId() {
    return automatedCallbackConfigId;
  }
  public void setAutomatedCallbackConfigId(String automatedCallbackConfigId) {
    this.automatedCallbackConfigId = automatedCallbackConfigId;
  }

  /**
   * A map of key-value pairs containing additional data that can be associated to the callback. These could be set up for instance to be used in a customized script shown during the call. Example: { \"notes\": \"ready to close the deal!\", \"customerPreferredName\": \"Doc\" }
   **/
  @ApiModelProperty(value = "A map of key-value pairs containing additional data that can be associated to the callback. These could be set up for instance to be used in a customized script shown during the call. Example: { \"notes\": \"ready to close the deal!\", \"customerPreferredName\": \"Doc\" }")
  public Map<String, String> getData() {
    return data;
  }
  public void setData(Map<String, String> data) {
    this.data = data;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCallbackCommand createCallbackCommand = (CreateCallbackCommand) o;
    return Objects.equals(scriptId, createCallbackCommand.scriptId) &&
        Objects.equals(queueId, createCallbackCommand.queueId) &&
        Objects.equals(routingData, createCallbackCommand.routingData) &&
        Objects.equals(callbackUserName, createCallbackCommand.callbackUserName) &&
        Objects.equals(callbackNumbers, createCallbackCommand.callbackNumbers) &&
        Objects.equals(callbackScheduledTime, createCallbackCommand.callbackScheduledTime) &&
        Objects.equals(countryCode, createCallbackCommand.countryCode) &&
        Objects.equals(isAutomated, createCallbackCommand.isAutomated) &&
        Objects.equals(automatedCallbackConfigId, createCallbackCommand.automatedCallbackConfigId) &&
        Objects.equals(data, createCallbackCommand.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scriptId, queueId, routingData, callbackUserName, callbackNumbers, callbackScheduledTime, countryCode, isAutomated, automatedCallbackConfigId, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCallbackCommand {\n");
    
    sb.append("    scriptId: ").append(toIndentedString(scriptId)).append("\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    routingData: ").append(toIndentedString(routingData)).append("\n");
    sb.append("    callbackUserName: ").append(toIndentedString(callbackUserName)).append("\n");
    sb.append("    callbackNumbers: ").append(toIndentedString(callbackNumbers)).append("\n");
    sb.append("    callbackScheduledTime: ").append(toIndentedString(callbackScheduledTime)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    isAutomated: ").append(toIndentedString(isAutomated)).append("\n");
    sb.append("    automatedCallbackConfigId: ").append(toIndentedString(automatedCallbackConfigId)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
