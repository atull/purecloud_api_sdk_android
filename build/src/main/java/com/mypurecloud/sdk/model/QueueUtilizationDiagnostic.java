package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.UriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class QueueUtilizationDiagnostic  implements Serializable {
  
  @SerializedName("queue")
  private UriReference queue = null;

  @SerializedName("usersInQueue")
  private Integer usersInQueue = null;

  @SerializedName("activeUsersInQueue")
  private Integer activeUsersInQueue = null;

  @SerializedName("usersOnQueue")
  private Integer usersOnQueue = null;

  @SerializedName("usersNotUtilized")
  private Integer usersNotUtilized = null;

  @SerializedName("usersOnQueueWithStation")
  private Integer usersOnQueueWithStation = null;

  @SerializedName("usersOnACampaignCall")
  private Integer usersOnACampaignCall = null;

  @SerializedName("usersOnDifferentEdgeGroup")
  private Integer usersOnDifferentEdgeGroup = null;

  @SerializedName("usersOnANonCampaignCall")
  private Integer usersOnANonCampaignCall = null;

  /**
   * Identifier of the queue
   **/
  @ApiModelProperty(value = "Identifier of the queue")
  public UriReference getQueue() {
    return queue;
  }
  public void setQueue(UriReference queue) {
    this.queue = queue;
  }

  /**
   * The number of users joined to the queue
   **/
  @ApiModelProperty(value = "The number of users joined to the queue")
  public Integer getUsersInQueue() {
    return usersInQueue;
  }

  /**
   * The number of users active on the queue
   **/
  @ApiModelProperty(value = "The number of users active on the queue")
  public Integer getActiveUsersInQueue() {
    return activeUsersInQueue;
  }

  /**
   * The number of users with a status of on-queue
   **/
  @ApiModelProperty(value = "The number of users with a status of on-queue")
  public Integer getUsersOnQueue() {
    return usersOnQueue;
  }

  /**
   * The number of users in the queue currently not engaged
   **/
  @ApiModelProperty(value = "The number of users in the queue currently not engaged")
  public Integer getUsersNotUtilized() {
    return usersNotUtilized;
  }

  /**
   * The number of users in the queue with a station
   **/
  @ApiModelProperty(value = "The number of users in the queue with a station")
  public Integer getUsersOnQueueWithStation() {
    return usersOnQueueWithStation;
  }

  /**
   * The number of users currently engaged in a campaign call
   **/
  @ApiModelProperty(value = "The number of users currently engaged in a campaign call")
  public Integer getUsersOnACampaignCall() {
    return usersOnACampaignCall;
  }

  /**
   * The number of users whose station is homed to an edge different from the campaign
   **/
  @ApiModelProperty(value = "The number of users whose station is homed to an edge different from the campaign")
  public Integer getUsersOnDifferentEdgeGroup() {
    return usersOnDifferentEdgeGroup;
  }

  /**
   * The number of users currently engaged in a communication that is not part of the campaign
   **/
  @ApiModelProperty(value = "The number of users currently engaged in a communication that is not part of the campaign")
  public Integer getUsersOnANonCampaignCall() {
    return usersOnANonCampaignCall;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueUtilizationDiagnostic queueUtilizationDiagnostic = (QueueUtilizationDiagnostic) o;
    return Objects.equals(queue, queueUtilizationDiagnostic.queue) &&
        Objects.equals(usersInQueue, queueUtilizationDiagnostic.usersInQueue) &&
        Objects.equals(activeUsersInQueue, queueUtilizationDiagnostic.activeUsersInQueue) &&
        Objects.equals(usersOnQueue, queueUtilizationDiagnostic.usersOnQueue) &&
        Objects.equals(usersNotUtilized, queueUtilizationDiagnostic.usersNotUtilized) &&
        Objects.equals(usersOnQueueWithStation, queueUtilizationDiagnostic.usersOnQueueWithStation) &&
        Objects.equals(usersOnACampaignCall, queueUtilizationDiagnostic.usersOnACampaignCall) &&
        Objects.equals(usersOnDifferentEdgeGroup, queueUtilizationDiagnostic.usersOnDifferentEdgeGroup) &&
        Objects.equals(usersOnANonCampaignCall, queueUtilizationDiagnostic.usersOnANonCampaignCall);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queue, usersInQueue, activeUsersInQueue, usersOnQueue, usersNotUtilized, usersOnQueueWithStation, usersOnACampaignCall, usersOnDifferentEdgeGroup, usersOnANonCampaignCall);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueUtilizationDiagnostic {\n");
    
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    usersInQueue: ").append(toIndentedString(usersInQueue)).append("\n");
    sb.append("    activeUsersInQueue: ").append(toIndentedString(activeUsersInQueue)).append("\n");
    sb.append("    usersOnQueue: ").append(toIndentedString(usersOnQueue)).append("\n");
    sb.append("    usersNotUtilized: ").append(toIndentedString(usersNotUtilized)).append("\n");
    sb.append("    usersOnQueueWithStation: ").append(toIndentedString(usersOnQueueWithStation)).append("\n");
    sb.append("    usersOnACampaignCall: ").append(toIndentedString(usersOnACampaignCall)).append("\n");
    sb.append("    usersOnDifferentEdgeGroup: ").append(toIndentedString(usersOnDifferentEdgeGroup)).append("\n");
    sb.append("    usersOnANonCampaignCall: ").append(toIndentedString(usersOnANonCampaignCall)).append("\n");
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
