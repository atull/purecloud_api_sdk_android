package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.IntegrationConfiguration;
import io.swagger.client.model.IntegrationStatusInfo;
import io.swagger.client.model.IntegrationType;

import com.google.gson.annotations.SerializedName;




/**
 * Details for an Integration
 **/
@ApiModel(description = "Details for an Integration")
public class Integration   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("integrationType")
  private IntegrationType integrationType = null;


  /**
   * Configured state of the integration.
   */
  public enum StateEnum {
    @SerializedName("ENABLED")
    ENABLED("ENABLED"),

    @SerializedName("DISABLED")
    DISABLED("DISABLED"),

    @SerializedName("DELETED")
    DELETED("DELETED");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("state")
  private StateEnum state = null;

  @SerializedName("config")
  private IntegrationConfiguration config = null;

  @SerializedName("lastStatus")
  private IntegrationStatusInfo lastStatus = null;

  @SerializedName("version")
  private Integer version = null;

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
   * Type of the integration
   **/
  @ApiModelProperty(value = "Type of the integration")
  public IntegrationType getIntegrationType() {
    return integrationType;
  }
  public void setIntegrationType(IntegrationType integrationType) {
    this.integrationType = integrationType;
  }

  /**
   * Configured state of the integration.
   **/
  @ApiModelProperty(required = true, value = "Configured state of the integration.")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }

  /**
   * Configuration for the integration.
   **/
  @ApiModelProperty(value = "Configuration for the integration.")
  public IntegrationConfiguration getConfig() {
    return config;
  }
  public void setConfig(IntegrationConfiguration config) {
    this.config = config;
  }

  /**
   * Last reported status of the integration.
   **/
  @ApiModelProperty(value = "Last reported status of the integration.")
  public IntegrationStatusInfo getLastStatus() {
    return lastStatus;
  }
  public void setLastStatus(IntegrationStatusInfo lastStatus) {
    this.lastStatus = lastStatus;
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
    Integration integration = (Integration) o;
    return Objects.equals(id, integration.id) &&
        Objects.equals(name, integration.name) &&
        Objects.equals(integrationType, integration.integrationType) &&
        Objects.equals(state, integration.state) &&
        Objects.equals(config, integration.config) &&
        Objects.equals(lastStatus, integration.lastStatus) &&
        Objects.equals(version, integration.version) &&
        Objects.equals(selfUri, integration.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, integrationType, state, config, lastStatus, version, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Integration {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    integrationType: ").append(toIndentedString(integrationType)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    lastStatus: ").append(toIndentedString(lastStatus)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
