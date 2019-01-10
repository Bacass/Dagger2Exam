package com.lee.dagger2exam

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import dagger.Component
import dagger.Module
import java.util.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var numberMaker: NumberMaker
    @Inject
    lateinit var charMaker: CharMaker

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        (applicationContext as MyApplication).magicBox?.inject(this)

        Log.e("Lee", "1 numberMaker.text : ${numberMaker.text}")
        Log.e("Lee", "1 charMaker.text : ${charMaker.text}")

        startActivity(Intent(this, Main2Activity::class.java))

    }

    @Component(modules = arrayOf(NumberMaker::class, CharMaker::class))
    interface MagicBox {
        fun inject(app: MainActivity)
        fun inject(app: Main2Activity)
    }

    @Module
    class CharMaker @Inject constructor() {
        var text = run{ Random().nextInt(100).toChar() }
    }
    @Module
    class NumberMaker @Inject constructor() {
        var text = run{ Random().nextInt(100) }
    }
}
