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
    val action = menu()
    when (action) {
        'a' -> startGame()
        'b' -> tutorial()
        'c' -> endGame()
    }
}
//    dice.add("1")
//    dice.add("2")
//    dice.add("3")
//    dice.add("4")
//    dice.add("5")
//    dice.add("6")
//    dice.add("7")
//    dice.add("8")
//    dice.add("9")
//    dice.add("10")
//    dice.add("11")
//    dice.add("12")



fun title() {
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
}
    fun menu() : Char {
        println("[a] PLAY")
        println("===============")
        println("[b] TUTORIAL ON HOW TO PLAY")
        println("================================")
        println("[c] QUIT")
        println("=============")

        val validChoice = "abc"

        while (true) {
            print("Choice: ")

            val input = readln()
            // Typed nothing? Try again!
            if (input.isBlank()) continue
            // Grab the first letter
            val choice = input.lowercase().first()
            // Check it is a valid option
            if (validChoice.contains(choice)) return choice
        }
    }

        // The function that starts the game from the A choice
            fun startGame(): Char {
            val player1 = getString("Please enter your name Player 1: ")
            val player2 = getString("Please enter your name Player 2: ")
            println("Welcome to The Dice Game $player1 and $player2")

            val randomNumber = (1..12).random()
            println(randomNumber)

        //The function that gives the player information on how to play (tutorial)
        fun tutorial() {

        }

        // The function that ends the game for the user. (Breaks loop)
        fun endGame() : Char {
            println("==================================================")
            println("Thanks for playing the Dice Game")
            println("==================================================")
            return 'a'
            }

//        val input = readln() {
//            // Typed nothing? Try again!
//            if (input.isBlank()) continue
//            // Grab the first letter
//            val choice = input.uppercase().first()
//            // Check it is a valid option
//            if (validChoice.contains(finalChoice)) return finalChoice
//            val lastOption = finalChoice
//            when (lastOption) {
//                'Y' -> {
//                    break
//                }
//
//                'N' ->
//            }
        }

fun getString (prompt: String) : String {
    var userInput: String

    while(true) {
        print(prompt)

        userInput = readln()
        if (userInput.isBlank()) break
    }

    return userInput
}





//    var player1Score = 0
//    var player2Score = 0
//    var targetScore = 0


