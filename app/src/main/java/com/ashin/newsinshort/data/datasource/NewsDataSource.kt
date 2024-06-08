package com.ashin.newsinshort.data.datasource

import com.ashin.newsinshort.data.entity.NewsResponse
import retrofit2.Response

interface NewsDataSource {
    suspend fun getNewsHeadline(country:String):Response<NewsResponse>
}