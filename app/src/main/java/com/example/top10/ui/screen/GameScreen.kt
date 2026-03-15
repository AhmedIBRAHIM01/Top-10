package com.example.top10.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.top10.model.Answer
import com.example.top10.viewmodle.GameViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GameScreen(viewModel: GameViewModel) {
    // Daten direkt aus dem ViewModel lesen (da mutableStateOf verwendet wird)
    val question = viewModel.currentQuestion.value
    val answers = viewModel.answers.value
    val t1 = viewModel.team1.value
    val t2 = viewModel.team2.value

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(12.dp), // Reduziertes Padding für mehr Platz
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // --- Frage Sektion (Kompakter) ---
        Card(
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.primaryContainer),
            modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp)
        ) {
            Text(
                text = question.text,
                style = MaterialTheme.typography.titleLarge, // Etwas kleinere Schrift
                modifier = Modifier.padding(12.dp),
                textAlign = TextAlign.Center,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )
        }

        // --- Score Board ---
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp, vertical = 4.dp), // Fix: horizontal/vertical statt symmetric
            horizontalArrangement = Arrangement.SpaceAround // Fix: Korrekter Name
        ) {
            CompactScoreDisplay(name = t1.teamName, score = t1.score, color = Color(0xFF2196F3))
            CompactScoreDisplay(name = t2.teamName, score = t2.score, color = Color(0xFFF44336))
        }

        Spacer(modifier = Modifier.height(8.dp))

        // --- Top 10 Liste (Der Hauptinhalt) ---
        LazyColumn(
            modifier = Modifier.weight(1f), // Nimmt den verfügbaren Platz ein
            verticalArrangement = Arrangement.spacedBy(4.dp) // Sehr kleiner Abstand zwischen Boxen
        ) {
            items(
                items = answers, // Das kommt jetzt frisch aus dem ViewModel
                key = { it.text + question.text } // Kombination aus Text und Frage macht den Key absolut eindeutiganswers
                         ) { answer ->
                AnswerSwipeItem(
                    answer = answer,
                    onSwipeLeft = { viewModel.assignAnswerToTeam(answer, 1) },
                    onSwipeRight = { viewModel.assignAnswerToTeam(answer, 2) }
                )
            }
        }

        // --- Steuerung unten (Rückt nach oben, da Liste kleiner ist) ---
        Button(
            onClick = { viewModel.nextQuestion() },
            modifier = Modifier.fillMaxWidth().padding(top = 12.dp),
            contentPadding = PaddingValues(16.dp) // Größerer Klickbereich
        ) {
            Text("Nächste Frage")
        }
    }
}

@Composable
fun CompactScoreDisplay(name: String, score: Int, color: Color) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = name, style = MaterialTheme.typography.bodySmall, color = Color.Gray)
        Text(
            text = score.toString(),
            style = MaterialTheme.typography.headlineLarge, // Große Zahl
            color = color,
            fontWeight = FontWeight.Bold
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AnswerSwipeItem(
    answer: Answer,
    onSwipeLeft: () -> Unit,
    onSwipeRight: () -> Unit
) {
    // State für die Swipe-Geste
    val dismissState = rememberSwipeToDismissBoxState(
        confirmValueChange = { value ->
            // Nur wischen lassen, wenn die Antwort noch nicht benutzt wurde
            if (!answer.used) {
                when (value) {
                    SwipeToDismissBoxValue.StartToEnd -> { // Rechts geswiped
                        onSwipeRight()
                        false // Item nicht aus der Liste entfernen
                    }
                    SwipeToDismissBoxValue.EndToStart -> { // Links geswiped
                        onSwipeLeft()
                        false // Item nicht aus der Liste entfernen
                    }
                    else -> false
                }
            } else {
                false // Swipe ignorieren, wenn bereits benutzt
            }
        }
    )

    SwipeToDismissBox(
        state = dismissState,
        enableDismissFromStartToEnd = !answer.used, // Swipe rechts deaktivieren wenn benutzt
        enableDismissFromEndToStart = !answer.used, // Swipe links deaktivieren wenn benutzt
        backgroundContent = {
            val color = when (dismissState.dismissDirection) {
                SwipeToDismissBoxValue.StartToEnd -> Color(0xFFF44336).copy(alpha = 0.5f) // Team 2 Rot
                SwipeToDismissBoxValue.EndToStart -> Color(0xFF2196F3).copy(alpha = 0.5f) // Team 1 Blau
                else -> Color.Transparent
            }
            Box(Modifier.fillMaxSize().background(color))
        }
    ) {
        // --- Die eigentliche Antwort-Karte (Kompakter) ---
        Card(
            modifier = Modifier.fillMaxWidth().height(50.dp), // Feste, kleine Höhe
            elevation = CardDefaults.cardElevation(defaultElevation = 1.dp),
            colors = CardDefaults.cardColors(
                // Visuelle Markierung: Grau, wenn beantwortet
                containerColor = if (answer.used) Color.LightGray else MaterialTheme.colorScheme.surfaceVariant,
                contentColor = if (answer.used) Color.Gray else MaterialTheme.colorScheme.onSurfaceVariant
            )
        ) {
            Row(
                modifier = Modifier.fillMaxSize().padding(horizontal = 12.dp, vertical = 8.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = answer.text, // Antwort IMMER anzeigen (da Spielleiter-App)
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = if (answer.used) FontWeight.Normal else FontWeight.Medium,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier.weight(1f)
                )

                // Rang/Punkte anzeigen
                // --- Innerhalb von AnswerSwipeItem (Die Badge) ---
                Surface(
                    color = if (answer.used) Color.Gray else MaterialTheme.colorScheme.primary,
                    shape = MaterialTheme.shapes.small,
                ) {
                    Text(
                        text = "${answer.rank}",
                        style = MaterialTheme.typography.labelLarge, // Fix: Korrekter Name
                        color = Color.White,
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                    )
                }
            }
        }
    }
}

