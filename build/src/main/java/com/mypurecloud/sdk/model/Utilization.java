package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.OrgMediaUtilization;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class Utilization  implements Serializable {
  
  @SerializedName("utilization")
  private Map<String, OrgMediaUtilization> utilization = new HashMap<String, OrgMediaUtilization>();

  /**
   * Map of media types to utilization settings.  Map keys can be: call, chat, email, or socialExpression
   **/
  @ApiModelProperty(value = "Map of media types to utilization settings.  Map keys can be: call, chat, email, or socialExpression")
  public Map<String, OrgMediaUtilization> getUtilization() {
    return utilization;
  }
  public void setUtilization(Map<String, OrgMediaUtilization> utilization) {
    this.utilization = utilization;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Utilization utilization = (Utilization) o;
    return Objects.equals(utilization, utilization.utilization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(utilization);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Utilization {\n");
    
    sb.append("    utilization: ").append(toIndentedString(utilization)).append("\n");
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
