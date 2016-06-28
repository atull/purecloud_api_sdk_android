package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.TransformLens;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class BasicTransform   {
  
  @SerializedName("replaces")
  private List<TransformLens> replaces = new ArrayList<TransformLens>();

  @SerializedName("entityPath")
  private List<String> entityPath = new ArrayList<String>();

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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BasicTransform basicTransform = (BasicTransform) o;
    return Objects.equals(replaces, basicTransform.replaces) &&
        Objects.equals(entityPath, basicTransform.entityPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(replaces, entityPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BasicTransform {\n");
    
    sb.append("    replaces: ").append(toIndentedString(replaces)).append("\n");
    sb.append("    entityPath: ").append(toIndentedString(entityPath)).append("\n");
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
