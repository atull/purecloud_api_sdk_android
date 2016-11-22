package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.Parameter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class ReportMetaData  implements Serializable {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("keywords")
  private List<String> keywords = new ArrayList<String>();

  @SerializedName("availableLocales")
  private List<String> availableLocales = new ArrayList<String>();

  @SerializedName("parameters")
  private List<Parameter> parameters = new ArrayList<Parameter>();

  @SerializedName("exampleUrl")
  private String exampleUrl = null;

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
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
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
  public List<String> getKeywords() {
    return keywords;
  }
  public void setKeywords(List<String> keywords) {
    this.keywords = keywords;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getAvailableLocales() {
    return availableLocales;
  }
  public void setAvailableLocales(List<String> availableLocales) {
    this.availableLocales = availableLocales;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Parameter> getParameters() {
    return parameters;
  }
  public void setParameters(List<Parameter> parameters) {
    this.parameters = parameters;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getExampleUrl() {
    return exampleUrl;
  }
  public void setExampleUrl(String exampleUrl) {
    this.exampleUrl = exampleUrl;
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
    ReportMetaData reportMetaData = (ReportMetaData) o;
    return Objects.equals(id, reportMetaData.id) &&
        Objects.equals(name, reportMetaData.name) &&
        Objects.equals(title, reportMetaData.title) &&
        Objects.equals(description, reportMetaData.description) &&
        Objects.equals(keywords, reportMetaData.keywords) &&
        Objects.equals(availableLocales, reportMetaData.availableLocales) &&
        Objects.equals(parameters, reportMetaData.parameters) &&
        Objects.equals(exampleUrl, reportMetaData.exampleUrl) &&
        Objects.equals(selfUri, reportMetaData.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, title, description, keywords, availableLocales, parameters, exampleUrl, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportMetaData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    availableLocales: ").append(toIndentedString(availableLocales)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    exampleUrl: ").append(toIndentedString(exampleUrl)).append("\n");
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
