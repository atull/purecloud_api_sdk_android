package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class WrapUpCodeMapping  implements Serializable {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("dateCreated")
  private Date dateCreated = null;

  @SerializedName("dateModified")
  private Date dateModified = null;

  @SerializedName("version")
  private Integer version = null;


  /**
   * Gets or Sets defaultSet
   */
  public enum DefaultSetEnum {
    @SerializedName("CONTACT_UNCALLABLE")
    CONTACT_UNCALLABLE("CONTACT_UNCALLABLE"),

    @SerializedName("NUMBER_UNCALLABLE")
    NUMBER_UNCALLABLE("NUMBER_UNCALLABLE"),

    @SerializedName("RIGHT_PARTY_CONTACT")
    RIGHT_PARTY_CONTACT("RIGHT_PARTY_CONTACT");

    private String value;

    DefaultSetEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("defaultSet")
  private List<DefaultSetEnum> defaultSet = new ArrayList<DefaultSetEnum>();

  @SerializedName("mapping")
  private Map<String, List<String>> mapping = new HashMap<String, List<String>>();

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
   * Creation time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Creation time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getDateCreated() {
    return dateCreated;
  }

  /**
   * Last modified time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Last modified time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getDateModified() {
    return dateModified;
  }

  /**
   * Required for updates, must match the version number of the most recent update
   **/
  @ApiModelProperty(value = "Required for updates, must match the version number of the most recent update")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }

  /**
   * The default set of wrapup values
   **/
  @ApiModelProperty(value = "The default set of wrapup values")
  public List<DefaultSetEnum> getDefaultSet() {
    return defaultSet;
  }
  public void setDefaultSet(List<DefaultSetEnum> defaultSet) {
    this.defaultSet = defaultSet;
  }

  /**
   * A map from wrapup code identifiers to a set of wrapup values
   **/
  @ApiModelProperty(value = "A map from wrapup code identifiers to a set of wrapup values")
  public Map<String, List<String>> getMapping() {
    return mapping;
  }
  public void setMapping(Map<String, List<String>> mapping) {
    this.mapping = mapping;
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
    WrapUpCodeMapping wrapUpCodeMapping = (WrapUpCodeMapping) o;
    return Objects.equals(id, wrapUpCodeMapping.id) &&
        Objects.equals(name, wrapUpCodeMapping.name) &&
        Objects.equals(dateCreated, wrapUpCodeMapping.dateCreated) &&
        Objects.equals(dateModified, wrapUpCodeMapping.dateModified) &&
        Objects.equals(version, wrapUpCodeMapping.version) &&
        Objects.equals(defaultSet, wrapUpCodeMapping.defaultSet) &&
        Objects.equals(mapping, wrapUpCodeMapping.mapping) &&
        Objects.equals(selfUri, wrapUpCodeMapping.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, version, defaultSet, mapping, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WrapUpCodeMapping {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    defaultSet: ").append(toIndentedString(defaultSet)).append("\n");
    sb.append("    mapping: ").append(toIndentedString(mapping)).append("\n");
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
