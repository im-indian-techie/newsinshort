package com.ashin.newsinshort.ui.screen

import android.util.Log
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.ashin.newsinshort.ui.components.Loader
import com.ashin.newsinshort.ui.components.NewsRowComponent
import com.ashin.newsinshort.ui.viewmodel.NewsViewModel
import com.ashin.utilities.ResourceState

const val TAG="HomeScreen"
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen(newsViewModel: NewsViewModel = hiltViewModel())
{
    val news by newsViewModel.news_loading.collectAsState()
    val pagerState= rememberPagerState(
        initialPage = 0,
        initialPageOffsetFraction = 0f
    ) {
        100
    }
    VerticalPager(state=pagerState,
        modifier = Modifier.fillMaxSize(),
        pageSize = PageSize.Fill,
        pageSpacing = 8.dp) {
        page: Int ->
        when(news)
            {
                is ResourceState.Loading<*> ->{
                    Log.d(TAG,"Inside Loading")
                    Loader()
                }
                is ResourceState.Success<*> -> {
                    Log.d(TAG,"Inside Success")
                    val res=(news as ResourceState.Success).data
                    //NewsList(res)
                    NewsRowComponent(page,res.articles!!.get(page))
                }
                is ResourceState.Error<*>->
                {
                    Log.d(TAG,"Inside Error")
                }

            
            }
    }


}
@Preview
@Composable
fun HomeScreenPreview()
{
    HomeScreen()
}