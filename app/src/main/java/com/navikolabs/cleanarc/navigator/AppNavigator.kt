package com.navikolabs.cleanarc.navigator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import com.navikolabs.cleanarc.ui.base.BaseActivity
import com.navikolabs.cleanarc.ui.home.view.HomeActivity

class AppNavigator(private val activity: AppCompatActivity) : Navigator {

    private fun navigateTo(intent: Intent) = activity.startActivity(intent)

    private inline fun <reified T : BaseActivity> getIntent() = Intent(activity, T::class.java)

    override fun showHomeActivity() = navigateTo(getIntent<HomeActivity>())
}