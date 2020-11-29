package com.navikolabs.cleanarc.utils

import android.content.Context
import android.widget.Toast

object UiUtils {

    fun showToast(context: Context, input: String) {
        Toast.makeText(context, input, Toast.LENGTH_SHORT).show()
    }

}