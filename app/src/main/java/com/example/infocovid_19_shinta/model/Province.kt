package com.example.infocovid_19_shinta.model

import com.google.gson.annotations.SerializedName

data class Province(
    @SerializedName("Kode Provi")
    val code: Int,
    @SerializedName("Provinsi")
    val province: String,
    @SerializedName("Kasus Provi")
    val positif: Int,
    @SerializedName("Kasus Semb")
    val recover: Int,
    @SerializedName("Kasus Meni")
    val death: Int
)