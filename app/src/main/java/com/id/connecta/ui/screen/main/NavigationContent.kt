package com.id.connecta.ui.screen.main;

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.id.connecta.ui.route.main.MainRoute
import com.id.connecta.ui.theme.ConnectaTheme
import com.id.connecta.ui.theme.Typography


@Composable
fun NavigationContent(
    modifier: Modifier = Modifier,
    mainNavController: NavController
) {
    Column {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(modifier = Modifier
                .size(80.dp)
                .clip(CircleShape)
                .background(Color.Black))
            Text(text = "Rai Aufa Kamilia", style = Typography.displayMedium.copy(
                color = Color.Black, fontSize = 20.sp
            ))
            Text(text = "Every day is a new opportunity to be better.", style = Typography.titleSmall.copy(
                fontSize = 12.sp, color = Color.DarkGray
            ))
        }
        Spacer(modifier = Modifier.padding(10.dp))
        NavigationDrawerItem(
            label = { Text(text = "Personal Info") },
            selected = false,
            onClick = { /*TODO*/ }
        )
        NavigationDrawerItem(
            label = { Text(text = "My Sessions") },
            selected = false,
            onClick = { /*TODO*/ }
        )
        NavigationDrawerItem(
            label = { Text(text = "Billing and Payments") },
            selected = false,
            onClick = { /*TODO*/ }
        )
        NavigationDrawerItem(
            label = { Text(text = "Account Security") },
            selected = false,
            onClick = { /*TODO*/ }
        )
        NavigationDrawerItem(
                label = { Text(text = "Notifications") },
        selected = false,
        onClick = { /*TODO*/ }
        )
        NavigationDrawerItem(
            label = { Text(text = "Help Center") },
            selected = false,
            onClick = { /*TODO*/ }
        )
        NavigationDrawerItem(
            label = { Text(text = "App Settings") },
            selected = false,
            onClick = { /*TODO*/ }
        )
        NavigationDrawerItem(
            label = { Text(text = "Logout", color = Color.Red) },
            selected = false,
            onClick = {
                mainNavController.navigate(MainRoute.AuthRoute.route) {
                    popUpTo(MainRoute.AuthRoute.route) {inclusive = true}
                }
            }
        )


    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun ShowNavigationContentPreview() {
    ConnectaTheme {
        NavigationContent(mainNavController = rememberNavController())
    }
}
