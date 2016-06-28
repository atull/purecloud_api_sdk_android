package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ColumnCollapse;
import io.swagger.client.model.IndexedTransform;
import io.swagger.client.model.UnpivotColumns;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class TableTransform   {
  
  @SerializedName("headerRow")
  private Integer headerRow = null;

  @SerializedName("firstData")
  private Integer firstData = null;

  @SerializedName("headerReplaces")
  private List<IndexedTransform> headerReplaces = new ArrayList<IndexedTransform>();

  @SerializedName("columns")
  private List<IndexedTransform> columns = new ArrayList<IndexedTransform>();

  @SerializedName("unpivots")
  private List<UnpivotColumns> unpivots = new ArrayList<UnpivotColumns>();

  @SerializedName("collapses")
  private List<ColumnCollapse> collapses = new ArrayList<ColumnCollapse>();

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getHeaderRow() {
    return headerRow;
  }
  public void setHeaderRow(Integer headerRow) {
    this.headerRow = headerRow;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getFirstData() {
    return firstData;
  }
  public void setFirstData(Integer firstData) {
    this.firstData = firstData;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<IndexedTransform> getHeaderReplaces() {
    return headerReplaces;
  }
  public void setHeaderReplaces(List<IndexedTransform> headerReplaces) {
    this.headerReplaces = headerReplaces;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<IndexedTransform> getColumns() {
    return columns;
  }
  public void setColumns(List<IndexedTransform> columns) {
    this.columns = columns;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<UnpivotColumns> getUnpivots() {
    return unpivots;
  }
  public void setUnpivots(List<UnpivotColumns> unpivots) {
    this.unpivots = unpivots;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<ColumnCollapse> getCollapses() {
    return collapses;
  }
  public void setCollapses(List<ColumnCollapse> collapses) {
    this.collapses = collapses;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableTransform tableTransform = (TableTransform) o;
    return Objects.equals(headerRow, tableTransform.headerRow) &&
        Objects.equals(firstData, tableTransform.firstData) &&
        Objects.equals(headerReplaces, tableTransform.headerReplaces) &&
        Objects.equals(columns, tableTransform.columns) &&
        Objects.equals(unpivots, tableTransform.unpivots) &&
        Objects.equals(collapses, tableTransform.collapses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headerRow, firstData, headerReplaces, columns, unpivots, collapses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableTransform {\n");
    
    sb.append("    headerRow: ").append(toIndentedString(headerRow)).append("\n");
    sb.append("    firstData: ").append(toIndentedString(firstData)).append("\n");
    sb.append("    headerReplaces: ").append(toIndentedString(headerReplaces)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    unpivots: ").append(toIndentedString(unpivots)).append("\n");
    sb.append("    collapses: ").append(toIndentedString(collapses)).append("\n");
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
