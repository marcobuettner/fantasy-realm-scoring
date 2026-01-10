package com.klamerek.fantasyrealms.game

import android.util.Log

/**
 * A player with a name and a list of cards (from a game)
 *
 * @property name
 * @property game
 */
class Player(private var name: String, private val game: Game, override var totalScore: Int) : WithGame {

    companion object {
        val all: MutableList<Player> = ArrayList()

        fun generateNextPlayerName(): String {
            var number = 1
            var playerNamePattern = "Player $number"
            while (all.firstOrNull { playerNamePattern == it.name } != null) {
                number++
                playerNamePattern = "Player $number"
            }
            return playerNamePattern
        }

    }

    fun setName(name: String) {
        this.name = name
    }

    fun addScore(score: Int) {
        if(this.totalScore == 0) {
            this.totalScore = score
            return
        }
        this.totalScore += score
        Log.v("PLAYER_SCORE", "${this.name} := ${this.totalScore}")
    }

    override fun name(): String = name

    override fun game(): Game = game
}
