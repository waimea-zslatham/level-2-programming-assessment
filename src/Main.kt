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


/**
 * This is the main function for the game to work. This is where it takes you to the menu to make your choice.
 */
fun main() {
    val action = menu()
}

/**
 * This is the choice making for the game. You choose your path to abandon the starting game or go for it. Starting will begin the StartGame function
 * The Start choice will take you to the startGame function but the Quit choice takes you to the B choice of thanks for playing then the game breaks.
 */
// The starting menu to start the game with 2 choices
    fun menu() {
        println("[A] PLAY")
        println("===============")
        println("[B] QUIT")
        println("=============")

        val choice = readLine()?.uppercase()
// choice function working
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

/**
 * This is the function that begins the game from the (A) menu choice and takes you to where you will be shown the cool logo for the game and the how to play instructions.
 * The game will then ask the user to input a name that will help them identify what they have to do.
 * The game won't let them input nothing though, so they have to put something.
 * Player 1 starts and the game will ask them to click enter to roll the dice displaying what roll they are on, what they rolled, and what their total points are.
 * The dice rolling function is run through a list of 1 - 12 randomising what one gets chosen.
 * If player gets the number 1, there score is put to 0, but they can still continue. They also have the option to say no if they are happy with their points.
 * The no choice is also automatic once they reach more than 5 rounds so the user can't play any more than 6.
 * Once they have put no or have reached their final round the game will respond with stating that their turn is up and what their final score is.
 * It moves to player 2 and the same thing happens.
 * The game will display a winner once player 2's turn has ended stating how many points player 2 got, who won with how many points and who lost with how many points.
 * There is also a tied game possible message so make sure the game doesn't break no matter what. It's very unlikely but good to take a measure like it.
 */
    // The function that starts the game from the A choice
        fun startGame() {
        val dice = mutableListOf<Int>()
// My list with all my dice possible number outcomes
        dice.add(1)
        dice.add(2)
        dice.add(3)
        dice.add(4)
        dice.add(5)
        dice.add(6)
        dice.add(7)
        dice.add(8)
        dice.add(9)
        dice.add(10)
        dice.add(11)
        dice.add(12)
// This is the title of the game with a brief description of what the game is about.
        println(
            "  _______ _            _____  _             _____                      \n" +
                    "|__   __| |          |  __ \\(_)           / ____|                     \n" +
                    "   | |  | |__   ___  | |  | |_  ___ ___  | |  __  __ _ _ __ ___   ___ \n" +
                    "   | |  | '_ \\ / _ \\ | |  | | |/ __/ _ \\ | | |_ |/ _` | '_ ` _ \\ / _ \\\n" +
                    "   | |  | | | |  __/ | |__| | | (_|  __/ | |__| | (_| | | | | | |  __/\n" +
                    "   |_|  |_| |_|\\___| |_____/|_|\\___\\___|  \\_____|\\__,_|_| |_| |_|\\___|                                     "
        )
// This is the description on how to play.
        println("-----------------------------------------------------------------------------------------------------")
        println("                                 HOW TO PLAY")
        println("The Dice Game is a two-player game, played with a Die but on a computer.")
        println("It will randomly generate a number from 1 to 12 and the game will keep score of it.")
        println("If it lands on a 1 you lose all your points in total. You still keep going to round 6 but with your limited points.")
        println("You can chose to sit out if you think you have enough from that round. Doing so will limit your points for that round.")
        println("Whoever has the most at the end of each round wins.")
        println()
// Player 1 and 2 creating there names to identify who they are
        val player1 = getString("Please enter your name Player 1: ")
        println("Welcome $player1")
        val player2 = getString("Please enter your name Player 2: ")
        println("Welcome to The Dice Game $player1 and $player2")

// Player 1 turn rolling dice, getting points and final score
        println("$player1, TIME TO ROLL THE DICE! You get 6 turns each. Once you have had your 6 turns it will be $player2's turn.")
        println("You can choose to stop if you want to by selecting no when asked.")
        var points = 0
        var playAgain = "yes"
        var rollCount = 0
        while (playAgain == "yes") {
            println("$player1 press enter to roll the dice!!!")
            readLine()

            // Random dice generator using my list
            val roll = (dice).random()
            println("$player1, you rolled a $roll")

            // This is the number that when landed on erases your points
            if (roll == 1) {
                points = 0
                println("$player1, You rolled a 1 and have lost your points!!!")
            } else {
                points += roll
                println("$player1, These are your points so far: $points")
            }
            // This is the rolls counted code where once you've completed more than 5 rounds the game will automatically end for the player, preventing more rounds.
            rollCount += 1
            println("Roll $rollCount")
            if (rollCount > 5) {
                playAgain = "no"
                rollCount = 0
                // This is the choice to allow the user to choose whether they've had enough rolls to keep safe
            } else {
                println("Wanna roll again? (yes/no)")
                playAgain = readLine()?.lowercase() ?: "no"
            }

        }
    // They're turn ending and it displaying how many points they've ended with.
        println("Your turn has ended. You ended with $points points")



// Player 2 turn rolling dice, getting points and final score
        println("$player2, TIME TO ROLL THE DICE! Once you've had 6 turns the game will end and either you or $player1 will win!")
        var points2 = 0
        var playAgain2 = "yes"
        var rollCount2 = 0
        while (playAgain2 == "yes") {
            println("$player2 press enter to roll the dice!!!")
            readLine()

            // Random dice generator using my list
            val roll = (1..12).random()
            println("$player2, you rolled a $roll")

            // This is the number that when landed on erases your points
            if (roll == 1) {
                points2 = 0
                println("$player2, You rolled a 1 and have lost your points!!!")

                // This is where if you haven't rolled a 1 it gives you your point
            } else {
                points2 += roll
                println("$player2, These are your points so far: $points2")
            }

            // This is the rolls counted code where once you've completed more than 5 rounds the game will automatically end for the player, preventing more rounds.
            rollCount2 += 1
            println("Roll $rollCount2")
            if (rollCount2 > 5) {
                playAgain2 = "no"
                rollCount2 = 0
                // This is the choice to allow the user to choose whether they've had enough rolls to keep safe
            } else {
                println("Wanna roll again? (yes/no)")
                playAgain2 = readLine()?.lowercase() ?: "no"
            }

        }
        println("Game over!!! Your turn has ended. You ended with $points2 points")

    // The final scoring chanced results. Eg... winners/losers/tied games and if you won what it displays and the same for if you lost.
        if (points2 > points) {
            println("Congratulations $player2, you got $points2 points and won!")
        }
        if (points > points2) {
            println("Congratulations $player1, you got $points points and won!")
        }
        if (points == points2) {
            println("Good job $player1 and $player2, you both tied with an equal score of $points points")
        }
        if (points < points2) {
            println("Unfortunately $player1 you lost with a score of $points points")
        }
        if (points2 < points) {
            println("Unfortunately $player2, you lost with a score of $points2 points")
        }
    }


/**
 * This is my getString function that works up with the Player 1 and 2 naming as from previous code I used it from it uses what they input for the rest of the code and for
 * the game to understand what it is they have typed.
 */
// My getString function for player 1 and player 2
        fun getString(s: String): String {
            var userInput: String

            while (true) {
                print(s)

                userInput = readln()
                if (userInput.isNotBlank()) break
            }

            return userInput
        }



