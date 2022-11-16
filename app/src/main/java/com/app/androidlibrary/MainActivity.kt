package com.app.androidlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.app.toasty.Toaster

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toaster.simpleToast(this, "My first Library!")
    }
}