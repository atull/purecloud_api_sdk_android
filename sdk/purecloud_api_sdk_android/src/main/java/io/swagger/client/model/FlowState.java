package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




/**
 * Information about the a State of a flow
 **/
@ApiModel(description = "Information about the a State of a flow")
public class FlowState   {
  
  @SerializedName("stateExecId")
  private String stateExecId = null;

  @SerializedName("stateConfigId")
  private String stateConfigId = null;

  @SerializedName("stateName")
  private String stateName = null;

  /**
   * The identifier of the execution instance of this State.
   **/
  @ApiModelProperty(required = true, value = "The identifier of the execution instance of this State.")
  public String getStateExecId() {
    return stateExecId;
  }
  public void setStateExecId(String stateExecId) {
    this.stateExecId = stateExecId;
  }

  /**
   * The identifier of the definition of this State.
   **/
  @ApiModelProperty(required = true, value = "The identifier of the definition of this State.")
  public String getStateConfigId() {
    return stateConfigId;
  }
  public void setStateConfigId(String stateConfigId) {
    this.stateConfigId = stateConfigId;
  }

  /**
   * The displayable name of this State.
   **/
  @ApiModelProperty(value = "The displayable name of this State.")
  public String getStateName() {
    return stateName;
  }
  public void setStateName(String stateName) {
    this.stateName = stateName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowState flowState = (FlowState) o;
    return Objects.equals(stateExecId, flowState.stateExecId) &&
        Objects.equals(stateConfigId, flowState.stateConfigId) &&
        Objects.equals(stateName, flowState.stateName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stateExecId, stateConfigId, stateName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowState {\n");
    
    sb.append("    stateExecId: ").append(toIndentedString(stateExecId)).append("\n");
    sb.append("    stateConfigId: ").append(toIndentedString(stateConfigId)).append("\n");
    sb.append("    stateName: ").append(toIndentedString(stateName)).append("\n");
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
