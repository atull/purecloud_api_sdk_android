package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class DialerAction  implements Serializable {
  

  /**
   * Type of the action
   */
  public enum TypeEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("Action")
    ACTION("Action"),

    @SerializedName("modifyContactAttribute")
    MODIFYCONTACTATTRIBUTE("modifyContactAttribute");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;


  /**
   * Identifier of the action
   */
  public enum ActionTypeNameEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("DO_NOT_DIAL")
    DO_NOT_DIAL("DO_NOT_DIAL"),

    @SerializedName("MODIFY_CONTACT_ATTRIBUTE")
    MODIFY_CONTACT_ATTRIBUTE("MODIFY_CONTACT_ATTRIBUTE"),

    @SerializedName("SWITCH_TO_PREVIEW")
    SWITCH_TO_PREVIEW("SWITCH_TO_PREVIEW"),

    @SerializedName("APPEND_NUMBER_TO_DNC_LIST")
    APPEND_NUMBER_TO_DNC_LIST("APPEND_NUMBER_TO_DNC_LIST"),

    @SerializedName("SCHEDULE_CALLBACK")
    SCHEDULE_CALLBACK("SCHEDULE_CALLBACK");

    private String value;

    ActionTypeNameEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("actionTypeName")
  private ActionTypeNameEnum actionTypeName = null;


  /**
   * Indicator of the type of update action (applicable only to certain types of actions)
   */
  public enum UpdateOptionEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("SET")
    SET("SET"),

    @SerializedName("INCREMENT")
    INCREMENT("INCREMENT"),

    @SerializedName("DECREMENT")
    DECREMENT("DECREMENT"),

    @SerializedName("CURRENT_TIME")
    CURRENT_TIME("CURRENT_TIME");

    private String value;

    UpdateOptionEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("updateOption")
  private UpdateOptionEnum updateOption = null;

  @SerializedName("properties")
  private Map<String, String> properties = new HashMap<String, String>();

  /**
   * Type of the action
   **/
  @ApiModelProperty(required = true, value = "Type of the action")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Identifier of the action
   **/
  @ApiModelProperty(required = true, value = "Identifier of the action")
  public ActionTypeNameEnum getActionTypeName() {
    return actionTypeName;
  }
  public void setActionTypeName(ActionTypeNameEnum actionTypeName) {
    this.actionTypeName = actionTypeName;
  }

  /**
   * Indicator of the type of update action (applicable only to certain types of actions)
   **/
  @ApiModelProperty(value = "Indicator of the type of update action (applicable only to certain types of actions)")
  public UpdateOptionEnum getUpdateOption() {
    return updateOption;
  }
  public void setUpdateOption(UpdateOptionEnum updateOption) {
    this.updateOption = updateOption;
  }

  /**
   * Map of key-value pairs pertinent to the action (different actions require different properties)
   **/
  @ApiModelProperty(value = "Map of key-value pairs pertinent to the action (different actions require different properties)")
  public Map<String, String> getProperties() {
    return properties;
  }
  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DialerAction dialerAction = (DialerAction) o;
    return Objects.equals(type, dialerAction.type) &&
        Objects.equals(actionTypeName, dialerAction.actionTypeName) &&
        Objects.equals(updateOption, dialerAction.updateOption) &&
        Objects.equals(properties, dialerAction.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, actionTypeName, updateOption, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerAction {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    actionTypeName: ").append(toIndentedString(actionTypeName)).append("\n");
    sb.append("    updateOption: ").append(toIndentedString(updateOption)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
