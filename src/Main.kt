/**
 * =====================================================================
 * Programming Project for NCEA Level 2, Standard 91896
 * ---------------------------------------------------------------------
 * Project Name:   Old Gold Game
 * Project Author: Zach Latham
 * GitHub Repo:    https://github.com/waimea-zslatham/level-2-programming-assessment
 * ---------------------------------------------------------------------
 * Notes:
 * Old gold is a two-player game, played on a one-dimensional grid with coins, where the aim is to win by being the player who removes the gold coin.
 * =====================================================================
 */



fun main() {
    println(
        " ________  ________  _______   _______   ________      ___    ___ \n" +
                "|\\   ____\\|\\   __  \\|\\  ___ \\ |\\  ___ \\ |\\   ___ \\    |\\  \\  /  /|\n" +
                "\\ \\  \\___|\\ \\  \\|\\  \\ \\   __/|\\ \\   __/|\\ \\  \\_|\\ \\   \\ \\  \\/  / /\n" +
                " \\ \\  \\  __\\ \\   _  _\\ \\  \\_|/_\\ \\  \\_|/_\\ \\  \\ \\\\ \\   \\ \\    / / \n" +
                "  \\ \\  \\|\\  \\ \\  \\\\  \\\\ \\  \\_|\\ \\ \\  \\_|\\ \\ \\  \\_\\\\ \\   \\/  /  /  \n" +
                "   \\ \\_______\\ \\__\\\\ _\\\\ \\_______\\ \\_______\\ \\_______\\__/  / /    \n" +
                "    \\|_______|\\|__|\\|__|\\|_______|\\|_______|\\|_______|\\___/ /     \n" +
                " ________  ___  ________                             \\|___|/      \n" +
                "|\\   __  \\|\\  \\|\\   ____\\                                         \n" +
                "\\ \\  \\|\\  \\ \\  \\ \\  \\___|                                         \n" +
                " \\ \\   ____\\ \\  \\ \\  \\  ___                                       \n" +
                "  \\ \\  \\___|\\ \\  \\ \\  \\|\\  \\                                      \n" +
                "   \\ \\__\\    \\ \\__\\ \\_______\\                                     \n" +
                "    \\|__|     \\|__|\\|_______|                                     "
    )

    println("-----------------------------------------------------------------------------------------------------")
    println("                                 HOW TO PLAY")
    println("Greedy Pig is a two-player game, played with a Die but on a computer.")
    println("It will randomly generate a number from 1 to 6 and you have to keep score on your grid.")
    println("If it lands on a 1 you lose all your points from that round.")
    println("You can chose to sit out if you think you have enough from that round.")
    println("Whoever has the most at the end of each round wins.")
    println()

    val playerName = ("Welcome player 1. Please enter your name: ")
    print("Nice to meet you, $playerName")
    }

// Random number generator
        val diceRoll = (1..100).random()
// Creating a mutable list of dice numbers
        val dice = mutableListOf<String>()

// My dice list
        dice.add("1")
        dice.add("2")
        dice.add("3")
        dice.add("4")
        dice.add("5")
        dice.add("6")

        dice.shuffle()
    }


