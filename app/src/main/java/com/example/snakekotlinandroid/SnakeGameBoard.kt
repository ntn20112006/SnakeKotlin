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
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp

@Composable
fun SnakeGameBoard() {
    LazyHorizontalGrid(
        rows = GridCells.Fixed(gridSize),
        modifier = Modifier.size((gridSize * backgroundGridSize).dp),
        content = {
            itemsIndexed((0..(gridSize * gridSize)).toList()) { index, item ->
                val row = index / 16
                val column = index % 16
                val tempBackgroundColor =
                    if ((column + row) % 2 == 0) backgroundGridColor1
                    else backgroundGridColor2
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