package com.example.snakekotlinandroid

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

//The layout that holds all the control buttons
@Composable
fun ControllerButtons() {
    Row {
        ControlButton(::moveUp)
        ControlButton(::moveDown)
        ControlButton(::moveLeft)
        ControlButton(::moveRight)
    }
}

//The individual control button taking in what function to execute
@Composable
fun ControlButton(action: () -> Unit) {
    val buttonSize = 40.dp
    val buttonColour = Color.Gray
    //Drawing the circles
    Box(
        modifier = Modifier
            .size(buttonSize)
            .clip(CircleShape)
            .background(buttonColour)
            .border(5.dp, Color.Black, CircleShape)
            .clickable {
                action()
            }
    )
}

fun moveUp() {
    //Change the snake direction to up
}
fun moveDown() {
    //Change the snake direction to down
}
fun moveLeft() {
    //Change the snake direction to left
}
fun moveRight() {
    //Change the snake direction to right
}