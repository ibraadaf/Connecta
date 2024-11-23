package com.id.connecta.ui.screen.main.save;

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
import androidx.compose.material3.ElevatedAssistChip
import androidx.compose.material3.FilterChip
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.id.connecta.ui.component.card.SaveCard
import com.id.connecta.ui.theme.ConnectaTheme
import com.id.connecta.ui.theme.Typography


@Composable
fun SavedScreen(
    modifier: Modifier = Modifier
) {
    Column {
        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Messages", style = Typography.titleSmall.copy(color = Color.Black))
                Text(text = "(10)", style = Typography.titleSmall.copy(color = Color.Gray))
            }
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
        Row(
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier.padding(top = 25.dp)
        ) {
            FilterChip(selected = true, onClick = { /*TODO*/ }, label = {
                Text(text = "All")}, shape = CircleShape)
            FilterChip(selected = false, onClick = { /*TODO*/ }, label = {
                Text(text = "Counselor")}, shape = CircleShape)
            FilterChip(selected = false, onClick = { /*TODO*/ }, label = {
                Text(text = "Soft Skill Development")}, shape = CircleShape)
        }
        LazyColumn(
            modifier = Modifier.padding(top = 35.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            items((1..2).toList()) {
                SaveCard()
            }
        }
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun ShowSavedScreenPreview() {
    ConnectaTheme {
        SavedScreen()
    }
}
