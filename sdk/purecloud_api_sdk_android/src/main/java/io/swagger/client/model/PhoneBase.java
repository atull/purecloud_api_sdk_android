package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.LineBase;
import io.swagger.client.model.PhoneCapabilities;
import io.swagger.client.model.UriReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;





public class PhoneBase   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("phoneMetaBase")
  private UriReference phoneMetaBase = null;

  @SerializedName("lines")
  private List<LineBase> lines = new ArrayList<LineBase>();

  @SerializedName("properties")
  private Map<String, Object> properties = new HashMap<String, Object>();

  @SerializedName("capabilities")
  private PhoneCapabilities capabilities = null;

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
   * Phone Meta Base
   **/
  @ApiModelProperty(required = true, value = "Phone Meta Base")
  public UriReference getPhoneMetaBase() {
    return phoneMetaBase;
  }
  public void setPhoneMetaBase(UriReference phoneMetaBase) {
    this.phoneMetaBase = phoneMetaBase;
  }

  /**
   * Lines
   **/
  @ApiModelProperty(required = true, value = "Lines")
  public List<LineBase> getLines() {
    return lines;
  }
  public void setLines(List<LineBase> lines) {
    this.lines = lines;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Map<String, Object> getProperties() {
    return properties;
  }
  public void setProperties(Map<String, Object> properties) {
    this.properties = properties;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public PhoneCapabilities getCapabilities() {
    return capabilities;
  }
  public void setCapabilities(PhoneCapabilities capabilities) {
    this.capabilities = capabilities;
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
    PhoneBase phoneBase = (PhoneBase) o;
    return Objects.equals(id, phoneBase.id) &&
        Objects.equals(name, phoneBase.name) &&
        Objects.equals(phoneMetaBase, phoneBase.phoneMetaBase) &&
        Objects.equals(lines, phoneBase.lines) &&
        Objects.equals(properties, phoneBase.properties) &&
        Objects.equals(capabilities, phoneBase.capabilities) &&
        Objects.equals(selfUri, phoneBase.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, phoneMetaBase, lines, properties, capabilities, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneBase {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phoneMetaBase: ").append(toIndentedString(phoneMetaBase)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
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
