package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




/**
 * Contains information about the text associated with a response.
 **/
@ApiModel(description = "Contains information about the text associated with a response.")
public class ResponseText   {
  
  @SerializedName("content")
  private String content = null;


  /**
   * Response text content type.
   */
  public enum ContentTypeEnum {
    @SerializedName("text/plain")
    PLAIN("text/plain"),

    @SerializedName("text/html")
    HTML("text/html");

    private String value;

    ContentTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("contentType")
  private ContentTypeEnum contentType = null;

  /**
   * Response text content.
   **/
  @ApiModelProperty(required = true, value = "Response text content.")
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }

  /**
   * Response text content type.
   **/
  @ApiModelProperty(value = "Response text content type.")
  public ContentTypeEnum getContentType() {
    return contentType;
  }
  public void setContentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseText responseText = (ResponseText) o;
    return Objects.equals(content, responseText.content) &&
        Objects.equals(contentType, responseText.contentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, contentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseText {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
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
