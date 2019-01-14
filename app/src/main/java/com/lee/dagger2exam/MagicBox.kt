package com.lee.dagger2exam

import dagger.Component

@Component(modules = arrayOf(MainActivity.NumberMaker::class, MainActivity.CharMaker::class))
interface MagicBox {
    fun inject(app: MainActivity)
    fun inject(app: Main2Activity)
}