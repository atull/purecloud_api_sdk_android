package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;





public class CallCommand   {
  
  @SerializedName("callNumber")
  private String callNumber = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCallNumber() {
    return callNumber;
  }
  public void setCallNumber(String callNumber) {
    this.callNumber = callNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallCommand callCommand = (CallCommand) o;
    return Objects.equals(callNumber, callCommand.callNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallCommand {\n");
    
    sb.append("    callNumber: ").append(toIndentedString(callNumber)).append("\n");
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
