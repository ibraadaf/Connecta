package com.id.connecta.ui.component.card;

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
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
import com.id.connecta.ui.theme.blueColor


@Composable
fun ActivityNotifCard(
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.Top,
        horizontalArrangement = Arrangement.Start
    ) {
        Box(modifier = Modifier
            .size(45.dp)
            .clip(CircleShape)
            .background(Color.Black))
        Column(
            modifier = Modifier.padding(start = 12.dp)
        ) {
            Text(text = "Yay! Kamu telah berhasil menyelesaikan MBTI Personality Test", style = Typography.bodyMedium.copy(
                fontSize = 15.sp
            ))
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "12 min ago", style = Typography.bodyMedium.copy(
                    fontWeight = FontWeight.Bold
                ), modifier = Modifier.padding(end = 4.dp))
                Box(modifier = Modifier.clip(CircleShape).size(8.dp).background(blueColor))
            }

        }
    }
}

@Composable
@Preview
fun ShowActivityNotifCardPreview() {
    ConnectaTheme {
        ActivityNotifCard()
    }
}
