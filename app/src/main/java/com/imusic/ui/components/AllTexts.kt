package com.imusic.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp

@Composable
@Preview(showBackground = true)
fun Texts() {
    Column(Modifier.padding(5.dp)) {
        Text(
            text = "Simple Text",
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Simple Text",
            color = Color.Red
        )
        Text(
            text = "Simple Text",
            color = Color.White,
            modifier = Modifier.background(Color.Blue)
        )
        Text(
            text = "Simple Text",
            color = Color.Blue,
            fontStyle = FontStyle.Italic
        )
        Text(
            text = "Simple Text",
            color = Color.Magenta,
            modifier = Modifier.border(width = 1.dp, Color.Black).padding(5.dp)
        )
        Text(
            text = "Simple Text",
            color = Color.Magenta,
            fontFamily = FontFamily.Cursive
        )
    }
}