package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.CertificateDetails;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;




/**
 * A certificate authority represents an organization that has issued a digital certificate for making secure connections with an edge device.
 **/
@ApiModel(description = "A certificate authority represents an organization that has issued a digital certificate for making secure connections with an edge device.")
public class DomainCertificateAuthority   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("version")
  private Integer version = null;

  @SerializedName("dateCreated")
  private Date dateCreated = null;

  @SerializedName("dateModified")
  private Date dateModified = null;

  @SerializedName("modifiedBy")
  private String modifiedBy = null;

  @SerializedName("createdBy")
  private String createdBy = null;


  /**
   * Gets or Sets state
   */
  public enum StateEnum {
    @SerializedName("active")
    ACTIVE("active"),

    @SerializedName("inactive")
    INACTIVE("inactive"),

    @SerializedName("deleted")
    DELETED("deleted");

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

  @SerializedName("modifiedByApp")
  private String modifiedByApp = null;

  @SerializedName("createdByApp")
  private String createdByApp = null;

  @SerializedName("certificate")
  private String certificate = null;


  /**
   * The certificate authorities type.  Managed certificate authorities are generated and maintained by Interactive Intelligence.  These are read-only and not modifiable by clients.  Remote authorities are customer managed.
   */
  public enum TypeEnum {
    @SerializedName("MANAGED")
    MANAGED("MANAGED"),

    @SerializedName("REMOTE")
    REMOTE("REMOTE");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;


  /**
   * Gets or Sets services
   */
  public enum ServicesEnum {
    @SerializedName("SIP")
    SIP("SIP"),

    @SerializedName("PROVISION")
    PROVISION("PROVISION"),

    @SerializedName("PROVISION_PHONE")
    PROVISION_PHONE("PROVISION_PHONE");

    private String value;

    ServicesEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("services")
  private List<ServicesEnum> services = new ArrayList<ServicesEnum>();

  @SerializedName("certificateDetails")
  private List<CertificateDetails> certificateDetails = new ArrayList<CertificateDetails>();

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
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
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
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getModifiedBy() {
    return modifiedBy;
  }
  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getModifiedByApp() {
    return modifiedByApp;
  }
  public void setModifiedByApp(String modifiedByApp) {
    this.modifiedByApp = modifiedByApp;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCreatedByApp() {
    return createdByApp;
  }
  public void setCreatedByApp(String createdByApp) {
    this.createdByApp = createdByApp;
  }

  /**
   * The authorities signed X509 PEM encoded certificate.
   **/
  @ApiModelProperty(required = true, value = "The authorities signed X509 PEM encoded certificate.")
  public String getCertificate() {
    return certificate;
  }
  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }

  /**
   * The certificate authorities type.  Managed certificate authorities are generated and maintained by Interactive Intelligence.  These are read-only and not modifiable by clients.  Remote authorities are customer managed.
   **/
  @ApiModelProperty(required = true, value = "The certificate authorities type.  Managed certificate authorities are generated and maintained by Interactive Intelligence.  These are read-only and not modifiable by clients.  Remote authorities are customer managed.")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * The service(s) that the authority can be used to authenticate.
   **/
  @ApiModelProperty(required = true, value = "The service(s) that the authority can be used to authenticate.")
  public List<ServicesEnum> getServices() {
    return services;
  }
  public void setServices(List<ServicesEnum> services) {
    this.services = services;
  }

  /**
   * The details of the parsed certificate(s).
   **/
  @ApiModelProperty(value = "The details of the parsed certificate(s).")
  public List<CertificateDetails> getCertificateDetails() {
    return certificateDetails;
  }
  public void setCertificateDetails(List<CertificateDetails> certificateDetails) {
    this.certificateDetails = certificateDetails;
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
    DomainCertificateAuthority domainCertificateAuthority = (DomainCertificateAuthority) o;
    return Objects.equals(id, domainCertificateAuthority.id) &&
        Objects.equals(name, domainCertificateAuthority.name) &&
        Objects.equals(description, domainCertificateAuthority.description) &&
        Objects.equals(version, domainCertificateAuthority.version) &&
        Objects.equals(dateCreated, domainCertificateAuthority.dateCreated) &&
        Objects.equals(dateModified, domainCertificateAuthority.dateModified) &&
        Objects.equals(modifiedBy, domainCertificateAuthority.modifiedBy) &&
        Objects.equals(createdBy, domainCertificateAuthority.createdBy) &&
        Objects.equals(state, domainCertificateAuthority.state) &&
        Objects.equals(modifiedByApp, domainCertificateAuthority.modifiedByApp) &&
        Objects.equals(createdByApp, domainCertificateAuthority.createdByApp) &&
        Objects.equals(certificate, domainCertificateAuthority.certificate) &&
        Objects.equals(type, domainCertificateAuthority.type) &&
        Objects.equals(services, domainCertificateAuthority.services) &&
        Objects.equals(certificateDetails, domainCertificateAuthority.certificateDetails) &&
        Objects.equals(selfUri, domainCertificateAuthority.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, version, dateCreated, dateModified, modifiedBy, createdBy, state, modifiedByApp, createdByApp, certificate, type, services, certificateDetails, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainCertificateAuthority {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    modifiedByApp: ").append(toIndentedString(modifiedByApp)).append("\n");
    sb.append("    createdByApp: ").append(toIndentedString(createdByApp)).append("\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    certificateDetails: ").append(toIndentedString(certificateDetails)).append("\n");
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
