package org.nemial.games.calc

import kotlin.random.Random

fun start() {
    println("Добро пожаловать в игру Brain Calc")
    println("Определи результат выражения")

    val operations = listOf('*', '+', '-')
    val firstOperand = Random.nextInt(1, 512)
    val secondOperand = Random.nextInt(1, firstOperand)
    val operation = operations.random()

    println("$firstOperand $operation $secondOperand")

    val userAnswer = readln().toInt()

    val correctAnswer = getExpressionResult(firstOperand, operation, secondOperand)

    val isCorrectAnswer = correctAnswer == userAnswer

    when (isCorrectAnswer) {
        true -> println("Вы выиграли!")
        else -> {
            println("Вы проиграли!")
            println("Правильный ответ $correctAnswer")
        }
    }
}

fun getExpressionResult(firstOperand: Int, operation: Char, secondOperand: Int): Int {
    return when (operation) {
        '*' -> firstOperand * secondOperand
        '+' -> firstOperand + secondOperand
        '-' -> firstOperand - secondOperand
        else -> 0
    }
}
