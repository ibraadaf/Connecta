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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.id.connecta.ui.theme.ConnectaTheme
import com.id.connecta.ui.theme.blueColor
import com.id.connecta.ui.theme.darkBlueColor
import com.id.connecta.ui.theme.primaryColor
import com.id.connecta.ui.utils.ChatType


@Composable
fun ChatCard(
    modifier: Modifier = Modifier,
    chatType: ChatType = ChatType.COUNSELOR,
    textChat: String = ""
) {
    when(chatType) {
        ChatType.COUNSELOR -> {
            Row(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(end = 20.dp),
                horizontalArrangement = Arrangement.Start
            ) {
                Box(modifier = Modifier.clip(CircleShape).size(25.dp).background(Color.Black))
                Column(
                    modifier = Modifier
                        .padding(start = 10.dp)
                        .clip(RoundedCornerShape(10.dp))
                        .background(
                            darkBlueColor
                        )
                        .padding(vertical = 15.dp, horizontal = 10.dp),
                ) {
                    Text(text = textChat, fontSize = 11.sp,
                        color = Color.White, textAlign = TextAlign.Start)
                }
            }

        }
        ChatType.USER -> {
            Row(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(start = 40.dp),
                horizontalArrangement = Arrangement.End
            ) {
                Column(
                    modifier = Modifier
                        .padding(start = 10.dp)
                        .clip(RoundedCornerShape(10.dp))
                        .background(
                            primaryColor
                        )
                        .padding(vertical = 15.dp, horizontal = 10.dp)
                ) {
                    Text(text = textChat, fontSize = 11.sp,
                        color = Color.White)
                }
            }

        }
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun ShowChatCardPreview() {
    ConnectaTheme {
        ChatCard(
            textChat = "Halo, selamat datang di sesi konseling Anda. Saya Karina dan saya di sini siap untuk melayani Anda. Bagaimana kabarnya hari ini?"
        )
    }
}
