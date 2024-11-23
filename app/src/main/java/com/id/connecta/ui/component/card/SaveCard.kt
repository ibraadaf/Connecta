package com.id.connecta.ui.component.card;

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.id.connecta.ui.theme.ConnectaTheme
import com.id.connecta.ui.theme.Typography
import com.id.connecta.ui.theme.blueColor


@Composable
fun SaveCard(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .shadow(2.dp)
            .zIndex(1f)
            .fillMaxWidth()
            .padding(horizontal = 20.dp, vertical = 17.dp),
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(modifier = Modifier
                .clip(CircleShape)
                .size(45.dp)
                .background(Color.Black))
            Column(
                modifier = Modifier
                    .padding(start = 16.dp)
                    .weight(1f)
            ) {
                Text(text = "Pharita", fontSize = 15.sp, fontWeight = FontWeight.Bold)
                Text(text = "Entrepreneur", maxLines = 1, overflow = TextOverflow.Ellipsis, style = Typography.displaySmall
                    .copy(fontSize = 13.sp))
            }
            Column(
                modifier = Modifier
                    .padding(start = 8.dp),
                horizontalAlignment = Alignment.End
            ) {
                Text(text = "Rp50.000/hour", fontSize = 13.sp, fontWeight = FontWeight.Bold)
                Text(text = "Jakarta", maxLines = 1, overflow = TextOverflow.Ellipsis, style = Typography.displaySmall.copy(
                    fontSize = 13.sp
                ))
            }
        }
        Row(
            modifier = Modifier.padding(top = 16.dp)
        ) {
            Column(
                modifier = Modifier
                    .clip(CircleShape)
                    .background(
                        color = blueColor.copy(
                            alpha = 0.15f
                        )
                    )
            ) {
                Text(text = "Book", maxLines = 1, color = blueColor, modifier = Modifier.padding(horizontal = 40.dp, vertical = 10.dp))
            }
            Column(
                modifier = Modifier
                    .padding(start = 10.dp)
                    .clip(CircleShape)
                    .background(
                        color = Color.Red.copy(
                            alpha = 0.15f
                        )
                    )
            ) {
                Icon(imageVector = Icons.Default.Delete, contentDescription = null, tint = Color.Red, modifier = Modifier.padding(horizontal = 10.dp, vertical = 10.dp))
            }
        }
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun ShowSaveCardPreview() {
    ConnectaTheme {
        SaveCard()
    }
}
