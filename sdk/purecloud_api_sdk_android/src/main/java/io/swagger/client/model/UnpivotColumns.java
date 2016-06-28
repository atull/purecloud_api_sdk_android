package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.IndexedTransform;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class UnpivotColumns   {
  
  @SerializedName("columns")
  private List<IndexedTransform> columns = new ArrayList<IndexedTransform>();

  /**
   **/
  @ApiModelProperty(value = "")
  public List<IndexedTransform> getColumns() {
    return columns;
  }
  public void setColumns(List<IndexedTransform> columns) {
    this.columns = columns;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnpivotColumns unpivotColumns = (UnpivotColumns) o;
    return Objects.equals(columns, unpivotColumns.columns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnpivotColumns {\n");
    
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
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
