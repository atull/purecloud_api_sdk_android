package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.IntegrationType;

import com.google.gson.annotations.SerializedName;




/**
 * Details for an Integration
 **/
@ApiModel(description = "Details for an Integration")
public class CreateIntegrationRequest   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("integrationType")
  private IntegrationType integrationType = null;

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
   * The name of the integration, used to distinguish this integration from others of the same type.
   **/
  @ApiModelProperty(required = true, value = "The name of the integration, used to distinguish this integration from others of the same type.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Type of the integration to create.
   **/
  @ApiModelProperty(required = true, value = "Type of the integration to create.")
  public IntegrationType getIntegrationType() {
    return integrationType;
  }
  public void setIntegrationType(IntegrationType integrationType) {
    this.integrationType = integrationType;
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
    CreateIntegrationRequest createIntegrationRequest = (CreateIntegrationRequest) o;
    return Objects.equals(id, createIntegrationRequest.id) &&
        Objects.equals(name, createIntegrationRequest.name) &&
        Objects.equals(integrationType, createIntegrationRequest.integrationType) &&
        Objects.equals(selfUri, createIntegrationRequest.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, integrationType, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateIntegrationRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    integrationType: ").append(toIndentedString(integrationType)).append("\n");
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
