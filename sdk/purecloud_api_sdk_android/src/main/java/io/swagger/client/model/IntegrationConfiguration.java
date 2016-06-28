package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




/**
 * Configuration for an Integration
 **/
@ApiModel(description = "Configuration for an Integration")
public class IntegrationConfiguration   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("version")
  private Integer version = null;

  @SerializedName("propertiesSchemaUri")
  private String propertiesSchemaUri = null;

  @SerializedName("advancedSchemaUri")
  private String advancedSchemaUri = null;

  @SerializedName("properties")
  private Object properties = null;

  @SerializedName("advanced")
  private Object advanced = null;

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
   * Version number required for updates.
   **/
  @ApiModelProperty(required = true, value = "Version number required for updates.")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }

  /**
   * URI for the JSON Schema describing the configuration properties in the properties field.
   **/
  @ApiModelProperty(value = "URI for the JSON Schema describing the configuration properties in the properties field.")
  public String getPropertiesSchemaUri() {
    return propertiesSchemaUri;
  }

  /**
   * URI for the JSON Schema describing the advanced configuration
   **/
  @ApiModelProperty(value = "URI for the JSON Schema describing the advanced configuration")
  public String getAdvancedSchemaUri() {
    return advancedSchemaUri;
  }

  /**
   * Key-value configuration settings described by the schema in the propertiesSchemaUri field.
   **/
  @ApiModelProperty(required = true, value = "Key-value configuration settings described by the schema in the propertiesSchemaUri field.")
  public Object getProperties() {
    return properties;
  }
  public void setProperties(Object properties) {
    this.properties = properties;
  }

  /**
   * Advanced configuration described by the schema in the advancedSchemaUri field.
   **/
  @ApiModelProperty(required = true, value = "Advanced configuration described by the schema in the advancedSchemaUri field.")
  public Object getAdvanced() {
    return advanced;
  }
  public void setAdvanced(Object advanced) {
    this.advanced = advanced;
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
    IntegrationConfiguration integrationConfiguration = (IntegrationConfiguration) o;
    return Objects.equals(id, integrationConfiguration.id) &&
        Objects.equals(name, integrationConfiguration.name) &&
        Objects.equals(version, integrationConfiguration.version) &&
        Objects.equals(propertiesSchemaUri, integrationConfiguration.propertiesSchemaUri) &&
        Objects.equals(advancedSchemaUri, integrationConfiguration.advancedSchemaUri) &&
        Objects.equals(properties, integrationConfiguration.properties) &&
        Objects.equals(advanced, integrationConfiguration.advanced) &&
        Objects.equals(selfUri, integrationConfiguration.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, version, propertiesSchemaUri, advancedSchemaUri, properties, advanced, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationConfiguration {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    propertiesSchemaUri: ").append(toIndentedString(propertiesSchemaUri)).append("\n");
    sb.append("    advancedSchemaUri: ").append(toIndentedString(advancedSchemaUri)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    advanced: ").append(toIndentedString(advanced)).append("\n");
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
