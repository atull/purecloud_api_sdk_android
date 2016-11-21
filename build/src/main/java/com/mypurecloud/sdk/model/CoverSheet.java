package com.mypurecloud.sdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class CoverSheet  implements Serializable {
  
  @SerializedName("notes")
  private String notes = null;

  @SerializedName("locale")
  private String locale = null;

  /**
   * Text to be added to the coversheet
   **/
  @ApiModelProperty(value = "Text to be added to the coversheet")
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
  }

  /**
   * Locale, e.g. = en-US
   **/
  @ApiModelProperty(value = "Locale, e.g. = en-US")
  public String getLocale() {
    return locale;
  }
  public void setLocale(String locale) {
    this.locale = locale;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoverSheet coverSheet = (CoverSheet) o;
    return Objects.equals(notes, coverSheet.notes) &&
        Objects.equals(locale, coverSheet.locale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notes, locale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoverSheet {\n");
    
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
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
