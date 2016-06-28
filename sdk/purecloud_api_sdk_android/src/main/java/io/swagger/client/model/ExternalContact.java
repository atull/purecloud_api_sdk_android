package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ContactAddress;
import io.swagger.client.model.ExternalDataSource;
import io.swagger.client.model.ExternalOrganization;
import io.swagger.client.model.PhoneNumber;
import io.swagger.client.model.TwitterId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class ExternalContact   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("middleName")
  private String middleName = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("salutation")
  private String salutation = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("workPhone")
  private PhoneNumber workPhone = null;

  @SerializedName("cellPhone")
  private PhoneNumber cellPhone = null;

  @SerializedName("homePhone")
  private PhoneNumber homePhone = null;

  @SerializedName("otherPhone")
  private PhoneNumber otherPhone = null;

  @SerializedName("workEmail")
  private String workEmail = null;

  @SerializedName("personalEmail")
  private String personalEmail = null;

  @SerializedName("otherEmail")
  private String otherEmail = null;

  @SerializedName("address")
  private ContactAddress address = null;

  @SerializedName("twitterId")
  private TwitterId twitterId = null;

  @SerializedName("modifyDate")
  private Date modifyDate = null;

  @SerializedName("createDate")
  private Date createDate = null;

  @SerializedName("externalOrganization")
  private ExternalOrganization externalOrganization = null;

  @SerializedName("externalDataSources")
  private List<ExternalDataSource> externalDataSources = new ArrayList<ExternalDataSource>();

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
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getMiddleName() {
    return middleName;
  }
  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSalutation() {
    return salutation;
  }
  public void setSalutation(String salutation) {
    this.salutation = salutation;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public PhoneNumber getWorkPhone() {
    return workPhone;
  }
  public void setWorkPhone(PhoneNumber workPhone) {
    this.workPhone = workPhone;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public PhoneNumber getCellPhone() {
    return cellPhone;
  }
  public void setCellPhone(PhoneNumber cellPhone) {
    this.cellPhone = cellPhone;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public PhoneNumber getHomePhone() {
    return homePhone;
  }
  public void setHomePhone(PhoneNumber homePhone) {
    this.homePhone = homePhone;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public PhoneNumber getOtherPhone() {
    return otherPhone;
  }
  public void setOtherPhone(PhoneNumber otherPhone) {
    this.otherPhone = otherPhone;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getWorkEmail() {
    return workEmail;
  }
  public void setWorkEmail(String workEmail) {
    this.workEmail = workEmail;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPersonalEmail() {
    return personalEmail;
  }
  public void setPersonalEmail(String personalEmail) {
    this.personalEmail = personalEmail;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getOtherEmail() {
    return otherEmail;
  }
  public void setOtherEmail(String otherEmail) {
    this.otherEmail = otherEmail;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ContactAddress getAddress() {
    return address;
  }
  public void setAddress(ContactAddress address) {
    this.address = address;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TwitterId getTwitterId() {
    return twitterId;
  }
  public void setTwitterId(TwitterId twitterId) {
    this.twitterId = twitterId;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getModifyDate() {
    return modifyDate;
  }
  public void setModifyDate(Date modifyDate) {
    this.modifyDate = modifyDate;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getCreateDate() {
    return createDate;
  }
  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ExternalOrganization getExternalOrganization() {
    return externalOrganization;
  }
  public void setExternalOrganization(ExternalOrganization externalOrganization) {
    this.externalOrganization = externalOrganization;
  }

  /**
   * Links to the sources of data (e.g. one source might be a CRM) that contributed data to this record.  Read-only, and only populated when requested via expand param.
   **/
  @ApiModelProperty(value = "Links to the sources of data (e.g. one source might be a CRM) that contributed data to this record.  Read-only, and only populated when requested via expand param.")
  public List<ExternalDataSource> getExternalDataSources() {
    return externalDataSources;
  }
  public void setExternalDataSources(List<ExternalDataSource> externalDataSources) {
    this.externalDataSources = externalDataSources;
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
    ExternalContact externalContact = (ExternalContact) o;
    return Objects.equals(id, externalContact.id) &&
        Objects.equals(firstName, externalContact.firstName) &&
        Objects.equals(middleName, externalContact.middleName) &&
        Objects.equals(lastName, externalContact.lastName) &&
        Objects.equals(salutation, externalContact.salutation) &&
        Objects.equals(title, externalContact.title) &&
        Objects.equals(workPhone, externalContact.workPhone) &&
        Objects.equals(cellPhone, externalContact.cellPhone) &&
        Objects.equals(homePhone, externalContact.homePhone) &&
        Objects.equals(otherPhone, externalContact.otherPhone) &&
        Objects.equals(workEmail, externalContact.workEmail) &&
        Objects.equals(personalEmail, externalContact.personalEmail) &&
        Objects.equals(otherEmail, externalContact.otherEmail) &&
        Objects.equals(address, externalContact.address) &&
        Objects.equals(twitterId, externalContact.twitterId) &&
        Objects.equals(modifyDate, externalContact.modifyDate) &&
        Objects.equals(createDate, externalContact.createDate) &&
        Objects.equals(externalOrganization, externalContact.externalOrganization) &&
        Objects.equals(externalDataSources, externalContact.externalDataSources) &&
        Objects.equals(selfUri, externalContact.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, middleName, lastName, salutation, title, workPhone, cellPhone, homePhone, otherPhone, workEmail, personalEmail, otherEmail, address, twitterId, modifyDate, createDate, externalOrganization, externalDataSources, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalContact {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    salutation: ").append(toIndentedString(salutation)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    workPhone: ").append(toIndentedString(workPhone)).append("\n");
    sb.append("    cellPhone: ").append(toIndentedString(cellPhone)).append("\n");
    sb.append("    homePhone: ").append(toIndentedString(homePhone)).append("\n");
    sb.append("    otherPhone: ").append(toIndentedString(otherPhone)).append("\n");
    sb.append("    workEmail: ").append(toIndentedString(workEmail)).append("\n");
    sb.append("    personalEmail: ").append(toIndentedString(personalEmail)).append("\n");
    sb.append("    otherEmail: ").append(toIndentedString(otherEmail)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    twitterId: ").append(toIndentedString(twitterId)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    externalOrganization: ").append(toIndentedString(externalOrganization)).append("\n");
    sb.append("    externalDataSources: ").append(toIndentedString(externalDataSources)).append("\n");
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
