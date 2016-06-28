package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.TransformLens;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class IndexedTransform   {
  
  @SerializedName("replaces")
  private List<TransformLens> replaces = new ArrayList<TransformLens>();

  @SerializedName("entityPath")
  private List<String> entityPath = new ArrayList<String>();

  @SerializedName("index")
  private Integer index = null;

  @SerializedName("name")
  private String name = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<TransformLens> getReplaces() {
    return replaces;
  }
  public void setReplaces(List<TransformLens> replaces) {
    this.replaces = replaces;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getEntityPath() {
    return entityPath;
  }
  public void setEntityPath(List<String> entityPath) {
    this.entityPath = entityPath;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getIndex() {
    return index;
  }
  public void setIndex(Integer index) {
    this.index = index;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndexedTransform indexedTransform = (IndexedTransform) o;
    return Objects.equals(replaces, indexedTransform.replaces) &&
        Objects.equals(entityPath, indexedTransform.entityPath) &&
        Objects.equals(index, indexedTransform.index) &&
        Objects.equals(name, indexedTransform.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(replaces, entityPath, index, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndexedTransform {\n");
    
    sb.append("    replaces: ").append(toIndentedString(replaces)).append("\n");
    sb.append("    entityPath: ").append(toIndentedString(entityPath)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
