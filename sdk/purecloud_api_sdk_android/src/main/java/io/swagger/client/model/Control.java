package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ControlOptions;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class Control   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("options")
  private List<ControlOptions> options = new ArrayList<ControlOptions>();

  @SerializedName("required")
  private Boolean required = false;

  @SerializedName("readOnly")
  private Boolean readOnly = false;

  @SerializedName("variableBindingId")
  private String variableBindingId = null;


  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    @SerializedName("CHECKBOX")
    CHECKBOX("CHECKBOX"),

    @SerializedName("RADIO")
    RADIO("RADIO"),

    @SerializedName("SELECT")
    SELECT("SELECT");

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
  public String getLabel() {
    return label;
  }
  public void setLabel(String label) {
    this.label = label;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<ControlOptions> getOptions() {
    return options;
  }
  public void setOptions(List<ControlOptions> options) {
    this.options = options;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getRequired() {
    return required;
  }
  public void setRequired(Boolean required) {
    this.required = required;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getReadOnly() {
    return readOnly;
  }
  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getVariableBindingId() {
    return variableBindingId;
  }
  public void setVariableBindingId(String variableBindingId) {
    this.variableBindingId = variableBindingId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Control control = (Control) o;
    return Objects.equals(id, control.id) &&
        Objects.equals(label, control.label) &&
        Objects.equals(options, control.options) &&
        Objects.equals(required, control.required) &&
        Objects.equals(readOnly, control.readOnly) &&
        Objects.equals(variableBindingId, control.variableBindingId) &&
        Objects.equals(type, control.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, label, options, required, readOnly, variableBindingId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Control {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    variableBindingId: ").append(toIndentedString(variableBindingId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
