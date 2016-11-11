package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.DomainEntity;
import com.mypurecloud.sdk.model.GreetingAudioFile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class Greeting  implements Serializable {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;


  /**
   * Greeting type
   */
  public enum TypeEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("STATION")
    STATION("STATION"),

    @SerializedName("VOICEMAIL")
    VOICEMAIL("VOICEMAIL"),

    @SerializedName("NAME")
    NAME("NAME");

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
   * Greeting owner type
   */
  public enum OwnerTypeEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("USER")
    USER("USER"),

    @SerializedName("ORGANIZATION")
    ORGANIZATION("ORGANIZATION"),

    @SerializedName("GROUP")
    GROUP("GROUP");

    private String value;

    OwnerTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("ownerType")
  private OwnerTypeEnum ownerType = null;

  @SerializedName("owner")
  private DomainEntity owner = null;

  @SerializedName("audioFile")
  private GreetingAudioFile audioFile = null;

  @SerializedName("audioTTS")
  private String audioTTS = null;

  @SerializedName("createdDate")
  private Date createdDate = null;

  @SerializedName("createdBy")
  private String createdBy = null;

  @SerializedName("modifiedDate")
  private Date modifiedDate = null;

  @SerializedName("modifiedBy")
  private String modifiedBy = null;

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
   * Greeting type
   **/
  @ApiModelProperty(required = true, value = "Greeting type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Greeting owner type
   **/
  @ApiModelProperty(required = true, value = "Greeting owner type")
  public OwnerTypeEnum getOwnerType() {
    return ownerType;
  }
  public void setOwnerType(OwnerTypeEnum ownerType) {
    this.ownerType = ownerType;
  }

  /**
   * Greeting owner
   **/
  @ApiModelProperty(required = true, value = "Greeting owner")
  public DomainEntity getOwner() {
    return owner;
  }
  public void setOwner(DomainEntity owner) {
    this.owner = owner;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public GreetingAudioFile getAudioFile() {
    return audioFile;
  }
  public void setAudioFile(GreetingAudioFile audioFile) {
    this.audioFile = audioFile;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getAudioTTS() {
    return audioTTS;
  }
  public void setAudioTTS(String audioTTS) {
    this.audioTTS = audioTTS;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getModifiedDate() {
    return modifiedDate;
  }
  public void setModifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getModifiedBy() {
    return modifiedBy;
  }
  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
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
    Greeting greeting = (Greeting) o;
    return Objects.equals(id, greeting.id) &&
        Objects.equals(name, greeting.name) &&
        Objects.equals(type, greeting.type) &&
        Objects.equals(ownerType, greeting.ownerType) &&
        Objects.equals(owner, greeting.owner) &&
        Objects.equals(audioFile, greeting.audioFile) &&
        Objects.equals(audioTTS, greeting.audioTTS) &&
        Objects.equals(createdDate, greeting.createdDate) &&
        Objects.equals(createdBy, greeting.createdBy) &&
        Objects.equals(modifiedDate, greeting.modifiedDate) &&
        Objects.equals(modifiedBy, greeting.modifiedBy) &&
        Objects.equals(selfUri, greeting.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, ownerType, owner, audioFile, audioTTS, createdDate, createdBy, modifiedDate, modifiedBy, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Greeting {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    ownerType: ").append(toIndentedString(ownerType)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    audioFile: ").append(toIndentedString(audioFile)).append("\n");
    sb.append("    audioTTS: ").append(toIndentedString(audioTTS)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
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
