package com.example.snakekotlinandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

const val backgroundGridSize = 20
val backgroundGridColor1 = Color(0xFF43A047)
val backgroundGridColor2 = Color(0xFF2E7D32)
const val gridSize = 16

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Background()
        }
    }
}

@Composable
fun Background() {
    LazyHorizontalGrid(
        rows = GridCells.Fixed(gridSize),
        modifier = Modifier.size((gridSize * backgroundGridSize).dp),
        content = {
            itemsIndexed((0..(gridSize * gridSize)).toList()) { index, item ->
                val tempBackgroundColor =
                    if (((index / gridSize) % 2 == 0 && index % 2 == 0)
                        || ((index / gridSize) % 2 == 1 && index % 2 == 1)) backgroundGridColor1
                    else backgroundGridColor2
                Box(
                    modifier = Modifier
                        .size(backgroundGridSize.dp)
                        .clip(RectangleShape)
                        .background(tempBackgroundColor)
                )
            }
    })
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    Background()
}