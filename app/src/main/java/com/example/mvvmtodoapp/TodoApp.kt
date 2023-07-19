package com.example.mvvmtodoapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class TodoApp: Application()    // After doing this, you should put (android:name=".TodoApp") to AndroidManifest.