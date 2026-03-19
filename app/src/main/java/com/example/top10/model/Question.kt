package com.example.top10.model

data class Question (
    val textGerman:String,
    val textEnglish:String,
    val textArabic:String,
    val answers: List<Answer>
)