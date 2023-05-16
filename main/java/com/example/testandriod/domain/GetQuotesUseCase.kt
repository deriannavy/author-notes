package com.example.testandriod.domain

import com.example.testandriod.data.QuoteRepository
import com.example.testandriod.data.model.QuoteModel
import javax.inject.Inject

class GetQuotesUseCase @Inject constructor(private val repository: QuoteRepository) {

    suspend operator fun invoke(): List<QuoteModel>? = repository.getAllQuotes()


}