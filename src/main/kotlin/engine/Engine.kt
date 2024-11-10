package org.nemial.engine

fun runGame(gameName: String, description: String, getAnswerAndQuestion: () -> Pair<String, String>) {
    println("Добро пожаловать в игру $gameName")
    println(description)

    val (answer, question) = getAnswerAndQuestion()

    println(question)

    val userAnswer = readln().trim().lowercase()

    when (userAnswer) {
        answer -> println("Вы выиграли")
        else -> {
            println("Вы проиграли")
            println("Правильный ответ: $answer")
        }
    }
}