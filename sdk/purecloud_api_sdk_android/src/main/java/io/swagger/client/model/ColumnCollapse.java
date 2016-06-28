package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class ColumnCollapse   {
  
  @SerializedName("label")
  private String label = null;

  @SerializedName("columns")
  private List<Integer> columns = new ArrayList<Integer>();

  /**
   **/
  @ApiModelProperty(value = "")
  public String getLabel() {
    return label;
  }
  public void setLabel(String label) {
    this.label = label;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Integer> getColumns() {
    return columns;
  }
  public void setColumns(List<Integer> columns) {
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
    ColumnCollapse columnCollapse = (ColumnCollapse) o;
    return Objects.equals(label, columnCollapse.label) &&
        Objects.equals(columns, columnCollapse.columns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, columns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ColumnCollapse {\n");
    
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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
