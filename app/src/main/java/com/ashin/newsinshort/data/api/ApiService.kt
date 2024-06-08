package com.ashin.newsinshort.data.api

import com.ashin.newsinshort.data.entity.NewsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET(APIConstants.HEAD_LINES)
    suspend fun getHeadLines(@Query("country")country:String,@Query("apiKey")apiKey:String):Response<NewsResponse>
}
//GET https://newsapi.org/v2/top-headlines?country=us&apiKey=c1e8d3b65b634e03954428369547d420
