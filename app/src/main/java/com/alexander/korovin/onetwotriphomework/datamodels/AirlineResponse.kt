package com.alexander.korovin.onetwotriphomework.datamodels


import com.google.gson.annotations.SerializedName

data class AirlineResponse(
    @SerializedName("companies")
    val airlines: List<Airline>
)