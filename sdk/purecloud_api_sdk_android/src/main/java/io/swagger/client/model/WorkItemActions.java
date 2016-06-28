package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;





public class WorkItemActions   {
  
  @SerializedName("canSubmit")
  private Boolean canSubmit = false;

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getCanSubmit() {
    return canSubmit;
  }
  public void setCanSubmit(Boolean canSubmit) {
    this.canSubmit = canSubmit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkItemActions workItemActions = (WorkItemActions) o;
    return Objects.equals(canSubmit, workItemActions.canSubmit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canSubmit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkItemActions {\n");
    
    sb.append("    canSubmit: ").append(toIndentedString(canSubmit)).append("\n");
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
