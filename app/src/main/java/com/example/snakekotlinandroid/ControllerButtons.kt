package com.example.snakekotlinandroid

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ControlButton() {
    val buttonSize = 40.dp
    val buttonColour = Color.White
    //Drawing the circles
    Box(
        modifier = Modifier
            .size(buttonSize)
            .clip(CircleShape)
            .background(buttonColour)
    )
}