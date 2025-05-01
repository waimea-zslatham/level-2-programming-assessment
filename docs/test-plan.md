# Plan for Testing the Program

The test plan lays out the actions and data I will use to test the functionality of my program.

Terminology:

- **VALID** data values are those that the program expects
- **BOUNDARY** data values are at the limits of the valid range
- **INVALID** data values are those that the program should reject

---

## display the logo and how to play

I want my game to be displaying the logo using www.asciiart.eu to help create it. 
I also need to add the how to play instructions as soon as you run the game. Later on I will have 
the (A) Start function and (B) End. I might add the (C) for a tutorial mode or not. I will be using println statements to run
the words

### Test Data To Use

I will be running it and the logo should appear with the how to play underneath or above

### Test Result

I want the logo to display well and the instructions are clear for the user.

---

## Test the Player 1 and Player 2 work

I want to have the game ask Player 1 to input their name so they can be identified when asked to do specific things. The same thing will occur for player 2 as well.
It will allow players to have turns and have a gameplay each. Using Val code to create the users.

### Test Data To Use

Once run and player 1 and 2 have inputed their names it will display their names by welcoming them then telling them how to play and what to do.

### Test Result
I will probably show multiple test results showing both the players inputing there names and the game registering it and putting
in so they know when they are playing and what to do next.

---

## Test the game structure works with the key components of random number (dice) and scoring

I want to have my game display the random number generator to give the user its points. I want it to be put in a total
score in order to display at the end of the game how many they have. I want then the 2nd player to have a go then display a winner.

### Test Data To Use

I will run the game mulitple times and every time change something to add features to the game to make it better.

### Expected Test Result

The game fully working with a dice (random number) generator that gives a number to the user then to the 2nd then by the end
a total score with the winner.

---

## Number to lose

I want the generator to generate a number that when received will make the user lose all their points. I will make
it 1 or 7 for now as they aren't as common but are still able to come up a good amount of times. For now, I will keep deciding.
Using an if variable to make the number I want, do what I want it to do.

### Test Data To Use

I will run code that when the certain number is generated it erases all points built up from the first roll.

### Expected Test Result

The scores will be gone from roll 1 if the number comes up. If the number 1 comes up first roll well they have none to lose.
After they have lost their points they will still be able to keep going as it may give them a chance to build up points.

---

## Sit down, stay standing

I'm going with the idea/main point of the game Greedy Pig. In this you have the choice to stay in the game
or sit down and keep whatever points you have. This will work with my number to loose as you have the choice
to risk all your points and possibly win against the other player or play it safe and sit down when you feel
the time is right. I want user to have a choice that once they have received a good score that they like they
can choose to stop or keep going. 

### Test Data To Use

I will run code that has a word you type to stop receiving points

### Expected Test Result
 
The scores will be gone from the rolls leading up to it. If they stop because they are happy with their points 
they keep their points but if the number comes up they lose their points from the rolls leading up to it.

---

## Winner

I want the game at the end to display who the winner is and how many points they had that made them win. I will have
the players name displayed and maybe a personalised response like "Congratulations" or "Good Job!". Then for the
player who lost the same. Using if player 1 > player 2 variables.

### Test Data To Use

I will run code that when the game is finished the winner has there name displayed with their points and the game will end.

### Expected Test Result
The name and winner to come up with the final score vs the player who lost :)

---

## (A) Start, (B) End

I want the game at the beginning maybe before the Logo and how to play come up to have the (A) start function
and the (B) end function to allow the user to have the choice of playing and not playing. 

### Test Data To Use

I will run code that when the game starts it shows the choices

### Expected Test Result
(A) Start
(B) End

Maybe (C) Tutorial

---