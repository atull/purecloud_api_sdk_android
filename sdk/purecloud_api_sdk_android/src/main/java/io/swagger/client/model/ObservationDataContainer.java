package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.AggregateMetricData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;





public class ObservationDataContainer   {
  
  @SerializedName("group")
  private Map<String, String> group = new HashMap<String, String>();

  @SerializedName("data")
  private List<AggregateMetricData> data = new ArrayList<AggregateMetricData>();

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
  public List<AggregateMetricData> getData() {
    return data;
  }
  public void setData(List<AggregateMetricData> data) {
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
    ObservationDataContainer observationDataContainer = (ObservationDataContainer) o;
    return Objects.equals(group, observationDataContainer.group) &&
        Objects.equals(data, observationDataContainer.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservationDataContainer {\n");
    
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
