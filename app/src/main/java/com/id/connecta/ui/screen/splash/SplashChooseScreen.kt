package com.id.connecta.ui.screen.splash;

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.id.connecta.R
import com.id.connecta.ui.component.button.PrimaryButton
import com.id.connecta.ui.component.button.SecondaryButton
import com.id.connecta.ui.theme.ConnectaTheme


@Composable
fun SplashChooseScreen(
    modifier: Modifier = Modifier,
    accountExistListener: () -> Unit = {},
    getStartedListener: () -> Unit = {},
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.weight(1f))
        Image(painter = painterResource(id = R.drawable.logo), contentDescription = null, modifier = Modifier.size(140.dp))
        Text(
            modifier = Modifier.padding(top = 50.dp),
            text = stringResource(id = R.string.app_name), fontSize = 40.sp, fontWeight = FontWeight.Bold, color = Color.White)
        Text(
            text = "Empower Your Future", fontSize = 20.sp, fontWeight = FontWeight.Normal, color = Color.White)
        Spacer(modifier = Modifier.weight(1f))
        PrimaryButton(text = "Get Started", bgColor = Color.White, textColor = Color.Black) {
            getStartedListener()
        }
        SecondaryButton(text = "I ALREADY HAVE AN ACCOUNT", borderColor = Color.White, textColor = Color.White, modifier = Modifier.padding(top = 20.dp, bottom = 80.dp)) {
            accountExistListener()
        }
    }
}

@Composable
@Preview
fun ShowSplashChooseScreenPreview() {
    ConnectaTheme {
        SplashChooseScreen()
    }
}
