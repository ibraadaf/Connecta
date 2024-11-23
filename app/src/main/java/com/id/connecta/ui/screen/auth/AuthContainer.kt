package com.id.connecta.ui.screen.auth;

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.id.connecta.ui.route.auth.AuthRoute
import com.id.connecta.ui.theme.ConnectaTheme


@Composable
fun AuthContainer(
    modifier: Modifier = Modifier,
    onLoginClick: () -> Unit = {}
) {
    val authNavController = rememberNavController()
    NavHost(
        modifier = modifier.padding(25.dp).fillMaxSize(), contentAlignment = Alignment.Center,
        navController = authNavController, startDestination = AuthRoute.Login.route) {
        composable(AuthRoute.Login.route) { LoginScreen(
            navController = authNavController, onLoginClick = onLoginClick
        )}
        composable(AuthRoute.Register.route) { RegisterScreen(
            navController = authNavController
        ) }
    }
}

@Composable
@Preview
fun ShowAuthContainerPreview() {
    ConnectaTheme {
        AuthContainer()
    }
}
