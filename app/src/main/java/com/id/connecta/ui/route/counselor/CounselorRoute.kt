package com.id.connecta.ui.route.counselor

sealed class CounselorRoute(val route: String) {
    data object DetailCounselor: CounselorRoute("counselorDetailScreenRoute")
    data object FinishedCounselor: CounselorRoute("finishedDetailScreenRoute")
}