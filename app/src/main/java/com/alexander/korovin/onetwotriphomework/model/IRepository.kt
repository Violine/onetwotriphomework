package com.alexander.korovin.onetwotriphomework.model

import com.alexander.korovin.onetwotriphomework.datamodels.Tour

interface IRepository {
    fun getTourList () : List<Tour>
}