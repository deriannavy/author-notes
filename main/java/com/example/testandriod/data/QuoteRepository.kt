package com.example.testandriod.data

import com.example.testandriod.data.model.QuoteModel
import com.example.testandriod.data.model.QuoteProvider
import com.example.testandriod.data.network.QuoteService
import javax.inject.Inject

class QuoteRepository @Inject constructor(
    private val api: QuoteService,
    private val quoteProvider: QuoteProvider
){

    suspend fun getAllQuotes(): List<QuoteModel>{
        val response = api.getQuotes()
        quoteProvider.quotes = response
        return response
    }
}