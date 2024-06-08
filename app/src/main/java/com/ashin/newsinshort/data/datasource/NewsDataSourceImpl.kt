package com.ashin.newsinshort.data.datasource

import com.ashin.newsinshort.data.api.APIConstants
import com.ashin.newsinshort.data.api.ApiService
import com.ashin.newsinshort.data.entity.NewsResponse
import retrofit2.Response
import javax.inject.Inject

class NewsDataSourceImpl @Inject constructor(private val apiService: ApiService):NewsDataSource {
    override suspend fun getNewsHeadline(country: String): Response<NewsResponse> {
        return apiService.getHeadLines(country,APIConstants.API_KEY)
    }
}