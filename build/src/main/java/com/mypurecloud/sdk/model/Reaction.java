package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class Reaction  implements Serializable {
  
  @SerializedName("data")
  private String data = null;

  @SerializedName("name")
  private String name = null;


  /**
   * Gets or Sets reactionType
   */
  public enum ReactionTypeEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("HANGUP")
    HANGUP("HANGUP"),

    @SerializedName("TRANSFER")
    TRANSFER("TRANSFER"),

    @SerializedName("TRANSFER_FLOW")
    TRANSFER_FLOW("TRANSFER_FLOW"),

    @SerializedName("PLAY_FILE")
    PLAY_FILE("PLAY_FILE");

    private String value;

    ReactionTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("reactionType")
  private ReactionTypeEnum reactionType = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getData() {
    return data;
  }
  public void setData(String data) {
    this.data = data;
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
  public ReactionTypeEnum getReactionType() {
    return reactionType;
  }
  public void setReactionType(ReactionTypeEnum reactionType) {
    this.reactionType = reactionType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reaction reaction = (Reaction) o;
    return Objects.equals(data, reaction.data) &&
        Objects.equals(name, reaction.name) &&
        Objects.equals(reactionType, reaction.reactionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, name, reactionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reaction {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    reactionType: ").append(toIndentedString(reactionType)).append("\n");
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
