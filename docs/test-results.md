# Results of Testing

The test results show the actual outcome of the testing, following the [Test Plan](test-plan.md)

---

## First off display the logo and the how to play instructions

I have made my game displaying the logo using www.asciiart.eu to help create it. I also added the how to play instructions as soon as you run the game. Later on I will have the (A) Start function and (B) End
function to replace them before they display after a choice is made

### Test Data To Use

I will run it and the logo should appear with the how to play

### Test Result

![img.png](img.png)

The logo displays well and the instructions are clear.

---

## Test the Player 1 and Player 2 work

I have made the game ask Player 1 to input their name so they can be identified when asked to do specific things. The same thing will occur for player 2 as well.

### Test Data To Use

Once run and player 1 and 2 have inputed their names it will display their names by welcoming them then telling them how to play and what to do.

### Test Result 1 - Player 1 can be inputed and works
![img_1.png](img_1.png) 

### Test Result 2 - Player 1 is welcomed to the game and then player 2 is asked for name
![img_2.png](img_2.png) 

### Test Result 3 - It introduces both player 1 and 2 to the game and explains what to do to start the game
![img_3.png](img_3.png)

### Test Result 4 - it won't let any players not input a name and will go on infinitely unless a character is inputed
![img_4.png](img_4.png)

---

## Test the game structure works with the key components of random number (dice) and scoring

I have made my game display the roll they are on, the number the dice has rolled and how many points they have. The game then asks if they want to roll again. 
For now when they put no the game breaks. But once the round is up it will display how many points they have.

### Test Data To Use

I will run it and a dice roll random number, total points and what roll your on will be produced 

### Test Result
![img_9.png](img_9.png)

### Test Result - points so far
![img_10.png](img_10.png)

### Test Result - Roll ......
![img_11.png](img_11.png)

### Test Result Player 1
![img_5.png](img_5.png)

### Test Result Player 1 (2)
![img_6.png](img_6.png)

### Test Result Player 2
![img_7.png](img_7.png)

### Test Result Player 2 (2)
![img_8.png](img_8.png)

I got the game to allow both player 1 and 2 to both game 6 rounds each after player 1 had finished. The game works with both the dice and the rolls counted. The total score
also works too and it displays them at the end.

---

## Number to lose

I wanted the generator to generate a number that when received will make the user lose all their points. I have made it so the number
is 1. 

### Test Data To Use

I ran the code that when the 1 is generated it erases all points built up from the beginning and still allows the user to carry on in case
they make up their points.

### Expected Test Result - loosing all your points

![img_12.png](img_12.png)

### Expected Test Result - After you have lost all your points
![img_13.png](img_13.png)

---

## Sit down, stay standing

I want user to have a choice that once they have received a good score that they like they can chose to sit down
or keep standing.
lp
### Test Data To Use

I will run code that has a letter you click to sit down and stop receiving points

### Expected Test Result

The scores will be gone from round 1 if the number specific comes up. If they sit down they keep their points but if
the number comes up they lose their points from the entire game.