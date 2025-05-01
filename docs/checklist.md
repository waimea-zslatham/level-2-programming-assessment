# Success Criteria Checklist

This checklist can be used to gauge progress towards different levels of success. Note that to pass, *all* of the Achieve Criteria must be met; for Merit, you need all Achieve, plus all the Merit Criteria, and so on for Excellence too.

---

## Achieve Criteria

### Program Functionality

The game functions correctly and meets the specification:
- [X] The game is **playable**
- [X] The **instructions** for the game are available in-game
- [X] **Two players** can play
- [X] Player **names** are used to identify each player
- [X] Players **take turns** to play
- [X] Players provides **input data** to the game (e.g. moves to make)
- [X] The **current status** of the game is shown after each play
- [X] A **winner is detected** correctly

### Program Code

The program stores data using:
- [X] **Variables** of at least two types (e.g. int, text, boolean)
- [X] At least one **data collection** (array / list) to store some elements of the game data

The program structure:
- [X] Is broken up into **functions**: a main function, plus other supporting functions 
- [X] Contains **sequences** of instructions
- [X] Uses **conditional** instructions to control the program flow
- [X] Uses program **branches** (if...else, when, etc.)
- [X] Uses **iteration** (loops) to repeat things (for, while, etc.)

### Program Documentation

The program code:
- [X] Is **indented** correctly
- [X] Is **laid-out clearly**
- [X] Contains **comments** that help in understanding how it works

### Program Testing

The program has been tested and there is documented evidence that:
- [ X The game is **fully functional**, showing testing of:
  - [X] game setup
  - [X] player moves
  - [X] players taking turns
  - [X] scoring (if any)
  - [X] players winning
  - [X] final feedback (if appropriate)
- [X] **Valid (expected) data** has been used to test **all data inputs**
- [X] Where tests have failed, **fixes** are discussed and **tests re-run**

---

## Merit Criteria

### Program Code

The program stores data using variables, where:
- [X] Variable **names are well-chosen** (relating to their purpose)
- [X] Variable names **begin with lowercase**
- [X] Naming is consistent, either **camelCase or snake_case**
- [X] Variables are **scoped appropriately** (global or local to a function)
- [X] **Global** variables are only used if **genuinely needed**

The program uses functions appropriately, where:
- [X] At least one uses **parameters** to pass data into it
- [X] At least one provides a **return value** to the calling code
- [X] The function **names are well-chosen**, relating to their functionality 

### Program Documentation

The program code is well-commented:
- [X] **JavaDoc Block comments** are used at the top of each **file** and **function**
- [X] Comments accurately describe the **function and behaviour** of the code:
  - [X] Defining the **purpose** of functions / key blocks of code
  - [X] Explaining the **reason** (the '**why**') of key parts of the code
  - [X] Defining function **parameters** and/or **return values**

### Program Testing

The program has been tested using:
- [X] A test plan **prepared in advance** of the coding
- [X] A test plan that **defines test data values** to be used
- [X] Test values that cover **boundary** (limit / edge) cases

---

## Excellence Criteria

### Program Code

Program flexibility and maintainability is aided by:
- [X] **Constants** being used to define key values, and used throughout the program
- [X] Variable values being **derived at run-time** (from other variables / constants)
- [X] Literal values only being used if they **make sense**, and they don't impact program flexibility

Program flexibility and maintainability is aided by good program structure:
- [X] Conditions, branching, loops and functions are used **effectively**
- [X] Procedures are **efficient** (minimal iterations, etc.)
- [X] **Minimal duplication of code** (instead using loops, or having multiple calls to a single function)
- [X] Functions are **well-chosen and logical**, with a clearly defined purpose
- [X] The functions chosen represent a **logical decomposition** of the task

### Program Documentation

The program code:
- [X] Code is laid-out and organised **logically and concisely**

### Program Testing

The program has been tested to be **robust**:
- [X] With a **comprehensive and thorough** test plan
- [X] Testing **regularly** throughput development, allowing **time for debugging**
- [X] Using test values that cover **invalid** (unexpected) cases
- [X] Resulting in a program that **copes appropriately** with invalid inputs
