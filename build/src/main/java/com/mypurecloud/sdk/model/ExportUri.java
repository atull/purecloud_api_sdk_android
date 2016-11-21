package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class ExportUri  implements Serializable {
  
  @SerializedName("uri")
  private String uri = null;

  @SerializedName("exportTimestamp")
  private Date exportTimestamp = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getUri() {
    return uri;
  }
  public void setUri(String uri) {
    this.uri = uri;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getExportTimestamp() {
    return exportTimestamp;
  }
  public void setExportTimestamp(Date exportTimestamp) {
    this.exportTimestamp = exportTimestamp;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportUri exportUri = (ExportUri) o;
    return Objects.equals(uri, exportUri.uri) &&
        Objects.equals(exportTimestamp, exportUri.exportTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uri, exportTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportUri {\n");
    
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    exportTimestamp: ").append(toIndentedString(exportTimestamp)).append("\n");
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
