package com.benidict.domain.ext

import com.google.gson.Gson

fun gson() = Gson()

fun Any.convertObjectToJsonString(): String {
    return gson().toJson(this)
}

inline fun <reified T: Any> convertStringToObject(json: String): T =
    gson().fromJson(json, T::class.java)