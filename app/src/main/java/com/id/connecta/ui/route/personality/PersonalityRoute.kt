package com.id.connecta.ui.route.personality

sealed class PersonalityRoute(val route: String) {
    data object ListScreen: PersonalityRoute("personalityListScreenRoute")
    data object TestScreen: PersonalityRoute("personalityTestScreenRoute")
}