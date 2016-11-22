package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class UserStation  implements Serializable {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("associatedUser")
  private User associatedUser = null;

  @SerializedName("associatedDate")
  private Date associatedDate = null;

  @SerializedName("defaultUser")
  private User defaultUser = null;

  @SerializedName("providerInfo")
  private Map<String, String> providerInfo = new HashMap<String, String>();

  /**
   * A globally unique identifier for this station
   **/
  @ApiModelProperty(value = "A globally unique identifier for this station")
  public String getId() {
    return id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public User getAssociatedUser() {
    return associatedUser;
  }
  public void setAssociatedUser(User associatedUser) {
    this.associatedUser = associatedUser;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getAssociatedDate() {
    return associatedDate;
  }
  public void setAssociatedDate(Date associatedDate) {
    this.associatedDate = associatedDate;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public User getDefaultUser() {
    return defaultUser;
  }
  public void setDefaultUser(User defaultUser) {
    this.defaultUser = defaultUser;
  }

  /**
   * Provider-specific info for this station, e.g. { \"edgeGroupId\": \"ffe7b15c-a9cc-4f4c-88f5-781327819a49\" }
   **/
  @ApiModelProperty(value = "Provider-specific info for this station, e.g. { \"edgeGroupId\": \"ffe7b15c-a9cc-4f4c-88f5-781327819a49\" }")
  public Map<String, String> getProviderInfo() {
    return providerInfo;
  }
  public void setProviderInfo(Map<String, String> providerInfo) {
    this.providerInfo = providerInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserStation userStation = (UserStation) o;
    return Objects.equals(id, userStation.id) &&
        Objects.equals(associatedUser, userStation.associatedUser) &&
        Objects.equals(associatedDate, userStation.associatedDate) &&
        Objects.equals(defaultUser, userStation.defaultUser) &&
        Objects.equals(providerInfo, userStation.providerInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, associatedUser, associatedDate, defaultUser, providerInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserStation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    associatedUser: ").append(toIndentedString(associatedUser)).append("\n");
    sb.append("    associatedDate: ").append(toIndentedString(associatedDate)).append("\n");
    sb.append("    defaultUser: ").append(toIndentedString(defaultUser)).append("\n");
    sb.append("    providerInfo: ").append(toIndentedString(providerInfo)).append("\n");
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
