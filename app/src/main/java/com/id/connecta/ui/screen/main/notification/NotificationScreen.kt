package com.id.connecta.ui.screen.main.notification;

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.HorizontalDivider
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
import com.id.connecta.ui.component.card.ActivityNotifCard
import com.id.connecta.ui.component.card.ChatNotifCard
import com.id.connecta.ui.theme.ConnectaTheme
import com.id.connecta.ui.theme.Typography


@Composable
fun NotificationScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
    ) {
        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
            Text(text = "Messages", style = Typography.titleSmall.copy(color = Color.Black))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                Box(modifier = Modifier
                    .size(50.dp)
                    .clip(CircleShape)
                    .background(Color.Black))
            }
        }
        Text(text = "New activity", style = Typography.titleSmall.copy(color = Color.Black, fontSize = 14.sp))
        LazyColumn(
            modifier = Modifier.padding(vertical = 16.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            items((1..2).toList()) {
                ActivityNotifCard()
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 30.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Messages", style = Typography.titleSmall.copy(color = Color.Black, fontSize = 14.sp))
            Text(text = "See All", style = Typography.titleSmall.copy(color = Color.Gray, fontWeight = FontWeight.Normal, fontSize = 14.sp))
        }
        LazyColumn(
            modifier = Modifier.padding(vertical = 16.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            items((1..2).toList()) {
                ChatNotifCard()
            }
        }
        HorizontalDivider(modifier = Modifier.padding(top = 10.dp))
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun ShowNotificationScreenPreview() {
    ConnectaTheme {
        NotificationScreen()
    }
}
