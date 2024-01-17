package com.example.poketrivia

// Define a data class to represent a trivia question
data class TriviaQuestion(
    val questionText: String,
    val imageUrl: Int, // Resource ID of the image
    val options: List<String>,
    val correctAnswer: String
)