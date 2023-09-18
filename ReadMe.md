# Exceptions Lab


Watch the following video :
* [Exceptions in java](https://www.youtube.com/watch?v=adTDlH0lhaA)
* [Generics in Java] (https://www.youtube.com/watch?v=jUcAyZ5OUm0)

Work 
* Part A - Coding Challenge
* Part B - Foundations 8-2
* Part C - Homework
  * Read the chapter on Generics In Thinking In Java

## Part A

You will be solving the given problem below.

### Problem
Determine if the given string contains between 1 and 3 'e' characters.

Only if the string contains between 1 and 3 'e' characters; return true.

Example:

```
containE("Hello") --> true

containE("Heelle") --> true

containE("Heelele") --> false
```

### Submission

Commit and push your solution to GitHub

## Part B

### Exercise 01

Examine in package `partB.exercises.ex01.exception` in `ExceptionEx1.java`:

* Execute the program and observe the output:
* ArrayIndexOutOfBoundsException occurs
* Is it a good practice to handle the exception for this program?
* Modify the program to compute the sum of the array

### Exercise 02

In the package `partB.exercises.ex02.calculator` examine `Calculator.java` and `ShoppingCart.java` :

* Modify the programs to implement exception handling:
	- Calculator.java:
		* Identify the exception that might occur
		* Change the divide method signature to indicate that it throws an exception.
	- ShoppingCart.java:
		* Catch the exception in the class that calls the divide method

### Demos

In the package `com.codedifferently.partB.demos` run all of the classes, and observe the exceptions being thrown.

Comment out all the code, and in the comments document what caused the exception.

## Part C

### Problem 01
Provide two numbers, evalute both numbers to see which one is nearest to the value 10.
Some numbers may have the same range in how near they are to 10; such as 13 and 7 both are 3 from 10.
In that case, we would consider that event a tie.

Tip: Math.abs(n) returns the absolute value of a number
    
Return whichever number is nearest to 10, or return 0 for the event of a tie.

Example:

near10(8, 13) --> 8

near10(13, 8) --> 8

near10(13, 7) --> 0

### Submission

Commit and push your solution to GitHub

### Problem 02

Your local rapper is looking to create his next hook for his next track. He wants to add phrases that begin with "mix".
But he decides he wants to take it a step further and accept any phrase except the "m" can be any letter or number.
He needs your help to make sure the list of given phrases begin with what was asked.

Return true if the given phrase begins with "mix", or any beginning letter or number following "ix"

Example:

startWithIx("mix snacks") --> true

startWithIx("pix snacks") --> true

startWithIx("piz snacks") --> false

#### Submission

Commit and push your solution to GitHub
