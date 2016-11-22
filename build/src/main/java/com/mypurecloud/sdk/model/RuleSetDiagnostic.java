package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.UriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class RuleSetDiagnostic  implements Serializable {
  
  @SerializedName("ruleSet")
  private UriReference ruleSet = null;


  /**
   * Gets or Sets warnings
   */
  public enum WarningsEnum {
    @SerializedName("WRAPUP_CODE_NOT_IN_QUEUE")
    WRAPUP_CODE_NOT_IN_QUEUE("WRAPUP_CODE_NOT_IN_QUEUE"),

    @SerializedName("CONTACT_ATTRIBUTE_NOT_IN_CONTACT_LIST")
    CONTACT_ATTRIBUTE_NOT_IN_CONTACT_LIST("CONTACT_ATTRIBUTE_NOT_IN_CONTACT_LIST"),

    @SerializedName("NO_DNC_LIST_FOR_APPEND")
    NO_DNC_LIST_FOR_APPEND("NO_DNC_LIST_FOR_APPEND"),

    @SerializedName("PHONE_CONDITIONS_WITH_MULTICOLUMN_PREVIEW")
    PHONE_CONDITIONS_WITH_MULTICOLUMN_PREVIEW("PHONE_CONDITIONS_WITH_MULTICOLUMN_PREVIEW");

    private String value;

    WarningsEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("warnings")
  private List<WarningsEnum> warnings = new ArrayList<WarningsEnum>();

  /**
   * A campaign rule set
   **/
  @ApiModelProperty(value = "A campaign rule set")
  public UriReference getRuleSet() {
    return ruleSet;
  }
  public void setRuleSet(UriReference ruleSet) {
    this.ruleSet = ruleSet;
  }

  /**
   * Diagnostic warnings for the rule set
   **/
  @ApiModelProperty(value = "Diagnostic warnings for the rule set")
  public List<WarningsEnum> getWarnings() {
    return warnings;
  }
  public void setWarnings(List<WarningsEnum> warnings) {
    this.warnings = warnings;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleSetDiagnostic ruleSetDiagnostic = (RuleSetDiagnostic) o;
    return Objects.equals(ruleSet, ruleSetDiagnostic.ruleSet) &&
        Objects.equals(warnings, ruleSetDiagnostic.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ruleSet, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleSetDiagnostic {\n");
    
    sb.append("    ruleSet: ").append(toIndentedString(ruleSet)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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
