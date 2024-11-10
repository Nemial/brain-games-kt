package org.nemial.games.calc

import org.nemial.engine.runGame
import kotlin.random.Random

const val GAME_NAME = "Brain Calc"
const val DESCRIPTION = "Определи результат выражения"

fun start() {
    runGame(GAME_NAME, DESCRIPTION) {
        val operations = listOf('*', '+', '-')
        val firstOperand = Random.nextInt(1, 512)
        val secondOperand = Random.nextInt(1, firstOperand)
        val operation = operations.random()

        val question = "$firstOperand $operation $secondOperand"
        val answer = getExpressionResult(firstOperand, operation, secondOperand)


        Pair(answer.toString(), question)
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
