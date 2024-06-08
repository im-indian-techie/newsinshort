package com.ashin.newsinshort.ui.repository

import android.util.Log
import com.ashin.newsinshort.data.datasource.NewsDataSource
import com.ashin.newsinshort.data.entity.NewsResponse
import com.ashin.utilities.ResourceState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import retrofit2.Response
import javax.inject.Inject

class newsRepository @Inject constructor(private val newsDataSource: NewsDataSource) {


    suspend fun getNewsHeadLines(country: String) : Flow<ResourceState<NewsResponse>>
    {
        return flow{
            emit(ResourceState.Loading())
            val response=newsDataSource.getNewsHeadline(country)
            if(response.isSuccessful && response.body()!=null)
            {
                emit(ResourceState.Success(response.body()!!))
            }
            else
            {
                emit(ResourceState.Error("Some error occured"))
            }
        }.catch { e->
            emit(ResourceState.Error(e.localizedMessage))
            Log.d("error",e.message!!)
        }
    }
}