package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.CallableContactsDiagnostic;
import io.swagger.client.model.QueueUtilizationDiagnostic;

import com.google.gson.annotations.SerializedName;





public class CampaignDiagnostics   {
  
  @SerializedName("callableContacts")
  private CallableContactsDiagnostic callableContacts = null;

  @SerializedName("queueUtilizationDiagnostic")
  private QueueUtilizationDiagnostic queueUtilizationDiagnostic = null;

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
        Objects.equals(outstandingInteractionsCount, campaignDiagnostics.outstandingInteractionsCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callableContacts, queueUtilizationDiagnostic, outstandingInteractionsCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignDiagnostics {\n");
    
    sb.append("    callableContacts: ").append(toIndentedString(callableContacts)).append("\n");
    sb.append("    queueUtilizationDiagnostic: ").append(toIndentedString(queueUtilizationDiagnostic)).append("\n");
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
