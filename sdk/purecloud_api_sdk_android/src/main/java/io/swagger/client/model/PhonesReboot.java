package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class PhonesReboot   {
  
  @SerializedName("phoneIds")
  private List<String> phoneIds = new ArrayList<String>();

  @SerializedName("siteId")
  private String siteId = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getPhoneIds() {
    return phoneIds;
  }
  public void setPhoneIds(List<String> phoneIds) {
    this.phoneIds = phoneIds;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSiteId() {
    return siteId;
  }
  public void setSiteId(String siteId) {
    this.siteId = siteId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhonesReboot phonesReboot = (PhonesReboot) o;
    return Objects.equals(phoneIds, phonesReboot.phoneIds) &&
        Objects.equals(siteId, phonesReboot.siteId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneIds, siteId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhonesReboot {\n");
    
    sb.append("    phoneIds: ").append(toIndentedString(phoneIds)).append("\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
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
