package org.nemial.games.gcd

import org.nemial.engine.runGame
import kotlin.random.Random

const val GAME_NAME = "Brain GCD"
const val DESCRIPTION = "Определите наибольший общий делитель для полученных чисел"

fun start() {
    runGame(GAME_NAME, DESCRIPTION) {
        val firstNum = Random.nextInt(1, 512)
        val secondNum = Random.nextInt(1, firstNum)
        val answer = getGcd(firstNum, secondNum)
        val question = "$firstNum $secondNum"

        Pair(answer.toString(), question)
    }
}

fun getGcd(firstNum: Int, secondNum: Int): Int {

    return if (firstNum % secondNum != 0) getGcd(secondNum, firstNum % secondNum) else secondNum
}
