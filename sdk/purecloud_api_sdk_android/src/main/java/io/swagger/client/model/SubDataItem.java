package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




/**
 * An additional data element that was set by the user for this event.
 **/
@ApiModel(description = "An additional data element that was set by the user for this event.")
public class SubDataItem   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("value")
  private String value = null;

  @SerializedName("prompt")
  private String prompt = null;

  @SerializedName("displayValue")
  private String displayValue = null;

  /**
   * The id of this element
   **/
  @ApiModelProperty(required = true, value = "The id of this element")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The 'type' of the element, this may be a system value, EG 'STRING' or a user defined type
   **/
  @ApiModelProperty(required = true, value = "The 'type' of the element, this may be a system value, EG 'STRING' or a user defined type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * The value of the element itself - This may be a simple value or more complex serialized data.
   **/
  @ApiModelProperty(required = true, value = "The value of the element itself - This may be a simple value or more complex serialized data.")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * The prompt displayed to the user that this data item was set from.
   **/
  @ApiModelProperty(required = true, value = "The prompt displayed to the user that this data item was set from.")
  public String getPrompt() {
    return prompt;
  }
  public void setPrompt(String prompt) {
    this.prompt = prompt;
  }

  /**
   * The display value that was offered to the user (as opposed to the actual value used internally
   **/
  @ApiModelProperty(required = true, value = "The display value that was offered to the user (as opposed to the actual value used internally")
  public String getDisplayValue() {
    return displayValue;
  }
  public void setDisplayValue(String displayValue) {
    this.displayValue = displayValue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubDataItem subDataItem = (SubDataItem) o;
    return Objects.equals(id, subDataItem.id) &&
        Objects.equals(type, subDataItem.type) &&
        Objects.equals(value, subDataItem.value) &&
        Objects.equals(prompt, subDataItem.prompt) &&
        Objects.equals(displayValue, subDataItem.displayValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, value, prompt, displayValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubDataItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    prompt: ").append(toIndentedString(prompt)).append("\n");
    sb.append("    displayValue: ").append(toIndentedString(displayValue)).append("\n");
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
