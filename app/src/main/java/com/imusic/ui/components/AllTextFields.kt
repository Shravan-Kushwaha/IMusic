package com.imusic.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview


val charLimit = 10

@Preview
@Composable
fun TextFields(msg: String = "") {
    //var textFieldValueState by remember { mutableStateOf(TextFieldValue(text = msg)) }
    var text by rememberSaveable { mutableStateOf("") }
    var isError by rememberSaveable { mutableStateOf(false) }
    val errorMessage = "Text input too long"
    fun validate(text: String) {
        isError = text.length > charLimit
    }
    Column {
        TextField(
            value = text,
            placeholder = { Text("msg") },
            onValueChange = { text = it },
            prefix = { Text("www.") },
            suffix = { Text(".com") },
            label = { Text("Email") },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.Favorite,
                    contentDescription = "Localized description"
                )
            },
            trailingIcon = {
                Icon(
                    imageVector = Icons.Filled.Info,
                    contentDescription = "Localized description"
                )
            }
        )

        TextField(
            value = text,
            onValueChange = {
                text = it
                validate(text)
            },
            keyboardActions = KeyboardActions {
                validate(text)
            },
            supportingText = {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = "Limit: ${text.length}/$charLimit",
                    textAlign = TextAlign.End,
                )
            },
            singleLine = true,
            isError = isError,
            label = { Text(if (isError) errorMessage else "No") }
        )
    }

}

