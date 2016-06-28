package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;





public class HIPAAConfig   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("enableIdleTokenTimeout")
  private Boolean enableIdleTokenTimeout = false;

  @SerializedName("selfUri")
  private String selfUri = null;

  /**
   * The globally unique identifier for the object.
   **/
  @ApiModelProperty(value = "The globally unique identifier for the object.")
  public String getId() {
    return id;
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
  public Boolean getEnableIdleTokenTimeout() {
    return enableIdleTokenTimeout;
  }
  public void setEnableIdleTokenTimeout(Boolean enableIdleTokenTimeout) {
    this.enableIdleTokenTimeout = enableIdleTokenTimeout;
  }

  /**
   * The URI for this object
   **/
  @ApiModelProperty(value = "The URI for this object")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HIPAAConfig hIPAAConfig = (HIPAAConfig) o;
    return Objects.equals(id, hIPAAConfig.id) &&
        Objects.equals(name, hIPAAConfig.name) &&
        Objects.equals(enableIdleTokenTimeout, hIPAAConfig.enableIdleTokenTimeout) &&
        Objects.equals(selfUri, hIPAAConfig.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, enableIdleTokenTimeout, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HIPAAConfig {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    enableIdleTokenTimeout: ").append(toIndentedString(enableIdleTokenTimeout)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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
