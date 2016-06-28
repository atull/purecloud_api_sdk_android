package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;





public class UserActionMetadataRequest   {
  
  @SerializedName("format")
  private String format = null;

  @SerializedName("method")
  private String method = null;

  @SerializedName("inputSchemaUri")
  private String inputSchemaUri = null;

  @SerializedName("successSchemaUri")
  private String successSchemaUri = null;

  @SerializedName("inputSchema")
  private Object inputSchema = null;

  @SerializedName("successSchema")
  private Object successSchema = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getFormat() {
    return format;
  }
  public void setFormat(String format) {
    this.format = format;
  }

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
  public String getInputSchemaUri() {
    return inputSchemaUri;
  }
  public void setInputSchemaUri(String inputSchemaUri) {
    this.inputSchemaUri = inputSchemaUri;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSuccessSchemaUri() {
    return successSchemaUri;
  }
  public void setSuccessSchemaUri(String successSchemaUri) {
    this.successSchemaUri = successSchemaUri;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Object getInputSchema() {
    return inputSchema;
  }
  public void setInputSchema(Object inputSchema) {
    this.inputSchema = inputSchema;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Object getSuccessSchema() {
    return successSchema;
  }
  public void setSuccessSchema(Object successSchema) {
    this.successSchema = successSchema;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserActionMetadataRequest userActionMetadataRequest = (UserActionMetadataRequest) o;
    return Objects.equals(format, userActionMetadataRequest.format) &&
        Objects.equals(method, userActionMetadataRequest.method) &&
        Objects.equals(inputSchemaUri, userActionMetadataRequest.inputSchemaUri) &&
        Objects.equals(successSchemaUri, userActionMetadataRequest.successSchemaUri) &&
        Objects.equals(inputSchema, userActionMetadataRequest.inputSchema) &&
        Objects.equals(successSchema, userActionMetadataRequest.successSchema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, method, inputSchemaUri, successSchemaUri, inputSchema, successSchema);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserActionMetadataRequest {\n");
    
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    inputSchemaUri: ").append(toIndentedString(inputSchemaUri)).append("\n");
    sb.append("    successSchemaUri: ").append(toIndentedString(successSchemaUri)).append("\n");
    sb.append("    inputSchema: ").append(toIndentedString(inputSchema)).append("\n");
    sb.append("    successSchema: ").append(toIndentedString(successSchema)).append("\n");
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
