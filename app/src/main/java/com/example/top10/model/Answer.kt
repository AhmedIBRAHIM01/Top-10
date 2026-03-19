package com.example.top10.model

data class Answer(
    val textGerman:String,
    val textEnglish:String,
    val textArabic:String,
    val rank: Int,
    var used: Boolean= false
)
