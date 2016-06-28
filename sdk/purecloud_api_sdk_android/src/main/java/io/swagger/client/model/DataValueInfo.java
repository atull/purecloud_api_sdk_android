package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.DataItem;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class DataValueInfo   {
  
  @SerializedName("dataItems")
  private List<DataItem> dataItems = new ArrayList<DataItem>();

  /**
   **/
  @ApiModelProperty(value = "")
  public List<DataItem> getDataItems() {
    return dataItems;
  }
  public void setDataItems(List<DataItem> dataItems) {
    this.dataItems = dataItems;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataValueInfo dataValueInfo = (DataValueInfo) o;
    return Objects.equals(dataItems, dataValueInfo.dataItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataValueInfo {\n");
    
    sb.append("    dataItems: ").append(toIndentedString(dataItems)).append("\n");
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
