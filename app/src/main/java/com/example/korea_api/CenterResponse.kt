package com.example.korea_api


import com.google.gson.annotations.SerializedName

data class CenterResponse(
    @SerializedName("TBGGSCREECLSTM")
    val tBGGSCREECLSTM: List<TBGGSCREECLSTM>?
)
data class Head(
    @SerializedName("api_version")
    val apiVersion: String?,
    @SerializedName("list_total_count")
    val listTotalCount: Int?,
    @SerializedName("RESULT")
    val rESULT: RESULT?
)
data class RESULT(
    @SerializedName("CODE")
    val cODE: String?,
    @SerializedName("MESSAGE")
    val mESSAGE: String?
)
data class Row(
    @SerializedName("INST_NM")
    val iNSTNM: String?, // 분당제생병원
    @SerializedName("REFINE_ROADNM_ADDR")
    val rEFINEROADNMADDR: String?, //경기도 성남시 분당구 서현로180번길 20
    @SerializedName("OPR_CONT")
    val oPRCONT: String?, // 09:00 ~ 17:00
    @SerializedName("SAT_OPR_CONT")
    val sATOPRCONT: String?, //09:00 ~ 12:00
    @SerializedName("HOLDY_OPR_CONT")
    val hOLDYOPRCONT: String?, // "미운영"
    @SerializedName("TELNO")
    val tELNO: String?, //"031-779-6594"
    @SerializedName("RM")
    val rM: String?, //도움인력, 전자문진표

    @SerializedName("INST_TELNO")
    val iNSTTELNO: String?, //031-779-3990
    @SerializedName("JURISD_NM")
    val jURISDNM: String?, //성남시 분당구 보건소
    @SerializedName("DATA_STD_DE")
    val dATASTDDE: String?, // 2022-03-10
    @SerializedName("REFINE_LOTNO_ADDR")
    val rEFINELOTNOADDR: String?, //경기도 성남시 분당구 서현동 255-2번지
    @SerializedName("REFINE_WGS84_LAT")
    val rEFINEWGS84LAT: String?, //37.3882075823
    @SerializedName("REFINE_WGS84_LOGT")
    val rEFINEWGS84LOGT: String?, // 127.1217770322
    @SerializedName("REFINE_ZIPNO")
    val rEFINEZIPNO: String?, // 13590
    @SerializedName("SIGUN_NM")
    val sIGUNNM: String? // 성남시

)
data class TBGGSCREECLSTM(
    @SerializedName("head")
    val head: List<Head>?,
    @SerializedName("row")
    val row: List<Row>?
)
