package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class OrgMediaUtilization   {
  
  @SerializedName("maximumCapacity")
  private Integer maximumCapacity = null;

  @SerializedName("interruptableMediaTypes")
  private List<String> interruptableMediaTypes = new ArrayList<String>();

  @SerializedName("includeNonAcd")
  private Boolean includeNonAcd = false;

  /**
   * Defines the maximum number of conversations of this type that an agent can handle at one time.
   **/
  @ApiModelProperty(value = "Defines the maximum number of conversations of this type that an agent can handle at one time.")
  public Integer getMaximumCapacity() {
    return maximumCapacity;
  }
  public void setMaximumCapacity(Integer maximumCapacity) {
    this.maximumCapacity = maximumCapacity;
  }

  /**
   * Defines the list of other media types that can interrupt a conversation of this media type.  Values can be: call, chat, email, or socialExpression
   **/
  @ApiModelProperty(value = "Defines the list of other media types that can interrupt a conversation of this media type.  Values can be: call, chat, email, or socialExpression")
  public List<String> getInterruptableMediaTypes() {
    return interruptableMediaTypes;
  }
  public void setInterruptableMediaTypes(List<String> interruptableMediaTypes) {
    this.interruptableMediaTypes = interruptableMediaTypes;
  }

  /**
   * If true, then track non-ACD conversations against utilization
   **/
  @ApiModelProperty(value = "If true, then track non-ACD conversations against utilization")
  public Boolean getIncludeNonAcd() {
    return includeNonAcd;
  }
  public void setIncludeNonAcd(Boolean includeNonAcd) {
    this.includeNonAcd = includeNonAcd;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgMediaUtilization orgMediaUtilization = (OrgMediaUtilization) o;
    return Objects.equals(maximumCapacity, orgMediaUtilization.maximumCapacity) &&
        Objects.equals(interruptableMediaTypes, orgMediaUtilization.interruptableMediaTypes) &&
        Objects.equals(includeNonAcd, orgMediaUtilization.includeNonAcd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maximumCapacity, interruptableMediaTypes, includeNonAcd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgMediaUtilization {\n");
    
    sb.append("    maximumCapacity: ").append(toIndentedString(maximumCapacity)).append("\n");
    sb.append("    interruptableMediaTypes: ").append(toIndentedString(interruptableMediaTypes)).append("\n");
    sb.append("    includeNonAcd: ").append(toIndentedString(includeNonAcd)).append("\n");
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
