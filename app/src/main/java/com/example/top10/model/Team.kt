package com.example.top10.model

data class Team(

    val teamName: String,
    var score: Int=0,
    val answers: MutableList<Answer> = mutableListOf()
)
