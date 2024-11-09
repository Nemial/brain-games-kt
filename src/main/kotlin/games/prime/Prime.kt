package org.nemial.games.prime

import kotlin.random.Random

fun start() {
    println("Добро пожаловать в игру Brain Prime")
    println("Напишите 'да' если число просто. Иначе напишите 'нет'")

    val num = Random.nextInt(1, 512)
    val correctAnswer = if (isPrime(num)) "да" else "нет"

    println(num)

    val userAnswer = readln().trim().lowercase()
    val isCorrectAnswer = correctAnswer == userAnswer

    when (isCorrectAnswer) {
        true -> println("Вы выиграли")
        else -> {
            println("Вы проиграли!")
            println("Правильный ответ: $correctAnswer")
        }
    }
}

fun isPrime(n: Int): Boolean {
    if (n < 2) {
        return false
    }

    for (i in 2..n / 2) {
        if (n % i == 0) {
            return false
        }
    }

    return true
}