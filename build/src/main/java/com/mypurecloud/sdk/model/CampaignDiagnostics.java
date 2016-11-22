package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.CallableContactsDiagnostic;
import com.mypurecloud.sdk.model.QueueUtilizationDiagnostic;
import com.mypurecloud.sdk.model.RuleSetDiagnostic;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class CampaignDiagnostics  implements Serializable {
  
  @SerializedName("callableContacts")
  private CallableContactsDiagnostic callableContacts = null;

  @SerializedName("queueUtilizationDiagnostic")
  private QueueUtilizationDiagnostic queueUtilizationDiagnostic = null;

  @SerializedName("ruleSetDiagnostics")
  private List<RuleSetDiagnostic> ruleSetDiagnostics = new ArrayList<RuleSetDiagnostic>();

  @SerializedName("outstandingInteractionsCount")
  private Integer outstandingInteractionsCount = null;

  /**
   * Campaign properties that can impact which contacts are callable
   **/
  @ApiModelProperty(value = "Campaign properties that can impact which contacts are callable")
  public CallableContactsDiagnostic getCallableContacts() {
    return callableContacts;
  }
  public void setCallableContacts(CallableContactsDiagnostic callableContacts) {
    this.callableContacts = callableContacts;
  }

  /**
   * Information regarding the campaign's queue
   **/
  @ApiModelProperty(value = "Information regarding the campaign's queue")
  public QueueUtilizationDiagnostic getQueueUtilizationDiagnostic() {
    return queueUtilizationDiagnostic;
  }
  public void setQueueUtilizationDiagnostic(QueueUtilizationDiagnostic queueUtilizationDiagnostic) {
    this.queueUtilizationDiagnostic = queueUtilizationDiagnostic;
  }

  /**
   * Information regarding the campaign's rule sets
   **/
  @ApiModelProperty(value = "Information regarding the campaign's rule sets")
  public List<RuleSetDiagnostic> getRuleSetDiagnostics() {
    return ruleSetDiagnostics;
  }
  public void setRuleSetDiagnostics(List<RuleSetDiagnostic> ruleSetDiagnostics) {
    this.ruleSetDiagnostics = ruleSetDiagnostics;
  }

  /**
   * Current number of outstanding interactions on the campaign
   **/
  @ApiModelProperty(value = "Current number of outstanding interactions on the campaign")
  public Integer getOutstandingInteractionsCount() {
    return outstandingInteractionsCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignDiagnostics campaignDiagnostics = (CampaignDiagnostics) o;
    return Objects.equals(callableContacts, campaignDiagnostics.callableContacts) &&
        Objects.equals(queueUtilizationDiagnostic, campaignDiagnostics.queueUtilizationDiagnostic) &&
        Objects.equals(ruleSetDiagnostics, campaignDiagnostics.ruleSetDiagnostics) &&
        Objects.equals(outstandingInteractionsCount, campaignDiagnostics.outstandingInteractionsCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callableContacts, queueUtilizationDiagnostic, ruleSetDiagnostics, outstandingInteractionsCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignDiagnostics {\n");
    
    sb.append("    callableContacts: ").append(toIndentedString(callableContacts)).append("\n");
    sb.append("    queueUtilizationDiagnostic: ").append(toIndentedString(queueUtilizationDiagnostic)).append("\n");
    sb.append("    ruleSetDiagnostics: ").append(toIndentedString(ruleSetDiagnostics)).append("\n");
    sb.append("    outstandingInteractionsCount: ").append(toIndentedString(outstandingInteractionsCount)).append("\n");
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
