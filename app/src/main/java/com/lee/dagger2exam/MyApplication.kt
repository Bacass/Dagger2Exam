package com.lee.dagger2exam

import android.app.Application

class MyApplication: Application() {
    var magicBox: MagicBox? = null

    override fun onCreate() {
        super.onCreate()

//        magicBox = DaggerMainActivity_MagicBox.builder().build()
        magicBox = DaggerMagicBox.builder().build()
    }
}