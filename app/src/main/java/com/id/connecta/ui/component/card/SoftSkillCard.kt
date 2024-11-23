package com.id.connecta.ui.component.card;

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.id.connecta.ui.component.button.PrimaryButton
import com.id.connecta.ui.component.button.TertiaryButton
import com.id.connecta.ui.theme.ConnectaTheme
import com.id.connecta.ui.theme.Typography
import com.id.connecta.ui.theme.blueColor


@Composable
fun SoftSkillCard(
    modifier: Modifier = Modifier,
    onButtonClick: () -> Unit = {}
) {
    Row(
        modifier = modifier
            .clip(RoundedCornerShape(10.dp))
            .background(Color.White)
            .fillMaxWidth()
            .border(4.dp, blueColor, RoundedCornerShape(10.dp))
            .padding(20.dp),
    ) {
        Box(modifier = Modifier
            .size(70.dp, 80.dp)
            .background(Color.Black))
        Column(
            modifier = Modifier.padding(start = 20.dp),
            verticalArrangement = Arrangement.spacedBy(5.dp)
        ) {
            Text(text = "Public Speaking", style = Typography.titleSmall.copy(Color.Black))
            Text(text = "7 tips so that we can be confident in doing public speaking without being nervous", style = Typography.bodySmall.copy(
                fontSize = 12.sp, fontWeight = FontWeight.Normal
            ))
            Row(
                modifier = Modifier.padding(top = 15.dp)
            ) {
                Spacer(modifier = Modifier.weight(1f))
                TertiaryButton(text = "Read") {
                    onButtonClick()
                }
            }
        }

    }
}

@Composable
@Preview
fun ShowSoftSkillCardPreview() {
    ConnectaTheme {
        SoftSkillCard()
    }
}
