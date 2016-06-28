package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.FlowConfigId;
import io.swagger.client.model.FlowInputData;

import com.google.gson.annotations.SerializedName;




/**
 * Passed into a flow to describe an object to launch and returned from the operation with the Id populated with the flowInstance launched.
 **/
@ApiModel(description = "Passed into a flow to describe an object to launch and returned from the operation with the Id populated with the flowInstance launched.")
public class FlowLaunchRequest   {
  
  @SerializedName("flowConfigId")
  private FlowConfigId flowConfigId = null;

  @SerializedName("flowInstanceName")
  private String flowInstanceName = null;

  @SerializedName("inputData")
  private FlowInputData inputData = null;


  /**
   * launch type of the flow - NORMAL or TEST
   */
  public enum LaunchTypeEnum {
    @SerializedName("UNKNOWN")
    UNKNOWN("UNKNOWN"),

    @SerializedName("NORMAL")
    NORMAL("NORMAL"),

    @SerializedName("TEST")
    TEST("TEST"),

    @SerializedName("AUTOMATIC")
    AUTOMATIC("AUTOMATIC");

    private String value;

    LaunchTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("launchType")
  private LaunchTypeEnum launchType = null;

  /**
   * ID of the flow to launch, will launch the most recently published version if a specific version is not specified.
   **/
  @ApiModelProperty(required = true, value = "ID of the flow to launch, will launch the most recently published version if a specific version is not specified.")
  public FlowConfigId getFlowConfigId() {
    return flowConfigId;
  }
  public void setFlowConfigId(FlowConfigId flowConfigId) {
    this.flowConfigId = flowConfigId;
  }

  /**
   * The displayable instance name to assign to the new flow instance (or omit to have one automatically generated)
   **/
  @ApiModelProperty(value = "The displayable instance name to assign to the new flow instance (or omit to have one automatically generated)")
  public String getFlowInstanceName() {
    return flowInstanceName;
  }
  public void setFlowInstanceName(String flowInstanceName) {
    this.flowInstanceName = flowInstanceName;
  }

  /**
   * contains launch parameters or initializations for variables in the flow.
   **/
  @ApiModelProperty(value = "contains launch parameters or initializations for variables in the flow.")
  public FlowInputData getInputData() {
    return inputData;
  }
  public void setInputData(FlowInputData inputData) {
    this.inputData = inputData;
  }

  /**
   * launch type of the flow - NORMAL or TEST
   **/
  @ApiModelProperty(required = true, value = "launch type of the flow - NORMAL or TEST")
  public LaunchTypeEnum getLaunchType() {
    return launchType;
  }
  public void setLaunchType(LaunchTypeEnum launchType) {
    this.launchType = launchType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowLaunchRequest flowLaunchRequest = (FlowLaunchRequest) o;
    return Objects.equals(flowConfigId, flowLaunchRequest.flowConfigId) &&
        Objects.equals(flowInstanceName, flowLaunchRequest.flowInstanceName) &&
        Objects.equals(inputData, flowLaunchRequest.inputData) &&
        Objects.equals(launchType, flowLaunchRequest.launchType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flowConfigId, flowInstanceName, inputData, launchType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowLaunchRequest {\n");
    
    sb.append("    flowConfigId: ").append(toIndentedString(flowConfigId)).append("\n");
    sb.append("    flowInstanceName: ").append(toIndentedString(flowInstanceName)).append("\n");
    sb.append("    inputData: ").append(toIndentedString(inputData)).append("\n");
    sb.append("    launchType: ").append(toIndentedString(launchType)).append("\n");
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
