package com.example.top10.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.top10.AppLanguage
import com.example.top10.model.Answer
import com.example.top10.viewmodle.GameViewModel

@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun LanguageScreen(viewModel: GameViewModel) {

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text("Sprache wählen", fontSize = 24.sp)

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {
                viewModel.selectedLanguage.value = AppLanguage.GERMAN
            }
        ) {
            Text("Deutsch 🇩🇪")
        }
        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {
                viewModel.selectedLanguage.value = AppLanguage.ENGLISH
            }
        ) {
            Text("English \uD83C\uDDEC\uD83C\uDDE7")
        }

        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = {
                viewModel.selectedLanguage.value = AppLanguage.ARABIC
            }
        ) {
            Text("العربية 🇸🇦")
        }

    }
}