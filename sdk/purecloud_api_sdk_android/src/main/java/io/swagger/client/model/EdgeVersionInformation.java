package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;





public class EdgeVersionInformation   {
  
  @SerializedName("softwareVersion")
  private String softwareVersion = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSoftwareVersion() {
    return softwareVersion;
  }
  public void setSoftwareVersion(String softwareVersion) {
    this.softwareVersion = softwareVersion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdgeVersionInformation edgeVersionInformation = (EdgeVersionInformation) o;
    return Objects.equals(softwareVersion, edgeVersionInformation.softwareVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(softwareVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdgeVersionInformation {\n");
    
    sb.append("    softwareVersion: ").append(toIndentedString(softwareVersion)).append("\n");
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
