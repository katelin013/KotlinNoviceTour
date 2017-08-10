package com.kayle.kotlinbcplayer.kotlin_practice

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.longToast
import org.jetbrains.anko.setContentView

/**
 * Created by Kayle on 2017/7/25.
 */
class KotlinPractice : AppCompatActivity() {
    lateinit var ui: KotlinPracticeUi

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ui = KotlinPracticeUi(this)
        ui.setContentView(this)
        ui.test.text = "點擊"
        ui.test.setOnClickListener{
            longToast("Hello Kotlin")
        }
    }
}