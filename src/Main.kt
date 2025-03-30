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
    val dice = mutableListOf<String>()

    dice.add("1")
    dice.add("2")
    dice.add("3")
    dice.add("4")
    dice.add("5")
    dice.add("6")
    dice.add("7")
    dice.add("8")
    dice.add("9")
    dice.add("10")
    dice.add("11")
    dice.add("12")

    println(
        "  _______ _            _____  _             _____                      \n" +
                "|__   __| |          |  __ \\(_)           / ____|                     \n" +
                "   | |  | |__   ___  | |  | |_  ___ ___  | |  __  __ _ _ __ ___   ___ \n" +
                "   | |  | '_ \\ / _ \\ | |  | | |/ __/ _ \\ | | |_ |/ _` | '_ ` _ \\ / _ \\\n" +
                "   | |  | | | |  __/ | |__| | | (_|  __/ | |__| | (_| | | | | | |  __/\n" +
                "   |_|  |_| |_|\\___| |_____/|_|\\___\\___|  \\_____|\\__,_|_| |_| |_|\\___|                                     "
    )

    println("-----------------------------------------------------------------------------------------------------")
    println("                                 HOW TO PLAY")
    println("The Dice Game is a two-player game, played with a Die but on a computer.")
    println("It will randomly generate a number from 1 to 12 and you have to keep score on a grid.")
    println("If it lands on a 1 you lose all your points in total.")
    println("You can chose to sit out if you think you have enough from that round.")
    println("Whoever has the most at the end of each round wins.")
    println()

    fun menu(): Char {
        println("[A] PLAY")
        println("===============")
        println("[B] TUTORIAL ON HOW TO PLAY")
        println("================================")
        println("[C] QUIT")
        println("=============")
//        println("[D] Single player with AI")
//        println("===============")

        val validChoice = "ABCD"

        while (true) {
            print("Choice: ")
            val input = readln()
            // Typed nothing? Try again!
            if (input.isBlank()) continue
            // Grab the first letter
            val choice = input.uppercase().first()
            // Check it is a valid option
            if (validChoice.contains(choice)) return choice
        }
    }

    // The function that starts the game from the A choice
    fun startGame() {

    }

    //The function that gives the player information on how to play (tutorial)
    fun tutorial() {

    }

    // The function that ends the game for the user. (Breaks loop)
    fun endGame() {
        println("==================================================")
        println("Are you sure you would like to leave the game?")
        println("==================================================")
        println("[Y] YES")
        println("[N] NO")
        val validChoice = "YN"
        while (true) {
            print("Choice: ")
        }

        val input = readln() {
            // Typed nothing? Try again!
            if (input.isBlank()) continue
            // Grab the first letter
            val choice = input.uppercase().first()
            // Check it is a valid option
            if (validChoice.contains(finalChoice)) return finalChoice
            val lastOption = finalChoice
            when (lastOption) {
                'Y' -> {
                    break
                }

                'N' ->
            }
        }
    }


    // Random number generator
    val diceRoll = (1..12).random()
}



    var player1Score = 0
    var player2Score = 0
    var targetScore = 0


