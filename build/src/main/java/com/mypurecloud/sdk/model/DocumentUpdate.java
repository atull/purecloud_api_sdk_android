package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.DocumentAttribute;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class DocumentUpdate  implements Serializable {
  
  @SerializedName("changeNumber")
  private Integer changeNumber = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("read")
  private Boolean read = false;

  @SerializedName("addTags")
  private List<String> addTags = new ArrayList<String>();

  @SerializedName("removeTags")
  private List<String> removeTags = new ArrayList<String>();

  @SerializedName("addTagIds")
  private List<String> addTagIds = new ArrayList<String>();

  @SerializedName("removeTagIds")
  private List<String> removeTagIds = new ArrayList<String>();

  @SerializedName("updateAttributes")
  private List<DocumentAttribute> updateAttributes = new ArrayList<DocumentAttribute>();

  @SerializedName("removeAttributes")
  private List<String> removeAttributes = new ArrayList<String>();

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getChangeNumber() {
    return changeNumber;
  }
  public void setChangeNumber(Integer changeNumber) {
    this.changeNumber = changeNumber;
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
  public Boolean getRead() {
    return read;
  }
  public void setRead(Boolean read) {
    this.read = read;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getAddTags() {
    return addTags;
  }
  public void setAddTags(List<String> addTags) {
    this.addTags = addTags;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getRemoveTags() {
    return removeTags;
  }
  public void setRemoveTags(List<String> removeTags) {
    this.removeTags = removeTags;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getAddTagIds() {
    return addTagIds;
  }
  public void setAddTagIds(List<String> addTagIds) {
    this.addTagIds = addTagIds;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getRemoveTagIds() {
    return removeTagIds;
  }
  public void setRemoveTagIds(List<String> removeTagIds) {
    this.removeTagIds = removeTagIds;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<DocumentAttribute> getUpdateAttributes() {
    return updateAttributes;
  }
  public void setUpdateAttributes(List<DocumentAttribute> updateAttributes) {
    this.updateAttributes = updateAttributes;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getRemoveAttributes() {
    return removeAttributes;
  }
  public void setRemoveAttributes(List<String> removeAttributes) {
    this.removeAttributes = removeAttributes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentUpdate documentUpdate = (DocumentUpdate) o;
    return Objects.equals(changeNumber, documentUpdate.changeNumber) &&
        Objects.equals(name, documentUpdate.name) &&
        Objects.equals(read, documentUpdate.read) &&
        Objects.equals(addTags, documentUpdate.addTags) &&
        Objects.equals(removeTags, documentUpdate.removeTags) &&
        Objects.equals(addTagIds, documentUpdate.addTagIds) &&
        Objects.equals(removeTagIds, documentUpdate.removeTagIds) &&
        Objects.equals(updateAttributes, documentUpdate.updateAttributes) &&
        Objects.equals(removeAttributes, documentUpdate.removeAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changeNumber, name, read, addTags, removeTags, addTagIds, removeTagIds, updateAttributes, removeAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentUpdate {\n");
    
    sb.append("    changeNumber: ").append(toIndentedString(changeNumber)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    read: ").append(toIndentedString(read)).append("\n");
    sb.append("    addTags: ").append(toIndentedString(addTags)).append("\n");
    sb.append("    removeTags: ").append(toIndentedString(removeTags)).append("\n");
    sb.append("    addTagIds: ").append(toIndentedString(addTagIds)).append("\n");
    sb.append("    removeTagIds: ").append(toIndentedString(removeTagIds)).append("\n");
    sb.append("    updateAttributes: ").append(toIndentedString(updateAttributes)).append("\n");
    sb.append("    removeAttributes: ").append(toIndentedString(removeAttributes)).append("\n");
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
