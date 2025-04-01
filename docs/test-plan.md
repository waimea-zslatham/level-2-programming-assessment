# Plan for Testing the Program

The test plan lays out the actions and data I will use to test the functionality of my program.

Terminology:

- **VALID** data values are those that the program expects
- **BOUNDARY** data values are at the limits of the valid range
- **INVALID** data values are those that the program should reject

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

I want the generator to generate a number that when received will make the user lose all their points.

### Test Data To Use

I will run code that when the certain number is generated it erases all points built up from the first round.

### Expected Test Result

The scores will be gone from round 1 if the number comes up. If the number 1 comes up first round well they have none to lose

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

---

## 1

I want the generator to generate a number that when received will make the user lose all their points.

### Test Data To Use

I will run code that when the certain number is generated it erases all points built up from the first round.

### Expected Test Result

The scores will be gone from round 1 if the number comes up. If the number 1 comes up first round well they have none to lose

---



