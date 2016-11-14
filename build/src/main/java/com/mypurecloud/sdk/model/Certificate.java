package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


/**
 * Represents a certificate to parse.
 **/
@ApiModel(description = "Represents a certificate to parse.")
public class Certificate  implements Serializable {
  
  @SerializedName("certificate")
  private String certificate = null;

  /**
   * The certificate to parse.
   **/
  @ApiModelProperty(required = true, value = "The certificate to parse.")
  public String getCertificate() {
    return certificate;
  }
  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Certificate certificate = (Certificate) o;
    return Objects.equals(certificate, certificate.certificate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Certificate {\n");
    
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
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
