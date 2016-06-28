package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Contact;
import io.swagger.client.model.UserImage;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class Group   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("dateModified")
  private Date dateModified = null;

  @SerializedName("memberCount")
  private Long memberCount = null;


  /**
   * Active, inactive, or deleted state.
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

  @SerializedName("version")
  private Integer version = null;


  /**
   * Type of group.
   */
  public enum TypeEnum {
    @SerializedName("social")
    SOCIAL("social"),

    @SerializedName("official")
    OFFICIAL("official");

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

  @SerializedName("images")
  private List<UserImage> images = new ArrayList<UserImage>();

  @SerializedName("addresses")
  private List<Contact> addresses = new ArrayList<Contact>();

  @SerializedName("rulesVisible")
  private Boolean rulesVisible = false;


  /**
   * Who can view this group
   */
  public enum VisibilityEnum {
    @SerializedName("public")
    PUBLIC("public"),

    @SerializedName("owners")
    OWNERS("owners"),

    @SerializedName("members")
    MEMBERS("members");

    private String value;

    VisibilityEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("visibility")
  private VisibilityEnum visibility = null;

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
   * Last modified date/time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Last modified date/time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getDateModified() {
    return dateModified;
  }

  /**
   * Number of members.
   **/
  @ApiModelProperty(value = "Number of members.")
  public Long getMemberCount() {
    return memberCount;
  }

  /**
   * Active, inactive, or deleted state.
   **/
  @ApiModelProperty(value = "Active, inactive, or deleted state.")
  public StateEnum getState() {
    return state;
  }

  /**
   * Current version for this resource.
   **/
  @ApiModelProperty(value = "Current version for this resource.")
  public Integer getVersion() {
    return version;
  }

  /**
   * Type of group.
   **/
  @ApiModelProperty(required = true, value = "Type of group.")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<UserImage> getImages() {
    return images;
  }
  public void setImages(List<UserImage> images) {
    this.images = images;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Contact> getAddresses() {
    return addresses;
  }
  public void setAddresses(List<Contact> addresses) {
    this.addresses = addresses;
  }

  /**
   * Are membership rules visible to the person requesting to view the group
   **/
  @ApiModelProperty(required = true, value = "Are membership rules visible to the person requesting to view the group")
  public Boolean getRulesVisible() {
    return rulesVisible;
  }
  public void setRulesVisible(Boolean rulesVisible) {
    this.rulesVisible = rulesVisible;
  }

  /**
   * Who can view this group
   **/
  @ApiModelProperty(required = true, value = "Who can view this group")
  public VisibilityEnum getVisibility() {
    return visibility;
  }
  public void setVisibility(VisibilityEnum visibility) {
    this.visibility = visibility;
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
    Group group = (Group) o;
    return Objects.equals(id, group.id) &&
        Objects.equals(name, group.name) &&
        Objects.equals(description, group.description) &&
        Objects.equals(dateModified, group.dateModified) &&
        Objects.equals(memberCount, group.memberCount) &&
        Objects.equals(state, group.state) &&
        Objects.equals(version, group.version) &&
        Objects.equals(type, group.type) &&
        Objects.equals(images, group.images) &&
        Objects.equals(addresses, group.addresses) &&
        Objects.equals(rulesVisible, group.rulesVisible) &&
        Objects.equals(visibility, group.visibility) &&
        Objects.equals(selfUri, group.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, dateModified, memberCount, state, version, type, images, addresses, rulesVisible, visibility, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Group {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    memberCount: ").append(toIndentedString(memberCount)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    rulesVisible: ").append(toIndentedString(rulesVisible)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
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
