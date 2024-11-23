package com.id.connecta.ui;

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.id.connecta.ui.route.counselor.CounselorRoute
import com.id.connecta.ui.route.main.MainRoute
import com.id.connecta.ui.screen.auth.AuthContainer
import com.id.connecta.ui.screen.chat.ChatContainer
import com.id.connecta.ui.screen.counselor_detail.CDContainer
import com.id.connecta.ui.screen.main.HomeContainer
import com.id.connecta.ui.screen.onboarding.OnboardingContainer
import com.id.connecta.ui.screen.personality.PersonalityContainer
import com.id.connecta.ui.screen.soft_skill.SoftSkillContainer
import com.id.connecta.ui.screen.splash.SplashContainer
import com.id.connecta.ui.theme.ConnectaTheme


@Composable
fun MainContainer(
    modifier: Modifier = Modifier
) {
    val mainController = rememberNavController()

    NavHost(modifier = modifier, navController = mainController, startDestination = MainRoute.SplashRoute.route) {
        composable(MainRoute.AuthRoute.route) {
            AuthContainer(
                onLoginClick = {
                    mainController.navigate(MainRoute.HomeRoute.route) {
                        popUpTo(MainRoute.AuthRoute.route) { inclusive = true }
                    }
                }
            )
        }
        composable(MainRoute.HomeRoute.route) {
            HomeContainer(mainNavController = mainController)
        }
        composable(MainRoute.SplashRoute.route) {
            SplashContainer(
                accountExistListener = {
                    mainController.navigate(MainRoute.AuthRoute.route) {
                        popUpTo(MainRoute.SplashRoute.route) { inclusive = true }
                    }
                },
                getStartedListener = {
                    mainController.navigate(MainRoute.OnboardRoute.route) {
                        popUpTo(MainRoute.SplashRoute.route) { inclusive = true }
                    }
                }
            )
        }
        composable(MainRoute.OnboardRoute.route) {
            OnboardingContainer(
                navigateToAuth = {
                    mainController.navigate(MainRoute.AuthRoute.route) {
                        popUpTo(MainRoute.OnboardRoute.route) { inclusive = true }
                    }
                }
            )
        }
        composable(MainRoute.SoftSkillRoute.route) {
            SoftSkillContainer(navigateToHome = {
                mainController.popBackStack()
            })
        }
        composable(MainRoute.PersonalityRoute.route) {
            PersonalityContainer(
                navigateToHome = {
                    mainController.popBackStack()
                }
            )
        }
        composable(MainRoute.ChatRoute.route) {
            ChatContainer(
                onBackClick = {
                   mainController.popBackStack()
                }
            )
        }
        composable(MainRoute.CounselorRoute.route) {
            CDContainer(mainNavController = mainController)
        }
    }
}

@Composable
@Preview
fun ShowMainContainerPreview() {
    ConnectaTheme {
        MainContainer()
    }
}
