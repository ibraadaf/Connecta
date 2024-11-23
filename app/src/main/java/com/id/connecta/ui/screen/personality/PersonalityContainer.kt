package com.id.connecta.ui.screen.personality;

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
import com.id.connecta.ui.route.personality.PersonalityRoute
import com.id.connecta.ui.theme.ConnectaTheme


@Composable
fun PersonalityContainer(
    modifier: Modifier = Modifier,
    navigateToHome: () -> Unit = {}
) {
    val personalityController = rememberNavController()
    NavHost(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        navController = personalityController, startDestination = PersonalityRoute.ListScreen.route) {
        composable(PersonalityRoute.ListScreen.route) { PersonalityListScreen(
            personalityNavController = personalityController,
            navigateToHome = navigateToHome
        )}
        composable(PersonalityRoute.TestScreen.route) { PersonalityTestScreen(
            personalNavController = personalityController
        ) }
    }
}

@Composable
@Preview
fun ShowPersonalityContainerPreview() {
    ConnectaTheme {
        PersonalityContainer()
    }
}
