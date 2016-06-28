package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import com.google.gson.annotations.SerializedName;





public class HealthCheckInfo   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("selfUri")
  private String selfUri = null;

  @SerializedName("Build-Time")
  private String buildTime = null;

  @SerializedName("Build-Version")
  private String buildVersion = null;

  @SerializedName("Implementation-Version")
  private String implementationVersion = null;


  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    @SerializedName("OK")
    OK("OK"),

    @SerializedName("CREATED")
    CREATED("CREATED"),

    @SerializedName("ACCEPTED")
    ACCEPTED("ACCEPTED"),

    @SerializedName("NO_CONTENT")
    NO_CONTENT("NO_CONTENT"),

    @SerializedName("RESET_CONTENT")
    RESET_CONTENT("RESET_CONTENT"),

    @SerializedName("PARTIAL_CONTENT")
    PARTIAL_CONTENT("PARTIAL_CONTENT"),

    @SerializedName("MOVED_PERMANENTLY")
    MOVED_PERMANENTLY("MOVED_PERMANENTLY"),

    @SerializedName("FOUND")
    FOUND("FOUND"),

    @SerializedName("SEE_OTHER")
    SEE_OTHER("SEE_OTHER"),

    @SerializedName("NOT_MODIFIED")
    NOT_MODIFIED("NOT_MODIFIED"),

    @SerializedName("USE_PROXY")
    USE_PROXY("USE_PROXY"),

    @SerializedName("TEMPORARY_REDIRECT")
    TEMPORARY_REDIRECT("TEMPORARY_REDIRECT"),

    @SerializedName("BAD_REQUEST")
    BAD_REQUEST("BAD_REQUEST"),

    @SerializedName("UNAUTHORIZED")
    UNAUTHORIZED("UNAUTHORIZED"),

    @SerializedName("PAYMENT_REQUIRED")
    PAYMENT_REQUIRED("PAYMENT_REQUIRED"),

    @SerializedName("FORBIDDEN")
    FORBIDDEN("FORBIDDEN"),

    @SerializedName("NOT_FOUND")
    NOT_FOUND("NOT_FOUND"),

    @SerializedName("METHOD_NOT_ALLOWED")
    METHOD_NOT_ALLOWED("METHOD_NOT_ALLOWED"),

    @SerializedName("NOT_ACCEPTABLE")
    NOT_ACCEPTABLE("NOT_ACCEPTABLE"),

    @SerializedName("PROXY_AUTHENTICATION_REQUIRED")
    PROXY_AUTHENTICATION_REQUIRED("PROXY_AUTHENTICATION_REQUIRED"),

    @SerializedName("REQUEST_TIMEOUT")
    REQUEST_TIMEOUT("REQUEST_TIMEOUT"),

    @SerializedName("CONFLICT")
    CONFLICT("CONFLICT"),

    @SerializedName("GONE")
    GONE("GONE"),

    @SerializedName("LENGTH_REQUIRED")
    LENGTH_REQUIRED("LENGTH_REQUIRED"),

    @SerializedName("PRECONDITION_FAILED")
    PRECONDITION_FAILED("PRECONDITION_FAILED"),

    @SerializedName("REQUEST_ENTITY_TOO_LARGE")
    REQUEST_ENTITY_TOO_LARGE("REQUEST_ENTITY_TOO_LARGE"),

    @SerializedName("REQUEST_URI_TOO_LONG")
    REQUEST_URI_TOO_LONG("REQUEST_URI_TOO_LONG"),

    @SerializedName("UNSUPPORTED_MEDIA_TYPE")
    UNSUPPORTED_MEDIA_TYPE("UNSUPPORTED_MEDIA_TYPE"),

    @SerializedName("REQUESTED_RANGE_NOT_SATISFIABLE")
    REQUESTED_RANGE_NOT_SATISFIABLE("REQUESTED_RANGE_NOT_SATISFIABLE"),

    @SerializedName("EXPECTATION_FAILED")
    EXPECTATION_FAILED("EXPECTATION_FAILED"),

    @SerializedName("INTERNAL_SERVER_ERROR")
    INTERNAL_SERVER_ERROR("INTERNAL_SERVER_ERROR"),

    @SerializedName("NOT_IMPLEMENTED")
    NOT_IMPLEMENTED("NOT_IMPLEMENTED"),

    @SerializedName("BAD_GATEWAY")
    BAD_GATEWAY("BAD_GATEWAY"),

    @SerializedName("SERVICE_UNAVAILABLE")
    SERVICE_UNAVAILABLE("SERVICE_UNAVAILABLE"),

    @SerializedName("GATEWAY_TIMEOUT")
    GATEWAY_TIMEOUT("GATEWAY_TIMEOUT"),

    @SerializedName("HTTP_VERSION_NOT_SUPPORTED")
    HTTP_VERSION_NOT_SUPPORTED("HTTP_VERSION_NOT_SUPPORTED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("Status")
  private StatusEnum status = null;

  @SerializedName("Ping-Ms")
  private Integer pingMs = null;

  @SerializedName("Date")
  private Date date = null;

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
   * The URI for this object
   **/
  @ApiModelProperty(value = "The URI for this object")
  public String getSelfUri() {
    return selfUri;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getBuildTime() {
    return buildTime;
  }
  public void setBuildTime(String buildTime) {
    this.buildTime = buildTime;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getBuildVersion() {
    return buildVersion;
  }
  public void setBuildVersion(String buildVersion) {
    this.buildVersion = buildVersion;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getImplementationVersion() {
    return implementationVersion;
  }
  public void setImplementationVersion(String implementationVersion) {
    this.implementationVersion = implementationVersion;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getPingMs() {
    return pingMs;
  }
  public void setPingMs(Integer pingMs) {
    this.pingMs = pingMs;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getDate() {
    return date;
  }
  public void setDate(Date date) {
    this.date = date;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HealthCheckInfo healthCheckInfo = (HealthCheckInfo) o;
    return Objects.equals(id, healthCheckInfo.id) &&
        Objects.equals(name, healthCheckInfo.name) &&
        Objects.equals(selfUri, healthCheckInfo.selfUri) &&
        Objects.equals(buildTime, healthCheckInfo.buildTime) &&
        Objects.equals(buildVersion, healthCheckInfo.buildVersion) &&
        Objects.equals(implementationVersion, healthCheckInfo.implementationVersion) &&
        Objects.equals(status, healthCheckInfo.status) &&
        Objects.equals(pingMs, healthCheckInfo.pingMs) &&
        Objects.equals(date, healthCheckInfo.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, selfUri, buildTime, buildVersion, implementationVersion, status, pingMs, date);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HealthCheckInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("    buildTime: ").append(toIndentedString(buildTime)).append("\n");
    sb.append("    buildVersion: ").append(toIndentedString(buildVersion)).append("\n");
    sb.append("    implementationVersion: ").append(toIndentedString(implementationVersion)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    pingMs: ").append(toIndentedString(pingMs)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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
