package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;





public class TransformLens   {
  
  @SerializedName("replace")
  private String replace = null;

  @SerializedName("value")
  private String value = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getReplace() {
    return replace;
  }
  public void setReplace(String replace) {
    this.replace = replace;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransformLens transformLens = (TransformLens) o;
    return Objects.equals(replace, transformLens.replace) &&
        Objects.equals(value, transformLens.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(replace, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransformLens {\n");
    
    sb.append("    replace: ").append(toIndentedString(replace)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
