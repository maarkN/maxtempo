package com.maarkn.maxclima.models

data class Results(
    val cid: String,
    val city: String,
    val city_name: String,
    val condition_code: String,
    val condition_slug: String,
    val currently: String,
    val date: String,
    val description: String,
    val previsao: List<Previsao>,
    val humidity: Int,
    val img_id: String,
    val sunrise: String,
    val sunset: String,
    val temp: Int,
    val time: String,
    val wind_speedy: String
)