package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;





public class DeltaRequest   {
  
  @SerializedName("contextToken")
  private String contextToken = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getContextToken() {
    return contextToken;
  }
  public void setContextToken(String contextToken) {
    this.contextToken = contextToken;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeltaRequest deltaRequest = (DeltaRequest) o;
    return Objects.equals(contextToken, deltaRequest.contextToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contextToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeltaRequest {\n");
    
    sb.append("    contextToken: ").append(toIndentedString(contextToken)).append("\n");
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
