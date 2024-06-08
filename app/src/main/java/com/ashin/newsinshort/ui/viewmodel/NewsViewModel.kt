package com.ashin.newsinshort.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ashin.newsinshort.data.api.APIConstants
import com.ashin.newsinshort.data.entity.NewsResponse
import com.ashin.newsinshort.ui.repository.newsRepository
import com.ashin.utilities.ResourceState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import okhttp3.Dispatcher
import javax.inject.Inject

@HiltViewModel
class NewsViewModel @Inject constructor(private val newsRepository: newsRepository):ViewModel() {
  private val _news_loading:MutableStateFlow<ResourceState<NewsResponse>> = MutableStateFlow(ResourceState.Loading())
   val news_loading:StateFlow<ResourceState<NewsResponse>> = _news_loading
  init {
      getNewsHeadLines(APIConstants.COUNTRY)
  }
    fun getNewsHeadLines(country:String)
    {
      viewModelScope.launch(Dispatchers.IO) {
        newsRepository.getNewsHeadLines(country).collectLatest { newsResponse->
          _news_loading.value=newsResponse
        }
      }
    }
    companion object{

    }
}