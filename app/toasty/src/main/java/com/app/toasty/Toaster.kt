package com.app.toasty

import android.content.Context
import android.widget.Toast

object Toaster {
    fun simpleToast(context: Context?, message: String?) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}