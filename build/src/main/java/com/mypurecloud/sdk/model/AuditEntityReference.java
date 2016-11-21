package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class AuditEntityReference  implements Serializable {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("selfUri")
  private String selfUri = null;


  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("ATTRIBUTE")
    ATTRIBUTE("ATTRIBUTE"),

    @SerializedName("ATTRIBUTE_GROUP_INSTANCE")
    ATTRIBUTE_GROUP_INSTANCE("ATTRIBUTE_GROUP_INSTANCE"),

    @SerializedName("DOCUMENT")
    DOCUMENT("DOCUMENT"),

    @SerializedName("DOWNLOAD")
    DOWNLOAD("DOWNLOAD"),

    @SerializedName("FAX")
    FAX("FAX"),

    @SerializedName("GROUP")
    GROUP("GROUP"),

    @SerializedName("RECORDING")
    RECORDING("RECORDING"),

    @SerializedName("TAG")
    TAG("TAG"),

    @SerializedName("WORKSPACE")
    WORKSPACE("WORKSPACE"),

    @SerializedName("USER")
    USER("USER"),

    @SerializedName("PUBLIC")
    PUBLIC("PUBLIC");

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

  @SerializedName("action")
  private String action = null;

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
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSelfUri() {
    return selfUri;
  }
  public void setSelfUri(String selfUri) {
    this.selfUri = selfUri;
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
  public String getAction() {
    return action;
  }
  public void setAction(String action) {
    this.action = action;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditEntityReference auditEntityReference = (AuditEntityReference) o;
    return Objects.equals(id, auditEntityReference.id) &&
        Objects.equals(name, auditEntityReference.name) &&
        Objects.equals(selfUri, auditEntityReference.selfUri) &&
        Objects.equals(type, auditEntityReference.type) &&
        Objects.equals(action, auditEntityReference.action);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, selfUri, type, action);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditEntityReference {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
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
