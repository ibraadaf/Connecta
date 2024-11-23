package com.id.connecta.ui.component.button;

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.id.connecta.ui.theme.ConnectaTheme
import com.id.connecta.ui.theme.Typography


@Composable
fun PersonalityButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {}
) {
    LazyRow(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        item {
            Text(text = "Agree", style = Typography.titleSmall.copy(
                color = Color.Green
            ))
        }
        items((-3..3).toList()) {
            val size = (5 * it * (if (it < 0)  -1 else  1) + 15).dp
            val color = if (it == 0) {
                Color.Black
            } else if (it < 0) {
                Color.Green
            } else {
                Color.Red
            }
            Box(modifier = Modifier
                .clip(CircleShape)
                .size(size)
                .border(1.dp, color, CircleShape)
                .clickable {
                    onClick()
                }
            )
        }
        item {
            Text(text = "Disagree", style = Typography.titleSmall.copy(
                color = Color.Red
            ))
        }
    }
}

@Composable
@Preview
fun ShowPersonalityButtonPreview() {
    ConnectaTheme {
        PersonalityButton()
    }
}
