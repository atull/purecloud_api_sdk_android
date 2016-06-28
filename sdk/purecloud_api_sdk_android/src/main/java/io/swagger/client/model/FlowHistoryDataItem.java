package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Value;

import com.google.gson.annotations.SerializedName;




/**
 * Data elements associated with a history event
 **/
@ApiModel(description = "Data elements associated with a history event")
public class FlowHistoryDataItem   {
  
  @SerializedName("parameterName")
  private String parameterName = null;

  @SerializedName("parameterType")
  private String parameterType = null;

  @SerializedName("parameterValues")
  private Value parameterValues = null;

  /**
   * The name of the data element associated with a history event.
   **/
  @ApiModelProperty(required = true, value = "The name of the data element associated with a history event.")
  public String getParameterName() {
    return parameterName;
  }
  public void setParameterName(String parameterName) {
    this.parameterName = parameterName;
  }

  /**
   * The type of the data element associated with a history event.
   **/
  @ApiModelProperty(required = true, value = "The type of the data element associated with a history event.")
  public String getParameterType() {
    return parameterType;
  }
  public void setParameterType(String parameterType) {
    this.parameterType = parameterType;
  }

  /**
   * The values of the data element associated with a history event.
   **/
  @ApiModelProperty(value = "The values of the data element associated with a history event.")
  public Value getParameterValues() {
    return parameterValues;
  }
  public void setParameterValues(Value parameterValues) {
    this.parameterValues = parameterValues;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowHistoryDataItem flowHistoryDataItem = (FlowHistoryDataItem) o;
    return Objects.equals(parameterName, flowHistoryDataItem.parameterName) &&
        Objects.equals(parameterType, flowHistoryDataItem.parameterType) &&
        Objects.equals(parameterValues, flowHistoryDataItem.parameterValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameterName, parameterType, parameterValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowHistoryDataItem {\n");
    
    sb.append("    parameterName: ").append(toIndentedString(parameterName)).append("\n");
    sb.append("    parameterType: ").append(toIndentedString(parameterType)).append("\n");
    sb.append("    parameterValues: ").append(toIndentedString(parameterValues)).append("\n");
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
