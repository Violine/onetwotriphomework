package com.alexander.korovin.onetwotriphomework.datamodels


import com.google.gson.annotations.SerializedName

data class Airline(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String
)