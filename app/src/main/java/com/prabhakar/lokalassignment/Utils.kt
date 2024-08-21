package com.prabhakar.lokalassignment

import android.content.Context
import android.widget.Toast

object Utils {

    const val BASE_URL = "https://testapi.getlokalapp.com/"
    const val END_POINT = "common/jobs?page=1"

    fun showToast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}