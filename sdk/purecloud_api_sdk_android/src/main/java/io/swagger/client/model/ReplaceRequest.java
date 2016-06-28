package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;





public class ReplaceRequest   {
  
  @SerializedName("changeNumber")
  private Integer changeNumber = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("authToken")
  private String authToken = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getChangeNumber() {
    return changeNumber;
  }
  public void setChangeNumber(Integer changeNumber) {
    this.changeNumber = changeNumber;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getAuthToken() {
    return authToken;
  }
  public void setAuthToken(String authToken) {
    this.authToken = authToken;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplaceRequest replaceRequest = (ReplaceRequest) o;
    return Objects.equals(changeNumber, replaceRequest.changeNumber) &&
        Objects.equals(name, replaceRequest.name) &&
        Objects.equals(authToken, replaceRequest.authToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changeNumber, name, authToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplaceRequest {\n");
    
    sb.append("    changeNumber: ").append(toIndentedString(changeNumber)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    authToken: ").append(toIndentedString(authToken)).append("\n");
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
