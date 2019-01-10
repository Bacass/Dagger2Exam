package com.lee.dagger2exam

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import javax.inject.Inject

class Main2Activity : AppCompatActivity() {

    @Inject
    lateinit var numberMaker: MainActivity.NumberMaker

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        (applicationContext as MyApplication).magicBox?.inject(this)

        Log.e("Lee", "2 numberMaker.text : ${numberMaker.text}")
    }
}
