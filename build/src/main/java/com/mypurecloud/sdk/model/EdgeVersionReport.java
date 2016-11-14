package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.EdgeVersionInformation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class EdgeVersionReport  implements Serializable {
  
  @SerializedName("oldestVersion")
  private EdgeVersionInformation oldestVersion = null;

  @SerializedName("newestVersion")
  private EdgeVersionInformation newestVersion = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public EdgeVersionInformation getOldestVersion() {
    return oldestVersion;
  }
  public void setOldestVersion(EdgeVersionInformation oldestVersion) {
    this.oldestVersion = oldestVersion;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public EdgeVersionInformation getNewestVersion() {
    return newestVersion;
  }
  public void setNewestVersion(EdgeVersionInformation newestVersion) {
    this.newestVersion = newestVersion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdgeVersionReport edgeVersionReport = (EdgeVersionReport) o;
    return Objects.equals(oldestVersion, edgeVersionReport.oldestVersion) &&
        Objects.equals(newestVersion, edgeVersionReport.newestVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oldestVersion, newestVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdgeVersionReport {\n");
    
    sb.append("    oldestVersion: ").append(toIndentedString(oldestVersion)).append("\n");
    sb.append("    newestVersion: ").append(toIndentedString(newestVersion)).append("\n");
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
