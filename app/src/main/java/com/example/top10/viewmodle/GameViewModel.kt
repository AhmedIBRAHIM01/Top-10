package com.example.top10.viewmodle

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.top10.AppLanguage
import com.example.top10.model.Answer
import com.example.top10.model.Team
import com.example.top10.repo.sampleQuestions

class GameViewModel : ViewModel() {
    var selectedLanguage = mutableStateOf<AppLanguage?>(null)
    var team1 = mutableStateOf(Team("Team 1"))
    var team2 = mutableStateOf(Team("Team 2"))

    var currentQuestion = mutableStateOf(sampleQuestions[0])
    // Initialisiere die Antworten Liste
    var answers = mutableStateOf(sampleQuestions[0].answers)

    private var questionIndex = 0

    fun assignAnswerToTeam(answerToAssign: Answer, teamNumber: Int) {
        if (answerToAssign.used) return

        // Erzeuge neue Liste mit Kopie (für die Farbe)
        val updatedAnswers = answers.value.map { answer ->
            if (answer== answerToAssign) {
                answer.copy(used = true)
            } else {
                answer
            }
        }
        answers.value = updatedAnswers

        val points = answerToAssign.rank
        when (teamNumber) {
            1 -> {
                team1.value = team1.value.copy(score = team1.value.score + points)
                team1.value.answers.add(answerToAssign)
            }
            2 -> {
                team2.value = team2.value.copy(score = team2.value.score + points)
                team2.value.answers.add(answerToAssign)
            }
        }
    }

    fun nextQuestion() {
        if (questionIndex < sampleQuestions.size - 1) {
            questionIndex++

            val nextQ = sampleQuestions[questionIndex]

            // WICHTIG: Setze den 'used' Status aller neuen Antworten auf false zurück,
            // falls sie im Repository global definiert sind
            val freshAnswers = nextQ.answers.map { it.copy(used = false) }

            // Erst die Daten aktualisieren
            currentQuestion.value = nextQ
            answers.value = freshAnswers

            // Teams für die neue Runde zurücksetzen
            resetTeams()
        }
    }

    fun resetTeams() {
        team1.value = Team("Team 1")
        team2.value = Team("Team 2")
    }
}