package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import com.google.gson.annotations.SerializedName;





public class DomainEdgeSoftwareVersionDto   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("edgeVersion")
  private String edgeVersion = null;

  @SerializedName("publishDate")
  private Date publishDate = null;

  @SerializedName("edgeUri")
  private String edgeUri = null;

  @SerializedName("current")
  private Boolean current = false;

  @SerializedName("latestRelease")
  private Boolean latestRelease = false;

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
  public String getEdgeVersion() {
    return edgeVersion;
  }
  public void setEdgeVersion(String edgeVersion) {
    this.edgeVersion = edgeVersion;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getPublishDate() {
    return publishDate;
  }
  public void setPublishDate(Date publishDate) {
    this.publishDate = publishDate;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getEdgeUri() {
    return edgeUri;
  }
  public void setEdgeUri(String edgeUri) {
    this.edgeUri = edgeUri;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getCurrent() {
    return current;
  }
  public void setCurrent(Boolean current) {
    this.current = current;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getLatestRelease() {
    return latestRelease;
  }
  public void setLatestRelease(Boolean latestRelease) {
    this.latestRelease = latestRelease;
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
    DomainEdgeSoftwareVersionDto domainEdgeSoftwareVersionDto = (DomainEdgeSoftwareVersionDto) o;
    return Objects.equals(id, domainEdgeSoftwareVersionDto.id) &&
        Objects.equals(name, domainEdgeSoftwareVersionDto.name) &&
        Objects.equals(edgeVersion, domainEdgeSoftwareVersionDto.edgeVersion) &&
        Objects.equals(publishDate, domainEdgeSoftwareVersionDto.publishDate) &&
        Objects.equals(edgeUri, domainEdgeSoftwareVersionDto.edgeUri) &&
        Objects.equals(current, domainEdgeSoftwareVersionDto.current) &&
        Objects.equals(latestRelease, domainEdgeSoftwareVersionDto.latestRelease) &&
        Objects.equals(selfUri, domainEdgeSoftwareVersionDto.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, edgeVersion, publishDate, edgeUri, current, latestRelease, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainEdgeSoftwareVersionDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    edgeVersion: ").append(toIndentedString(edgeVersion)).append("\n");
    sb.append("    publishDate: ").append(toIndentedString(publishDate)).append("\n");
    sb.append("    edgeUri: ").append(toIndentedString(edgeUri)).append("\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    latestRelease: ").append(toIndentedString(latestRelease)).append("\n");
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
