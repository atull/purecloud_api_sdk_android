package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import com.google.gson.annotations.SerializedName;




/**
 * Represents the details of a parsed certificate.
 **/
@ApiModel(description = "Represents the details of a parsed certificate.")
public class CertificateDetails   {
  
  @SerializedName("issuer")
  private String issuer = null;

  @SerializedName("subject")
  private String subject = null;

  @SerializedName("expirationDate")
  private Date expirationDate = null;

  @SerializedName("issueDate")
  private Date issueDate = null;

  @SerializedName("expired")
  private Boolean expired = false;

  @SerializedName("valid")
  private Boolean valid = false;

  @SerializedName("signatureValid")
  private Boolean signatureValid = false;

  /**
   * Information about the issuer of the certificate.  The value of this property is a comma separated key=value format.  Each key is one of the attribute names supported by X.500.
   **/
  @ApiModelProperty(value = "Information about the issuer of the certificate.  The value of this property is a comma separated key=value format.  Each key is one of the attribute names supported by X.500.")
  public String getIssuer() {
    return issuer;
  }
  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }

  /**
   * Information about the subject of the certificate.  The value of this property is a comma separated key=value format.  Each key is one of the attribute names supported by X.500.
   **/
  @ApiModelProperty(value = "Information about the subject of the certificate.  The value of this property is a comma separated key=value format.  Each key is one of the attribute names supported by X.500.")
  public String getSubject() {
    return subject;
  }
  public void setSubject(String subject) {
    this.subject = subject;
  }

  /**
   * The expiration date of the certificate. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "The expiration date of the certificate. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getExpirationDate() {
    return expirationDate;
  }
  public void setExpirationDate(Date expirationDate) {
    this.expirationDate = expirationDate;
  }

  /**
   * The issue date of the certificate. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "The issue date of the certificate. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getIssueDate() {
    return issueDate;
  }
  public void setIssueDate(Date issueDate) {
    this.issueDate = issueDate;
  }

  /**
   * True if the certificate is expired, false otherwise.
   **/
  @ApiModelProperty(value = "True if the certificate is expired, false otherwise.")
  public Boolean getExpired() {
    return expired;
  }
  public void setExpired(Boolean expired) {
    this.expired = expired;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getValid() {
    return valid;
  }
  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getSignatureValid() {
    return signatureValid;
  }
  public void setSignatureValid(Boolean signatureValid) {
    this.signatureValid = signatureValid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertificateDetails certificateDetails = (CertificateDetails) o;
    return Objects.equals(issuer, certificateDetails.issuer) &&
        Objects.equals(subject, certificateDetails.subject) &&
        Objects.equals(expirationDate, certificateDetails.expirationDate) &&
        Objects.equals(issueDate, certificateDetails.issueDate) &&
        Objects.equals(expired, certificateDetails.expired) &&
        Objects.equals(valid, certificateDetails.valid) &&
        Objects.equals(signatureValid, certificateDetails.signatureValid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuer, subject, expirationDate, issueDate, expired, valid, signatureValid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateDetails {\n");
    
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
    sb.append("    expired: ").append(toIndentedString(expired)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    signatureValid: ").append(toIndentedString(signatureValid)).append("\n");
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
