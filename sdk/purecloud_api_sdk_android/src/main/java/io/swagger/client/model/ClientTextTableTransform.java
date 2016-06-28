package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.BasicTransform;
import io.swagger.client.model.TableTransform;
import io.swagger.client.model.TagModel;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class ClientTextTableTransform   {
  
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

  @SerializedName("comments")
  private String comments = null;

  @SerializedName("delimiter")
  private String delimiter = null;

  @SerializedName("table")
  private TableTransform table = null;

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
  public String getComments() {
    return comments;
  }
  public void setComments(String comments) {
    this.comments = comments;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDelimiter() {
    return delimiter;
  }
  public void setDelimiter(String delimiter) {
    this.delimiter = delimiter;
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
    ClientTextTableTransform clientTextTableTransform = (ClientTextTableTransform) o;
    return Objects.equals(id, clientTextTableTransform.id) &&
        Objects.equals(endpointId, clientTextTableTransform.endpointId) &&
        Objects.equals(filenameReplaces, clientTextTableTransform.filenameReplaces) &&
        Objects.equals(tags, clientTextTableTransform.tags) &&
        Objects.equals(name, clientTextTableTransform.name) &&
        Objects.equals(comments, clientTextTableTransform.comments) &&
        Objects.equals(delimiter, clientTextTableTransform.delimiter) &&
        Objects.equals(table, clientTextTableTransform.table);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, endpointId, filenameReplaces, tags, name, comments, delimiter, table);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientTextTableTransform {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
    sb.append("    filenameReplaces: ").append(toIndentedString(filenameReplaces)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    delimiter: ").append(toIndentedString(delimiter)).append("\n");
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
