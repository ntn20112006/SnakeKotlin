package com.example.snakekotlinandroid

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp

// A grid like board composable
@Composable
fun SnakeGameBoard() {
    val backgroundGridSize = 20
    val backgroundGridColor1 = Color(0xFF43A047)
    val backgroundGridColor2 = Color(0xFF2E7D32)
    val gridSize = 16

    LazyHorizontalGrid(
        // The size of the board in terms of squares
        rows = GridCells.Fixed(gridSize),
        // The size of each individual square on the board
        modifier = Modifier.size((gridSize * backgroundGridSize).dp),
        content = {
            // Loop through a list to determine if the square should be colour 1 or colour 2
            itemsIndexed((0..(gridSize * gridSize)).toList()) { index, item ->
                val row = index / 16
                val column = index % 16
                val tempBackgroundColor =
                    if ((column + row) % 2 == 0) backgroundGridColor1
                    else backgroundGridColor2
                // Drawing the square
                Box(
                    modifier = Modifier
                        .size(backgroundGridSize.dp)
                        .clip(RectangleShape)
                        .background(tempBackgroundColor)
                )
            }
        }
    )
}