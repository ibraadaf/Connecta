package com.id.connecta.ui.screen.main.message;

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.id.connecta.R
import com.id.connecta.ui.component.card.MessageCard
import com.id.connecta.ui.component.text_field.InputTextField
import com.id.connecta.ui.route.main.MainRoute
import com.id.connecta.ui.theme.ConnectaTheme
import com.id.connecta.ui.theme.Typography


@Composable
fun MessageScreen(
    modifier: Modifier = Modifier,
    mainNavController: NavController
) {
    Column(
        modifier = modifier
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Messages", style = Typography.titleSmall.copy(color = Color.Black))
            Spacer(modifier = Modifier.weight(1f))
            Icon(painter = painterResource(id = R.drawable.search_ic), contentDescription = null)
            Icon(painter = painterResource(id = R.drawable.write_ic), contentDescription = null,
                modifier = Modifier.padding(start = 20.dp))
        }
        Row(
            modifier = Modifier.padding(vertical = 16.dp)
        ) {
            InputTextField(hint = "Search a counselor or career")
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Counselor", style = Typography.titleSmall.copy(color = Color.Black, fontSize = 14.sp))
        }
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier.padding(top = 10.dp)
        ) {
            items((1..2).toList()) {
                MessageCard(
                    onChatClick = {
                        mainNavController.navigate(MainRoute.ChatRoute.route)
                    }
                )
            }
        }
        HorizontalDivider(modifier = Modifier.padding(10.dp))
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun ShowMessageScreenPreview() {
    ConnectaTheme {
        MessageScreen(mainNavController = rememberNavController())
    }
}
