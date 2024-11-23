package com.id.connecta.ui.screen.main.home;

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.id.connecta.ui.component.card.CounselorCard
import com.id.connecta.ui.component.card.ExploreCard
import com.id.connecta.ui.component.text_field.InputTextField
import com.id.connecta.ui.route.counselor.CounselorRoute
import com.id.connecta.ui.route.main.MainRoute
import com.id.connecta.ui.theme.ConnectaTheme
import com.id.connecta.ui.theme.Typography


@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    mainNavController: NavController,
    onProfileClicked: () -> Unit = {}
) {
    Column(
        modifier = modifier
            .verticalScroll(rememberScrollState())
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(text = "Welcome Back!", style = Typography.displaySmall)
                Text(text = "Rai Aufa Kamilia", style = Typography.titleMedium, modifier = Modifier.padding(top = 5.dp))
            }
            Box(modifier = Modifier
                .clickable {
                    onProfileClicked()
                }
                .size(50.dp)
                .clip(CircleShape)
                .background(Color.Black)

            )
        }
        Row(
            modifier = Modifier.padding(vertical = 40.dp)
        ) {
            InputTextField(hint = "Search a counselor or career")
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Featured Counselor", style = Typography.titleSmall.copy(color = Color.Black))
            Text(text = "See All", style = Typography.titleSmall.copy(color = Color.Gray, fontWeight = FontWeight.Normal))
        }
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(15.dp),
            modifier = Modifier.padding(top = 20.dp)
        ) {
            items((0..2).toList()) {
                CounselorCard {
                    mainNavController.navigate(MainRoute.CounselorRoute.route)
                }
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 40.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Explore", style = Typography.titleSmall.copy(color = Color.Black))
            Text(text = "See All", style = Typography.titleSmall.copy(color = Color.Gray, fontWeight = FontWeight.Normal))
        }
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(15.dp),
            modifier = Modifier.padding(top = 20.dp)
        ) {
            item {
                ExploreCard(
                    title = "Personality Test"
                ) {
                    mainNavController.navigate(MainRoute.PersonalityRoute.route)
                }
            }
            item {
                ExploreCard(
                    title = "Soft Skill Development"
                ) {
                    mainNavController.navigate(MainRoute.SoftSkillRoute.route)
                }
            }
        }
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun ShowHomeScreenPreview() {
    ConnectaTheme {
        HomeScreen(mainNavController = rememberNavController())
    }
}
