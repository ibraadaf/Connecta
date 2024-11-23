package com.id.connecta.ui.component.card;

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.id.connecta.ui.theme.ConnectaTheme
import com.id.connecta.ui.theme.blueColor


@Composable
fun MessageCard(
    modifier: Modifier = Modifier,
    onChatClick: () -> Unit = {}
) {
    Row(
        modifier = modifier.fillMaxWidth().padding(10.dp)
            .clickable { onChatClick() },
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(modifier = Modifier
            .clip(CircleShape)
            .size(45.dp)
            .background(Color.Black))
        Column(
            modifier = Modifier
                .padding(start = 8.dp)
                .weight(1f)
        ) {
            Text(text = "Pharita", fontSize = 15.sp, fontWeight = FontWeight.Bold)
            Text(text = "Baik, terima kasih atas feedbacknya dan bal bal", maxLines = 1, overflow = TextOverflow.Ellipsis, fontSize = 14.sp)
        }
        Column(
            modifier = Modifier.padding(start = 8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "11:45", fontSize = 12.sp)
            Column(modifier = Modifier.clip(CircleShape).background(blueColor)) {
                Text(text = "4", color = Color.White, fontSize = 12.sp, modifier = Modifier.padding(horizontal = 8.dp))
            }
        }
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun ShowMessageCardPreview() {
    ConnectaTheme {
        MessageCard()
    }
}
