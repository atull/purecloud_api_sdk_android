package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.ConnectRate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class CampaignStats  implements Serializable {
  
  @SerializedName("contactRate")
  private ConnectRate contactRate = null;

  @SerializedName("idleAgents")
  private Integer idleAgents = null;

  @SerializedName("adjustedCallsPerAgent")
  private Double adjustedCallsPerAgent = null;

  @SerializedName("outstandingCalls")
  private Integer outstandingCalls = null;

  /**
   * Information regarding the campaign's connect rate
   **/
  @ApiModelProperty(value = "Information regarding the campaign's connect rate")
  public ConnectRate getContactRate() {
    return contactRate;
  }
  public void setContactRate(ConnectRate contactRate) {
    this.contactRate = contactRate;
  }

  /**
   * Number of available agents not currently being utilized
   **/
  @ApiModelProperty(value = "Number of available agents not currently being utilized")
  public Integer getIdleAgents() {
    return idleAgents;
  }

  /**
   * Calls per agent adjusted by pace
   **/
  @ApiModelProperty(value = "Calls per agent adjusted by pace")
  public Double getAdjustedCallsPerAgent() {
    return adjustedCallsPerAgent;
  }

  /**
   * Number of campaign calls currently ongoing
   **/
  @ApiModelProperty(value = "Number of campaign calls currently ongoing")
  public Integer getOutstandingCalls() {
    return outstandingCalls;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignStats campaignStats = (CampaignStats) o;
    return Objects.equals(contactRate, campaignStats.contactRate) &&
        Objects.equals(idleAgents, campaignStats.idleAgents) &&
        Objects.equals(adjustedCallsPerAgent, campaignStats.adjustedCallsPerAgent) &&
        Objects.equals(outstandingCalls, campaignStats.outstandingCalls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactRate, idleAgents, adjustedCallsPerAgent, outstandingCalls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignStats {\n");
    
    sb.append("    contactRate: ").append(toIndentedString(contactRate)).append("\n");
    sb.append("    idleAgents: ").append(toIndentedString(idleAgents)).append("\n");
    sb.append("    adjustedCallsPerAgent: ").append(toIndentedString(adjustedCallsPerAgent)).append("\n");
    sb.append("    outstandingCalls: ").append(toIndentedString(outstandingCalls)).append("\n");
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
