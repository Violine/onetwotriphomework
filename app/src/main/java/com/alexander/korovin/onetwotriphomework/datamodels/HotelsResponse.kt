package com.alexander.korovin.onetwotriphomework.datamodels


import com.google.gson.annotations.SerializedName

data class HotelsResponse(
    @SerializedName("hotels")
    val hotels: List<Hotel>
)