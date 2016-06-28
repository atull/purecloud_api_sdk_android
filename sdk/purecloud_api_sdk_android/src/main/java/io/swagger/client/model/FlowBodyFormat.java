package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;





public class FlowBodyFormat   {
  
  @SerializedName("schemaUri")
  private String schemaUri = null;

  @SerializedName("description")
  private String description = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSchemaUri() {
    return schemaUri;
  }
  public void setSchemaUri(String schemaUri) {
    this.schemaUri = schemaUri;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowBodyFormat flowBodyFormat = (FlowBodyFormat) o;
    return Objects.equals(schemaUri, flowBodyFormat.schemaUri) &&
        Objects.equals(description, flowBodyFormat.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemaUri, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowBodyFormat {\n");
    
    sb.append("    schemaUri: ").append(toIndentedString(schemaUri)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
