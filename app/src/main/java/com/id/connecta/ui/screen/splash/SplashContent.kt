package com.id.connecta.ui.screen.splash;

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
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
import com.id.connecta.ui.theme.ConnectaTheme


@Composable
fun SplashContent(
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(id = R.drawable.logo), contentDescription = null, modifier = Modifier.size(160.dp))
        Text(
            modifier = Modifier.padding(top = 180.dp),
            text = stringResource(id = R.string.app_name), fontSize = 40.sp, fontWeight = FontWeight.Bold, color = Color.White)
    }
}

@Composable
@Preview
fun ShowSplashContentPreview() {
    ConnectaTheme {
        SplashContent()
    }
}
