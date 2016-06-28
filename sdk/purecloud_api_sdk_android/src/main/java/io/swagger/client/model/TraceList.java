package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.App;
import io.swagger.client.model.Trace;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class TraceList   {
  
  @SerializedName("app")
  private App app = null;

  @SerializedName("traces")
  private List<Trace> traces = new ArrayList<Trace>();

  /**
   **/
  @ApiModelProperty(value = "")
  public App getApp() {
    return app;
  }
  public void setApp(App app) {
    this.app = app;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Trace> getTraces() {
    return traces;
  }
  public void setTraces(List<Trace> traces) {
    this.traces = traces;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TraceList traceList = (TraceList) o;
    return Objects.equals(app, traceList.app) &&
        Objects.equals(traces, traceList.traces);
  }

  @Override
  public int hashCode() {
    return Objects.hash(app, traces);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TraceList {\n");
    
    sb.append("    app: ").append(toIndentedString(app)).append("\n");
    sb.append("    traces: ").append(toIndentedString(traces)).append("\n");
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
