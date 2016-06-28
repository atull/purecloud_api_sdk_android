package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class LineStatus   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("reachable")
  private Boolean reachable = false;

  @SerializedName("addressOfRecord")
  private String addressOfRecord = null;

  @SerializedName("contactAddresses")
  private List<String> contactAddresses = new ArrayList<String>();

  @SerializedName("reachableStateTime")
  private Date reachableStateTime = null;

  /**
   * The id of this line
   **/
  @ApiModelProperty(value = "The id of this line")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Indicates whether the edge can reach the line.
   **/
  @ApiModelProperty(value = "Indicates whether the edge can reach the line.")
  public Boolean getReachable() {
    return reachable;
  }
  public void setReachable(Boolean reachable) {
    this.reachable = reachable;
  }

  /**
   * The line's address of record.
   **/
  @ApiModelProperty(value = "The line's address of record.")
  public String getAddressOfRecord() {
    return addressOfRecord;
  }
  public void setAddressOfRecord(String addressOfRecord) {
    this.addressOfRecord = addressOfRecord;
  }

  /**
   * The addresses used to contact the line.
   **/
  @ApiModelProperty(value = "The addresses used to contact the line.")
  public List<String> getContactAddresses() {
    return contactAddresses;
  }
  public void setContactAddresses(List<String> contactAddresses) {
    this.contactAddresses = contactAddresses;
  }

  /**
   * The time the line entered its current reachable state. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "The time the line entered its current reachable state. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getReachableStateTime() {
    return reachableStateTime;
  }
  public void setReachableStateTime(Date reachableStateTime) {
    this.reachableStateTime = reachableStateTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineStatus lineStatus = (LineStatus) o;
    return Objects.equals(id, lineStatus.id) &&
        Objects.equals(reachable, lineStatus.reachable) &&
        Objects.equals(addressOfRecord, lineStatus.addressOfRecord) &&
        Objects.equals(contactAddresses, lineStatus.contactAddresses) &&
        Objects.equals(reachableStateTime, lineStatus.reachableStateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, reachable, addressOfRecord, contactAddresses, reachableStateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineStatus {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    reachable: ").append(toIndentedString(reachable)).append("\n");
    sb.append("    addressOfRecord: ").append(toIndentedString(addressOfRecord)).append("\n");
    sb.append("    contactAddresses: ").append(toIndentedString(contactAddresses)).append("\n");
    sb.append("    reachableStateTime: ").append(toIndentedString(reachableStateTime)).append("\n");
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
