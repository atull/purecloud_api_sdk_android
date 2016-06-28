package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.View;

import com.google.gson.annotations.SerializedName;





public class EmbeddedSignatureView   {
  
  @SerializedName("view")
  private View view = null;

  @SerializedName("envelopeId")
  private String envelopeId = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public View getView() {
    return view;
  }
  public void setView(View view) {
    this.view = view;
  }

  /**
   * Envelope id for the terms and conditions associated with this request.
   **/
  @ApiModelProperty(value = "Envelope id for the terms and conditions associated with this request.")
  public String getEnvelopeId() {
    return envelopeId;
  }
  public void setEnvelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmbeddedSignatureView embeddedSignatureView = (EmbeddedSignatureView) o;
    return Objects.equals(view, embeddedSignatureView.view) &&
        Objects.equals(envelopeId, embeddedSignatureView.envelopeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(view, envelopeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmbeddedSignatureView {\n");
    
    sb.append("    view: ").append(toIndentedString(view)).append("\n");
    sb.append("    envelopeId: ").append(toIndentedString(envelopeId)).append("\n");
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
