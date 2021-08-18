package com.example.mysampleapp.data

import com.google.gson.JsonObject
import retrofit2.http.GET

interface APIs {
    @GET("api/users")
    suspend fun sampleGet(): JsonObject
}