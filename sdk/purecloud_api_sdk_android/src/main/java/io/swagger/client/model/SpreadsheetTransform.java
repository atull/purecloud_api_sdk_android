package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.BasicTransform;
import io.swagger.client.model.ClientSpreadsheetTransform;
import io.swagger.client.model.IndexedTransform;
import io.swagger.client.model.SheetTransform;
import io.swagger.client.model.TagModel;
import io.swagger.client.model.TransformEndpoint;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class SpreadsheetTransform   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("restEndpoint")
  private TransformEndpoint restEndpoint = null;

  @SerializedName("filenameTransforms")
  private List<BasicTransform> filenameTransforms = new ArrayList<BasicTransform>();

  @SerializedName("tags")
  private List<TagModel> tags = new ArrayList<TagModel>();

  @SerializedName("sheetNameTransforms")
  private List<IndexedTransform> sheetNameTransforms = new ArrayList<IndexedTransform>();

  @SerializedName("sheets")
  private List<SheetTransform> sheets = new ArrayList<SheetTransform>();

  @SerializedName("clientTransformModel")
  private ClientSpreadsheetTransform clientTransformModel = null;

  @SerializedName("selfUri")
  private String selfUri = null;

  /**
   * The globally unique identifier for the object.
   **/
  @ApiModelProperty(value = "The globally unique identifier for the object.")
  public String getId() {
    return id;
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
  public TransformEndpoint getRestEndpoint() {
    return restEndpoint;
  }
  public void setRestEndpoint(TransformEndpoint restEndpoint) {
    this.restEndpoint = restEndpoint;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<BasicTransform> getFilenameTransforms() {
    return filenameTransforms;
  }
  public void setFilenameTransforms(List<BasicTransform> filenameTransforms) {
    this.filenameTransforms = filenameTransforms;
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
  public List<IndexedTransform> getSheetNameTransforms() {
    return sheetNameTransforms;
  }
  public void setSheetNameTransforms(List<IndexedTransform> sheetNameTransforms) {
    this.sheetNameTransforms = sheetNameTransforms;
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

  /**
   **/
  @ApiModelProperty(value = "")
  public ClientSpreadsheetTransform getClientTransformModel() {
    return clientTransformModel;
  }
  public void setClientTransformModel(ClientSpreadsheetTransform clientTransformModel) {
    this.clientTransformModel = clientTransformModel;
  }

  /**
   * The URI for this object
   **/
  @ApiModelProperty(value = "The URI for this object")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpreadsheetTransform spreadsheetTransform = (SpreadsheetTransform) o;
    return Objects.equals(id, spreadsheetTransform.id) &&
        Objects.equals(name, spreadsheetTransform.name) &&
        Objects.equals(restEndpoint, spreadsheetTransform.restEndpoint) &&
        Objects.equals(filenameTransforms, spreadsheetTransform.filenameTransforms) &&
        Objects.equals(tags, spreadsheetTransform.tags) &&
        Objects.equals(sheetNameTransforms, spreadsheetTransform.sheetNameTransforms) &&
        Objects.equals(sheets, spreadsheetTransform.sheets) &&
        Objects.equals(clientTransformModel, spreadsheetTransform.clientTransformModel) &&
        Objects.equals(selfUri, spreadsheetTransform.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, restEndpoint, filenameTransforms, tags, sheetNameTransforms, sheets, clientTransformModel, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpreadsheetTransform {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    restEndpoint: ").append(toIndentedString(restEndpoint)).append("\n");
    sb.append("    filenameTransforms: ").append(toIndentedString(filenameTransforms)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    sheetNameTransforms: ").append(toIndentedString(sheetNameTransforms)).append("\n");
    sb.append("    sheets: ").append(toIndentedString(sheets)).append("\n");
    sb.append("    clientTransformModel: ").append(toIndentedString(clientTransformModel)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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
