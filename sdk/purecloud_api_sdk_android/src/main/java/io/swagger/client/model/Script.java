package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Page;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class Script   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("versionId")
  private String versionId = null;

  @SerializedName("createdDate")
  private Date createdDate = null;

  @SerializedName("modifiedDate")
  private Date modifiedDate = null;

  @SerializedName("publishedDate")
  private Date publishedDate = null;

  @SerializedName("versionDate")
  private Date versionDate = null;

  @SerializedName("startPageId")
  private String startPageId = null;

  @SerializedName("startPageName")
  private String startPageName = null;

  @SerializedName("features")
  private Object features = null;

  @SerializedName("variables")
  private Object variables = null;

  @SerializedName("customActions")
  private Object customActions = null;

  @SerializedName("pages")
  private List<Page> pages = new ArrayList<Page>();

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
  public String getVersionId() {
    return versionId;
  }
  public void setVersionId(String versionId) {
    this.versionId = versionId;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getModifiedDate() {
    return modifiedDate;
  }
  public void setModifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getPublishedDate() {
    return publishedDate;
  }
  public void setPublishedDate(Date publishedDate) {
    this.publishedDate = publishedDate;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getVersionDate() {
    return versionDate;
  }
  public void setVersionDate(Date versionDate) {
    this.versionDate = versionDate;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getStartPageId() {
    return startPageId;
  }
  public void setStartPageId(String startPageId) {
    this.startPageId = startPageId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getStartPageName() {
    return startPageName;
  }
  public void setStartPageName(String startPageName) {
    this.startPageName = startPageName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Object getFeatures() {
    return features;
  }
  public void setFeatures(Object features) {
    this.features = features;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Object getVariables() {
    return variables;
  }
  public void setVariables(Object variables) {
    this.variables = variables;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Object getCustomActions() {
    return customActions;
  }
  public void setCustomActions(Object customActions) {
    this.customActions = customActions;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Page> getPages() {
    return pages;
  }
  public void setPages(List<Page> pages) {
    this.pages = pages;
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
    Script script = (Script) o;
    return Objects.equals(id, script.id) &&
        Objects.equals(name, script.name) &&
        Objects.equals(versionId, script.versionId) &&
        Objects.equals(createdDate, script.createdDate) &&
        Objects.equals(modifiedDate, script.modifiedDate) &&
        Objects.equals(publishedDate, script.publishedDate) &&
        Objects.equals(versionDate, script.versionDate) &&
        Objects.equals(startPageId, script.startPageId) &&
        Objects.equals(startPageName, script.startPageName) &&
        Objects.equals(features, script.features) &&
        Objects.equals(variables, script.variables) &&
        Objects.equals(customActions, script.customActions) &&
        Objects.equals(pages, script.pages) &&
        Objects.equals(selfUri, script.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, versionId, createdDate, modifiedDate, publishedDate, versionDate, startPageId, startPageName, features, variables, customActions, pages, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Script {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    publishedDate: ").append(toIndentedString(publishedDate)).append("\n");
    sb.append("    versionDate: ").append(toIndentedString(versionDate)).append("\n");
    sb.append("    startPageId: ").append(toIndentedString(startPageId)).append("\n");
    sb.append("    startPageName: ").append(toIndentedString(startPageName)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("    customActions: ").append(toIndentedString(customActions)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
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
