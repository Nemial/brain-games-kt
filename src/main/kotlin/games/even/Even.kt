package org.nemial.games.even

import kotlin.random.Random

fun start() {
    println("Добро пожаловать в игру Brain Even")
    println("Определи, чётное число или нет")

    val randNum = Random.nextInt(0, 100)
    val isEven = isEven(randNum)

    println(randNum)

    val userAnswer = readln().trim().lowercase()
    val answer = when (userAnswer) {
        "да" -> true
        else -> false
    }
    val isCorrectAnswer = answer == isEven

    when (isCorrectAnswer) {
        true -> println("Вы выиграли!")
        else -> println("Вы проиграли")
    }
}

fun isEven(num: Int): Boolean = num % 2 == 0