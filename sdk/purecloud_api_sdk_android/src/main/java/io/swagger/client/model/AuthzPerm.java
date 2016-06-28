package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;





public class AuthzPerm   {
  
  @SerializedName("name")
  private String name = null;

  @SerializedName("permitted")
  private Boolean permitted = false;

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
  public Boolean getPermitted() {
    return permitted;
  }
  public void setPermitted(Boolean permitted) {
    this.permitted = permitted;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthzPerm authzPerm = (AuthzPerm) o;
    return Objects.equals(name, authzPerm.name) &&
        Objects.equals(permitted, authzPerm.permitted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, permitted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthzPerm {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    permitted: ").append(toIndentedString(permitted)).append("\n");
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
