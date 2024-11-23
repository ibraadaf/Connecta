package com.id.connecta.ui.screen.counselor_detail;

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.FilterChip
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.id.connecta.R
import com.id.connecta.ui.component.button.PrimaryButton
import com.id.connecta.ui.component.navigation.TopAppBarNav
import com.id.connecta.ui.theme.ConnectaTheme
import com.id.connecta.ui.theme.Typography
import com.id.connecta.ui.theme.darkBlueColor

enum class CDScreen {
    DESC,
    RATING
}

@Composable
fun CDScreen(
    modifier: Modifier = Modifier,
    navigateToFinished: () -> Unit = {},
    onBackListener: () -> Unit = {}
) {
    var currentContent by remember {
        mutableStateOf(CDScreen.DESC)
    }
    Column {
        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
            Image(painter = painterResource(id = R.drawable.blue_bg),
                contentDescription = null,
                modifier = Modifier
                    .matchParentSize()
                    .scale(1.15f), contentScale = ContentScale.FillBounds)

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                TopAppBarNav(
                    trailIcon = R.drawable.bookmark_ic,
                    onNavigationClick = onBackListener
                )
                Box(modifier = Modifier
                    .size(80.dp)
                    .clip(CircleShape)
                    .background(Color.Black))
                Column(
                    modifier = Modifier
                        .padding(bottom = 20.dp, top = 20.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "Karina", style = Typography.titleSmall)
                    Text(text = "IT Counselor", style = Typography.bodySmall)
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Column(
                            modifier = Modifier
                                .padding(top = 16.dp)
                                .clip(CircleShape)
                                .weight(1f)
                                .background(
                                    color = Color.White.copy(
                                        alpha = 0.15f
                                    )
                                ),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(text = "Software Engineer", maxLines = 1, color = Color.White, modifier = Modifier.padding(horizontal = 16.dp, vertical = 4.dp))
                        }
                        Column(
                            modifier = Modifier
                                .padding(top = 16.dp)
                                .weight(1f)
                                .clip(CircleShape)
                                .background(
                                    color = Color.White.copy(
                                        alpha = 0.15f
                                    )
                                ),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(text = "IT Consultant", maxLines = 1, overflow = TextOverflow.Ellipsis, color = Color.White, modifier = Modifier.padding(horizontal = 16.dp, vertical = 4.dp))
                        }
                    }
                }
                Row(
                    modifier = Modifier.padding(top = 5.dp)
                ) {
                    Text(text = "Rp100.000/hour", fontSize = 15.sp, color = Color.White)
                    Spacer(modifier = Modifier.weight(1f))
                    Text(text = "Jakarta, Indonesia", fontSize = 15.sp, color = Color.White)
                }
            }
        }
        Column(
            modifier = modifier.padding(16.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                FilterChip(selected = currentContent == CDScreen.DESC, onClick = { currentContent = CDScreen.DESC }, label = {
                    Text(text = "Description")}, shape = CircleShape)
                FilterChip(selected = currentContent == CDScreen.RATING, onClick = { currentContent = CDScreen.RATING }, label = {
                    Text(text = "Ratings & Reviews")}, shape = CircleShape)
            }
            Box(
                modifier = Modifier.padding(vertical = 10.dp)
            ) {
                when (currentContent) {
                    CDScreen.DESC -> {
                        CDDescContent(
                            modifier = Modifier.padding(bottom = 50.dp)
                        )
                    }
                    CDScreen.RATING -> {
                        CDRatingContent(
                            modifier = Modifier.padding(bottom = 50.dp)
                        )
                    }
                }
                Column {
                    Spacer(modifier = Modifier.weight(1f))
                    PrimaryButton(text = "Book") {
                        navigateToFinished()
                    }
                }
            }
        }
    }
}

@Composable
@Preview
fun ShowCDScreenPreview() {
    ConnectaTheme {
        CDScreen()
    }
}
