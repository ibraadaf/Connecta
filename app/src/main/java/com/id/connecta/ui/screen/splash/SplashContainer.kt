package com.id.connecta.ui.screen.splash;

import androidx.compose.animation.AnimatedContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.id.connecta.ui.theme.ConnectaTheme
import com.id.connecta.ui.theme.darkBlueColor
import com.id.connecta.ui.theme.primaryTextColor
import kotlinx.coroutines.delay


@Composable
fun SplashContainer(
    modifier: Modifier = Modifier,
    accountExistListener: () -> Unit = {},
    getStartedListener: () -> Unit = {}
) {
    var splashEnd by remember {
        mutableStateOf(false)
    }

    LaunchedEffect(key1 = Unit) {
        delay(300)
        splashEnd = true
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    listOf(primaryTextColor, darkBlueColor)
                )
            )
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        AnimatedContent(targetState = splashEnd, label = "") {
            when(it) {
                true -> {
                    SplashChooseScreen(
                        accountExistListener = accountExistListener,
                        getStartedListener = getStartedListener
                    )
                }
                false -> {
                    SplashContent()
                }
            }
        }
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun ShowSplashContainerPreview() {
    ConnectaTheme {
        SplashContainer()
    }
}
