package com.ashin.newsinshort.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.ashin.newsinshort.R
import com.ashin.newsinshort.data.entity.Article
import com.ashin.newsinshort.data.entity.NewsResponse


@Composable
fun Loader()
{
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        CircularProgressIndicator(
            modifier =
            Modifier
                .size(50.dp)
                .padding(10.dp),
            color = Color.Blue
        )
    }

}

@Preview
@Composable
fun LoaderPreview()
{
    Loader()
}

@Composable
fun NewsList(res: NewsResponse)
{
  LazyColumn{
      items(res.articles!!)
      {
        articles->
          NormalTextComponent(text = articles.title!!?:"NA")
      }
  }
}
@Composable
fun NormalTextComponent(text:String)
{
    Text(modifier = Modifier
        .fillMaxWidth()
        .wrapContentWidth()
        .padding(8.dp),
        text =text,
        style = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.Normal, fontFamily = FontFamily.SansSerif))
}
@Composable
fun HeadingTextComponent(text:String)
{
    Text(modifier = Modifier
        .fillMaxWidth()
        .wrapContentWidth()
        .padding(8.dp),
        text =text,
        style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold))
}
@Composable
fun NewsRowComponent(page: Int, get: Article)
{
  Column(
      modifier = Modifier
          .fillMaxSize()
          .padding(8.dp)
          .background(Color.White)
  ) {
     AsyncImage(modifier = Modifier
         .fillMaxWidth()
         .height(100.dp),
         model = get.urlToImage,
         contentScale = ContentScale.Crop,
         placeholder = painterResource(id = R.drawable.user),
         error= painterResource(id = R.drawable.user),
         contentDescription = "")
      Spacer(modifier = Modifier.size(20.dp))
      HeadingTextComponent(text = get.title?:"")
      Spacer(modifier = Modifier.size(20.dp))
      NormalTextComponent(text = get.description?:"")

  }

}


