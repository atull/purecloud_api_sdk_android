package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.BasicTransform;
import io.swagger.client.model.IndexedTransform;
import io.swagger.client.model.SheetTransform;
import io.swagger.client.model.TagModel;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class ClientSpreadsheetTransform   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("endpointId")
  private String endpointId = null;

  @SerializedName("filenameReplaces")
  private List<BasicTransform> filenameReplaces = new ArrayList<BasicTransform>();

  @SerializedName("tags")
  private List<TagModel> tags = new ArrayList<TagModel>();

  @SerializedName("name")
  private String name = null;

  @SerializedName("sheetNameReplaces")
  private List<IndexedTransform> sheetNameReplaces = new ArrayList<IndexedTransform>();

  @SerializedName("sheets")
  private List<SheetTransform> sheets = new ArrayList<SheetTransform>();

  /**
   **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getEndpointId() {
    return endpointId;
  }
  public void setEndpointId(String endpointId) {
    this.endpointId = endpointId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<BasicTransform> getFilenameReplaces() {
    return filenameReplaces;
  }
  public void setFilenameReplaces(List<BasicTransform> filenameReplaces) {
    this.filenameReplaces = filenameReplaces;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<TagModel> getTags() {
    return tags;
  }
  public void setTags(List<TagModel> tags) {
    this.tags = tags;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<IndexedTransform> getSheetNameReplaces() {
    return sheetNameReplaces;
  }
  public void setSheetNameReplaces(List<IndexedTransform> sheetNameReplaces) {
    this.sheetNameReplaces = sheetNameReplaces;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<SheetTransform> getSheets() {
    return sheets;
  }
  public void setSheets(List<SheetTransform> sheets) {
    this.sheets = sheets;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientSpreadsheetTransform clientSpreadsheetTransform = (ClientSpreadsheetTransform) o;
    return Objects.equals(id, clientSpreadsheetTransform.id) &&
        Objects.equals(endpointId, clientSpreadsheetTransform.endpointId) &&
        Objects.equals(filenameReplaces, clientSpreadsheetTransform.filenameReplaces) &&
        Objects.equals(tags, clientSpreadsheetTransform.tags) &&
        Objects.equals(name, clientSpreadsheetTransform.name) &&
        Objects.equals(sheetNameReplaces, clientSpreadsheetTransform.sheetNameReplaces) &&
        Objects.equals(sheets, clientSpreadsheetTransform.sheets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, endpointId, filenameReplaces, tags, name, sheetNameReplaces, sheets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientSpreadsheetTransform {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
    sb.append("    filenameReplaces: ").append(toIndentedString(filenameReplaces)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sheetNameReplaces: ").append(toIndentedString(sheetNameReplaces)).append("\n");
    sb.append("    sheets: ").append(toIndentedString(sheets)).append("\n");
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
