package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import com.google.gson.annotations.SerializedName;




/**
 * Status information for an Integration.
 **/
@ApiModel(description = "Status information for an Integration.")
public class IntegrationStatusInfo   {
  

  /**
   * Machine-readable status as reported by the integration.
   */
  public enum InternalEnum {
    @SerializedName("ACTIVE")
    ACTIVE("ACTIVE"),

    @SerializedName("ACTIVATING")
    ACTIVATING("ACTIVATING"),

    @SerializedName("INACTIVE")
    INACTIVE("INACTIVE"),

    @SerializedName("DEACTIVATING")
    DEACTIVATING("DEACTIVATING"),

    @SerializedName("ERROR")
    ERROR("ERROR");

    private String value;

    InternalEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("internal")
  private InternalEnum internal = null;

  @SerializedName("effective")
  private String effective = null;

  @SerializedName("detail")
  private String detail = null;

  @SerializedName("lastUpdated")
  private Date lastUpdated = null;

  /**
   * Machine-readable status as reported by the integration.
   **/
  @ApiModelProperty(value = "Machine-readable status as reported by the integration.")
  public InternalEnum getInternal() {
    return internal;
  }

  /**
   * Localized, human-readable, effective status of the integration.
   **/
  @ApiModelProperty(value = "Localized, human-readable, effective status of the integration.")
  public String getEffective() {
    return effective;
  }

  /**
   * Localized status details for the integration.
   **/
  @ApiModelProperty(value = "Localized status details for the integration.")
  public String getDetail() {
    return detail;
  }

  /**
   * Date and time (in UTC) when the integration status (i.e. the internal field) was last updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date and time (in UTC) when the integration status (i.e. the internal field) was last updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getLastUpdated() {
    return lastUpdated;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationStatusInfo integrationStatusInfo = (IntegrationStatusInfo) o;
    return Objects.equals(internal, integrationStatusInfo.internal) &&
        Objects.equals(effective, integrationStatusInfo.effective) &&
        Objects.equals(detail, integrationStatusInfo.detail) &&
        Objects.equals(lastUpdated, integrationStatusInfo.lastUpdated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(internal, effective, detail, lastUpdated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationStatusInfo {\n");
    
    sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
    sb.append("    effective: ").append(toIndentedString(effective)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
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
