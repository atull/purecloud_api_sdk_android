package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;





public class CodesRequest   {
  
  @SerializedName("organizationId")
  private String organizationId = null;

  @SerializedName("addCommunicationCode")
  private String addCommunicationCode = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getOrganizationId() {
    return organizationId;
  }
  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getAddCommunicationCode() {
    return addCommunicationCode;
  }
  public void setAddCommunicationCode(String addCommunicationCode) {
    this.addCommunicationCode = addCommunicationCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CodesRequest codesRequest = (CodesRequest) o;
    return Objects.equals(organizationId, codesRequest.organizationId) &&
        Objects.equals(addCommunicationCode, codesRequest.addCommunicationCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizationId, addCommunicationCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodesRequest {\n");
    
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    addCommunicationCode: ").append(toIndentedString(addCommunicationCode)).append("\n");
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
