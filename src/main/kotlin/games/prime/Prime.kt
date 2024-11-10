package org.nemial.games.prime

import org.nemial.engine.runGame
import kotlin.random.Random

const val GAME_NAME = "Brain Prime"
const val DESCRIPTION = "Напишите 'да' если число просто. Иначе напишите 'нет'"

fun start() {
    runGame(GAME_NAME, DESCRIPTION) {
        val num = Random.nextInt(1, 512)
        val answer = if (isPrime(num)) "да" else "нет"

        Pair(num.toString(), answer)
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