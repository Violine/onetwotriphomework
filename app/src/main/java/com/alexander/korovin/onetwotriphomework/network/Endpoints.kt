package com.alexander.korovin.onetwotriphomework.network

import com.alexander.korovin.onetwotriphomework.datamodels.AirlineResponse
import com.alexander.korovin.onetwotriphomework.datamodels.FlightsResponse
import com.alexander.korovin.onetwotriphomework.datamodels.HotelsResponse
import io.reactivex.Observable
import retrofit2.http.GET

interface Endpoints {
    @GET("8d024")
    fun getAviaCompaniesList() : Observable<AirlineResponse>

    @GET ("12q3ws")
    fun getHotelsList() : Observable<HotelsResponse>

    @GET ("zqxvw")
    fun getFlightsList() : Observable<FlightsResponse>
}