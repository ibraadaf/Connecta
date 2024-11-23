package com.id.connecta.ui.screen.chat;

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.Call
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.id.connecta.ui.component.card.ChatCard
import com.id.connecta.ui.theme.ConnectaTheme
import com.id.connecta.ui.theme.Typography
import com.id.connecta.ui.utils.ChatType


@Composable
fun ChatScreen(
    modifier: Modifier = Modifier,
    onBackListener: () -> Unit = {}
) {
    Column(
        modifier = Modifier.padding(top = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = onBackListener) {
                Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardArrowLeft, contentDescription = null)
            }
            Box(modifier = Modifier
                .clip(CircleShape)
                .size(40.dp)
                .background(Color.Black))
            Column(
                modifier = Modifier.padding(start = 15.dp),
                horizontalAlignment = Alignment.Start
            ) {
                Text(text = "Karina", style = Typography.titleSmall.copy(
                    color = Color.Black
                ))
                Text(text = "IT", style = Typography.bodySmall.copy(
                    fontSize = 14.sp
                ))
            }
            Spacer(modifier = Modifier.weight(1f))
            IconButton(onClick = onBackListener) {
                Icon(imageVector = Icons.Default.Call, contentDescription = null)
            }
        }
        HorizontalDivider(modifier = Modifier.padding(top = 16.dp))
        LazyColumn(
            modifier = modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(15.dp)
        ) {
            item {
                ChatCard(
                    chatType = ChatType.COUNSELOR,
                    textChat = "Halo, selamat datang di sesi konseling Anda. Saya Karina dan saya di sini siap untuk melayani Anda. Bagaimana kabarnya hari ini?"
                )
            }
            item {
                ChatCard(
                    chatType = ChatType.USER,
                    textChat = "Halo juga, kabar saya baik. Terima kasih. Saya ingin tahu lebih banyak tentang dunia IT, terutama mengenai profesi Software Engineer. Apakah bisa tolong jelaskan?"
                )
            }
            item {
                ChatCard(
                    chatType = ChatType.COUNSELOR,
                    textChat = "Tentu, saya akan dengan senang hati membantu. Software Engineer adalah seorang profesional yang merancang, mengembangkan, dan memelihara perangkat lunak. Pekerjaan mereka mencakup berbagai tahap, mulai dari pemahaman kebutuhan pengguna, menulis kode, menguji perangkat lunak, hingga merilis produk akhir dan memeliharanya."
                )
            }
        }
        Text(text = "Counselling ended.", style = Typography.bodySmall.copy(
            fontSize = 16.sp
        ))
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun ShowChatScreenPreview() {
    ConnectaTheme {
        ChatScreen()
    }
}
