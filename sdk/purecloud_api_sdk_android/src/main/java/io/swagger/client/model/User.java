package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Chat;
import io.swagger.client.model.Contact;
import io.swagger.client.model.Geolocation;
import io.swagger.client.model.OutOfOffice;
import io.swagger.client.model.RoutingStatus;
import io.swagger.client.model.UserAuthorization;
import io.swagger.client.model.UserConversationSummary;
import io.swagger.client.model.UserImage;
import io.swagger.client.model.UserPresence;
import io.swagger.client.model.UserStations;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class User   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("chat")
  private Chat chat = null;

  @SerializedName("department")
  private String department = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("primaryContactInfo")
  private List<Contact> primaryContactInfo = new ArrayList<Contact>();

  @SerializedName("addresses")
  private List<Contact> addresses = new ArrayList<Contact>();


  /**
   * The current state for this user.
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

  @SerializedName("title")
  private String title = null;

  @SerializedName("username")
  private String username = null;

  @SerializedName("images")
  private List<UserImage> images = new ArrayList<UserImage>();

  @SerializedName("version")
  private Integer version = null;

  @SerializedName("routingStatus")
  private RoutingStatus routingStatus = null;

  @SerializedName("presence")
  private UserPresence presence = null;

  @SerializedName("conversationSummary")
  private UserConversationSummary conversationSummary = null;

  @SerializedName("outOfOffice")
  private OutOfOffice outOfOffice = null;

  @SerializedName("geolocation")
  private Geolocation geolocation = null;

  @SerializedName("station")
  private UserStations station = null;

  @SerializedName("authorization")
  private UserAuthorization authorization = null;

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
  public Chat getChat() {
    return chat;
  }
  public void setChat(Chat chat) {
    this.chat = chat;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDepartment() {
    return department;
  }
  public void setDepartment(String department) {
    this.department = department;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * Auto populated from addresses.
   **/
  @ApiModelProperty(value = "Auto populated from addresses.")
  public List<Contact> getPrimaryContactInfo() {
    return primaryContactInfo;
  }
  public void setPrimaryContactInfo(List<Contact> primaryContactInfo) {
    this.primaryContactInfo = primaryContactInfo;
  }

  /**
   * Email addresses and phone numbers for this user
   **/
  @ApiModelProperty(value = "Email addresses and phone numbers for this user")
  public List<Contact> getAddresses() {
    return addresses;
  }
  public void setAddresses(List<Contact> addresses) {
    this.addresses = addresses;
  }

  /**
   * The current state for this user.
   **/
  @ApiModelProperty(value = "The current state for this user.")
  public StateEnum getState() {
    return state;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
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
   * Required when updating. Version must be the current version. Only the system can assign version.
   **/
  @ApiModelProperty(value = "Required when updating. Version must be the current version. Only the system can assign version.")
  public Integer getVersion() {
    return version;
  }

  /**
   * ACD routing status
   **/
  @ApiModelProperty(value = "ACD routing status")
  public RoutingStatus getRoutingStatus() {
    return routingStatus;
  }
  public void setRoutingStatus(RoutingStatus routingStatus) {
    this.routingStatus = routingStatus;
  }

  /**
   * Active presence
   **/
  @ApiModelProperty(value = "Active presence")
  public UserPresence getPresence() {
    return presence;
  }
  public void setPresence(UserPresence presence) {
    this.presence = presence;
  }

  /**
   * Summary of conversion statistics for conversation types.
   **/
  @ApiModelProperty(value = "Summary of conversion statistics for conversation types.")
  public UserConversationSummary getConversationSummary() {
    return conversationSummary;
  }
  public void setConversationSummary(UserConversationSummary conversationSummary) {
    this.conversationSummary = conversationSummary;
  }

  /**
   * Determine if out of office is enabled
   **/
  @ApiModelProperty(value = "Determine if out of office is enabled")
  public OutOfOffice getOutOfOffice() {
    return outOfOffice;
  }
  public void setOutOfOffice(OutOfOffice outOfOffice) {
    this.outOfOffice = outOfOffice;
  }

  /**
   * Current geolocation position
   **/
  @ApiModelProperty(value = "Current geolocation position")
  public Geolocation getGeolocation() {
    return geolocation;
  }
  public void setGeolocation(Geolocation geolocation) {
    this.geolocation = geolocation;
  }

  /**
   * Effective, default, and last station information
   **/
  @ApiModelProperty(value = "Effective, default, and last station information")
  public UserStations getStation() {
    return station;
  }
  public void setStation(UserStations station) {
    this.station = station;
  }

  /**
   * Roles and permissions assigned to the user
   **/
  @ApiModelProperty(value = "Roles and permissions assigned to the user")
  public UserAuthorization getAuthorization() {
    return authorization;
  }
  public void setAuthorization(UserAuthorization authorization) {
    this.authorization = authorization;
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
    User user = (User) o;
    return Objects.equals(id, user.id) &&
        Objects.equals(name, user.name) &&
        Objects.equals(chat, user.chat) &&
        Objects.equals(department, user.department) &&
        Objects.equals(email, user.email) &&
        Objects.equals(primaryContactInfo, user.primaryContactInfo) &&
        Objects.equals(addresses, user.addresses) &&
        Objects.equals(state, user.state) &&
        Objects.equals(title, user.title) &&
        Objects.equals(username, user.username) &&
        Objects.equals(images, user.images) &&
        Objects.equals(version, user.version) &&
        Objects.equals(routingStatus, user.routingStatus) &&
        Objects.equals(presence, user.presence) &&
        Objects.equals(conversationSummary, user.conversationSummary) &&
        Objects.equals(outOfOffice, user.outOfOffice) &&
        Objects.equals(geolocation, user.geolocation) &&
        Objects.equals(station, user.station) &&
        Objects.equals(authorization, user.authorization) &&
        Objects.equals(selfUri, user.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, chat, department, email, primaryContactInfo, addresses, state, title, username, images, version, routingStatus, presence, conversationSummary, outOfOffice, geolocation, station, authorization, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    chat: ").append(toIndentedString(chat)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    primaryContactInfo: ").append(toIndentedString(primaryContactInfo)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    routingStatus: ").append(toIndentedString(routingStatus)).append("\n");
    sb.append("    presence: ").append(toIndentedString(presence)).append("\n");
    sb.append("    conversationSummary: ").append(toIndentedString(conversationSummary)).append("\n");
    sb.append("    outOfOffice: ").append(toIndentedString(outOfOffice)).append("\n");
    sb.append("    geolocation: ").append(toIndentedString(geolocation)).append("\n");
    sb.append("    station: ").append(toIndentedString(station)).append("\n");
    sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
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
