package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;





public class BackendFlowAvailableActions   {
  
  @SerializedName("canTerminate")
  private Boolean canTerminate = false;

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getCanTerminate() {
    return canTerminate;
  }
  public void setCanTerminate(Boolean canTerminate) {
    this.canTerminate = canTerminate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BackendFlowAvailableActions backendFlowAvailableActions = (BackendFlowAvailableActions) o;
    return Objects.equals(canTerminate, backendFlowAvailableActions.canTerminate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canTerminate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BackendFlowAvailableActions {\n");
    
    sb.append("    canTerminate: ").append(toIndentedString(canTerminate)).append("\n");
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
