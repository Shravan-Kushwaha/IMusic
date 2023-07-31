package com.imusic.ui.register

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.imusic.ui.components.IEditText
import com.imusic.ui.components.IText
import com.imusic.ui.components.TextFields

@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview(showSystemUi = true)
fun RegisterScreen() {
    Scaffold(modifier = Modifier) { padding ->

        Column(Modifier.padding(padding)) {
            IText(text = "First Name")
            IEditText(text = "Enter First Name")
            TextFields(msg = "")
        }
    }
}