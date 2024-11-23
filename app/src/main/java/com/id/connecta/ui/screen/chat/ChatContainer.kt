package com.id.connecta.ui.screen.chat;

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import com.id.connecta.ui.theme.ConnectaTheme


@Composable
fun ChatContainer(
    modifier: Modifier = Modifier,
    onBackClick: () -> Unit = {}
) {
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        ChatScreen(onBackListener = onBackClick)
    }
}

@Composable
@Preview
fun ShowChatContainerPreview() {
    ConnectaTheme {
        ChatContainer()
    }
}
