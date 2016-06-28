package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




/**
 * Returned upon a successful publish request.
 **/
@ApiModel(description = "Returned upon a successful publish request.")
public class FlowPublish   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("flowConfigVersionSource")
  private String flowConfigVersionSource = null;

  @SerializedName("selfUri")
  private String selfUri = null;

  @SerializedName("version")
  private String version = null;

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
   * Source version that the flow was published from.
   **/
  @ApiModelProperty(required = true, value = "Source version that the flow was published from.")
  public String getFlowConfigVersionSource() {
    return flowConfigVersionSource;
  }
  public void setFlowConfigVersionSource(String flowConfigVersionSource) {
    this.flowConfigVersionSource = flowConfigVersionSource;
  }

  /**
   * The URI for this object
   **/
  @ApiModelProperty(value = "The URI for this object")
  public String getSelfUri() {
    return selfUri;
  }

  /**
   * Version of this flow config.
   **/
  @ApiModelProperty(value = "Version of this flow config.")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowPublish flowPublish = (FlowPublish) o;
    return Objects.equals(id, flowPublish.id) &&
        Objects.equals(name, flowPublish.name) &&
        Objects.equals(flowConfigVersionSource, flowPublish.flowConfigVersionSource) &&
        Objects.equals(selfUri, flowPublish.selfUri) &&
        Objects.equals(version, flowPublish.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, flowConfigVersionSource, selfUri, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowPublish {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    flowConfigVersionSource: ").append(toIndentedString(flowConfigVersionSource)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
