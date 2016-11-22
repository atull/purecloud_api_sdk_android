package com.mypurecloud.sdk.model;

import java.util.Objects;
import com.mypurecloud.sdk.model.FacetStatistics;
import com.mypurecloud.sdk.model.FacetTerm;
import com.mypurecloud.sdk.model.TermAttribute;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class FacetEntry  implements Serializable {
  
  @SerializedName("attribute")
  private TermAttribute attribute = null;

  @SerializedName("statistics")
  private FacetStatistics statistics = null;

  @SerializedName("other")
  private Long other = null;

  @SerializedName("total")
  private Long total = null;

  @SerializedName("missing")
  private Long missing = null;

  @SerializedName("termCount")
  private Integer termCount = null;


  /**
   * Gets or Sets termType
   */
  public enum TermTypeEnum {
    @SerializedName("OutdatedSdkVersion")
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),

    @SerializedName("TERM")
    TERM("TERM"),

    @SerializedName("NUMBERRANGE")
    NUMBERRANGE("NUMBERRANGE"),

    @SerializedName("NUMBERHISTOGRAM")
    NUMBERHISTOGRAM("NUMBERHISTOGRAM"),

    @SerializedName("DATERANGE")
    DATERANGE("DATERANGE"),

    @SerializedName("DATEHISTOGRAM")
    DATEHISTOGRAM("DATEHISTOGRAM"),

    @SerializedName("ID")
    ID("ID");

    private String value;

    TermTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("termType")
  private TermTypeEnum termType = null;

  @SerializedName("terms")
  private List<FacetTerm> terms = new ArrayList<FacetTerm>();

  /**
   **/
  @ApiModelProperty(value = "")
  public TermAttribute getAttribute() {
    return attribute;
  }
  public void setAttribute(TermAttribute attribute) {
    this.attribute = attribute;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public FacetStatistics getStatistics() {
    return statistics;
  }
  public void setStatistics(FacetStatistics statistics) {
    this.statistics = statistics;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getOther() {
    return other;
  }
  public void setOther(Long other) {
    this.other = other;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getTotal() {
    return total;
  }
  public void setTotal(Long total) {
    this.total = total;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getMissing() {
    return missing;
  }
  public void setMissing(Long missing) {
    this.missing = missing;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getTermCount() {
    return termCount;
  }
  public void setTermCount(Integer termCount) {
    this.termCount = termCount;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TermTypeEnum getTermType() {
    return termType;
  }
  public void setTermType(TermTypeEnum termType) {
    this.termType = termType;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<FacetTerm> getTerms() {
    return terms;
  }
  public void setTerms(List<FacetTerm> terms) {
    this.terms = terms;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FacetEntry facetEntry = (FacetEntry) o;
    return Objects.equals(attribute, facetEntry.attribute) &&
        Objects.equals(statistics, facetEntry.statistics) &&
        Objects.equals(other, facetEntry.other) &&
        Objects.equals(total, facetEntry.total) &&
        Objects.equals(missing, facetEntry.missing) &&
        Objects.equals(termCount, facetEntry.termCount) &&
        Objects.equals(termType, facetEntry.termType) &&
        Objects.equals(terms, facetEntry.terms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attribute, statistics, other, total, missing, termCount, termType, terms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacetEntry {\n");
    
    sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
    sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
    sb.append("    other: ").append(toIndentedString(other)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    missing: ").append(toIndentedString(missing)).append("\n");
    sb.append("    termCount: ").append(toIndentedString(termCount)).append("\n");
    sb.append("    termType: ").append(toIndentedString(termType)).append("\n");
    sb.append("    terms: ").append(toIndentedString(terms)).append("\n");
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
