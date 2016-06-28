package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.UserImage;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;




/**
 * Descriptor for a type of Integration.
 **/
@ApiModel(description = "Descriptor for a type of Integration.")
public class IntegrationType   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("provider")
  private String provider = null;

  @SerializedName("images")
  private List<UserImage> images = new ArrayList<UserImage>();

  @SerializedName("configPropertiesSchemaUri")
  private String configPropertiesSchemaUri = null;

  @SerializedName("configAdvancedSchemaUri")
  private String configAdvancedSchemaUri = null;

  @SerializedName("selfUri")
  private String selfUri = null;

  /**
   * The ID of the integration type.
   **/
  @ApiModelProperty(required = true, value = "The ID of the integration type.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
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
   * Localized description of the integration type.
   **/
  @ApiModelProperty(value = "Localized description of the integration type.")
  public String getDescription() {
    return description;
  }

  /**
   * PureCloud provider of the integration type.
   **/
  @ApiModelProperty(value = "PureCloud provider of the integration type.")
  public String getProvider() {
    return provider;
  }

  /**
   * Collection of logos.
   **/
  @ApiModelProperty(value = "Collection of logos.")
  public List<UserImage> getImages() {
    return images;
  }
  public void setImages(List<UserImage> images) {
    this.images = images;
  }

  /**
   * URI of the schema describing the key-value properties needed to configure an integration of this type.
   **/
  @ApiModelProperty(value = "URI of the schema describing the key-value properties needed to configure an integration of this type.")
  public String getConfigPropertiesSchemaUri() {
    return configPropertiesSchemaUri;
  }

  /**
   * URI of the schema describing the advanced JSON document needed to configure an integration of this type.
   **/
  @ApiModelProperty(value = "URI of the schema describing the advanced JSON document needed to configure an integration of this type.")
  public String getConfigAdvancedSchemaUri() {
    return configAdvancedSchemaUri;
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
    IntegrationType integrationType = (IntegrationType) o;
    return Objects.equals(id, integrationType.id) &&
        Objects.equals(name, integrationType.name) &&
        Objects.equals(description, integrationType.description) &&
        Objects.equals(provider, integrationType.provider) &&
        Objects.equals(images, integrationType.images) &&
        Objects.equals(configPropertiesSchemaUri, integrationType.configPropertiesSchemaUri) &&
        Objects.equals(configAdvancedSchemaUri, integrationType.configAdvancedSchemaUri) &&
        Objects.equals(selfUri, integrationType.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, provider, images, configPropertiesSchemaUri, configAdvancedSchemaUri, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationType {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    configPropertiesSchemaUri: ").append(toIndentedString(configPropertiesSchemaUri)).append("\n");
    sb.append("    configAdvancedSchemaUri: ").append(toIndentedString(configAdvancedSchemaUri)).append("\n");
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
