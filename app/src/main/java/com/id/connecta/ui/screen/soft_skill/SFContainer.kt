package com.id.connecta.ui.screen.soft_skill;

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.id.connecta.ui.route.main.MainRoute
import com.id.connecta.ui.route.soft_skill.SoftSkillRoute
import com.id.connecta.ui.theme.ConnectaTheme


@Composable
fun SoftSkillContainer(
    modifier: Modifier = Modifier,
    navigateToHome: () -> Unit = {}
) {
    val softSkillController = rememberNavController()

    NavHost(
        modifier = modifier.fillMaxSize(),
        navController = softSkillController, startDestination = SoftSkillRoute.ListScreen.route) {
        composable(SoftSkillRoute.ListScreen.route) {
            SFListScreen(modifier = Modifier.padding(16.dp), sfNavController = softSkillController, navigateToHome = navigateToHome)
        }
        composable(SoftSkillRoute.DetailScreen.route) {
            SFDetailScreen(sfNavController = softSkillController)
        }
        composable(SoftSkillRoute.FinishedScreen.route) {
            SFFinishedScreen(modifier = Modifier.padding(16.dp).fillMaxSize(), sfNavController = softSkillController,
                navigateToHome = navigateToHome)
        }
    }
}

@Composable
@Preview
fun ShowSoftSkillContainerPreview() {
    ConnectaTheme {
        SoftSkillContainer()
    }
}
