package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.UriReference;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class CampaignSequence   {
  
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

  @SerializedName("campaigns")
  private List<UriReference> campaigns = new ArrayList<UriReference>();

  @SerializedName("currentCampaign")
  private Integer currentCampaign = null;


  /**
   * status of the sequence
   */
  public enum StatusEnum {
    @SerializedName("ON")
    ON("ON"),

    @SerializedName("OFF")
    OFF("OFF"),

    @SerializedName("COMPLETE")
    COMPLETE("COMPLETE");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("stopMessage")
  private String stopMessage = null;

  @SerializedName("repeat")
  private Boolean repeat = false;

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
   * the ordered list of campaign identifiers
   **/
  @ApiModelProperty(required = true, value = "the ordered list of campaign identifiers")
  public List<UriReference> getCampaigns() {
    return campaigns;
  }
  public void setCampaigns(List<UriReference> campaigns) {
    this.campaigns = campaigns;
  }

  /**
   * the zero-based index of the current campaign in the campaigns list
   **/
  @ApiModelProperty(required = true, value = "the zero-based index of the current campaign in the campaigns list")
  public Integer getCurrentCampaign() {
    return currentCampaign;
  }

  /**
   * status of the sequence
   **/
  @ApiModelProperty(required = true, value = "status of the sequence")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   * if a sequence has unexpectedly stopped, this message provides the reason
   **/
  @ApiModelProperty(value = "if a sequence has unexpectedly stopped, this message provides the reason")
  public String getStopMessage() {
    return stopMessage;
  }

  /**
   * indicates if a sequence is to repeat from the beginning after the last campaign completes; default is false
   **/
  @ApiModelProperty(value = "indicates if a sequence is to repeat from the beginning after the last campaign completes; default is false")
  public Boolean getRepeat() {
    return repeat;
  }
  public void setRepeat(Boolean repeat) {
    this.repeat = repeat;
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
    CampaignSequence campaignSequence = (CampaignSequence) o;
    return Objects.equals(id, campaignSequence.id) &&
        Objects.equals(name, campaignSequence.name) &&
        Objects.equals(dateCreated, campaignSequence.dateCreated) &&
        Objects.equals(dateModified, campaignSequence.dateModified) &&
        Objects.equals(version, campaignSequence.version) &&
        Objects.equals(campaigns, campaignSequence.campaigns) &&
        Objects.equals(currentCampaign, campaignSequence.currentCampaign) &&
        Objects.equals(status, campaignSequence.status) &&
        Objects.equals(stopMessage, campaignSequence.stopMessage) &&
        Objects.equals(repeat, campaignSequence.repeat) &&
        Objects.equals(selfUri, campaignSequence.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, version, campaigns, currentCampaign, status, stopMessage, repeat, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignSequence {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    campaigns: ").append(toIndentedString(campaigns)).append("\n");
    sb.append("    currentCampaign: ").append(toIndentedString(currentCampaign)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    stopMessage: ").append(toIndentedString(stopMessage)).append("\n");
    sb.append("    repeat: ").append(toIndentedString(repeat)).append("\n");
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
