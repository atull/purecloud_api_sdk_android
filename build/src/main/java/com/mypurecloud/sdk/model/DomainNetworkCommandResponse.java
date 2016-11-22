package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.ErrorDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class DomainNetworkCommandResponse  implements Serializable {
  
  @SerializedName("correlationId")
  private String correlationId = null;

  @SerializedName("commandName")
  private String commandName = null;

  @SerializedName("acknowledged")
  private Boolean acknowledged = false;

  @SerializedName("errorInfo")
  private ErrorDetails errorInfo = null;

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
  public String getCommandName() {
    return commandName;
  }
  public void setCommandName(String commandName) {
    this.commandName = commandName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getAcknowledged() {
    return acknowledged;
  }
  public void setAcknowledged(Boolean acknowledged) {
    this.acknowledged = acknowledged;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ErrorDetails getErrorInfo() {
    return errorInfo;
  }
  public void setErrorInfo(ErrorDetails errorInfo) {
    this.errorInfo = errorInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomainNetworkCommandResponse domainNetworkCommandResponse = (DomainNetworkCommandResponse) o;
    return Objects.equals(correlationId, domainNetworkCommandResponse.correlationId) &&
        Objects.equals(commandName, domainNetworkCommandResponse.commandName) &&
        Objects.equals(acknowledged, domainNetworkCommandResponse.acknowledged) &&
        Objects.equals(errorInfo, domainNetworkCommandResponse.errorInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correlationId, commandName, acknowledged, errorInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainNetworkCommandResponse {\n");
    
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    commandName: ").append(toIndentedString(commandName)).append("\n");
    sb.append("    acknowledged: ").append(toIndentedString(acknowledged)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
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
