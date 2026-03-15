package com.example.top10.model

data class Answer(
    val text:String,
    val rank: Int,
    var used: Boolean= false
)
