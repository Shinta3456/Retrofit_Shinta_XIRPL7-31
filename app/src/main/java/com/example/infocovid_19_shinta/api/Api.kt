package com.example.infocovid_19_shinta.api

import com.example.infocovid_19_shinta.model.IndonesiaResponse
import com.example.infocovid_19_shinta.model.ProvinceResponse
import retrofit2.Call
import retrofit2.http.GET

interface Api {
    @GET("casenumber.json")
    fun getIndonesia(): Call<ArrayList<IndonesiaResponse>>

    @GET("casenumberprovince.json")
    fun getProvince(): Call<ArrayList<ProvinceResponse>>
}