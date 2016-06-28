package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ContactSort;
import io.swagger.client.model.PhoneColumn;
import io.swagger.client.model.RestErrorDetail;
import io.swagger.client.model.UriReference;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class Campaign   {
  
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

  @SerializedName("contactList")
  private UriReference contactList = null;

  @SerializedName("queue")
  private UriReference queue = null;


  /**
   * dialing mode of the campaign
   */
  public enum DialingModeEnum {
    @SerializedName("agentless")
    AGENTLESS("agentless"),

    @SerializedName("preview")
    PREVIEW("preview"),

    @SerializedName("power")
    POWER("power"),

    @SerializedName("predictive")
    PREDICTIVE("predictive"),

    @SerializedName("progressive")
    PROGRESSIVE("progressive");

    private String value;

    DialingModeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("dialingMode")
  private DialingModeEnum dialingMode = null;

  @SerializedName("script")
  private UriReference script = null;

  @SerializedName("edgeGroup")
  private UriReference edgeGroup = null;

  @SerializedName("campaignStatus")
  private String campaignStatus = null;

  @SerializedName("phoneColumns")
  private List<PhoneColumn> phoneColumns = new ArrayList<PhoneColumn>();

  @SerializedName("abandonRate")
  private Double abandonRate = null;

  @SerializedName("dncLists")
  private List<UriReference> dncLists = new ArrayList<UriReference>();

  @SerializedName("callableTimeSet")
  private UriReference callableTimeSet = null;

  @SerializedName("callAnalysisResponseSet")
  private UriReference callAnalysisResponseSet = null;

  @SerializedName("errors")
  private List<RestErrorDetail> errors = new ArrayList<RestErrorDetail>();

  @SerializedName("callerName")
  private String callerName = null;

  @SerializedName("callerAddress")
  private String callerAddress = null;

  @SerializedName("outboundLineCount")
  private Integer outboundLineCount = null;

  @SerializedName("ruleSets")
  private List<UriReference> ruleSets = new ArrayList<UriReference>();

  @SerializedName("skipPreviewDisabled")
  private Boolean skipPreviewDisabled = false;

  @SerializedName("previewTimeOutSeconds")
  private Long previewTimeOutSeconds = null;

  @SerializedName("contactSort")
  private ContactSort contactSort = null;

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
   * identifier of the contact list for the campaign
   **/
  @ApiModelProperty(required = true, value = "identifier of the contact list for the campaign")
  public UriReference getContactList() {
    return contactList;
  }
  public void setContactList(UriReference contactList) {
    this.contactList = contactList;
  }

  /**
   * identifier of the agent assignment queue, required for all dialing modes other than agentless
   **/
  @ApiModelProperty(required = true, value = "identifier of the agent assignment queue, required for all dialing modes other than agentless")
  public UriReference getQueue() {
    return queue;
  }
  public void setQueue(UriReference queue) {
    this.queue = queue;
  }

  /**
   * dialing mode of the campaign
   **/
  @ApiModelProperty(required = true, value = "dialing mode of the campaign")
  public DialingModeEnum getDialingMode() {
    return dialingMode;
  }
  public void setDialingMode(DialingModeEnum dialingMode) {
    this.dialingMode = dialingMode;
  }

  /**
   * identifier of the campaign script, required for all dialing modes other than agentless
   **/
  @ApiModelProperty(required = true, value = "identifier of the campaign script, required for all dialing modes other than agentless")
  public UriReference getScript() {
    return script;
  }
  public void setScript(UriReference script) {
    this.script = script;
  }

  /**
   * identifier of the edge group, required for all dialing modes other than preview
   **/
  @ApiModelProperty(required = true, value = "identifier of the edge group, required for all dialing modes other than preview")
  public UriReference getEdgeGroup() {
    return edgeGroup;
  }
  public void setEdgeGroup(UriReference edgeGroup) {
    this.edgeGroup = edgeGroup;
  }

  /**
   * status of the campaign; can be set to 'on' or 'off'
   **/
  @ApiModelProperty(required = true, value = "status of the campaign; can be set to 'on' or 'off'")
  public String getCampaignStatus() {
    return campaignStatus;
  }
  public void setCampaignStatus(String campaignStatus) {
    this.campaignStatus = campaignStatus;
  }

  /**
   * the contact list phone columns to be called for the campaign
   **/
  @ApiModelProperty(required = true, value = "the contact list phone columns to be called for the campaign")
  public List<PhoneColumn> getPhoneColumns() {
    return phoneColumns;
  }
  public void setPhoneColumns(List<PhoneColumn> phoneColumns) {
    this.phoneColumns = phoneColumns;
  }

  /**
   * the targeted abandon rate percentage
   **/
  @ApiModelProperty(value = "the targeted abandon rate percentage")
  public Double getAbandonRate() {
    return abandonRate;
  }
  public void setAbandonRate(Double abandonRate) {
    this.abandonRate = abandonRate;
  }

  /**
   * identifiers of the do not call lists
   **/
  @ApiModelProperty(value = "identifiers of the do not call lists")
  public List<UriReference> getDncLists() {
    return dncLists;
  }
  public void setDncLists(List<UriReference> dncLists) {
    this.dncLists = dncLists;
  }

  /**
   * the identifier of the callable time set
   **/
  @ApiModelProperty(value = "the identifier of the callable time set")
  public UriReference getCallableTimeSet() {
    return callableTimeSet;
  }
  public void setCallableTimeSet(UriReference callableTimeSet) {
    this.callableTimeSet = callableTimeSet;
  }

  /**
   * the identifier of the call analysis response set, required for all dialing modes other than preview
   **/
  @ApiModelProperty(required = true, value = "the identifier of the call analysis response set, required for all dialing modes other than preview")
  public UriReference getCallAnalysisResponseSet() {
    return callAnalysisResponseSet;
  }
  public void setCallAnalysisResponseSet(UriReference callAnalysisResponseSet) {
    this.callAnalysisResponseSet = callAnalysisResponseSet;
  }

  /**
   * a list of current error conditions associated with the campaign
   **/
  @ApiModelProperty(value = "a list of current error conditions associated with the campaign")
  public List<RestErrorDetail> getErrors() {
    return errors;
  }
  public void setErrors(List<RestErrorDetail> errors) {
    this.errors = errors;
  }

  /**
   * caller id name to be displayed on the outbound call
   **/
  @ApiModelProperty(value = "caller id name to be displayed on the outbound call")
  public String getCallerName() {
    return callerName;
  }
  public void setCallerName(String callerName) {
    this.callerName = callerName;
  }

  /**
   * caller id phone number to be displayed on the outbound call
   **/
  @ApiModelProperty(value = "caller id phone number to be displayed on the outbound call")
  public String getCallerAddress() {
    return callerAddress;
  }
  public void setCallerAddress(String callerAddress) {
    this.callerAddress = callerAddress;
  }

  /**
   * for agentless campaigns, the number of outbound lines to be concurrently dialed
   **/
  @ApiModelProperty(value = "for agentless campaigns, the number of outbound lines to be concurrently dialed")
  public Integer getOutboundLineCount() {
    return outboundLineCount;
  }
  public void setOutboundLineCount(Integer outboundLineCount) {
    this.outboundLineCount = outboundLineCount;
  }

  /**
   * identifiers of the rule sets
   **/
  @ApiModelProperty(value = "identifiers of the rule sets")
  public List<UriReference> getRuleSets() {
    return ruleSets;
  }
  public void setRuleSets(List<UriReference> ruleSets) {
    this.ruleSets = ruleSets;
  }

  /**
   * for preview campaigns, indicator of whether the agent can skip a preview without placing a call
   **/
  @ApiModelProperty(value = "for preview campaigns, indicator of whether the agent can skip a preview without placing a call")
  public Boolean getSkipPreviewDisabled() {
    return skipPreviewDisabled;
  }
  public void setSkipPreviewDisabled(Boolean skipPreviewDisabled) {
    this.skipPreviewDisabled = skipPreviewDisabled;
  }

  /**
   * for preview campaigns, number of seconds before a call will be automatically placed. A value of 0 indicates no automatic placement of calls
   **/
  @ApiModelProperty(value = "for preview campaigns, number of seconds before a call will be automatically placed. A value of 0 indicates no automatic placement of calls")
  public Long getPreviewTimeOutSeconds() {
    return previewTimeOutSeconds;
  }
  public void setPreviewTimeOutSeconds(Long previewTimeOutSeconds) {
    this.previewTimeOutSeconds = previewTimeOutSeconds;
  }

  /**
   * information determining the order in which the contacts will be dialed
   **/
  @ApiModelProperty(value = "information determining the order in which the contacts will be dialed")
  public ContactSort getContactSort() {
    return contactSort;
  }
  public void setContactSort(ContactSort contactSort) {
    this.contactSort = contactSort;
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
    Campaign campaign = (Campaign) o;
    return Objects.equals(id, campaign.id) &&
        Objects.equals(name, campaign.name) &&
        Objects.equals(dateCreated, campaign.dateCreated) &&
        Objects.equals(dateModified, campaign.dateModified) &&
        Objects.equals(version, campaign.version) &&
        Objects.equals(contactList, campaign.contactList) &&
        Objects.equals(queue, campaign.queue) &&
        Objects.equals(dialingMode, campaign.dialingMode) &&
        Objects.equals(script, campaign.script) &&
        Objects.equals(edgeGroup, campaign.edgeGroup) &&
        Objects.equals(campaignStatus, campaign.campaignStatus) &&
        Objects.equals(phoneColumns, campaign.phoneColumns) &&
        Objects.equals(abandonRate, campaign.abandonRate) &&
        Objects.equals(dncLists, campaign.dncLists) &&
        Objects.equals(callableTimeSet, campaign.callableTimeSet) &&
        Objects.equals(callAnalysisResponseSet, campaign.callAnalysisResponseSet) &&
        Objects.equals(errors, campaign.errors) &&
        Objects.equals(callerName, campaign.callerName) &&
        Objects.equals(callerAddress, campaign.callerAddress) &&
        Objects.equals(outboundLineCount, campaign.outboundLineCount) &&
        Objects.equals(ruleSets, campaign.ruleSets) &&
        Objects.equals(skipPreviewDisabled, campaign.skipPreviewDisabled) &&
        Objects.equals(previewTimeOutSeconds, campaign.previewTimeOutSeconds) &&
        Objects.equals(contactSort, campaign.contactSort) &&
        Objects.equals(selfUri, campaign.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, version, contactList, queue, dialingMode, script, edgeGroup, campaignStatus, phoneColumns, abandonRate, dncLists, callableTimeSet, callAnalysisResponseSet, errors, callerName, callerAddress, outboundLineCount, ruleSets, skipPreviewDisabled, previewTimeOutSeconds, contactSort, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Campaign {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    contactList: ").append(toIndentedString(contactList)).append("\n");
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    dialingMode: ").append(toIndentedString(dialingMode)).append("\n");
    sb.append("    script: ").append(toIndentedString(script)).append("\n");
    sb.append("    edgeGroup: ").append(toIndentedString(edgeGroup)).append("\n");
    sb.append("    campaignStatus: ").append(toIndentedString(campaignStatus)).append("\n");
    sb.append("    phoneColumns: ").append(toIndentedString(phoneColumns)).append("\n");
    sb.append("    abandonRate: ").append(toIndentedString(abandonRate)).append("\n");
    sb.append("    dncLists: ").append(toIndentedString(dncLists)).append("\n");
    sb.append("    callableTimeSet: ").append(toIndentedString(callableTimeSet)).append("\n");
    sb.append("    callAnalysisResponseSet: ").append(toIndentedString(callAnalysisResponseSet)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    callerName: ").append(toIndentedString(callerName)).append("\n");
    sb.append("    callerAddress: ").append(toIndentedString(callerAddress)).append("\n");
    sb.append("    outboundLineCount: ").append(toIndentedString(outboundLineCount)).append("\n");
    sb.append("    ruleSets: ").append(toIndentedString(ruleSets)).append("\n");
    sb.append("    skipPreviewDisabled: ").append(toIndentedString(skipPreviewDisabled)).append("\n");
    sb.append("    previewTimeOutSeconds: ").append(toIndentedString(previewTimeOutSeconds)).append("\n");
    sb.append("    contactSort: ").append(toIndentedString(contactSort)).append("\n");
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
