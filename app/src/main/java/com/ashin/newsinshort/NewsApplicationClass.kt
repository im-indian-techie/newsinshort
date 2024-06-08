package com.ashin.newsinshort

import android.app.Application
import android.util.Log
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class NewsApplicationClass:Application() {
    override fun onCreate() {
        super.onCreate()
        Log.d(TAG,"coming inside oncreate")
    }
    companion object{
        const val TAG="NewsApp"
    }
}