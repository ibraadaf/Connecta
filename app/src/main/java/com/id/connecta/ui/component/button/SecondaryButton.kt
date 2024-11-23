package com.id.connecta.ui.component.button;

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.id.connecta.ui.theme.ConnectaTheme


@Composable
fun SecondaryButton(
    modifier: Modifier = Modifier,
    text: String = "",
    borderColor: Color = Color.Black,
    textColor: Color = Color.White,
    onClickListener: () -> Unit = {}
) {
    Column(
        modifier = modifier
            .clip(RoundedCornerShape(5.dp))
            .fillMaxWidth()
            .background(Color.Transparent)
            .clickable { onClickListener() }
            .border(3.dp, borderColor, RoundedCornerShape(5.dp)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = text, style = TextStyle(
            color = textColor,
            fontSize = 16.sp
        ), modifier = Modifier.padding(10.dp))
    }
}

@Composable
@Preview
fun ShowSecondaryButtonPreview() {
    ConnectaTheme {
        SecondaryButton()
    }
}
