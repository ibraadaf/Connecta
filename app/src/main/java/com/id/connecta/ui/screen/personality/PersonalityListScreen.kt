package com.id.connecta.ui.screen.personality;

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.id.connecta.ui.component.card.PersonalityTestcard
import com.id.connecta.ui.component.card.SoftSkillCard
import com.id.connecta.ui.component.navigation.TopAppBarNav
import com.id.connecta.ui.route.personality.PersonalityRoute
import com.id.connecta.ui.route.soft_skill.SoftSkillRoute
import com.id.connecta.ui.theme.ConnectaTheme


@Composable
fun PersonalityListScreen(
    modifier: Modifier = Modifier,
    personalityNavController: NavController,
    navigateToHome: () -> Unit = {}
) {
    Column(
        modifier = modifier.fillMaxWidth()
    ) {
        TopAppBarNav(
            title = "Personality Test",
            onNavigationClick = {
                navigateToHome()
            }
        )
        LazyColumn(
            modifier = Modifier.padding(top = 30.dp),
            verticalArrangement = Arrangement.spacedBy(30.dp)
        ) {
            items((1..2).toList()) {
                PersonalityTestcard(
                    onButtonClick = { personalityNavController.navigate(PersonalityRoute.TestScreen.route) }
                )
            }
        }
    }

}

@Composable
@Preview
fun ShowPersonalityListScreenPreview() {
    ConnectaTheme {
        PersonalityListScreen(
            personalityNavController = rememberNavController()
        )
    }
}
