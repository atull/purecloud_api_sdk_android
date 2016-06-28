package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;





public class PublishScriptRequestData   {
  
  @SerializedName("scriptId")
  private String scriptId = null;

  @SerializedName("versionId")
  private String versionId = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getScriptId() {
    return scriptId;
  }
  public void setScriptId(String scriptId) {
    this.scriptId = scriptId;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublishScriptRequestData publishScriptRequestData = (PublishScriptRequestData) o;
    return Objects.equals(scriptId, publishScriptRequestData.scriptId) &&
        Objects.equals(versionId, publishScriptRequestData.versionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scriptId, versionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublishScriptRequestData {\n");
    
    sb.append("    scriptId: ").append(toIndentedString(scriptId)).append("\n");
    sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
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
