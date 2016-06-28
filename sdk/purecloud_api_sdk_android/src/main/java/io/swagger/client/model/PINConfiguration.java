package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;





public class PINConfiguration   {
  
  @SerializedName("minimumLength")
  private Integer minimumLength = null;

  @SerializedName("maximumLength")
  private Integer maximumLength = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getMinimumLength() {
    return minimumLength;
  }
  public void setMinimumLength(Integer minimumLength) {
    this.minimumLength = minimumLength;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getMaximumLength() {
    return maximumLength;
  }
  public void setMaximumLength(Integer maximumLength) {
    this.maximumLength = maximumLength;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PINConfiguration pINConfiguration = (PINConfiguration) o;
    return Objects.equals(minimumLength, pINConfiguration.minimumLength) &&
        Objects.equals(maximumLength, pINConfiguration.maximumLength);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minimumLength, maximumLength);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PINConfiguration {\n");
    
    sb.append("    minimumLength: ").append(toIndentedString(minimumLength)).append("\n");
    sb.append("    maximumLength: ").append(toIndentedString(maximumLength)).append("\n");
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
