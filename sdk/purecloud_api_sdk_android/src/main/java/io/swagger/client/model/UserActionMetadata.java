package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.UserActionMetadataRequest;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class UserActionMetadata   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("category")
  private String category = null;

  @SerializedName("deprecated")
  private Boolean deprecated = false;

  @SerializedName("description")
  private String description = null;

  @SerializedName("published")
  private Boolean published = false;

  @SerializedName("tags")
  private List<String> tags = new ArrayList<String>();

  @SerializedName("helpLink")
  private String helpLink = null;

  @SerializedName("requests")
  private List<UserActionMetadataRequest> requests = new ArrayList<UserActionMetadataRequest>();

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
  public String getCategory() {
    return category;
  }
  public void setCategory(String category) {
    this.category = category;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getDeprecated() {
    return deprecated;
  }
  public void setDeprecated(Boolean deprecated) {
    this.deprecated = deprecated;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getPublished() {
    return published;
  }
  public void setPublished(Boolean published) {
    this.published = published;
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
  public String getHelpLink() {
    return helpLink;
  }
  public void setHelpLink(String helpLink) {
    this.helpLink = helpLink;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<UserActionMetadataRequest> getRequests() {
    return requests;
  }
  public void setRequests(List<UserActionMetadataRequest> requests) {
    this.requests = requests;
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
    UserActionMetadata userActionMetadata = (UserActionMetadata) o;
    return Objects.equals(id, userActionMetadata.id) &&
        Objects.equals(name, userActionMetadata.name) &&
        Objects.equals(category, userActionMetadata.category) &&
        Objects.equals(deprecated, userActionMetadata.deprecated) &&
        Objects.equals(description, userActionMetadata.description) &&
        Objects.equals(published, userActionMetadata.published) &&
        Objects.equals(tags, userActionMetadata.tags) &&
        Objects.equals(helpLink, userActionMetadata.helpLink) &&
        Objects.equals(requests, userActionMetadata.requests) &&
        Objects.equals(selfUri, userActionMetadata.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, category, deprecated, description, published, tags, helpLink, requests, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserActionMetadata {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    deprecated: ").append(toIndentedString(deprecated)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    helpLink: ").append(toIndentedString(helpLink)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
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
