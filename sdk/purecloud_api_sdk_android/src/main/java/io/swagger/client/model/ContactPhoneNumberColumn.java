package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;





public class ContactPhoneNumberColumn   {
  
  @SerializedName("columnName")
  private String columnName = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("callableTimeColumn")
  private String callableTimeColumn = null;

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

  /**
   * name of the column indicating the timezone to be considered for determining callable times
   **/
  @ApiModelProperty(value = "name of the column indicating the timezone to be considered for determining callable times")
  public String getCallableTimeColumn() {
    return callableTimeColumn;
  }
  public void setCallableTimeColumn(String callableTimeColumn) {
    this.callableTimeColumn = callableTimeColumn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactPhoneNumberColumn contactPhoneNumberColumn = (ContactPhoneNumberColumn) o;
    return Objects.equals(columnName, contactPhoneNumberColumn.columnName) &&
        Objects.equals(type, contactPhoneNumberColumn.type) &&
        Objects.equals(callableTimeColumn, contactPhoneNumberColumn.callableTimeColumn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnName, type, callableTimeColumn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactPhoneNumberColumn {\n");
    
    sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    callableTimeColumn: ").append(toIndentedString(callableTimeColumn)).append("\n");
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
