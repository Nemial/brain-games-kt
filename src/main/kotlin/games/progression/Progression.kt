package org.nemial.games.progression

import kotlin.random.Random

fun start() {
    println("Добро пожаловать в игру Brain Progression")
    println("Какого числа не хватает в прогрессии?")

    val progressionLength = 10
    val startNum = Random.nextInt(1, 512)
    val step = Random.nextInt(1, 5)

    val progression = generateProgression(startNum, step, progressionLength)
    val randomKey = Random.nextInt(0, progressionLength)
    val hiddenMask = "..."

    val hiddenValue = progression.getValue(randomKey)

    println(
        progression
            .values
            .joinToString { value -> if (value == hiddenValue) hiddenMask else value.toString() }
    )

    val userAnswer = readln().toInt()
    val isCorrectAnswer = hiddenValue == userAnswer

    when (isCorrectAnswer) {
        true -> println("Вы выиграли")
        else -> {
            println("Вы проиграли")
            println("Правильный ответ: $hiddenValue")
        }
    }
}

fun generateProgression(startNum: Int, step: Int, progressionLength: Int): Map<Int, Int> {
    val progression = mutableMapOf(0 to startNum)


    for (i in 1..progressionLength) {
        progression[i] = i * step + startNum
    }

    return progression
}
