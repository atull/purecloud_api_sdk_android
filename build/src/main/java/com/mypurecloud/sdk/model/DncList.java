package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.ImportStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class DncList  implements Serializable {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("dateCreated")
  private Date dateCreated = null;

  @SerializedName("dateModified")
  private Date dateModified = null;

  @SerializedName("version")
  private Integer version = null;

  @SerializedName("phoneNumberColumns")
  private List<String> phoneNumberColumns = new ArrayList<String>();

  @SerializedName("importStatus")
  private ImportStatus importStatus = null;

  @SerializedName("size")
  private Long size = null;


  /**
   * the type of dnc list being created, rds (csv file), gryphon, or dnc.com
   */
  public enum DncSourceTypeEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("RDS")
    RDS("RDS"),

    @SerializedName("DNC_DOT_COM")
    DNC_DOT_COM("DNC_DOT_COM"),

    @SerializedName("GRYPHON")
    GRYPHON("GRYPHON");

    private String value;

    DncSourceTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("dncSourceType")
  private DncSourceTypeEnum dncSourceType = null;

  @SerializedName("loginId")
  private String loginId = null;

  @SerializedName("dncCodes")
  private List<String> dncCodes = new ArrayList<String>();

  @SerializedName("licenseId")
  private String licenseId = null;

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
   * Creation time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Creation time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getDateCreated() {
    return dateCreated;
  }

  /**
   * Last modified time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Last modified time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getDateModified() {
    return dateModified;
  }

  /**
   * Required for updates, must match the version number of the most recent update
   **/
  @ApiModelProperty(value = "Required for updates, must match the version number of the most recent update")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }

  /**
   * the name of the columns containing the numbers not to be called
   **/
  @ApiModelProperty(required = true, value = "the name of the columns containing the numbers not to be called")
  public List<String> getPhoneNumberColumns() {
    return phoneNumberColumns;
  }
  public void setPhoneNumberColumns(List<String> phoneNumberColumns) {
    this.phoneNumberColumns = phoneNumberColumns;
  }

  /**
   * the status of the import process
   **/
  @ApiModelProperty(value = "the status of the import process")
  public ImportStatus getImportStatus() {
    return importStatus;
  }
  public void setImportStatus(ImportStatus importStatus) {
    this.importStatus = importStatus;
  }

  /**
   * the number of phone numbers in the do not call list
   **/
  @ApiModelProperty(value = "the number of phone numbers in the do not call list")
  public Long getSize() {
    return size;
  }

  /**
   * the type of dnc list being created, rds (csv file), gryphon, or dnc.com
   **/
  @ApiModelProperty(value = "the type of dnc list being created, rds (csv file), gryphon, or dnc.com")
  public DncSourceTypeEnum getDncSourceType() {
    return dncSourceType;
  }

  /**
   * the loginId if the dncSourceType is dnc.com
   **/
  @ApiModelProperty(value = "the loginId if the dncSourceType is dnc.com")
  public String getLoginId() {
    return loginId;
  }

  /**
   * the list of dnc.com codes to be treated as DNC
   **/
  @ApiModelProperty(value = "the list of dnc.com codes to be treated as DNC")
  public List<String> getDncCodes() {
    return dncCodes;
  }
  public void setDncCodes(List<String> dncCodes) {
    this.dncCodes = dncCodes;
  }

  /**
   * the license number if the dncSourceType is gryphon
   **/
  @ApiModelProperty(value = "the license number if the dncSourceType is gryphon")
  public String getLicenseId() {
    return licenseId;
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
    DncList dncList = (DncList) o;
    return Objects.equals(id, dncList.id) &&
        Objects.equals(name, dncList.name) &&
        Objects.equals(dateCreated, dncList.dateCreated) &&
        Objects.equals(dateModified, dncList.dateModified) &&
        Objects.equals(version, dncList.version) &&
        Objects.equals(phoneNumberColumns, dncList.phoneNumberColumns) &&
        Objects.equals(importStatus, dncList.importStatus) &&
        Objects.equals(size, dncList.size) &&
        Objects.equals(dncSourceType, dncList.dncSourceType) &&
        Objects.equals(loginId, dncList.loginId) &&
        Objects.equals(dncCodes, dncList.dncCodes) &&
        Objects.equals(licenseId, dncList.licenseId) &&
        Objects.equals(selfUri, dncList.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, version, phoneNumberColumns, importStatus, size, dncSourceType, loginId, dncCodes, licenseId, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DncList {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    phoneNumberColumns: ").append(toIndentedString(phoneNumberColumns)).append("\n");
    sb.append("    importStatus: ").append(toIndentedString(importStatus)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    dncSourceType: ").append(toIndentedString(dncSourceType)).append("\n");
    sb.append("    loginId: ").append(toIndentedString(loginId)).append("\n");
    sb.append("    dncCodes: ").append(toIndentedString(dncCodes)).append("\n");
    sb.append("    licenseId: ").append(toIndentedString(licenseId)).append("\n");
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
