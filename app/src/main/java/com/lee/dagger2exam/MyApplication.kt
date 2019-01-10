package com.lee.dagger2exam

import android.app.Application

class MyApplication: Application() {
    var magicBox: MainActivity.MagicBox? = null

    override fun onCreate() {
        super.onCreate()

        magicBox = DaggerMainActivity_MagicBox.builder().build()
    }
}