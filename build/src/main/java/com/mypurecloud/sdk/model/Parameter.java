package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class Parameter  implements Serializable {
  
  @SerializedName("name")
  private String name = null;


  /**
   * Gets or Sets parameterType
   */
  public enum ParameterTypeEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("UUID")
    UUID("UUID"),

    @SerializedName("STRING")
    STRING("STRING"),

    @SerializedName("UUIDLIST")
    UUIDLIST("UUIDLIST"),

    @SerializedName("STRINGLIST")
    STRINGLIST("STRINGLIST");

    private String value;

    ParameterTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("parameterType")
  private ParameterTypeEnum parameterType = null;


  /**
   * Gets or Sets domain
   */
  public enum DomainEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("USERID")
    USERID("USERID"),

    @SerializedName("QUEUEID")
    QUEUEID("QUEUEID"),

    @SerializedName("MEDIATYPE")
    MEDIATYPE("MEDIATYPE"),

    @SerializedName("DIALERCAMPAIGNID")
    DIALERCAMPAIGNID("DIALERCAMPAIGNID"),

    @SerializedName("QMEVALFORMID")
    QMEVALFORMID("QMEVALFORMID"),

    @SerializedName("UNKNOWN")
    UNKNOWN("UNKNOWN");

    private String value;

    DomainEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("domain")
  private DomainEnum domain = null;

  @SerializedName("required")
  private Boolean required = false;

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
  public ParameterTypeEnum getParameterType() {
    return parameterType;
  }
  public void setParameterType(ParameterTypeEnum parameterType) {
    this.parameterType = parameterType;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public DomainEnum getDomain() {
    return domain;
  }
  public void setDomain(DomainEnum domain) {
    this.domain = domain;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getRequired() {
    return required;
  }
  public void setRequired(Boolean required) {
    this.required = required;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Parameter parameter = (Parameter) o;
    return Objects.equals(name, parameter.name) &&
        Objects.equals(parameterType, parameter.parameterType) &&
        Objects.equals(domain, parameter.domain) &&
        Objects.equals(required, parameter.required);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, parameterType, domain, required);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Parameter {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parameterType: ").append(toIndentedString(parameterType)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
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
