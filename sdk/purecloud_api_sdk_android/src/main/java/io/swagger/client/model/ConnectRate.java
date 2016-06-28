package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;





public class ConnectRate   {
  
  @SerializedName("attempts")
  private Long attempts = null;

  @SerializedName("connects")
  private Long connects = null;

  @SerializedName("connectRatio")
  private Double connectRatio = null;

  /**
   * Number of call attempts made
   **/
  @ApiModelProperty(value = "Number of call attempts made")
  public Long getAttempts() {
    return attempts;
  }

  /**
   * Number of calls with a live voice detected
   **/
  @ApiModelProperty(value = "Number of calls with a live voice detected")
  public Long getConnects() {
    return connects;
  }

  /**
   * Ratio of connects to attempts
   **/
  @ApiModelProperty(value = "Ratio of connects to attempts")
  public Double getConnectRatio() {
    return connectRatio;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectRate connectRate = (ConnectRate) o;
    return Objects.equals(attempts, connectRate.attempts) &&
        Objects.equals(connects, connectRate.connects) &&
        Objects.equals(connectRatio, connectRate.connectRatio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attempts, connects, connectRatio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectRate {\n");
    
    sb.append("    attempts: ").append(toIndentedString(attempts)).append("\n");
    sb.append("    connects: ").append(toIndentedString(connects)).append("\n");
    sb.append("    connectRatio: ").append(toIndentedString(connectRatio)).append("\n");
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
