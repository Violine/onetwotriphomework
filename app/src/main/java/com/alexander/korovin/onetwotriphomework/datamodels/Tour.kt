package com.alexander.korovin.onetwotriphomework.datamodels

data class Tour(val hotelName: String, val flights: List<Flight>) {

    fun getMinPrice(): Int {
        var min = flights[0].price
        for (flight in flights) {
            if (flight.price < min) {
                min = flight.price
            }
        }
        return min
    }

    fun getFlightCount(): Int {
        return flights.size
    }
}