package com.id.connecta.ui.component.text_field;

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import com.id.connecta.ui.theme.ConnectaTheme


@Composable
fun InputTextField(
    modifier: Modifier = Modifier,
    value: String = "",
    onValueChange: (String) -> Unit = {},
    hint: String = ""
) {
    OutlinedTextField(
        modifier = modifier.fillMaxWidth(),
        value = value,
        onValueChange = onValueChange,
        label = {
            Text(text = hint)
        }
    )
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun ShowInputTextFieldPreview() {
    ConnectaTheme{
        InputTextField(
            hint = "Password"
        )
    }
}
