package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




/**
 * Management Unit object for Workforce Management.  Not currently functional in public-api v2
 **/
@ApiModel(description = "Management Unit object for Workforce Management.  Not currently functional in public-api v2")
public class ManagementUnit   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("startDayOfWeek")
  private String startDayOfWeek = null;

  @SerializedName("timezone")
  private String timezone = null;

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
  public String getStartDayOfWeek() {
    return startDayOfWeek;
  }
  public void setStartDayOfWeek(String startDayOfWeek) {
    this.startDayOfWeek = startDayOfWeek;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTimezone() {
    return timezone;
  }
  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  /**
   **/
  @ApiModelProperty(value = "")
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
    ManagementUnit managementUnit = (ManagementUnit) o;
    return Objects.equals(id, managementUnit.id) &&
        Objects.equals(name, managementUnit.name) &&
        Objects.equals(startDayOfWeek, managementUnit.startDayOfWeek) &&
        Objects.equals(timezone, managementUnit.timezone) &&
        Objects.equals(version, managementUnit.version) &&
        Objects.equals(selfUri, managementUnit.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, startDayOfWeek, timezone, version, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManagementUnit {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    startDayOfWeek: ").append(toIndentedString(startDayOfWeek)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
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
