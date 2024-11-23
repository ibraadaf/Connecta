package com.id.connecta.ui.screen.counselor_detail;

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.id.connecta.ui.component.card.RatingCard
import com.id.connecta.ui.theme.ConnectaTheme


@Composable
fun CDRatingContent(
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(15.dp)
    ) {
        item {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(bottom = 25.dp)
            ) {
                Text(text = "5.0", fontWeight = FontWeight.Bold, modifier = Modifier.padding(end = 10.dp))
                Row(
                    horizontalArrangement = Arrangement.spacedBy(5.dp),
                    modifier = Modifier.padding(end = 10.dp)
                ) {
                    (1..4).forEach { _ ->
                        Icon(imageVector = Icons.Default.Star, contentDescription = null, tint = Color.Yellow)
                    }
                }
                Spacer(modifier = Modifier.weight(1f))
                Text(text = "24 rating • 6 reviews")
            }
        }
        items((1..4).toList()) {
            RatingCard()
        }
    }
}

@Composable
@Preview
fun ShowCDRatingContentPreview() {
    ConnectaTheme {
        CDRatingContent()
    }
}
