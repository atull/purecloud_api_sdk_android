package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;





public class RestErrorDetail   {
  
  @SerializedName("error")
  private String error = null;

  @SerializedName("details")
  private String details = null;

  /**
   * name of the error
   **/
  @ApiModelProperty(required = true, value = "name of the error")
  public String getError() {
    return error;
  }

  /**
   * additional information regarding the error
   **/
  @ApiModelProperty(value = "additional information regarding the error")
  public String getDetails() {
    return details;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestErrorDetail restErrorDetail = (RestErrorDetail) o;
    return Objects.equals(error, restErrorDetail.error) &&
        Objects.equals(details, restErrorDetail.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestErrorDetail {\n");
    
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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
