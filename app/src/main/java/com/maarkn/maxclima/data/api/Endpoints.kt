package com.maarkn.maxclima.data.api

import retrofit2.http.GET
import retrofit2.http.Query

const val API_KEY = "f5dcab04"

interface Endpoints {

    // https://api.hgbrasil.com/weather?key=f5dcab04&city_name=Goiania,GO

    @GET("")
    fun getForecastByCity(
        @Query(value = "city_name") city_name: String
    )

}