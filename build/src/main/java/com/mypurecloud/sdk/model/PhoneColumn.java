package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class PhoneColumn  implements Serializable {
  
  @SerializedName("columnName")
  private String columnName = null;

  @SerializedName("type")
  private String type = null;

  /**
   * name of the phone column
   **/
  @ApiModelProperty(required = true, value = "name of the phone column")
  public String getColumnName() {
    return columnName;
  }
  public void setColumnName(String columnName) {
    this.columnName = columnName;
  }

  /**
   * type of the phone column, for example, 'cell' or 'home'
   **/
  @ApiModelProperty(required = true, value = "type of the phone column, for example, 'cell' or 'home'")
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
    PhoneColumn phoneColumn = (PhoneColumn) o;
    return Objects.equals(columnName, phoneColumn.columnName) &&
        Objects.equals(type, phoneColumn.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnName, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneColumn {\n");
    
    sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
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
