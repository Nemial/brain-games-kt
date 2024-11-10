package org.nemial.games.even

import org.nemial.engine.runGame
import kotlin.random.Random

const val GAME_NAME = "Brain Even"
const val DESCRIPTION = "Определи, чётное число или нет"

fun start() {
    runGame(GAME_NAME, DESCRIPTION) {
        val randNum = Random.nextInt(0, 100)
        val answer = if (isEven(randNum)) "да" else "нет"

        Pair(answer, randNum.toString())
    }
}

fun isEven(num: Int): Boolean = num % 2 == 0