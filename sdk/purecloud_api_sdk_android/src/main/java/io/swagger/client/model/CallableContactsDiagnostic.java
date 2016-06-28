package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.UriReference;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class CallableContactsDiagnostic   {
  
  @SerializedName("dncLists")
  private List<UriReference> dncLists = new ArrayList<UriReference>();

  @SerializedName("callableTimeSet")
  private UriReference callableTimeSet = null;

  @SerializedName("ruleSets")
  private List<UriReference> ruleSets = new ArrayList<UriReference>();

  /**
   * Do not call lists for the campaign
   **/
  @ApiModelProperty(value = "Do not call lists for the campaign")
  public List<UriReference> getDncLists() {
    return dncLists;
  }
  public void setDncLists(List<UriReference> dncLists) {
    this.dncLists = dncLists;
  }

  /**
   * Callable time sets for the campaign
   **/
  @ApiModelProperty(value = "Callable time sets for the campaign")
  public UriReference getCallableTimeSet() {
    return callableTimeSet;
  }
  public void setCallableTimeSet(UriReference callableTimeSet) {
    this.callableTimeSet = callableTimeSet;
  }

  /**
   * Rule sets for the campaign
   **/
  @ApiModelProperty(value = "Rule sets for the campaign")
  public List<UriReference> getRuleSets() {
    return ruleSets;
  }
  public void setRuleSets(List<UriReference> ruleSets) {
    this.ruleSets = ruleSets;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallableContactsDiagnostic callableContactsDiagnostic = (CallableContactsDiagnostic) o;
    return Objects.equals(dncLists, callableContactsDiagnostic.dncLists) &&
        Objects.equals(callableTimeSet, callableContactsDiagnostic.callableTimeSet) &&
        Objects.equals(ruleSets, callableContactsDiagnostic.ruleSets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dncLists, callableTimeSet, ruleSets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallableContactsDiagnostic {\n");
    
    sb.append("    dncLists: ").append(toIndentedString(dncLists)).append("\n");
    sb.append("    callableTimeSet: ").append(toIndentedString(callableTimeSet)).append("\n");
    sb.append("    ruleSets: ").append(toIndentedString(ruleSets)).append("\n");
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
