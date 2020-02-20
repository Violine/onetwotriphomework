package com.alexander.korovin.onetwotriphomework.model

import com.alexander.korovin.onetwotriphomework.datamodels.Tour
import com.alexander.korovin.onetwotriphomework.network.Endpoints
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class Repository : IRepository {

    @Inject
    lateinit var endpoints : Endpoints

    override fun getTourList(): List<Tour> {
        endpoints.getAviaCompaniesList()
            .subscribeOn(Schedulers.newThread())
            .subscribe()
        return arrayListOf()
    }
}