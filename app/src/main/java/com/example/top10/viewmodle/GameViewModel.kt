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

    // 🔥 Fragen gemischt (random Reihenfolge)
    private val shuffledQuestions = sampleQuestions.shuffled()

    private var questionIndex = 0

    var currentQuestion = mutableStateOf(shuffledQuestions[0])
    var answers = mutableStateOf(
        shuffledQuestions[0].answers.map { it.copy(used = false) }
    )

    fun assignAnswerToTeam(answerToAssign: Answer, teamNumber: Int) {
        if (answerToAssign.used) return

        val updatedAnswers = answers.value.map { answer ->
            if (answer == answerToAssign) {
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
        if (questionIndex < shuffledQuestions.size - 1) {
            questionIndex++

            val nextQ = shuffledQuestions[questionIndex]

            currentQuestion.value = nextQ
            answers.value = nextQ.answers.map { it.copy(used = false) }

            resetTeams()
        }
    }

    fun resetTeams() {
        team1.value = Team("Team 1")
        team2.value = Team("Team 2")
    }
}