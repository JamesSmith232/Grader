<h1 align="center">Grader</h1>

## Description
Using two arrays, this program will take the names and test scores of students. Displaying the average, highest score, 
lowest score of the test. 

This program has six different methods: getScores, printScores, average, highestScore, lowestScore, main.
 - **_getScores:_** receives two arrays and an int as parameters. Using a for loop with the int vairable students 
as its condition, it fills both the names and scores array. Using the same index for both arrays is how we match up the student
with their individual score. 
 - **_printScores:_** takes both arrays that were filled earlier and displays them to the user
 - **_average:_** uses the scores array in a for loop to get running sum of scores. It then takes that sum and divides
 it with the variable students that was passed to it. It returns that number as the average for all test scores. 
- **_highestScore:_** passed the scores array and the variable students, this method uses a for loop to get the highest score and
the index of that score. That index variable will be used in the names array to match that score with the student who got it. This 
method uses the Math.max() function to assign the best test score to the varaible highest. The Math.max() function takes two numbers
and returns the greatest of that number. 
- **_lowestScore:_** this method is nearly identical to the highestScore() method but gets the lowest score and index of that score. 
Math.min() is also used to get the lowest of the test scores. This operates exactly the same as Math.max() but returns the lower of 
the two numbers. 
- **_main:_** describes the program to the user. Asks the user for the amount of students who took the test, which is used in every other
method in the program. It takes that student variable and gives the two arrays its length. Calls the getScores() method so the user 
can enter the names and test scores. Calls the average() method to assign what ever it returns to the average variable. As well gets the 
highestIndex and lowestIndex from both respective methods. Uses the DecimalFormat subclass on the average variable to receive the desired 
format of #0.00. Then displays the average, along with name and score of the person who received the highest score and the lowest score. 


## Outcome
<p align="center">
  <img src="https://user-images.githubusercontent.com/80684500/170366099-10b000a2-bf4d-4466-a9fc-700e1293e50c.JPG" alt="Sublime's custom image"/>
</p>

## Projects
|  Num  | Project                                                                                                   | Author                                          |
| ----- | --------------------------------------------------------------------------------------------------------- | ------------------------------------------------|
|   1   | [Bookstore](https://github.com/JamesSmith232/BookStore)                                                   | [James Smith](https://github.com/JamesSmith232)   |
|   2   | [FizzBuzz](https://github.com/JamesSmith232/FizzBuzz)                                                     | [James Smith](https://github.com/JamesSmith232)   |
|   3   | [RockPaperScissors](https://github.com/JamesSmith232/RockPaperScissors)                                   | [James Smith](https://github.com/JamesSmith232)   |
|   4   | [Grader](https://github.com/JamesSmith232/Grader)                                                         | [James Smith](https://github.com/JamesSmith232)   |
|   5   | [StoreManager](https://github.com/JamesSmith232/StoreManager)                                             | [James Smith](https://github.com/JamesSmith232)   |
