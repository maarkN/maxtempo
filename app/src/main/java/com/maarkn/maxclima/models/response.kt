package com.maarkn.maxclima.models

data class response(
    val `by`: String,
    val execution_time: Int,
    val from_cache: Boolean,
    val results: Results,
    val valid_key: Boolean
)