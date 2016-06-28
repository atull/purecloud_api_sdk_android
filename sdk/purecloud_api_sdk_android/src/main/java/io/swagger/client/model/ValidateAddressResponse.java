package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.SubscriberResponse;

import com.google.gson.annotations.SerializedName;





public class ValidateAddressResponse   {
  
  @SerializedName("valid")
  private Boolean valid = false;

  @SerializedName("response")
  private SubscriberResponse response = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getValid() {
    return valid;
  }
  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public SubscriberResponse getResponse() {
    return response;
  }
  public void setResponse(SubscriberResponse response) {
    this.response = response;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateAddressResponse validateAddressResponse = (ValidateAddressResponse) o;
    return Objects.equals(valid, validateAddressResponse.valid) &&
        Objects.equals(response, validateAddressResponse.response);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, response);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateAddressResponse {\n");
    
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
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
