package com.id.connecta.ui.screen.soft_skill;

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.id.connecta.R
import com.id.connecta.ui.component.button.PrimaryButton
import com.id.connecta.ui.component.navigation.TopAppBarNav
import com.id.connecta.ui.route.soft_skill.SoftSkillRoute
import com.id.connecta.ui.theme.ConnectaTheme
import com.id.connecta.ui.theme.Typography
import com.id.connecta.ui.theme.darkBlueColor


@Composable
fun SFDetailScreen(
    modifier: Modifier = Modifier,
    sfNavController: NavController
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .verticalScroll(rememberScrollState())
    ) {
        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
            Image(painter = painterResource(id = R.drawable.blue_bg),
                contentDescription = null,
                modifier = Modifier
                    .matchParentSize()
                    .scale(1.15f), contentScale = ContentScale.FillBounds)

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                TopAppBarNav(
                    trailIcon = R.drawable.bookmark_ic,
                    onNavigationClick = {
                        sfNavController.popBackStack()
                    }
                )
                Box(modifier = Modifier
                    .size(80.dp)
                    .clip(CircleShape)
                    .background(Color.Black))
                Column(
                    modifier = Modifier
                        .padding(bottom = 20.dp, top = 20.dp)
                        .clip(RoundedCornerShape(10.dp))
                        .background(darkBlueColor)
                ) {
                    Text(text = "7 Tips for Good Public Speaking", style = Typography.titleSmall.copy(
                        fontSize = 20.sp
                    ), modifier = Modifier.padding(8.dp))
                }
            }
        }
        Column(
            modifier = modifier
                .fillMaxWidth()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Public speaking (speaking in public) is a skill that requires skill and courage. For some people, public speaking is very easy and can be done as naturally as breathing; but for others, it takes years of practice and dedication to achieve the confidence and poise needed for public speaking.",
                style = Typography.bodySmall.copy(
                    fontSize = 12.sp
                ), modifier = Modifier.fillMaxWidth())
            Box(modifier = Modifier
                .padding(vertical = 20.dp)
                .size(200.dp, 130.dp)
                .background(Color.Black)
            )
            Text(text = "1. Know your audience and presentation topic\n" +
                    "2. Continuous practice\n" +
                    "3. Record Yourself\n" +
                    "4. Prepare the material to be delivered well\n" +
                    "5. Make sure you understand what will be said\n" +
                    "6. Be Confident\n" +
                    "7. Pay attention to your body language",
                style = Typography.bodySmall.copy(
                    fontSize = 12.sp
                ), modifier = Modifier.fillMaxWidth()
            )
            PrimaryButton(text = "Finished", modifier = Modifier.padding(vertical = 20.dp)) {
                sfNavController.navigate(SoftSkillRoute.FinishedScreen.route)
            }
        }
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun ShowSFDetailScreenPreview() {
    ConnectaTheme {
        SFDetailScreen(sfNavController = rememberNavController())
    }
}
