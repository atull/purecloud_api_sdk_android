package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;





public class EmailSetup   {
  
  @SerializedName("rootDomain")
  private String rootDomain = null;

  /**
   * The root PureCloud domain that all sub-domains are created from.
   **/
  @ApiModelProperty(value = "The root PureCloud domain that all sub-domains are created from.")
  public String getRootDomain() {
    return rootDomain;
  }
  public void setRootDomain(String rootDomain) {
    this.rootDomain = rootDomain;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailSetup emailSetup = (EmailSetup) o;
    return Objects.equals(rootDomain, emailSetup.rootDomain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rootDomain);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailSetup {\n");
    
    sb.append("    rootDomain: ").append(toIndentedString(rootDomain)).append("\n");
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
