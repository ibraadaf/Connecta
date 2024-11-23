package com.id.connecta.ui.screen.auth;

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.id.connecta.ui.component.button.PrimaryButton
import com.id.connecta.ui.component.text_field.InputTextField
import com.id.connecta.ui.route.auth.AuthRoute
import com.id.connecta.ui.theme.ConnectaTheme
import com.id.connecta.ui.theme.Typography
import com.id.connecta.ui.theme.primaryTextColor


@Composable
fun LoginScreen(
    modifier: Modifier = Modifier,
    onLoginClick: () -> Unit = {},
    navController: NavController
) {
    Column(
        modifier = modifier
            .fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(32.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(8.dp)) {
            Text(text = "Connecta", style = Typography.displayMedium)
            Text(text = "Login", style = Typography.titleMedium)
            Text(text = "Let’s Login. Meet the counselor!", style = Typography.displaySmall)
        }
        Column (
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(16.dp)) {
            InputTextField(hint = "E-mail")
            InputTextField(hint = "Password")
        }
        PrimaryButton(text = "Login") {
            onLoginClick()
        }
        Text(text = "Forgot Password?", style = Typography.displaySmall.copy(
            color = primaryTextColor))
        HorizontalDivider(modifier = Modifier.padding(horizontal = 10.dp))
        Row(modifier = Modifier, verticalAlignment = Alignment.CenterVertically,) {
            Text(text = "Haven't an account?", style = Typography.displaySmall)
            Text(text = "Register", style = Typography.displaySmall.copy(
                color = primaryTextColor,
                fontWeight = FontWeight.Bold
            ), modifier = Modifier.padding(start = 10.dp).clickable {
                navController.navigate(AuthRoute.Register.route)
            })
        }
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun ShowLoginScreenPreview() {
    ConnectaTheme {
        LoginScreen(navController = rememberNavController())
    }
}
