package com.example.top10

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.top10.ui.screen.GameScreen
import com.example.top10.viewmodle.GameViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            val viewModel: GameViewModel = viewModel()

            GameScreen(viewModel)

        }
    }
}

