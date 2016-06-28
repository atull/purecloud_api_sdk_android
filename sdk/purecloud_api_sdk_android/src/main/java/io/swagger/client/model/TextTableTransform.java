package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.BasicTransform;
import io.swagger.client.model.TableTransform;
import io.swagger.client.model.TagModel;
import io.swagger.client.model.TransformEndpoint;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class TextTableTransform   {
  
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

  @SerializedName("commentSymbol")
  private String commentSymbol = null;

  @SerializedName("delimiter")
  private String delimiter = null;

  @SerializedName("table")
  private TableTransform table = null;

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
  public String getCommentSymbol() {
    return commentSymbol;
  }
  public void setCommentSymbol(String commentSymbol) {
    this.commentSymbol = commentSymbol;
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
    TextTableTransform textTableTransform = (TextTableTransform) o;
    return Objects.equals(id, textTableTransform.id) &&
        Objects.equals(name, textTableTransform.name) &&
        Objects.equals(restEndpoint, textTableTransform.restEndpoint) &&
        Objects.equals(filenameTransforms, textTableTransform.filenameTransforms) &&
        Objects.equals(tags, textTableTransform.tags) &&
        Objects.equals(commentSymbol, textTableTransform.commentSymbol) &&
        Objects.equals(delimiter, textTableTransform.delimiter) &&
        Objects.equals(table, textTableTransform.table) &&
        Objects.equals(selfUri, textTableTransform.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, restEndpoint, filenameTransforms, tags, commentSymbol, delimiter, table, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextTableTransform {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    restEndpoint: ").append(toIndentedString(restEndpoint)).append("\n");
    sb.append("    filenameTransforms: ").append(toIndentedString(filenameTransforms)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    commentSymbol: ").append(toIndentedString(commentSymbol)).append("\n");
    sb.append("    delimiter: ").append(toIndentedString(delimiter)).append("\n");
    sb.append("    table: ").append(toIndentedString(table)).append("\n");
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
