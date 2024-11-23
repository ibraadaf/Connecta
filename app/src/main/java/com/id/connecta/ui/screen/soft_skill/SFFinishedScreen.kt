package com.id.connecta.ui.screen.soft_skill;

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.id.connecta.R
import com.id.connecta.ui.component.button.PrimaryButton
import com.id.connecta.ui.component.button.SecondaryButton
import com.id.connecta.ui.route.soft_skill.SoftSkillRoute
import com.id.connecta.ui.theme.ConnectaTheme
import com.id.connecta.ui.theme.Typography
import com.id.connecta.ui.theme.blueColor
import com.id.connecta.ui.theme.primaryTextColor


@Composable
fun SFFinishedScreen(
    modifier: Modifier = Modifier,
    sfNavController: NavController,
    navigateToHome: () -> Unit = {}
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            modifier = Modifier.size(254.dp),
            contentScale = ContentScale.FillBounds,
            painter = painterResource(id = R.drawable.finished_img), contentDescription = null)
        Text(text = "Yay! You have successfully completed it", style = Typography.titleSmall.copy(
            fontSize = 20.sp, color = Color.Black
        ))
        Text(text = "You have completed and learned how to build Public Speaking well, do you now understand it?",
            style = Typography.bodySmall.copy(
                fontSize = 16.sp
            ), textAlign = TextAlign.Center, modifier = Modifier.padding(vertical = 20.dp))
        PrimaryButton(text = "Read the others") {
            sfNavController.popBackStack(SoftSkillRoute.ListScreen.route, false)
        }
        SecondaryButton(text = "Back to home", textColor = primaryTextColor, borderColor = blueColor, modifier = Modifier.padding(top = 20.dp)) {
            navigateToHome()
        }
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun ShowSFFinishedScreenPreview() {
    ConnectaTheme {
        SFFinishedScreen(sfNavController = rememberNavController())
    }
}
