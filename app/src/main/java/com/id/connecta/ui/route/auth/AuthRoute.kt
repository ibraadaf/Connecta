package com.id.connecta.ui.route.auth

sealed class AuthRoute(val route: String) {
    data object Login: AuthRoute("loginScreenRoute")
    data object Register: AuthRoute("registerScreenRoute")
}