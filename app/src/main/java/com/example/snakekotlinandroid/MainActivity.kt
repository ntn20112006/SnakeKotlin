package com.example.snakekotlinandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

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
    Column {
        SnakeGameBoard()
    }
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    Background()
}