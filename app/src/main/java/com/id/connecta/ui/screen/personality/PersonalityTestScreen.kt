package com.id.connecta.ui.screen.personality;

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.id.connecta.ui.component.button.PersonalityButton
import com.id.connecta.ui.component.button.PrimaryButton
import com.id.connecta.ui.component.navigation.TopAppBarNav
import com.id.connecta.ui.theme.ConnectaTheme


@Composable
fun PersonalityTestScreen(
    modifier: Modifier = Modifier,
    personalNavController: NavController
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TopAppBarNav(
            title = "Personality Test",
            onNavigationClick = {
                personalNavController.popBackStack()
            }
        )
        Row(
            modifier = Modifier.padding(top = 25.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "0%", modifier = Modifier.padding(end = 10.dp))
            LinearProgressIndicator()
        }
        LazyColumn(
            modifier = Modifier.padding(top = 20.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            items((1..5).toList()) {
                Text(text = "I prefer talking to others rather than being alone.", modifier = Modifier.padding(top = 25.dp, bottom = 15.dp))
                PersonalityButton()
            }
        }
        Spacer(modifier = Modifier.weight(1f))
        PrimaryButton(text = "See Result") {
            personalNavController.popBackStack()
        }
    }

}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun ShowPersonalityTestScreenPreview() {
    ConnectaTheme {
        PersonalityTestScreen(
            personalNavController = rememberNavController()
        )
    }
}
