package com.id.connecta.ui.route.home

import androidx.annotation.DrawableRes
import com.id.connecta.R

sealed class HomeRoute(val route: String, @DrawableRes val resourceId: Int) {
    data object HomeScreen: HomeRoute("homeScreenRoute", R.drawable.home_ic)
    data object MessageScreen: HomeRoute("messageScreenRoute", R.drawable.message_ic)
    data object SavedScreen: HomeRoute("savedScreenRoute", R.drawable.save_ic)
    data object NotificationScreen: HomeRoute("notificationScreenRoute", R.drawable.notification_ic)
    companion object {
        val listRoute = listOf(
            HomeScreen, MessageScreen, SavedScreen, NotificationScreen
        )
    }
}

