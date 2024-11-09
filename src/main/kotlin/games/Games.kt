package org.nemial.games


enum class Games {
    EVEN {
        override fun startGame() {
            org.nemial.games.even.start()
        }
    },
    PROGRESSION {
        override fun startGame() {
            org.nemial.games.progression.start()
        }
    },
    PRIME {
        override fun startGame() {
            org.nemial.games.prime.start()
        }
    },
    GCD {
        override fun startGame() {
            org.nemial.games.gcd.start()
        }
    },
    CALC {
        override fun startGame() {
            org.nemial.games.calc.start()
        }
    };

    abstract fun startGame()
}