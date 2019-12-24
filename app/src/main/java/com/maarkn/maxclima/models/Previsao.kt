package com.maarkn.maxclima.models

data class Previsao(
    val condition: String,
    val date: String,
    val description: String,
    val max: Int,
    val min: Int,
    val weekday: String
)