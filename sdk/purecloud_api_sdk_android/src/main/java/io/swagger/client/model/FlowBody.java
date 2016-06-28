package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;





public class FlowBody   {
  
  @SerializedName("format")
  private String format = null;

  @SerializedName("body")
  private Map<String, Object> body = new HashMap<String, Object>();

  /**
   * The 'format' indicates the particular format of the 'body' contents.  Reference the Automate documentation for format information.
   **/
  @ApiModelProperty(value = "The 'format' indicates the particular format of the 'body' contents.  Reference the Automate documentation for format information.")
  public String getFormat() {
    return format;
  }
  public void setFormat(String format) {
    this.format = format;
  }

  /**
   * The flow definition body according to the syntax supported by the 'format'.  Use the /processautomation/flows/schemas endpoint to get detailed syntax information for each format.
   **/
  @ApiModelProperty(value = "The flow definition body according to the syntax supported by the 'format'.  Use the /processautomation/flows/schemas endpoint to get detailed syntax information for each format.")
  public Map<String, Object> getBody() {
    return body;
  }
  public void setBody(Map<String, Object> body) {
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
    FlowBody flowBody = (FlowBody) o;
    return Objects.equals(format, flowBody.format) &&
        Objects.equals(body, flowBody.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, body);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowBody {\n");
    
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
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
