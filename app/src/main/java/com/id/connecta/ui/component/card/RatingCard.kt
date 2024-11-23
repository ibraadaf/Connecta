package com.id.connecta.ui.component.card;

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.id.connecta.ui.theme.ConnectaTheme
import com.id.connecta.ui.theme.Typography


@Composable
fun RatingCard(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Box(modifier = Modifier
                .clip(CircleShape)
                .size(50.dp)
                .background(Color.Black)
            )
            Text(text = "Han So Hee", style = Typography.titleSmall.copy(
                color = Color.Black, fontSize = 12.sp),
                modifier = Modifier.padding(start = 10.dp))
        }
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(5.dp),
                modifier = Modifier.padding(end = 10.dp)
            ) {
                (1..4).forEach { _ ->
                    Icon(imageVector = Icons.Default.Star, contentDescription = null, tint = Color.Yellow)
                }
            }
            Text(text = "Han So Hee", style = Typography.titleSmall.copy(
                color = Color.LightGray, fontSize = 10.sp
            ))
        }
        Text(text = "Ka Karina bener” ngebantu aku banget! Semua masalah yang aku alamin dan aku bingungin semuanya dijelasin dengan detail sama ka karina. Jadi makin pede sama pilihan karirkuu!",
            style = Typography.titleSmall.copy(
                fontWeight = FontWeight.Normal,
                color = Color.Black, fontSize = 10.sp) )
        HorizontalDivider()
    }
}

@Composable
@Preview
fun ShowRatingCardPreview() {
    ConnectaTheme {
        RatingCard()
    }
}
