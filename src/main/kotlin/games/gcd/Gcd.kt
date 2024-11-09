package org.nemial.games.gcd

import kotlin.random.Random

fun start() {
    println("Добро пожаловать в игру Brain GCD")
    println("Определите наибольший общий делитель для полученных чисел")

    val firstNum = Random.nextInt(1, 512)
    val secondNum = Random.nextInt(1, firstNum)
    val correctAnswer = getGcd(firstNum, secondNum)

    println("$firstNum $secondNum")

    val userAnswer = readln().toInt()
    val isCorrectAnswer = userAnswer == correctAnswer

    when (isCorrectAnswer) {
        true -> println("Вы выиграли!")
        else -> {
            println("Вы проиграли!")
            println("Правильный ответ: $correctAnswer")
        }
    }
}

fun getGcd(firstNum: Int, secondNum: Int): Int {

    return if (firstNum % secondNum != 0) getGcd(secondNum, firstNum % secondNum) else secondNum
}
