package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ContactPhoneNumberColumn;
import io.swagger.client.model.ImportStatus;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class ContactList   {
  
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

  @SerializedName("columnNames")
  private List<String> columnNames = new ArrayList<String>();

  @SerializedName("phoneColumns")
  private List<ContactPhoneNumberColumn> phoneColumns = new ArrayList<ContactPhoneNumberColumn>();

  @SerializedName("importStatus")
  private ImportStatus importStatus = null;

  @SerializedName("previewModeColumnName")
  private String previewModeColumnName = null;

  @SerializedName("previewModeAcceptedValues")
  private List<String> previewModeAcceptedValues = new ArrayList<String>();

  @SerializedName("size")
  private Long size = null;

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
   * the contact column names
   **/
  @ApiModelProperty(required = true, value = "the contact column names")
  public List<String> getColumnNames() {
    return columnNames;
  }
  public void setColumnNames(List<String> columnNames) {
    this.columnNames = columnNames;
  }

  /**
   * the columns containing phone numbers
   **/
  @ApiModelProperty(required = true, value = "the columns containing phone numbers")
  public List<ContactPhoneNumberColumn> getPhoneColumns() {
    return phoneColumns;
  }
  public void setPhoneColumns(List<ContactPhoneNumberColumn> phoneColumns) {
    this.phoneColumns = phoneColumns;
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
   * the name of the column that holds the indicators for contacts that are to be dialed in preview mode only
   **/
  @ApiModelProperty(value = "the name of the column that holds the indicators for contacts that are to be dialed in preview mode only")
  public String getPreviewModeColumnName() {
    return previewModeColumnName;
  }
  public void setPreviewModeColumnName(String previewModeColumnName) {
    this.previewModeColumnName = previewModeColumnName;
  }

  /**
   * list of user-defined values indicating the contact is to be dialed in preview mode only
   **/
  @ApiModelProperty(value = "list of user-defined values indicating the contact is to be dialed in preview mode only")
  public List<String> getPreviewModeAcceptedValues() {
    return previewModeAcceptedValues;
  }
  public void setPreviewModeAcceptedValues(List<String> previewModeAcceptedValues) {
    this.previewModeAcceptedValues = previewModeAcceptedValues;
  }

  /**
   * the number of contacts in the contact list
   **/
  @ApiModelProperty(value = "the number of contacts in the contact list")
  public Long getSize() {
    return size;
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
    ContactList contactList = (ContactList) o;
    return Objects.equals(id, contactList.id) &&
        Objects.equals(name, contactList.name) &&
        Objects.equals(dateCreated, contactList.dateCreated) &&
        Objects.equals(dateModified, contactList.dateModified) &&
        Objects.equals(version, contactList.version) &&
        Objects.equals(columnNames, contactList.columnNames) &&
        Objects.equals(phoneColumns, contactList.phoneColumns) &&
        Objects.equals(importStatus, contactList.importStatus) &&
        Objects.equals(previewModeColumnName, contactList.previewModeColumnName) &&
        Objects.equals(previewModeAcceptedValues, contactList.previewModeAcceptedValues) &&
        Objects.equals(size, contactList.size) &&
        Objects.equals(selfUri, contactList.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, version, columnNames, phoneColumns, importStatus, previewModeColumnName, previewModeAcceptedValues, size, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactList {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    columnNames: ").append(toIndentedString(columnNames)).append("\n");
    sb.append("    phoneColumns: ").append(toIndentedString(phoneColumns)).append("\n");
    sb.append("    importStatus: ").append(toIndentedString(importStatus)).append("\n");
    sb.append("    previewModeColumnName: ").append(toIndentedString(previewModeColumnName)).append("\n");
    sb.append("    previewModeAcceptedValues: ").append(toIndentedString(previewModeAcceptedValues)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
