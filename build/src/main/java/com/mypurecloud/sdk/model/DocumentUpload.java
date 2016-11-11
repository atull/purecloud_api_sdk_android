package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.UriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class DocumentUpload  implements Serializable {
  
  @SerializedName("name")
  private String name = null;

  @SerializedName("workspace")
  private UriReference workspace = null;

  @SerializedName("tags")
  private List<String> tags = new ArrayList<String>();

  @SerializedName("tagIds")
  private List<String> tagIds = new ArrayList<String>();

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
  public UriReference getWorkspace() {
    return workspace;
  }
  public void setWorkspace(UriReference workspace) {
    this.workspace = workspace;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getTags() {
    return tags;
  }
  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getTagIds() {
    return tagIds;
  }
  public void setTagIds(List<String> tagIds) {
    this.tagIds = tagIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentUpload documentUpload = (DocumentUpload) o;
    return Objects.equals(name, documentUpload.name) &&
        Objects.equals(workspace, documentUpload.workspace) &&
        Objects.equals(tags, documentUpload.tags) &&
        Objects.equals(tagIds, documentUpload.tagIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, workspace, tags, tagIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentUpload {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    tagIds: ").append(toIndentedString(tagIds)).append("\n");
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
