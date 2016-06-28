package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;





public class Dependency   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("version")
  private String version = null;


  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    @SerializedName("ACDLANGUAGE")
    ACDLANGUAGE("ACDLANGUAGE"),

    @SerializedName("ACDSKILL")
    ACDSKILL("ACDSKILL"),

    @SerializedName("ACDWRAPUPCODE")
    ACDWRAPUPCODE("ACDWRAPUPCODE"),

    @SerializedName("BRIDGEACTION")
    BRIDGEACTION("BRIDGEACTION"),

    @SerializedName("COMPOSERSCRIPT")
    COMPOSERSCRIPT("COMPOSERSCRIPT"),

    @SerializedName("CONTACTLIST")
    CONTACTLIST("CONTACTLIST"),

    @SerializedName("INBOUNDCALLFLOW")
    INBOUNDCALLFLOW("INBOUNDCALLFLOW"),

    @SerializedName("INQUEUECALLFLOW")
    INQUEUECALLFLOW("INQUEUECALLFLOW"),

    @SerializedName("IVRCONFIGURATION")
    IVRCONFIGURATION("IVRCONFIGURATION"),

    @SerializedName("LANGUAGE")
    LANGUAGE("LANGUAGE"),

    @SerializedName("OUTBOUNDCALLFLOW")
    OUTBOUNDCALLFLOW("OUTBOUNDCALLFLOW"),

    @SerializedName("QUEUE")
    QUEUE("QUEUE"),

    @SerializedName("SUBFLOWCALLFLOW")
    SUBFLOWCALLFLOW("SUBFLOWCALLFLOW"),

    @SerializedName("SYSTEMPROMPT")
    SYSTEMPROMPT("SYSTEMPROMPT"),

    @SerializedName("USER")
    USER("USER"),

    @SerializedName("USERPROMPT")
    USERPROMPT("USERPROMPT"),

    @SerializedName("VOICEXML")
    VOICEXML("VOICEXML");

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

  @SerializedName("deleted")
  private Boolean deleted = false;

  @SerializedName("updated")
  private Boolean updated = false;

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
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
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
  public Boolean getDeleted() {
    return deleted;
  }
  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getUpdated() {
    return updated;
  }
  public void setUpdated(Boolean updated) {
    this.updated = updated;
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
    Dependency dependency = (Dependency) o;
    return Objects.equals(id, dependency.id) &&
        Objects.equals(name, dependency.name) &&
        Objects.equals(version, dependency.version) &&
        Objects.equals(type, dependency.type) &&
        Objects.equals(deleted, dependency.deleted) &&
        Objects.equals(updated, dependency.updated) &&
        Objects.equals(selfUri, dependency.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, version, type, deleted, updated, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dependency {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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
