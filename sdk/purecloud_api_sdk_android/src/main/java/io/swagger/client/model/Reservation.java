package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import com.google.gson.annotations.SerializedName;





public class Reservation   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("reservedTn")
  private String reservedTn = null;

  @SerializedName("reservationExpires")
  private Date reservationExpires = null;


  /**
   * The type of phone number (eg us-domestic, toll-free, etc).
   */
  public enum PhoneNumberTypeEnum {
    @SerializedName("TOLL_FREE")
    TOLL_FREE("TOLL_FREE"),

    @SerializedName("CN_DOMESTIC")
    CN_DOMESTIC("CN_DOMESTIC"),

    @SerializedName("US_DOMESTIC")
    US_DOMESTIC("US_DOMESTIC"),

    @SerializedName("US_TOLLFREE")
    US_TOLLFREE("US_TOLLFREE"),

    @SerializedName("XA_TOLLFREE")
    XA_TOLLFREE("XA_TOLLFREE"),

    @SerializedName("XB_TOLLFREE")
    XB_TOLLFREE("XB_TOLLFREE"),

    @SerializedName("XC_TOLLFREE")
    XC_TOLLFREE("XC_TOLLFREE"),

    @SerializedName("AG_DID")
    AG_DID("AG_DID"),

    @SerializedName("AI_DID")
    AI_DID("AI_DID"),

    @SerializedName("BB_DID")
    BB_DID("BB_DID"),

    @SerializedName("BM_DID")
    BM_DID("BM_DID"),

    @SerializedName("BS_DID")
    BS_DID("BS_DID"),

    @SerializedName("CA_DID")
    CA_DID("CA_DID"),

    @SerializedName("DM_DID")
    DM_DID("DM_DID"),

    @SerializedName("DO_DID")
    DO_DID("DO_DID"),

    @SerializedName("GD_DID")
    GD_DID("GD_DID"),

    @SerializedName("JM_DID")
    JM_DID("JM_DID"),

    @SerializedName("KN_DID")
    KN_DID("KN_DID"),

    @SerializedName("KY_DID")
    KY_DID("KY_DID"),

    @SerializedName("KZ_DID")
    KZ_DID("KZ_DID"),

    @SerializedName("LC_DID")
    LC_DID("LC_DID"),

    @SerializedName("MP_DID")
    MP_DID("MP_DID"),

    @SerializedName("MS_DID")
    MS_DID("MS_DID"),

    @SerializedName("RU_DID")
    RU_DID("RU_DID"),

    @SerializedName("TC_DID")
    TC_DID("TC_DID"),

    @SerializedName("TT_DID")
    TT_DID("TT_DID"),

    @SerializedName("US_DID")
    US_DID("US_DID"),

    @SerializedName("VC_DID")
    VC_DID("VC_DID"),

    @SerializedName("VG_DID")
    VG_DID("VG_DID"),

    @SerializedName("AF_DID")
    AF_DID("AF_DID"),

    @SerializedName("AR_DID")
    AR_DID("AR_DID"),

    @SerializedName("AT_DID")
    AT_DID("AT_DID"),

    @SerializedName("AU_DID")
    AU_DID("AU_DID"),

    @SerializedName("BE_DID")
    BE_DID("BE_DID"),

    @SerializedName("BR_DID")
    BR_DID("BR_DID"),

    @SerializedName("CH_DID")
    CH_DID("CH_DID"),

    @SerializedName("CL_DID")
    CL_DID("CL_DID"),

    @SerializedName("CN_DID")
    CN_DID("CN_DID"),

    @SerializedName("CO_DID")
    CO_DID("CO_DID"),

    @SerializedName("CU_DID")
    CU_DID("CU_DID"),

    @SerializedName("DE_DID")
    DE_DID("DE_DID"),

    @SerializedName("DK_DID")
    DK_DID("DK_DID"),

    @SerializedName("EG_DID")
    EG_DID("EG_DID"),

    @SerializedName("ES_DID")
    ES_DID("ES_DID"),

    @SerializedName("FR_DID")
    FR_DID("FR_DID"),

    @SerializedName("GB_DID")
    GB_DID("GB_DID"),

    @SerializedName("GR_DID")
    GR_DID("GR_DID"),

    @SerializedName("HU_DID")
    HU_DID("HU_DID"),

    @SerializedName("ID_DID")
    ID_DID("ID_DID"),

    @SerializedName("IN_DID")
    IN_DID("IN_DID"),

    @SerializedName("IR_DID")
    IR_DID("IR_DID"),

    @SerializedName("IT_DID")
    IT_DID("IT_DID"),

    @SerializedName("JP_DID")
    JP_DID("JP_DID"),

    @SerializedName("KR_DID")
    KR_DID("KR_DID"),

    @SerializedName("LK_DID")
    LK_DID("LK_DID"),

    @SerializedName("MM_DID")
    MM_DID("MM_DID"),

    @SerializedName("MX_DID")
    MX_DID("MX_DID"),

    @SerializedName("MY_DID")
    MY_DID("MY_DID"),

    @SerializedName("NL_DID")
    NL_DID("NL_DID"),

    @SerializedName("NO_DID")
    NO_DID("NO_DID"),

    @SerializedName("NZ_DID")
    NZ_DID("NZ_DID"),

    @SerializedName("PE_DID")
    PE_DID("PE_DID"),

    @SerializedName("PH_DID")
    PH_DID("PH_DID"),

    @SerializedName("PK_DID")
    PK_DID("PK_DID"),

    @SerializedName("PL_DID")
    PL_DID("PL_DID"),

    @SerializedName("RO_DID")
    RO_DID("RO_DID"),

    @SerializedName("SE_DID")
    SE_DID("SE_DID"),

    @SerializedName("SG_DID")
    SG_DID("SG_DID"),

    @SerializedName("TH_DID")
    TH_DID("TH_DID"),

    @SerializedName("TR_DID")
    TR_DID("TR_DID"),

    @SerializedName("VE_DID")
    VE_DID("VE_DID"),

    @SerializedName("VN_DID")
    VN_DID("VN_DID"),

    @SerializedName("ZA_DID")
    ZA_DID("ZA_DID"),

    @SerializedName("AD_DID")
    AD_DID("AD_DID"),

    @SerializedName("AE_DID")
    AE_DID("AE_DID"),

    @SerializedName("AL_DID")
    AL_DID("AL_DID"),

    @SerializedName("AM_DID")
    AM_DID("AM_DID"),

    @SerializedName("AO_DID")
    AO_DID("AO_DID"),

    @SerializedName("AQ_DID")
    AQ_DID("AQ_DID"),

    @SerializedName("AW_DID")
    AW_DID("AW_DID"),

    @SerializedName("AZ_DID")
    AZ_DID("AZ_DID"),

    @SerializedName("BA_DID")
    BA_DID("BA_DID"),

    @SerializedName("BD_DID")
    BD_DID("BD_DID"),

    @SerializedName("BF_DID")
    BF_DID("BF_DID"),

    @SerializedName("BG_DID")
    BG_DID("BG_DID"),

    @SerializedName("BH_DID")
    BH_DID("BH_DID"),

    @SerializedName("BI_DID")
    BI_DID("BI_DID"),

    @SerializedName("BJ_DID")
    BJ_DID("BJ_DID"),

    @SerializedName("BL_DID")
    BL_DID("BL_DID"),

    @SerializedName("BN_DID")
    BN_DID("BN_DID"),

    @SerializedName("BO_DID")
    BO_DID("BO_DID"),

    @SerializedName("BQ_DID")
    BQ_DID("BQ_DID"),

    @SerializedName("BT_DID")
    BT_DID("BT_DID"),

    @SerializedName("BW_DID")
    BW_DID("BW_DID"),

    @SerializedName("BY_DID")
    BY_DID("BY_DID"),

    @SerializedName("BZ_DID")
    BZ_DID("BZ_DID"),

    @SerializedName("CD_DID")
    CD_DID("CD_DID"),

    @SerializedName("CF_DID")
    CF_DID("CF_DID"),

    @SerializedName("CG_DID")
    CG_DID("CG_DID"),

    @SerializedName("CI_DID")
    CI_DID("CI_DID"),

    @SerializedName("CK_DID")
    CK_DID("CK_DID"),

    @SerializedName("CM_DID")
    CM_DID("CM_DID"),

    @SerializedName("CR_DID")
    CR_DID("CR_DID"),

    @SerializedName("CV_DID")
    CV_DID("CV_DID"),

    @SerializedName("CY_DID")
    CY_DID("CY_DID"),

    @SerializedName("CZ_DID")
    CZ_DID("CZ_DID"),

    @SerializedName("DJ_DID")
    DJ_DID("DJ_DID"),

    @SerializedName("DZ_DID")
    DZ_DID("DZ_DID"),

    @SerializedName("EC_DID")
    EC_DID("EC_DID"),

    @SerializedName("EE_DID")
    EE_DID("EE_DID"),

    @SerializedName("EH_DID")
    EH_DID("EH_DID"),

    @SerializedName("ER_DID")
    ER_DID("ER_DID"),

    @SerializedName("ET_DID")
    ET_DID("ET_DID"),

    @SerializedName("FI_DID")
    FI_DID("FI_DID"),

    @SerializedName("FJ_DID")
    FJ_DID("FJ_DID"),

    @SerializedName("FK_DID")
    FK_DID("FK_DID"),

    @SerializedName("FM_DID")
    FM_DID("FM_DID"),

    @SerializedName("FO_DID")
    FO_DID("FO_DID"),

    @SerializedName("GA_DID")
    GA_DID("GA_DID"),

    @SerializedName("GE_DID")
    GE_DID("GE_DID"),

    @SerializedName("GF_DID")
    GF_DID("GF_DID"),

    @SerializedName("GH_DID")
    GH_DID("GH_DID"),

    @SerializedName("GI_DID")
    GI_DID("GI_DID"),

    @SerializedName("GL_DID")
    GL_DID("GL_DID"),

    @SerializedName("GM_DID")
    GM_DID("GM_DID"),

    @SerializedName("GN_DID")
    GN_DID("GN_DID"),

    @SerializedName("GP_DID")
    GP_DID("GP_DID"),

    @SerializedName("GQ_DID")
    GQ_DID("GQ_DID"),

    @SerializedName("GT_DID")
    GT_DID("GT_DID"),

    @SerializedName("GW_DID")
    GW_DID("GW_DID"),

    @SerializedName("GY_DID")
    GY_DID("GY_DID"),

    @SerializedName("HK_DID")
    HK_DID("HK_DID"),

    @SerializedName("HN_DID")
    HN_DID("HN_DID"),

    @SerializedName("HR_DID")
    HR_DID("HR_DID"),

    @SerializedName("HT_DID")
    HT_DID("HT_DID"),

    @SerializedName("IE_DID")
    IE_DID("IE_DID"),

    @SerializedName("IL_DID")
    IL_DID("IL_DID"),

    @SerializedName("IO_DID")
    IO_DID("IO_DID"),

    @SerializedName("IQ_DID")
    IQ_DID("IQ_DID"),

    @SerializedName("IS_DID")
    IS_DID("IS_DID"),

    @SerializedName("JO_DID")
    JO_DID("JO_DID"),

    @SerializedName("KE_DID")
    KE_DID("KE_DID"),

    @SerializedName("KG_DID")
    KG_DID("KG_DID"),

    @SerializedName("KH_DID")
    KH_DID("KH_DID"),

    @SerializedName("KI_DID")
    KI_DID("KI_DID"),

    @SerializedName("KM_DID")
    KM_DID("KM_DID"),

    @SerializedName("KP_DID")
    KP_DID("KP_DID"),

    @SerializedName("KW_DID")
    KW_DID("KW_DID"),

    @SerializedName("LA_DID")
    LA_DID("LA_DID"),

    @SerializedName("LB_DID")
    LB_DID("LB_DID"),

    @SerializedName("LI_DID")
    LI_DID("LI_DID"),

    @SerializedName("LR_DID")
    LR_DID("LR_DID"),

    @SerializedName("LS_DID")
    LS_DID("LS_DID"),

    @SerializedName("LT_DID")
    LT_DID("LT_DID"),

    @SerializedName("LU_DID")
    LU_DID("LU_DID"),

    @SerializedName("LV_DID")
    LV_DID("LV_DID"),

    @SerializedName("LY_DID")
    LY_DID("LY_DID"),

    @SerializedName("MA_DID")
    MA_DID("MA_DID"),

    @SerializedName("MC_DID")
    MC_DID("MC_DID"),

    @SerializedName("MD_DID")
    MD_DID("MD_DID"),

    @SerializedName("ME_DID")
    ME_DID("ME_DID"),

    @SerializedName("MF_DID")
    MF_DID("MF_DID"),

    @SerializedName("MG_DID")
    MG_DID("MG_DID"),

    @SerializedName("MH_DID")
    MH_DID("MH_DID"),

    @SerializedName("MK_DID")
    MK_DID("MK_DID"),

    @SerializedName("ML_DID")
    ML_DID("ML_DID"),

    @SerializedName("MN_DID")
    MN_DID("MN_DID"),

    @SerializedName("MO_DID")
    MO_DID("MO_DID"),

    @SerializedName("MQ_DID")
    MQ_DID("MQ_DID"),

    @SerializedName("MR_DID")
    MR_DID("MR_DID"),

    @SerializedName("MT_DID")
    MT_DID("MT_DID"),

    @SerializedName("MU_DID")
    MU_DID("MU_DID"),

    @SerializedName("MV_DID")
    MV_DID("MV_DID"),

    @SerializedName("MW_DID")
    MW_DID("MW_DID"),

    @SerializedName("MZ_DID")
    MZ_DID("MZ_DID"),

    @SerializedName("NA_DID")
    NA_DID("NA_DID"),

    @SerializedName("NC_DID")
    NC_DID("NC_DID"),

    @SerializedName("NE_DID")
    NE_DID("NE_DID"),

    @SerializedName("NF_DID")
    NF_DID("NF_DID"),

    @SerializedName("NG_DID")
    NG_DID("NG_DID"),

    @SerializedName("NI_DID")
    NI_DID("NI_DID"),

    @SerializedName("NP_DID")
    NP_DID("NP_DID"),

    @SerializedName("NR_DID")
    NR_DID("NR_DID"),

    @SerializedName("NU_DID")
    NU_DID("NU_DID"),

    @SerializedName("OM_DID")
    OM_DID("OM_DID"),

    @SerializedName("PA_DID")
    PA_DID("PA_DID"),

    @SerializedName("PF_DID")
    PF_DID("PF_DID"),

    @SerializedName("PG_DID")
    PG_DID("PG_DID"),

    @SerializedName("PM_DID")
    PM_DID("PM_DID"),

    @SerializedName("PS_DID")
    PS_DID("PS_DID"),

    @SerializedName("PT_DID")
    PT_DID("PT_DID"),

    @SerializedName("PW_DID")
    PW_DID("PW_DID"),

    @SerializedName("PY_DID")
    PY_DID("PY_DID"),

    @SerializedName("QA_DID")
    QA_DID("QA_DID"),

    @SerializedName("RE_DID")
    RE_DID("RE_DID"),

    @SerializedName("RS_DID")
    RS_DID("RS_DID"),

    @SerializedName("RW_DID")
    RW_DID("RW_DID"),

    @SerializedName("SA_DID")
    SA_DID("SA_DID"),

    @SerializedName("SB_DID")
    SB_DID("SB_DID"),

    @SerializedName("SC_DID")
    SC_DID("SC_DID"),

    @SerializedName("SD_DID")
    SD_DID("SD_DID"),

    @SerializedName("SH_247_DID")
    SH_247_DID("SH_247_DID"),

    @SerializedName("SH_290_DID")
    SH_290_DID("SH_290_DID"),

    @SerializedName("SI_DID")
    SI_DID("SI_DID"),

    @SerializedName("SK_DID")
    SK_DID("SK_DID"),

    @SerializedName("SL_DID")
    SL_DID("SL_DID"),

    @SerializedName("SM_DID")
    SM_DID("SM_DID"),

    @SerializedName("SN_DID")
    SN_DID("SN_DID"),

    @SerializedName("SO_DID")
    SO_DID("SO_DID"),

    @SerializedName("SR_DID")
    SR_DID("SR_DID"),

    @SerializedName("SS_DID")
    SS_DID("SS_DID"),

    @SerializedName("ST_DID")
    ST_DID("ST_DID"),

    @SerializedName("SV_DID")
    SV_DID("SV_DID"),

    @SerializedName("SY_DID")
    SY_DID("SY_DID"),

    @SerializedName("SZ_DID")
    SZ_DID("SZ_DID"),

    @SerializedName("TD_DID")
    TD_DID("TD_DID"),

    @SerializedName("TG_DID")
    TG_DID("TG_DID"),

    @SerializedName("TJ_DID")
    TJ_DID("TJ_DID"),

    @SerializedName("TK_DID")
    TK_DID("TK_DID"),

    @SerializedName("TL_DID")
    TL_DID("TL_DID"),

    @SerializedName("TM_DID")
    TM_DID("TM_DID"),

    @SerializedName("TN_DID")
    TN_DID("TN_DID"),

    @SerializedName("TO_DID")
    TO_DID("TO_DID"),

    @SerializedName("TV_DID")
    TV_DID("TV_DID"),

    @SerializedName("TW_DID")
    TW_DID("TW_DID"),

    @SerializedName("TZ_DID")
    TZ_DID("TZ_DID"),

    @SerializedName("UA_DID")
    UA_DID("UA_DID"),

    @SerializedName("UG_DID")
    UG_DID("UG_DID"),

    @SerializedName("UY_DID")
    UY_DID("UY_DID"),

    @SerializedName("UZ_DID")
    UZ_DID("UZ_DID"),

    @SerializedName("VU_DID")
    VU_DID("VU_DID"),

    @SerializedName("WF_DID")
    WF_DID("WF_DID"),

    @SerializedName("WS_DID")
    WS_DID("WS_DID"),

    @SerializedName("XG_DID")
    XG_DID("XG_DID"),

    @SerializedName("XN_DID")
    XN_DID("XN_DID"),

    @SerializedName("XV_882_DID")
    XV_882_DID("XV_882_DID"),

    @SerializedName("XV_883_DID")
    XV_883_DID("XV_883_DID"),

    @SerializedName("YE_DID")
    YE_DID("YE_DID"),

    @SerializedName("YT_DID")
    YT_DID("YT_DID"),

    @SerializedName("ZM_DID")
    ZM_DID("ZM_DID"),

    @SerializedName("ZW_DID")
    ZW_DID("ZW_DID"),

    @SerializedName("SX_DID")
    SX_DID("SX_DID");

    private String value;

    PhoneNumberTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("phoneNumberType")
  private PhoneNumberTypeEnum phoneNumberType = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getReservedTn() {
    return reservedTn;
  }
  public void setReservedTn(String reservedTn) {
    this.reservedTn = reservedTn;
  }

  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getReservationExpires() {
    return reservationExpires;
  }
  public void setReservationExpires(Date reservationExpires) {
    this.reservationExpires = reservationExpires;
  }

  /**
   * The type of phone number (eg us-domestic, toll-free, etc).
   **/
  @ApiModelProperty(value = "The type of phone number (eg us-domestic, toll-free, etc).")
  public PhoneNumberTypeEnum getPhoneNumberType() {
    return phoneNumberType;
  }
  public void setPhoneNumberType(PhoneNumberTypeEnum phoneNumberType) {
    this.phoneNumberType = phoneNumberType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reservation reservation = (Reservation) o;
    return Objects.equals(id, reservation.id) &&
        Objects.equals(reservedTn, reservation.reservedTn) &&
        Objects.equals(reservationExpires, reservation.reservationExpires) &&
        Objects.equals(phoneNumberType, reservation.phoneNumberType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, reservedTn, reservationExpires, phoneNumberType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reservation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    reservedTn: ").append(toIndentedString(reservedTn)).append("\n");
    sb.append("    reservationExpires: ").append(toIndentedString(reservationExpires)).append("\n");
    sb.append("    phoneNumberType: ").append(toIndentedString(phoneNumberType)).append("\n");
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
