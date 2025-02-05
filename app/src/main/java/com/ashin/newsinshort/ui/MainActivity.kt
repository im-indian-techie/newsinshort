package com.ashin.newsinshort.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.ashin.newsinshort.ui.navigation.AppNavigationGraph
import com.ashin.newsinshort.ui.theme.NewsInshortTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            NewsInshortTheme {
                Surface(
                    modifier = Modifier.fillMaxSize().fillMaxSize().background(Color.White)
                ) {
                    AppEntryPoint()
                }
            }
        }
    }
    @Composable
    fun AppEntryPoint()
    {
        AppNavigationGraph()
    }
}

