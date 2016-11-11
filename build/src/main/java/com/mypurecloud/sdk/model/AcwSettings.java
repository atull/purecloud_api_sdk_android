package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class AcwSettings  implements Serializable {
  

  /**
   * Gets or Sets wrapupPrompt
   */
  public enum WrapupPromptEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("MANDATORY")
    MANDATORY("MANDATORY"),

    @SerializedName("OPTIONAL")
    OPTIONAL("OPTIONAL"),

    @SerializedName("MANDATORY_TIMEOUT")
    MANDATORY_TIMEOUT("MANDATORY_TIMEOUT"),

    @SerializedName("MANDATORY_FORCED_TIMEOUT")
    MANDATORY_FORCED_TIMEOUT("MANDATORY_FORCED_TIMEOUT");

    private String value;

    WrapupPromptEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("wrapupPrompt")
  private WrapupPromptEnum wrapupPrompt = null;

  @SerializedName("timeoutMs")
  private Integer timeoutMs = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public WrapupPromptEnum getWrapupPrompt() {
    return wrapupPrompt;
  }
  public void setWrapupPrompt(WrapupPromptEnum wrapupPrompt) {
    this.wrapupPrompt = wrapupPrompt;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getTimeoutMs() {
    return timeoutMs;
  }
  public void setTimeoutMs(Integer timeoutMs) {
    this.timeoutMs = timeoutMs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AcwSettings acwSettings = (AcwSettings) o;
    return Objects.equals(wrapupPrompt, acwSettings.wrapupPrompt) &&
        Objects.equals(timeoutMs, acwSettings.timeoutMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wrapupPrompt, timeoutMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcwSettings {\n");
    
    sb.append("    wrapupPrompt: ").append(toIndentedString(wrapupPrompt)).append("\n");
    sb.append("    timeoutMs: ").append(toIndentedString(timeoutMs)).append("\n");
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
