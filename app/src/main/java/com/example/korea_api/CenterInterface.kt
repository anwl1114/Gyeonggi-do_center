package com.example.korea_api

import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CenterInterface {
    @GET("TBGGSCREECLSTM")
    fun getCenterData(@Query("KEY")KEY : String,
    @Query("Type")Type:String):Call<CenterResponse>

    @GET("TBGGSCREECLSTM")
    suspend fun getDataCon(
        @Query("KEY") KEY: String,
        @Query("Type") Type: String
    ) : Response<CenterResponse>
}