package com.alexander.korovin.onetwotriphomework.datamodels


import com.google.gson.annotations.SerializedName

data class FlightsResponse(
    @SerializedName("flights")
    val flights: List<Flight>
)