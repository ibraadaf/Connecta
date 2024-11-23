package com.id.connecta.ui.screen.onboarding;

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.id.connecta.ui.theme.ConnectaTheme


@Composable
fun OnboardScreen(
    modifier: Modifier = Modifier,
    onboardItems: OnboardItems = OnboardItems.FirstPage
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            modifier = Modifier.size(285.dp),
            painter = painterResource(id = onboardItems.imageRes), contentDescription = null)
        Text(text = onboardItems.title, fontSize = 30.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(top = 10.dp))
        Text(text = onboardItems.description, fontSize = 15.sp, color = Color.Gray,fontWeight = FontWeight.Normal, modifier = Modifier.padding(top = 10.dp))
    }
}

@Composable
@Preview
fun ShowOnboardScreenPreview() {
    ConnectaTheme {
        OnboardScreen()
    }
}
