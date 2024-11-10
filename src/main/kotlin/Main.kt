package org.nemial

import org.nemial.games.Games

fun main() {
    println("Привет! Введи игру, в которую будем играть")
    println("Доступные игры: ${Games.entries.joinToString { it.name.lowercase() }}")
    val sourceGameName = readln().trim()
    val gameName = sourceGameName.uppercase()


    try {
        val game = Games.valueOf(gameName)
        println("Запускаю игру: ${game.name}")
        game.startGame()
    } catch (_: IllegalArgumentException) {
        println("Игра $sourceGameName не поддерживается!")
        return
    }

}