package com.id.connecta.ui.screen.counselor_detail;

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.id.connecta.ui.route.counselor.CounselorRoute
import com.id.connecta.ui.theme.ConnectaTheme


@Composable
fun CDContainer(
    modifier: Modifier = Modifier,
    mainNavController: NavController
) {
    val cdNavController = rememberNavController()

    NavHost(
        modifier = modifier.fillMaxSize().background(Color.White),
        navController = cdNavController, startDestination = CounselorRoute.DetailCounselor.route) {
        composable(CounselorRoute.DetailCounselor.route) {
            CDScreen(
                onBackListener = {mainNavController.popBackStack()},
                navigateToFinished = {
                    cdNavController.navigate(CounselorRoute.FinishedCounselor.route)
                }
            )
        }
        composable(CounselorRoute.FinishedCounselor.route) {
            CDFinishedScreen(mainNavController = mainNavController, modifier = Modifier.padding(16.dp))
        }
    }
}

@Composable
@Preview
fun ShowCDContainerPreview() {
    ConnectaTheme {
        CDContainer(mainNavController = rememberNavController())
    }
}
