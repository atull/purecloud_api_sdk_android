package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.PortBillingAddress;
import io.swagger.client.model.PortContact;
import java.util.Date;

import com.google.gson.annotations.SerializedName;





public class NumberOrder   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("did")
  private String did = null;

  @SerializedName("effectiveStartDate")
  private Date effectiveStartDate = null;

  @SerializedName("effectiveEndDate")
  private Date effectiveEndDate = null;

  @SerializedName("lastUpdated")
  private Date lastUpdated = null;

  @SerializedName("startAuthUserId")
  private String startAuthUserId = null;

  @SerializedName("endAuthUserId")
  private String endAuthUserId = null;


  /**
   * Current status of this DID order
   */
  public enum StatusEnum {
    @SerializedName("COMPLETE")
    COMPLETE("COMPLETE"),

    @SerializedName("CONNECTING")
    CONNECTING("CONNECTING"),

    @SerializedName("FAILED")
    FAILED("FAILED"),

    @SerializedName("BACKORDERED")
    BACKORDERED("BACKORDERED"),

    @SerializedName("PENDING")
    PENDING("PENDING"),

    @SerializedName("ACTIVATING")
    ACTIVATING("ACTIVATING"),

    @SerializedName("ACTIVATION_ERROR")
    ACTIVATION_ERROR("ACTIVATION_ERROR"),

    @SerializedName("ERROR")
    ERROR("ERROR"),

    @SerializedName("DISCONNECTED")
    DISCONNECTED("DISCONNECTED"),

    @SerializedName("DISCONNECT_PENDING")
    DISCONNECT_PENDING("DISCONNECT_PENDING"),

    @SerializedName("DEACTIVATING")
    DEACTIVATING("DEACTIVATING"),

    @SerializedName("DEACTIVATION_ERROR")
    DEACTIVATION_ERROR("DEACTIVATION_ERROR"),

    @SerializedName("DISCONNECT_FAILED")
    DISCONNECT_FAILED("DISCONNECT_FAILED"),

    @SerializedName("SUBMITTED")
    SUBMITTED("SUBMITTED"),

    @SerializedName("REJECTED")
    REJECTED("REJECTED"),

    @SerializedName("SUPP")
    SUPP("SUPP"),

    @SerializedName("PORT_PENDING")
    PORT_PENDING("PORT_PENDING"),

    @SerializedName("FOC")
    FOC("FOC");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;


  /**
   * Class of DID being purchased (eg. us-domestic, toll-free, etc)
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

  @SerializedName("porting")
  private Boolean porting = false;

  @SerializedName("billingAddress")
  private PortBillingAddress billingAddress = null;

  @SerializedName("responsibleContact")
  private PortContact responsibleContact = null;

  @SerializedName("companyName")
  private String companyName = null;

  @SerializedName("countryCode")
  private String countryCode = null;

  @SerializedName("envelopeId")
  private String envelopeId = null;

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
   * DID purchased
   **/
  @ApiModelProperty(value = "DID purchased")
  public String getDid() {
    return did;
  }
  public void setDid(String did) {
    this.did = did;
  }

  /**
   * Effective date of service for this order. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Effective date of service for this order. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getEffectiveStartDate() {
    return effectiveStartDate;
  }
  public void setEffectiveStartDate(Date effectiveStartDate) {
    this.effectiveStartDate = effectiveStartDate;
  }

  /**
   * Effective disconnection date for this order. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Effective disconnection date for this order. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getEffectiveEndDate() {
    return effectiveEndDate;
  }
  public void setEffectiveEndDate(Date effectiveEndDate) {
    this.effectiveEndDate = effectiveEndDate;
  }

  /**
   * Date of last update. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  @ApiModelProperty(value = "Date of last update. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  public Date getLastUpdated() {
    return lastUpdated;
  }
  public void setLastUpdated(Date lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  /**
   * UserId authorizing purchase
   **/
  @ApiModelProperty(value = "UserId authorizing purchase")
  public String getStartAuthUserId() {
    return startAuthUserId;
  }
  public void setStartAuthUserId(String startAuthUserId) {
    this.startAuthUserId = startAuthUserId;
  }

  /**
   * UserId authorizing disconnection
   **/
  @ApiModelProperty(value = "UserId authorizing disconnection")
  public String getEndAuthUserId() {
    return endAuthUserId;
  }
  public void setEndAuthUserId(String endAuthUserId) {
    this.endAuthUserId = endAuthUserId;
  }

  /**
   * Current status of this DID order
   **/
  @ApiModelProperty(value = "Current status of this DID order")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   * Class of DID being purchased (eg. us-domestic, toll-free, etc)
   **/
  @ApiModelProperty(value = "Class of DID being purchased (eg. us-domestic, toll-free, etc)")
  public PhoneNumberTypeEnum getPhoneNumberType() {
    return phoneNumberType;
  }
  public void setPhoneNumberType(PhoneNumberTypeEnum phoneNumberType) {
    this.phoneNumberType = phoneNumberType;
  }

  /**
   * Whether or not the number was ported
   **/
  @ApiModelProperty(value = "Whether or not the number was ported")
  public Boolean getPorting() {
    return porting;
  }
  public void setPorting(Boolean porting) {
    this.porting = porting;
  }

  /**
   * Billing address used for a number port
   **/
  @ApiModelProperty(value = "Billing address used for a number port")
  public PortBillingAddress getBillingAddress() {
    return billingAddress;
  }
  public void setBillingAddress(PortBillingAddress billingAddress) {
    this.billingAddress = billingAddress;
  }

  /**
   * Company contact for a number port
   **/
  @ApiModelProperty(value = "Company contact for a number port")
  public PortContact getResponsibleContact() {
    return responsibleContact;
  }
  public void setResponsibleContact(PortContact responsibleContact) {
    this.responsibleContact = responsibleContact;
  }

  /**
   * Company name for a number port
   **/
  @ApiModelProperty(value = "Company name for a number port")
  public String getCompanyName() {
    return companyName;
  }
  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  /**
   * Country dial in codes (telephone dialing prefixes)
   **/
  @ApiModelProperty(value = "Country dial in codes (telephone dialing prefixes)")
  public String getCountryCode() {
    return countryCode;
  }
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  /**
   * Id of the terms and conditions envelope for the order.
   **/
  @ApiModelProperty(value = "Id of the terms and conditions envelope for the order.")
  public String getEnvelopeId() {
    return envelopeId;
  }
  public void setEnvelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
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
    NumberOrder numberOrder = (NumberOrder) o;
    return Objects.equals(id, numberOrder.id) &&
        Objects.equals(name, numberOrder.name) &&
        Objects.equals(did, numberOrder.did) &&
        Objects.equals(effectiveStartDate, numberOrder.effectiveStartDate) &&
        Objects.equals(effectiveEndDate, numberOrder.effectiveEndDate) &&
        Objects.equals(lastUpdated, numberOrder.lastUpdated) &&
        Objects.equals(startAuthUserId, numberOrder.startAuthUserId) &&
        Objects.equals(endAuthUserId, numberOrder.endAuthUserId) &&
        Objects.equals(status, numberOrder.status) &&
        Objects.equals(phoneNumberType, numberOrder.phoneNumberType) &&
        Objects.equals(porting, numberOrder.porting) &&
        Objects.equals(billingAddress, numberOrder.billingAddress) &&
        Objects.equals(responsibleContact, numberOrder.responsibleContact) &&
        Objects.equals(companyName, numberOrder.companyName) &&
        Objects.equals(countryCode, numberOrder.countryCode) &&
        Objects.equals(envelopeId, numberOrder.envelopeId) &&
        Objects.equals(selfUri, numberOrder.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, did, effectiveStartDate, effectiveEndDate, lastUpdated, startAuthUserId, endAuthUserId, status, phoneNumberType, porting, billingAddress, responsibleContact, companyName, countryCode, envelopeId, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumberOrder {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    did: ").append(toIndentedString(did)).append("\n");
    sb.append("    effectiveStartDate: ").append(toIndentedString(effectiveStartDate)).append("\n");
    sb.append("    effectiveEndDate: ").append(toIndentedString(effectiveEndDate)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    startAuthUserId: ").append(toIndentedString(startAuthUserId)).append("\n");
    sb.append("    endAuthUserId: ").append(toIndentedString(endAuthUserId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    phoneNumberType: ").append(toIndentedString(phoneNumberType)).append("\n");
    sb.append("    porting: ").append(toIndentedString(porting)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    responsibleContact: ").append(toIndentedString(responsibleContact)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    envelopeId: ").append(toIndentedString(envelopeId)).append("\n");
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
