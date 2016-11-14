package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.AnalyticsProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class PropertyIndexRequest  implements Serializable {
  
  @SerializedName("sessionId")
  private String sessionId = null;

  @SerializedName("timestamp")
  private Long timestamp = null;

  @SerializedName("properties")
  private List<AnalyticsProperty> properties = new ArrayList<AnalyticsProperty>();

  /**
   * Attach properties to a segment in the indicated session. Also requires a timestamp.
   **/
  @ApiModelProperty(value = "Attach properties to a segment in the indicated session. Also requires a timestamp.")
  public String getSessionId() {
    return sessionId;
  }
  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }

  /**
   * Attach properties to a segment covering a specific point in time. Also requries a sessionId.
   **/
  @ApiModelProperty(value = "Attach properties to a segment covering a specific point in time. Also requries a sessionId.")
  public Long getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  /**
   * The list of properties to index
   **/
  @ApiModelProperty(required = true, value = "The list of properties to index")
  public List<AnalyticsProperty> getProperties() {
    return properties;
  }
  public void setProperties(List<AnalyticsProperty> properties) {
    this.properties = properties;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropertyIndexRequest propertyIndexRequest = (PropertyIndexRequest) o;
    return Objects.equals(sessionId, propertyIndexRequest.sessionId) &&
        Objects.equals(timestamp, propertyIndexRequest.timestamp) &&
        Objects.equals(properties, propertyIndexRequest.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionId, timestamp, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertyIndexRequest {\n");
    
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
