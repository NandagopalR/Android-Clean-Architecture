package com.navikolabs.cleanarc.data.preferences

import android.content.Context
import android.content.SharedPreferences
import javax.inject.Inject

class AppPreference @Inject constructor(context: Context) {

    companion object {
        private const val PREFERENCE_NAME = "AMIL_FREIGHT_PREFERENCE"
    }

    private val preference: SharedPreferences =
        context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE)

    /*----------------------------------------------- Clear Preference Starts -----------------------------------------------*/

    fun clearAppPreference() {
        preference.edit().clear().apply()
    }

    /*----------------------------------------------- Clear Preference Ends -----------------------------------------------*/

}