package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.Line;
import com.mypurecloud.sdk.model.PhoneCapabilities;
import com.mypurecloud.sdk.model.PhoneStatus;
import com.mypurecloud.sdk.model.UriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class Phone  implements Serializable {
  
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
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

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

  @SerializedName("site")
  private UriReference site = null;

  @SerializedName("phoneBaseSettings")
  private UriReference phoneBaseSettings = null;

  @SerializedName("lineBaseSettings")
  private UriReference lineBaseSettings = null;

  @SerializedName("phoneMetaBase")
  private UriReference phoneMetaBase = null;

  @SerializedName("lines")
  private List<Line> lines = new ArrayList<Line>();

  @SerializedName("status")
  private PhoneStatus status = null;

  @SerializedName("secondaryStatus")
  private PhoneStatus secondaryStatus = null;

  @SerializedName("properties")
  private Map<String, Object> properties = new HashMap<String, Object>();

  @SerializedName("capabilities")
  private PhoneCapabilities capabilities = null;

  @SerializedName("webRtcUser")
  private UriReference webRtcUser = null;

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
   * The name of the entity.
   **/
  @ApiModelProperty(required = true, value = "The name of the entity.")
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
   * The site associated to the phone.
   **/
  @ApiModelProperty(required = true, value = "The site associated to the phone.")
  public UriReference getSite() {
    return site;
  }
  public void setSite(UriReference site) {
    this.site = site;
  }

  /**
   * Phone Base Settings
   **/
  @ApiModelProperty(required = true, value = "Phone Base Settings")
  public UriReference getPhoneBaseSettings() {
    return phoneBaseSettings;
  }
  public void setPhoneBaseSettings(UriReference phoneBaseSettings) {
    this.phoneBaseSettings = phoneBaseSettings;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public UriReference getLineBaseSettings() {
    return lineBaseSettings;
  }
  public void setLineBaseSettings(UriReference lineBaseSettings) {
    this.lineBaseSettings = lineBaseSettings;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public UriReference getPhoneMetaBase() {
    return phoneMetaBase;
  }
  public void setPhoneMetaBase(UriReference phoneMetaBase) {
    this.phoneMetaBase = phoneMetaBase;
  }

  /**
   * Lines
   **/
  @ApiModelProperty(required = true, value = "Lines")
  public List<Line> getLines() {
    return lines;
  }
  public void setLines(List<Line> lines) {
    this.lines = lines;
  }

  /**
   * The status of the phone and lines from the primary Edge.
   **/
  @ApiModelProperty(value = "The status of the phone and lines from the primary Edge.")
  public PhoneStatus getStatus() {
    return status;
  }
  public void setStatus(PhoneStatus status) {
    this.status = status;
  }

  /**
   * The status of the phone and lines from the secondary Edge.
   **/
  @ApiModelProperty(value = "The status of the phone and lines from the secondary Edge.")
  public PhoneStatus getSecondaryStatus() {
    return secondaryStatus;
  }
  public void setSecondaryStatus(PhoneStatus secondaryStatus) {
    this.secondaryStatus = secondaryStatus;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Map<String, Object> getProperties() {
    return properties;
  }
  public void setProperties(Map<String, Object> properties) {
    this.properties = properties;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public PhoneCapabilities getCapabilities() {
    return capabilities;
  }
  public void setCapabilities(PhoneCapabilities capabilities) {
    this.capabilities = capabilities;
  }

  /**
   * This is the user associated with a WebRTC type phone.  It is required for all WebRTC phones.
   **/
  @ApiModelProperty(value = "This is the user associated with a WebRTC type phone.  It is required for all WebRTC phones.")
  public UriReference getWebRtcUser() {
    return webRtcUser;
  }
  public void setWebRtcUser(UriReference webRtcUser) {
    this.webRtcUser = webRtcUser;
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
    Phone phone = (Phone) o;
    return Objects.equals(id, phone.id) &&
        Objects.equals(name, phone.name) &&
        Objects.equals(description, phone.description) &&
        Objects.equals(version, phone.version) &&
        Objects.equals(dateCreated, phone.dateCreated) &&
        Objects.equals(dateModified, phone.dateModified) &&
        Objects.equals(modifiedBy, phone.modifiedBy) &&
        Objects.equals(createdBy, phone.createdBy) &&
        Objects.equals(state, phone.state) &&
        Objects.equals(modifiedByApp, phone.modifiedByApp) &&
        Objects.equals(createdByApp, phone.createdByApp) &&
        Objects.equals(site, phone.site) &&
        Objects.equals(phoneBaseSettings, phone.phoneBaseSettings) &&
        Objects.equals(lineBaseSettings, phone.lineBaseSettings) &&
        Objects.equals(phoneMetaBase, phone.phoneMetaBase) &&
        Objects.equals(lines, phone.lines) &&
        Objects.equals(status, phone.status) &&
        Objects.equals(secondaryStatus, phone.secondaryStatus) &&
        Objects.equals(properties, phone.properties) &&
        Objects.equals(capabilities, phone.capabilities) &&
        Objects.equals(webRtcUser, phone.webRtcUser) &&
        Objects.equals(selfUri, phone.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, version, dateCreated, dateModified, modifiedBy, createdBy, state, modifiedByApp, createdByApp, site, phoneBaseSettings, lineBaseSettings, phoneMetaBase, lines, status, secondaryStatus, properties, capabilities, webRtcUser, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Phone {\n");
    
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
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
    sb.append("    phoneBaseSettings: ").append(toIndentedString(phoneBaseSettings)).append("\n");
    sb.append("    lineBaseSettings: ").append(toIndentedString(lineBaseSettings)).append("\n");
    sb.append("    phoneMetaBase: ").append(toIndentedString(phoneMetaBase)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    secondaryStatus: ").append(toIndentedString(secondaryStatus)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
    sb.append("    webRtcUser: ").append(toIndentedString(webRtcUser)).append("\n");
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
