package com.example.snakekotlinandroid

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ControllerButtons() {
    Row {
        ControlButton()
        ControlButton()
        ControlButton()
        ControlButton()
    }
}

@Composable
fun ControlButton() {
    val buttonSize = 40.dp
    val buttonColour = Color.Gray
    //Drawing the circles
    Box(
        modifier = Modifier
            .size(buttonSize)
            .clip(CircleShape)
            .background(buttonColour)
            .border(5.dp, Color.Black, CircleShape)
    )
}