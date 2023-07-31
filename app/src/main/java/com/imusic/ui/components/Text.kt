package com.imusic.ui.components

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.input.TextFieldValue

@Composable
fun IText(text: String) {
    Text(text = text)
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun IEditText(text: String) {
    var textFieldValueState by remember { mutableStateOf(TextFieldValue(text = text)) }
    TextField(
        value = textFieldValueState,
        onValueChange = { t ->
            run {
                textFieldValueState = t
            }
        }, placeholder = { IText(text = text) }
    )
}