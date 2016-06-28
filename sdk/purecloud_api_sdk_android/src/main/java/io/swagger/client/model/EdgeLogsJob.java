package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.EdgeLogsJobFile;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class EdgeLogsJob   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("files")
  private List<EdgeLogsJobFile> files = new ArrayList<EdgeLogsJobFile>();

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
   * The files available to upload from the Edge to the cloud.
   **/
  @ApiModelProperty(value = "The files available to upload from the Edge to the cloud.")
  public List<EdgeLogsJobFile> getFiles() {
    return files;
  }
  public void setFiles(List<EdgeLogsJobFile> files) {
    this.files = files;
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
    EdgeLogsJob edgeLogsJob = (EdgeLogsJob) o;
    return Objects.equals(id, edgeLogsJob.id) &&
        Objects.equals(name, edgeLogsJob.name) &&
        Objects.equals(files, edgeLogsJob.files) &&
        Objects.equals(selfUri, edgeLogsJob.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, files, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdgeLogsJob {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
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
