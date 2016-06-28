package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ContactAddress;
import io.swagger.client.model.ExternalDataSource;
import io.swagger.client.model.PhoneNumber;
import io.swagger.client.model.Ticker;
import io.swagger.client.model.TwitterId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class ExternalOrganization   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("companyType")
  private String companyType = null;

  @SerializedName("industry")
  private String industry = null;

  @SerializedName("primaryContactId")
  private String primaryContactId = null;

  @SerializedName("address")
  private ContactAddress address = null;

  @SerializedName("phoneNumber")
  private PhoneNumber phoneNumber = null;

  @SerializedName("faxNumber")
  private PhoneNumber faxNumber = null;

  @SerializedName("employeeCount")
  private Long employeeCount = null;

  @SerializedName("revenue")
  private Long revenue = null;

  @SerializedName("tags")
  private List<String> tags = new ArrayList<String>();

  @SerializedName("websites")
  private List<String> websites = new ArrayList<String>();

  @SerializedName("tickers")
  private List<Ticker> tickers = new ArrayList<Ticker>();

  @SerializedName("twitterId")
  private TwitterId twitterId = null;

  @SerializedName("modifyDate")
  private Date modifyDate = null;

  @SerializedName("createDate")
  private Date createDate = null;

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
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCompanyType() {
    return companyType;
  }
  public void setCompanyType(String companyType) {
    this.companyType = companyType;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getIndustry() {
    return industry;
  }
  public void setIndustry(String industry) {
    this.industry = industry;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPrimaryContactId() {
    return primaryContactId;
  }
  public void setPrimaryContactId(String primaryContactId) {
    this.primaryContactId = primaryContactId;
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
  public PhoneNumber getPhoneNumber() {
    return phoneNumber;
  }
  public void setPhoneNumber(PhoneNumber phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public PhoneNumber getFaxNumber() {
    return faxNumber;
  }
  public void setFaxNumber(PhoneNumber faxNumber) {
    this.faxNumber = faxNumber;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getEmployeeCount() {
    return employeeCount;
  }
  public void setEmployeeCount(Long employeeCount) {
    this.employeeCount = employeeCount;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getRevenue() {
    return revenue;
  }
  public void setRevenue(Long revenue) {
    this.revenue = revenue;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getTags() {
    return tags;
  }
  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getWebsites() {
    return websites;
  }
  public void setWebsites(List<String> websites) {
    this.websites = websites;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Ticker> getTickers() {
    return tickers;
  }
  public void setTickers(List<Ticker> tickers) {
    this.tickers = tickers;
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
    ExternalOrganization externalOrganization = (ExternalOrganization) o;
    return Objects.equals(id, externalOrganization.id) &&
        Objects.equals(name, externalOrganization.name) &&
        Objects.equals(companyType, externalOrganization.companyType) &&
        Objects.equals(industry, externalOrganization.industry) &&
        Objects.equals(primaryContactId, externalOrganization.primaryContactId) &&
        Objects.equals(address, externalOrganization.address) &&
        Objects.equals(phoneNumber, externalOrganization.phoneNumber) &&
        Objects.equals(faxNumber, externalOrganization.faxNumber) &&
        Objects.equals(employeeCount, externalOrganization.employeeCount) &&
        Objects.equals(revenue, externalOrganization.revenue) &&
        Objects.equals(tags, externalOrganization.tags) &&
        Objects.equals(websites, externalOrganization.websites) &&
        Objects.equals(tickers, externalOrganization.tickers) &&
        Objects.equals(twitterId, externalOrganization.twitterId) &&
        Objects.equals(modifyDate, externalOrganization.modifyDate) &&
        Objects.equals(createDate, externalOrganization.createDate) &&
        Objects.equals(externalDataSources, externalOrganization.externalDataSources) &&
        Objects.equals(selfUri, externalOrganization.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, companyType, industry, primaryContactId, address, phoneNumber, faxNumber, employeeCount, revenue, tags, websites, tickers, twitterId, modifyDate, createDate, externalDataSources, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalOrganization {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    companyType: ").append(toIndentedString(companyType)).append("\n");
    sb.append("    industry: ").append(toIndentedString(industry)).append("\n");
    sb.append("    primaryContactId: ").append(toIndentedString(primaryContactId)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    faxNumber: ").append(toIndentedString(faxNumber)).append("\n");
    sb.append("    employeeCount: ").append(toIndentedString(employeeCount)).append("\n");
    sb.append("    revenue: ").append(toIndentedString(revenue)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    websites: ").append(toIndentedString(websites)).append("\n");
    sb.append("    tickers: ").append(toIndentedString(tickers)).append("\n");
    sb.append("    twitterId: ").append(toIndentedString(twitterId)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
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
