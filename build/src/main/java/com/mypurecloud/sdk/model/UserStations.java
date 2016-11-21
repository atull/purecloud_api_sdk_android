package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.UserStation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class UserStations  implements Serializable {
  
  @SerializedName("associatedStation")
  private UserStation associatedStation = null;

  @SerializedName("effectiveStation")
  private UserStation effectiveStation = null;

  @SerializedName("defaultStation")
  private UserStation defaultStation = null;

  @SerializedName("lastAssociatedStation")
  private UserStation lastAssociatedStation = null;

  /**
   * Current associated station for this user.
   **/
  @ApiModelProperty(value = "Current associated station for this user.")
  public UserStation getAssociatedStation() {
    return associatedStation;
  }
  public void setAssociatedStation(UserStation associatedStation) {
    this.associatedStation = associatedStation;
  }

  /**
   * The station where the user can be reached based on their default and associated station.
   **/
  @ApiModelProperty(value = "The station where the user can be reached based on their default and associated station.")
  public UserStation getEffectiveStation() {
    return effectiveStation;
  }
  public void setEffectiveStation(UserStation effectiveStation) {
    this.effectiveStation = effectiveStation;
  }

  /**
   * Default station to be used if not associated with a station.
   **/
  @ApiModelProperty(value = "Default station to be used if not associated with a station.")
  public UserStation getDefaultStation() {
    return defaultStation;
  }
  public void setDefaultStation(UserStation defaultStation) {
    this.defaultStation = defaultStation;
  }

  /**
   * Last associated station for this user.
   **/
  @ApiModelProperty(value = "Last associated station for this user.")
  public UserStation getLastAssociatedStation() {
    return lastAssociatedStation;
  }
  public void setLastAssociatedStation(UserStation lastAssociatedStation) {
    this.lastAssociatedStation = lastAssociatedStation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserStations userStations = (UserStations) o;
    return Objects.equals(associatedStation, userStations.associatedStation) &&
        Objects.equals(effectiveStation, userStations.effectiveStation) &&
        Objects.equals(defaultStation, userStations.defaultStation) &&
        Objects.equals(lastAssociatedStation, userStations.lastAssociatedStation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associatedStation, effectiveStation, defaultStation, lastAssociatedStation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserStations {\n");
    
    sb.append("    associatedStation: ").append(toIndentedString(associatedStation)).append("\n");
    sb.append("    effectiveStation: ").append(toIndentedString(effectiveStation)).append("\n");
    sb.append("    defaultStation: ").append(toIndentedString(defaultStation)).append("\n");
    sb.append("    lastAssociatedStation: ").append(toIndentedString(lastAssociatedStation)).append("\n");
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
