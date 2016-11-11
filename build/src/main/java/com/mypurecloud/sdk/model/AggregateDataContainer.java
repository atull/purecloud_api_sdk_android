package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.StatisticalResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class AggregateDataContainer  implements Serializable {
  
  @SerializedName("group")
  private Map<String, String> group = new HashMap<String, String>();

  @SerializedName("data")
  private List<StatisticalResponse> data = new ArrayList<StatisticalResponse>();

  /**
   * A mapping from dimension to value
   **/
  @ApiModelProperty(value = "A mapping from dimension to value")
  public Map<String, String> getGroup() {
    return group;
  }
  public void setGroup(Map<String, String> group) {
    this.group = group;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<StatisticalResponse> getData() {
    return data;
  }
  public void setData(List<StatisticalResponse> data) {
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
    AggregateDataContainer aggregateDataContainer = (AggregateDataContainer) o;
    return Objects.equals(group, aggregateDataContainer.group) &&
        Objects.equals(data, aggregateDataContainer.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregateDataContainer {\n");
    
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
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
