package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




/**
 * Data containing details to upload a flow definition to for post versioned flows.
 **/
@ApiModel(description = "Data containing details to upload a flow definition to for post versioned flows.")
public class FlowUploadResponse   {
  
  @SerializedName("uri")
  private String uri = null;

  @SerializedName("uploadToken")
  private String uploadToken = null;

  /**
   * uri destination to upload file to
   **/
  @ApiModelProperty(value = "uri destination to upload file to")
  public String getUri() {
    return uri;
  }
  public void setUri(String uri) {
    this.uri = uri;
  }

  /**
   * token to send along when creating versioned flow so the file can be bound to the metadata
   **/
  @ApiModelProperty(value = "token to send along when creating versioned flow so the file can be bound to the metadata")
  public String getUploadToken() {
    return uploadToken;
  }
  public void setUploadToken(String uploadToken) {
    this.uploadToken = uploadToken;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowUploadResponse flowUploadResponse = (FlowUploadResponse) o;
    return Objects.equals(uri, flowUploadResponse.uri) &&
        Objects.equals(uploadToken, flowUploadResponse.uploadToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uri, uploadToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowUploadResponse {\n");
    
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    uploadToken: ").append(toIndentedString(uploadToken)).append("\n");
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
