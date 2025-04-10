import kotlin.random.Random

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
    }

//val dice = mutableListOf<String>()

//dice.add(1)
//dice.add(2)
//dice.add(3)
//dice.add(4)
//dice.add(5)
//dice.add(6)
//dice.add(7)
//dice.add(8)
//dice.add(9)
//dice.add(10)
//dice.add(11)
//dice.add(12)

// This is the title of the game with a brief description of what the game is about.
fun start() {
    println(
        "  _______ _            _____  _             _____                      \n" +
                "|__   __| |          |  __ \\(_)           / ____|                     \n" +
                "   | |  | |__   ___  | |  | |_  ___ ___  | |  __  __ _ _ __ ___   ___ \n" +
                "   | |  | '_ \\ / _ \\ | |  | | |/ __/ _ \\ | | |_ |/ _` | '_ ` _ \\ / _ \\\n" +
                "   | |  | | | |  __/ | |__| | | (_|  __/ | |__| | (_| | | | | | |  __/\n" +
                "   |_|  |_| |_|\\___| |_____/|_|\\___\\___|  \\_____|\\__,_|_| |_| |_|\\___|                                     "
    )
// This is the brief description.
    println("-----------------------------------------------------------------------------------------------------")
    println("                                 HOW TO PLAY")
    println("The Dice Game is a two-player game, played with a Die but on a computer.")
    println("It will randomly generate a number from 1 to 12 and you have to keep score on a grid.")
    println("If it lands on a 1 you lose all your points in total.")
    println("You can chose to sit out if you think you have enough from that round.")
    println("Whoever has the most at the end of each round wins.")
    println()
}
    fun menu() {
        println("[A] PLAY")
        println("===============")
        println("[B] QUIT")
        println("=============")

        val choice = readLine()?.uppercase()

        when (choice) {
            // The function that starts the game
            "A" -> {
                println("Starting the game now!!!")
                startGame()
            }
            // The function that ends the game for the user. (Breaks loop)
            "B" -> {
                println("Thanks for playing!!")
                return
            }

            else -> {
                println("That's not A or B... try again next time")
            }
        }
    }

    // The function that starts the game from the A choice
        fun startGame() {
        val player1 = getString("Please enter your name Player 1: ")
        println("Welcome $player1")
        val player2 = getString("Please enter your name Player 2: ")
        println("Welcome to The Dice Game $player1 and $player2")

        println("$player1, TIME TO ROLL THE DICE. You get 6 turns each. Once you have had your 6 turns please enter 'No' and give $player2 a turn")
        var points = 0
        var playAgain = "yes"

        while (playAgain == "yes") {
            println("$player1 Press Enter to roll the dice!!!")
            readLine()

            val roll = (1..12).random()
            println("$player1 You rolled a $roll")
            points += roll
            println("$player1, These are your points so far: $points")

            println("Wanna roll again? (yes/no)")
            playAgain = readLine()?.lowercase() ?: "no"
        }
        println ("Game over!!! You ended with $points points")



            println("$player2, TIME TO ROLL THE DICE. Once you've had 6 turns please enter 'No' and end game.")
                var points2 = 0

                var playAgain2 = "yes"

            while (playAgain2 == "yes") {
                println("$player2 Press Enter to roll the dice!!!")
                readLine()

                val roll = (1..12).random()
                println("$player2 You rolled a $roll")
                points2 += roll
                println("$player2, These are your points so far: $points2")

                println("Wanna roll again? (yes/no)")
                playAgain2 = readLine()?.lowercase() ?: "no"
            }
                    println ("Game over!!! You ended with $points2 points")
        }



fun getString (s: String) : String {
    var userInput: String

    while(true) {
        print(s)

        userInput = readln()
        if (userInput.isNotBlank()) break
    }

    return userInput
}


