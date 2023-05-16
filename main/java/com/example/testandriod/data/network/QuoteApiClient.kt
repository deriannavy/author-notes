package com.example.testandriod.data.network

import com.example.testandriod.data.model.QuoteModel
import retrofit2.Response
import retrofit2.http.GET

interface QuoteApiClient {
    @GET("/json")
    suspend fun getAllQuotes():Response<List<QuoteModel>>
}