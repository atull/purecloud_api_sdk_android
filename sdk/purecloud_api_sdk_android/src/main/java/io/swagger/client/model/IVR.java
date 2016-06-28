package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.UriReference;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class IVR   {
  
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

  @SerializedName("ivrUri")
  private String ivrUri = null;

  @SerializedName("dnis")
  private List<String> dnis = new ArrayList<String>();

  @SerializedName("flowId")
  private String flowId = null;

  @SerializedName("scheduleId")
  private String scheduleId = null;

  @SerializedName("openHoursFlow")
  private UriReference openHoursFlow = null;

  @SerializedName("closedHoursFlow")
  private UriReference closedHoursFlow = null;

  @SerializedName("scheduleGroup")
  private UriReference scheduleGroup = null;

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
   **/
  @ApiModelProperty(value = "")
  public String getIvrUri() {
    return ivrUri;
  }
  public void setIvrUri(String ivrUri) {
    this.ivrUri = ivrUri;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getDnis() {
    return dnis;
  }
  public void setDnis(List<String> dnis) {
    this.dnis = dnis;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getFlowId() {
    return flowId;
  }
  public void setFlowId(String flowId) {
    this.flowId = flowId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getScheduleId() {
    return scheduleId;
  }
  public void setScheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public UriReference getOpenHoursFlow() {
    return openHoursFlow;
  }
  public void setOpenHoursFlow(UriReference openHoursFlow) {
    this.openHoursFlow = openHoursFlow;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public UriReference getClosedHoursFlow() {
    return closedHoursFlow;
  }
  public void setClosedHoursFlow(UriReference closedHoursFlow) {
    this.closedHoursFlow = closedHoursFlow;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public UriReference getScheduleGroup() {
    return scheduleGroup;
  }
  public void setScheduleGroup(UriReference scheduleGroup) {
    this.scheduleGroup = scheduleGroup;
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
    IVR IVR = (IVR) o;
    return Objects.equals(id, IVR.id) &&
        Objects.equals(name, IVR.name) &&
        Objects.equals(description, IVR.description) &&
        Objects.equals(version, IVR.version) &&
        Objects.equals(dateCreated, IVR.dateCreated) &&
        Objects.equals(dateModified, IVR.dateModified) &&
        Objects.equals(modifiedBy, IVR.modifiedBy) &&
        Objects.equals(createdBy, IVR.createdBy) &&
        Objects.equals(state, IVR.state) &&
        Objects.equals(modifiedByApp, IVR.modifiedByApp) &&
        Objects.equals(createdByApp, IVR.createdByApp) &&
        Objects.equals(ivrUri, IVR.ivrUri) &&
        Objects.equals(dnis, IVR.dnis) &&
        Objects.equals(flowId, IVR.flowId) &&
        Objects.equals(scheduleId, IVR.scheduleId) &&
        Objects.equals(openHoursFlow, IVR.openHoursFlow) &&
        Objects.equals(closedHoursFlow, IVR.closedHoursFlow) &&
        Objects.equals(scheduleGroup, IVR.scheduleGroup) &&
        Objects.equals(selfUri, IVR.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, version, dateCreated, dateModified, modifiedBy, createdBy, state, modifiedByApp, createdByApp, ivrUri, dnis, flowId, scheduleId, openHoursFlow, closedHoursFlow, scheduleGroup, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IVR {\n");
    
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
    sb.append("    ivrUri: ").append(toIndentedString(ivrUri)).append("\n");
    sb.append("    dnis: ").append(toIndentedString(dnis)).append("\n");
    sb.append("    flowId: ").append(toIndentedString(flowId)).append("\n");
    sb.append("    scheduleId: ").append(toIndentedString(scheduleId)).append("\n");
    sb.append("    openHoursFlow: ").append(toIndentedString(openHoursFlow)).append("\n");
    sb.append("    closedHoursFlow: ").append(toIndentedString(closedHoursFlow)).append("\n");
    sb.append("    scheduleGroup: ").append(toIndentedString(scheduleGroup)).append("\n");
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
