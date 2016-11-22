package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.CertificateDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


/**
 * Represents the parsed certificate information.
 **/
@ApiModel(description = "Represents the parsed certificate information.")
public class ParsedCertificate  implements Serializable {
  
  @SerializedName("certificateDetails")
  private List<CertificateDetails> certificateDetails = new ArrayList<CertificateDetails>();

  /**
   * The details of the certificates that were parsed correctly.
   **/
  @ApiModelProperty(value = "The details of the certificates that were parsed correctly.")
  public List<CertificateDetails> getCertificateDetails() {
    return certificateDetails;
  }
  public void setCertificateDetails(List<CertificateDetails> certificateDetails) {
    this.certificateDetails = certificateDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParsedCertificate parsedCertificate = (ParsedCertificate) o;
    return Objects.equals(certificateDetails, parsedCertificate.certificateDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificateDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParsedCertificate {\n");
    
    sb.append("    certificateDetails: ").append(toIndentedString(certificateDetails)).append("\n");
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
