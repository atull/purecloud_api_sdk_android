package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.DomainEdgeSoftwareVersionDto;
import java.util.Date;

import com.google.gson.annotations.SerializedName;





public class DomainEdgeSoftwareUpdateDto   {
  
  @SerializedName("version")
  private DomainEdgeSoftwareVersionDto version = null;

  @SerializedName("maxDownloadRate")
  private Integer maxDownloadRate = null;

  @SerializedName("downloadStartTime")
  private Date downloadStartTime = null;

  @SerializedName("executeStartTime")
  private Date executeStartTime = null;

  @SerializedName("executeStopTime")
  private Date executeStopTime = null;

  @SerializedName("executeOnIdle")
  private Boolean executeOnIdle = false;


  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    @SerializedName("NONE")
    NONE("NONE"),

    @SerializedName("INIT")
    INIT("INIT"),

    @SerializedName("IN_PROGRESS")
    IN_PROGRESS("IN_PROGRESS"),

    @SerializedName("EXPIRED")
    EXPIRED("EXPIRED"),

    @SerializedName("EXCEPTION")
    EXCEPTION("EXCEPTION"),

    @SerializedName("ABORTED")
    ABORTED("ABORTED"),

    @SerializedName("FAILED")
    FAILED("FAILED"),

    @SerializedName("SUCCEEDED")
    SUCCEEDED("SUCCEEDED"),

    @SerializedName("DELETE")
    DELETE("DELETE");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("edgeUri")
  private String edgeUri = null;

  @SerializedName("current")
  private Boolean current = false;

  /**
   * Version
   **/
  @ApiModelProperty(required = true, value = "Version")
  public DomainEdgeSoftwareVersionDto getVersion() {
    return version;
  }
  public void setVersion(DomainEdgeSoftwareVersionDto version) {
    this.version = version;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getMaxDownloadRate() {
    return maxDownloadRate;
  }
  public void setMaxDownloadRate(Integer maxDownloadRate) {
    this.maxDownloadRate = maxDownloadRate;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getDownloadStartTime() {
    return downloadStartTime;
  }
  public void setDownloadStartTime(Date downloadStartTime) {
    this.downloadStartTime = downloadStartTime;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getExecuteStartTime() {
    return executeStartTime;
  }
  public void setExecuteStartTime(Date executeStartTime) {
    this.executeStartTime = executeStartTime;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getExecuteStopTime() {
    return executeStopTime;
  }
  public void setExecuteStopTime(Date executeStopTime) {
    this.executeStopTime = executeStopTime;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getExecuteOnIdle() {
    return executeOnIdle;
  }
  public void setExecuteOnIdle(Boolean executeOnIdle) {
    this.executeOnIdle = executeOnIdle;
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
  public String getEdgeUri() {
    return edgeUri;
  }
  public void setEdgeUri(String edgeUri) {
    this.edgeUri = edgeUri;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getCurrent() {
    return current;
  }
  public void setCurrent(Boolean current) {
    this.current = current;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomainEdgeSoftwareUpdateDto domainEdgeSoftwareUpdateDto = (DomainEdgeSoftwareUpdateDto) o;
    return Objects.equals(version, domainEdgeSoftwareUpdateDto.version) &&
        Objects.equals(maxDownloadRate, domainEdgeSoftwareUpdateDto.maxDownloadRate) &&
        Objects.equals(downloadStartTime, domainEdgeSoftwareUpdateDto.downloadStartTime) &&
        Objects.equals(executeStartTime, domainEdgeSoftwareUpdateDto.executeStartTime) &&
        Objects.equals(executeStopTime, domainEdgeSoftwareUpdateDto.executeStopTime) &&
        Objects.equals(executeOnIdle, domainEdgeSoftwareUpdateDto.executeOnIdle) &&
        Objects.equals(status, domainEdgeSoftwareUpdateDto.status) &&
        Objects.equals(edgeUri, domainEdgeSoftwareUpdateDto.edgeUri) &&
        Objects.equals(current, domainEdgeSoftwareUpdateDto.current);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, maxDownloadRate, downloadStartTime, executeStartTime, executeStopTime, executeOnIdle, status, edgeUri, current);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainEdgeSoftwareUpdateDto {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    maxDownloadRate: ").append(toIndentedString(maxDownloadRate)).append("\n");
    sb.append("    downloadStartTime: ").append(toIndentedString(downloadStartTime)).append("\n");
    sb.append("    executeStartTime: ").append(toIndentedString(executeStartTime)).append("\n");
    sb.append("    executeStopTime: ").append(toIndentedString(executeStopTime)).append("\n");
    sb.append("    executeOnIdle: ").append(toIndentedString(executeOnIdle)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    edgeUri: ").append(toIndentedString(edgeUri)).append("\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
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
