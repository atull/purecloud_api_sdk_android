package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class EncryptionKey  implements Serializable {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("createDate")
  private Date createDate = null;

  @SerializedName("keydataSummary")
  private String keydataSummary = null;

  @SerializedName("user")
  private User user = null;

  @SerializedName("selfUri")
  private String selfUri = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
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
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getCreateDate() {
    return createDate;
  }
  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getKeydataSummary() {
    return keydataSummary;
  }
  public void setKeydataSummary(String keydataSummary) {
    this.keydataSummary = keydataSummary;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public User getUser() {
    return user;
  }
  public void setUser(User user) {
    this.user = user;
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
    EncryptionKey encryptionKey = (EncryptionKey) o;
    return Objects.equals(id, encryptionKey.id) &&
        Objects.equals(name, encryptionKey.name) &&
        Objects.equals(createDate, encryptionKey.createDate) &&
        Objects.equals(keydataSummary, encryptionKey.keydataSummary) &&
        Objects.equals(user, encryptionKey.user) &&
        Objects.equals(selfUri, encryptionKey.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, createDate, keydataSummary, user, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EncryptionKey {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    keydataSummary: ").append(toIndentedString(keydataSummary)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
