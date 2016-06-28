package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;





public class DataItem   {
  
  @SerializedName("dataItemId")
  private String dataItemId = null;

  @SerializedName("value")
  private String value = null;

  @SerializedName("type")
  private String type = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDataItemId() {
    return dataItemId;
  }
  public void setDataItemId(String dataItemId) {
    this.dataItemId = dataItemId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataItem dataItem = (DataItem) o;
    return Objects.equals(dataItemId, dataItem.dataItemId) &&
        Objects.equals(value, dataItem.value) &&
        Objects.equals(type, dataItem.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataItemId, value, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataItem {\n");
    
    sb.append("    dataItemId: ").append(toIndentedString(dataItemId)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
