package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.BatchItemBody;

import com.google.gson.annotations.SerializedName;





public class BatchItem   {
  
  @SerializedName("method")
  private String method = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("body")
  private BatchItemBody body = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getMethod() {
    return method;
  }
  public void setMethod(String method) {
    this.method = method;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BatchItemBody getBody() {
    return body;
  }
  public void setBody(BatchItemBody body) {
    this.body = body;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchItem batchItem = (BatchItem) o;
    return Objects.equals(method, batchItem.method) &&
        Objects.equals(url, batchItem.url) &&
        Objects.equals(body, batchItem.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(method, url, body);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchItem {\n");
    
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
