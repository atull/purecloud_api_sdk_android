package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.PolicyErrorMessage;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class PolicyErrors   {
  
  @SerializedName("policyErrorMessages")
  private List<PolicyErrorMessage> policyErrorMessages = new ArrayList<PolicyErrorMessage>();

  /**
   **/
  @ApiModelProperty(value = "")
  public List<PolicyErrorMessage> getPolicyErrorMessages() {
    return policyErrorMessages;
  }
  public void setPolicyErrorMessages(List<PolicyErrorMessage> policyErrorMessages) {
    this.policyErrorMessages = policyErrorMessages;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolicyErrors policyErrors = (PolicyErrors) o;
    return Objects.equals(policyErrorMessages, policyErrors.policyErrorMessages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyErrorMessages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyErrors {\n");
    
    sb.append("    policyErrorMessages: ").append(toIndentedString(policyErrorMessages)).append("\n");
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
