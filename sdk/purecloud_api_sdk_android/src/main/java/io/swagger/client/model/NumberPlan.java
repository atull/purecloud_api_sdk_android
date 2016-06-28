package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.DigitLength;
import io.swagger.client.model.Number;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class NumberPlan   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("version")
  private Integer version = null;

  @SerializedName("dateCreated")
  private Date dateCreated = null;

  @SerializedName("dateModified")
  private Date dateModified = null;

  @SerializedName("modifiedBy")
  private String modifiedBy = null;

  @SerializedName("createdBy")
  private String createdBy = null;


  /**
   * Gets or Sets state
   */
  public enum StateEnum {
    @SerializedName("active")
    ACTIVE("active"),

    @SerializedName("inactive")
    INACTIVE("inactive"),

    @SerializedName("deleted")
    DELETED("deleted");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("state")
  private StateEnum state = null;

  @SerializedName("modifiedByApp")
  private String modifiedByApp = null;

  @SerializedName("createdByApp")
  private String createdByApp = null;

  @SerializedName("match")
  private String match = null;

  @SerializedName("normalizedFormat")
  private String normalizedFormat = null;

  @SerializedName("priority")
  private Integer priority = null;

  @SerializedName("numbers")
  private List<Number> numbers = new ArrayList<Number>();

  @SerializedName("digitLength")
  private DigitLength digitLength = null;

  @SerializedName("classification")
  private String classification = null;


  /**
   * The type of matching technique the number plan uses.
   */
  public enum MatchTypeEnum {
    @SerializedName("e164NumberList")
    E164NUMBERLIST("e164NumberList"),

    @SerializedName("numberList")
    NUMBERLIST("numberList"),

    @SerializedName("digitLength")
    DIGITLENGTH("digitLength"),

    @SerializedName("regex")
    REGEX("regex"),

    @SerializedName("intraCountryCode")
    INTRACOUNTRYCODE("intraCountryCode"),

    @SerializedName("interCountryCode")
    INTERCOUNTRYCODE("interCountryCode");

    private String value;

    MatchTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("matchType")
  private MatchTypeEnum matchType = null;

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
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
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
   **/
  @ApiModelProperty(value = "")
  public String getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getModifiedByApp() {
    return modifiedByApp;
  }
  public void setModifiedByApp(String modifiedByApp) {
    this.modifiedByApp = modifiedByApp;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCreatedByApp() {
    return createdByApp;
  }
  public void setCreatedByApp(String createdByApp) {
    this.createdByApp = createdByApp;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getMatch() {
    return match;
  }
  public void setMatch(String match) {
    this.match = match;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getNormalizedFormat() {
    return normalizedFormat;
  }
  public void setNormalizedFormat(String normalizedFormat) {
    this.normalizedFormat = normalizedFormat;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getPriority() {
    return priority;
  }
  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Number> getNumbers() {
    return numbers;
  }
  public void setNumbers(List<Number> numbers) {
    this.numbers = numbers;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public DigitLength getDigitLength() {
    return digitLength;
  }
  public void setDigitLength(DigitLength digitLength) {
    this.digitLength = digitLength;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getClassification() {
    return classification;
  }
  public void setClassification(String classification) {
    this.classification = classification;
  }

  /**
   * The type of matching technique the number plan uses.
   **/
  @ApiModelProperty(required = true, value = "The type of matching technique the number plan uses.")
  public MatchTypeEnum getMatchType() {
    return matchType;
  }
  public void setMatchType(MatchTypeEnum matchType) {
    this.matchType = matchType;
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
    NumberPlan numberPlan = (NumberPlan) o;
    return Objects.equals(id, numberPlan.id) &&
        Objects.equals(name, numberPlan.name) &&
        Objects.equals(description, numberPlan.description) &&
        Objects.equals(version, numberPlan.version) &&
        Objects.equals(dateCreated, numberPlan.dateCreated) &&
        Objects.equals(dateModified, numberPlan.dateModified) &&
        Objects.equals(modifiedBy, numberPlan.modifiedBy) &&
        Objects.equals(createdBy, numberPlan.createdBy) &&
        Objects.equals(state, numberPlan.state) &&
        Objects.equals(modifiedByApp, numberPlan.modifiedByApp) &&
        Objects.equals(createdByApp, numberPlan.createdByApp) &&
        Objects.equals(match, numberPlan.match) &&
        Objects.equals(normalizedFormat, numberPlan.normalizedFormat) &&
        Objects.equals(priority, numberPlan.priority) &&
        Objects.equals(numbers, numberPlan.numbers) &&
        Objects.equals(digitLength, numberPlan.digitLength) &&
        Objects.equals(classification, numberPlan.classification) &&
        Objects.equals(matchType, numberPlan.matchType) &&
        Objects.equals(selfUri, numberPlan.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, version, dateCreated, dateModified, modifiedBy, createdBy, state, modifiedByApp, createdByApp, match, normalizedFormat, priority, numbers, digitLength, classification, matchType, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumberPlan {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    modifiedByApp: ").append(toIndentedString(modifiedByApp)).append("\n");
    sb.append("    createdByApp: ").append(toIndentedString(createdByApp)).append("\n");
    sb.append("    match: ").append(toIndentedString(match)).append("\n");
    sb.append("    normalizedFormat: ").append(toIndentedString(normalizedFormat)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    numbers: ").append(toIndentedString(numbers)).append("\n");
    sb.append("    digitLength: ").append(toIndentedString(digitLength)).append("\n");
    sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
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
