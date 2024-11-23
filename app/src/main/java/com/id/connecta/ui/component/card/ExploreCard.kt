package com.id.connecta.ui.component.card;

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.id.connecta.ui.component.button.PrimaryButton
import com.id.connecta.ui.theme.ConnectaTheme
import com.id.connecta.ui.theme.pinkBgColor


@Composable
fun ExploreCard(
    modifier: Modifier = Modifier,
    title: String = "",
    onClick: () -> Unit = {}
) {
    Column(
        modifier = modifier
            .clip(RoundedCornerShape(24.dp))
            .size(155.dp, 180.dp)
            .background(pinkBgColor)
            .padding(18.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Box(modifier = Modifier
            .size(40.dp)
            .background(Color.Black))
        Text(text = title, textAlign = TextAlign.Center,fontWeight = FontWeight.Bold, modifier = Modifier
            .padding(top = 8.dp)
            .weight(1f)
        )
        PrimaryButton(text = "Start", modifier = Modifier.padding(horizontal = 20.dp).padding(top = 8.dp)) {
            onClick()
        }

    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun ShowExploreCardPreview() {
    ConnectaTheme {
        ExploreCard()
    }
}
