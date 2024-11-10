package org.nemial.games.progression

import org.nemial.engine.runGame
import kotlin.random.Random

const val GAME_NAME = "Brain Progression"
const val DESCRIPTION = "Какого числа не хватает в прогрессии?"
fun start() {
    runGame(GAME_NAME, DESCRIPTION) {
        val progressionLength = 10
        val startNum = Random.nextInt(1, 512)
        val step = Random.nextInt(1, 5)

        val progression = generateProgression(startNum, step, progressionLength)
        val randomKey = Random.nextInt(0, progressionLength)
        val hiddenMask = "..."

        val answer = progression.getValue(randomKey)
        val question = progression
            .values
            .joinToString { value -> if (value == answer) hiddenMask else value.toString() }

        Pair(answer.toString(), question)
    }
}

fun generateProgression(startNum: Int, step: Int, progressionLength: Int): Map<Int, Int> {
    val progression = mutableMapOf(0 to startNum)


    for (i in 1..progressionLength) {
        progression[i] = i * step + startNum
    }

    return progression
}
