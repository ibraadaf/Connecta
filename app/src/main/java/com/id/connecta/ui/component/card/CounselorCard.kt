package com.id.connecta.ui.component.card;

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.id.connecta.R
import com.id.connecta.ui.theme.ConnectaTheme
import com.id.connecta.ui.theme.Typography
import com.id.connecta.ui.theme.primaryTextColor


@Composable
fun CounselorCard(
    modifier: Modifier = Modifier,
    bgColor: Color = primaryTextColor,
    onClickListener: () -> Unit = {}
) {
    Column(
        modifier = modifier
            .clip(RoundedCornerShape(24.dp))
            .size(width = 280.dp, 200.dp)
            .background(color = bgColor)
            .padding(13.dp)
            .clickable { onClickListener() },
        verticalArrangement = Arrangement.Center
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(modifier = Modifier
                .size(66.dp)
                .clip(CircleShape)
                .background(Color.Black))
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 8.dp)
            ) {
                Text(text = "Karina", style = Typography.titleSmall)
                Text(text = "IT Counselor", style = Typography.bodySmall)
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(painter = painterResource(id = R.drawable.bookmark_ic), contentDescription = null)
            }
        }
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
                    )
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
                    )
            ) {
                Text(text = "IT Consultant", maxLines = 1, overflow = TextOverflow.Ellipsis, color = Color.White, modifier = Modifier.padding(horizontal = 16.dp, vertical = 4.dp))
            }
        }

        Row(
            modifier = Modifier.padding(top = 24.dp)
        ) {
            Text(text = "Rp100.000/hour", fontSize = 13.sp, color = Color.White)
            Spacer(modifier = Modifier.weight(1f))
            Text(text = "Jakarta, Indonesia", fontSize = 13.sp, color = Color.White)

        }
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun ShowCounselorCardPreview() {
    ConnectaTheme {
        CounselorCard()
    }
}
