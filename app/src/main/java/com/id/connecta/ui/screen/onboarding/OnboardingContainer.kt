package com.id.connecta.ui.screen.onboarding;

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.currentRecomposeScope
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.id.connecta.ui.component.button.PrimaryButton
import com.id.connecta.ui.theme.ConnectaTheme
import com.id.connecta.ui.theme.Typography
import com.id.connecta.ui.theme.primaryColor
import kotlinx.coroutines.launch


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun OnboardingContainer(
    modifier: Modifier = Modifier,
    navigateToAuth: () -> Unit = {}
) {
    val pagerState = rememberPagerState(
        initialPage = 0,
        pageCount = {
            OnboardItems.listPage.size
        }
    )
    val coroutineScope = rememberCoroutineScope()
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        HorizontalPager(
            state = pagerState) { page ->
            when (page) {
                0 -> OnboardScreen(onboardItems = OnboardItems.FirstPage)
                1 -> OnboardScreen(onboardItems = OnboardItems.SecondPage)
                2 -> OnboardScreen(onboardItems = OnboardItems.ThirdPage)
            }
        }
        Row(
            Modifier
                .wrapContentHeight()
                .fillMaxWidth()
                .padding(top = 50.dp, bottom = 70.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            repeat(pagerState.pageCount) { iteration ->
                val color = if (pagerState.currentPage == iteration) Color.DarkGray else Color.LightGray
                Box(
                    modifier = Modifier
                        .padding(2.dp)
                        .clip(CircleShape)
                        .background(color)
                        .size(10.dp)
                )
            }
        }
        if (pagerState.currentPage < 2) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = "Skip", style = Typography.displaySmall.copy(
                    color = Color.DarkGray
                ), modifier = Modifier
                    .padding(20.dp)
                    .clickable {
                        coroutineScope.launch {
                            pagerState.animateScrollToPage(2)
                        }
                    })
                Column(
                    modifier = Modifier
                        .clip(RoundedCornerShape(5.dp))
                        .background(primaryColor)
                        .clickable {
                            coroutineScope.launch {
                                pagerState.animateScrollToPage(pagerState.currentPage + 1)
                            }
                        }
                ) {
                    Text(text = "Next", color = Color.White,modifier = Modifier.padding(vertical = 20.dp, horizontal = 40.dp))
                }
            }
        } else {
            PrimaryButton(text = "Start Your Journey") {
                navigateToAuth()
            }
        }
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun ShowOnboardingContainerPreview() {
    ConnectaTheme {
        OnboardingContainer()
    }
}
