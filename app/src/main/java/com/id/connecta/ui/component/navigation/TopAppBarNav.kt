package com.id.connecta.ui.component.navigation;

import androidx.annotation.DrawableRes
import androidx.annotation.NavigationRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import com.id.connecta.R
import com.id.connecta.ui.theme.ConnectaTheme
import com.id.connecta.ui.theme.Typography


@Composable
fun TopAppBarNav(
    modifier: Modifier = Modifier,
    title: String = "",
    @DrawableRes trailIcon: Int? = null,
    onNavigationClick: () -> Unit = {},
    trailIconOnClick: () -> Unit = {}
) {
    Box(modifier = modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center) {
        Text(text = title, style = Typography.titleSmall.copy(color = Color.Black))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Start
        ) {
            IconButton(onClick = onNavigationClick) {
                Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardArrowLeft, contentDescription = null)
            }
            if (trailIcon != null) {
                Spacer(modifier = Modifier.weight(1f))
                IconButton(onClick = trailIconOnClick) {
                    Icon(painter = painterResource(id = trailIcon), contentDescription = null)
                }
            }
        }
    }
}

@Composable
@Preview
fun ShowTopAppBarNavPreview() {
    ConnectaTheme {
        TopAppBarNav(title = "Soft Skill Development")
    }
}
