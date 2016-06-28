package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.TableTransform;

import com.google.gson.annotations.SerializedName;





public class SheetTransform   {
  
  @SerializedName("sheet")
  private Integer sheet = null;

  @SerializedName("sheetName")
  private String sheetName = null;

  @SerializedName("table")
  private TableTransform table = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getSheet() {
    return sheet;
  }
  public void setSheet(Integer sheet) {
    this.sheet = sheet;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSheetName() {
    return sheetName;
  }
  public void setSheetName(String sheetName) {
    this.sheetName = sheetName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TableTransform getTable() {
    return table;
  }
  public void setTable(TableTransform table) {
    this.table = table;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SheetTransform sheetTransform = (SheetTransform) o;
    return Objects.equals(sheet, sheetTransform.sheet) &&
        Objects.equals(sheetName, sheetTransform.sheetName) &&
        Objects.equals(table, sheetTransform.table);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sheet, sheetName, table);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SheetTransform {\n");
    
    sb.append("    sheet: ").append(toIndentedString(sheet)).append("\n");
    sb.append("    sheetName: ").append(toIndentedString(sheetName)).append("\n");
    sb.append("    table: ").append(toIndentedString(table)).append("\n");
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
