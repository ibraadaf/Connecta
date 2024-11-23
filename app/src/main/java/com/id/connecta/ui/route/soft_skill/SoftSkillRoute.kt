package com.id.connecta.ui.route.soft_skill

sealed class SoftSkillRoute(val route: String) {
    data object ListScreen: SoftSkillRoute("listSoftSkillRoute")
    data object DetailScreen: SoftSkillRoute("detailSoftSkillRoute")
    data object FinishedScreen: SoftSkillRoute("finishedSoftSkillRoute")
}