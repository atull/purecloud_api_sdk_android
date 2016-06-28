package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.BatchItemBody;

import com.google.gson.annotations.SerializedName;





public class BatchReplyItem   {
  
  @SerializedName("code")
  private Double code = null;

  @SerializedName("error")
  private String error = null;

  @SerializedName("body")
  private BatchItemBody body = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getCode() {
    return code;
  }
  public void setCode(Double code) {
    this.code = code;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getError() {
    return error;
  }
  public void setError(String error) {
    this.error = error;
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
    BatchReplyItem batchReplyItem = (BatchReplyItem) o;
    return Objects.equals(code, batchReplyItem.code) &&
        Objects.equals(error, batchReplyItem.error) &&
        Objects.equals(body, batchReplyItem.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, error, body);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchReplyItem {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
