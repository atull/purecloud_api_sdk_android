package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;





public class VoiceXmlOperation   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;


  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    @SerializedName("GOTO")
    GOTO("GOTO"),

    @SerializedName("CALL_AND_RETURN")
    CALL_AND_RETURN("CALL_AND_RETURN");

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
   * Gets or Sets method
   */
  public enum MethodEnum {
    @SerializedName("GET")
    GET("GET"),

    @SerializedName("PUT")
    PUT("PUT"),

    @SerializedName("POST")
    POST("POST"),

    @SerializedName("DELETE")
    DELETE("DELETE");

    private String value;

    MethodEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("method")
  private MethodEnum method = null;


  /**
   * Gets or Sets encoding
   */
  public enum EncodingEnum {
    @SerializedName("MULTIPART_FORM_DATA")
    MULTIPART_FORM_DATA("MULTIPART_FORM_DATA"),

    @SerializedName("FORM_URL_ENCODED")
    FORM_URL_ENCODED("FORM_URL_ENCODED"),

    @SerializedName("JSON")
    JSON("JSON");

    private String value;

    EncodingEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("encoding")
  private EncodingEnum encoding = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("uri")
  private String uri = null;

  @SerializedName("inputs")
  private String inputs = null;

  @SerializedName("outputs")
  private String outputs = null;

  @SerializedName("fetchAudio")
  private String fetchAudio = null;

  @SerializedName("timeoutMS")
  private Integer timeoutMS = null;

  @SerializedName("selfUri")
  private String selfUri = null;

  /**
   * The globally unique identifier for the object.
   **/
  @ApiModelProperty(value = "The globally unique identifier for the object.")
  public String getId() {
    return id;
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
   **/
  @ApiModelProperty(value = "")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public MethodEnum getMethod() {
    return method;
  }
  public void setMethod(MethodEnum method) {
    this.method = method;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public EncodingEnum getEncoding() {
    return encoding;
  }
  public void setEncoding(EncodingEnum encoding) {
    this.encoding = encoding;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getUri() {
    return uri;
  }
  public void setUri(String uri) {
    this.uri = uri;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getInputs() {
    return inputs;
  }
  public void setInputs(String inputs) {
    this.inputs = inputs;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getOutputs() {
    return outputs;
  }
  public void setOutputs(String outputs) {
    this.outputs = outputs;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getFetchAudio() {
    return fetchAudio;
  }
  public void setFetchAudio(String fetchAudio) {
    this.fetchAudio = fetchAudio;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getTimeoutMS() {
    return timeoutMS;
  }
  public void setTimeoutMS(Integer timeoutMS) {
    this.timeoutMS = timeoutMS;
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
    VoiceXmlOperation voiceXmlOperation = (VoiceXmlOperation) o;
    return Objects.equals(id, voiceXmlOperation.id) &&
        Objects.equals(name, voiceXmlOperation.name) &&
        Objects.equals(type, voiceXmlOperation.type) &&
        Objects.equals(method, voiceXmlOperation.method) &&
        Objects.equals(encoding, voiceXmlOperation.encoding) &&
        Objects.equals(description, voiceXmlOperation.description) &&
        Objects.equals(uri, voiceXmlOperation.uri) &&
        Objects.equals(inputs, voiceXmlOperation.inputs) &&
        Objects.equals(outputs, voiceXmlOperation.outputs) &&
        Objects.equals(fetchAudio, voiceXmlOperation.fetchAudio) &&
        Objects.equals(timeoutMS, voiceXmlOperation.timeoutMS) &&
        Objects.equals(selfUri, voiceXmlOperation.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, method, encoding, description, uri, inputs, outputs, fetchAudio, timeoutMS, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoiceXmlOperation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
    sb.append("    fetchAudio: ").append(toIndentedString(fetchAudio)).append("\n");
    sb.append("    timeoutMS: ").append(toIndentedString(timeoutMS)).append("\n");
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
