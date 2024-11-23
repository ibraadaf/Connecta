package com.id.connecta.ui.route.main

sealed class MainRoute(val route: String) {
    data object SplashRoute: MainRoute("splashRouteContainer")
    data object OnboardRoute: MainRoute("onboardRouteContainer")
    data object AuthRoute: MainRoute("authRouteContainer")
    data object HomeRoute: MainRoute("homeRouteContainer")
    data object SoftSkillRoute: MainRoute("softSkillRouteContainer")
    data object PersonalityRoute: MainRoute("personalityRouteContainer")
    data object ChatRoute: MainRoute("chatRouteContainer")
    data object CounselorRoute: MainRoute("counselorRouteContainer")
}