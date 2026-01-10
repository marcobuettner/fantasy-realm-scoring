package com.klamerek.fantasyrealms.game

/**
 * Interface for all objects that contains a Game (Player, discard area, ...)
 */
interface WithGame {
    var totalScore: Int

    fun name(): String
    fun game(): Game
    fun displayScore(): Boolean = true
}
