/* 
This program assignes grades given the number of students and their scores. 
Author: James Smith
Last modified: October 11, 2018
Email: jsmith1863@kctcs.edu    
*/

import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;

public class Grader {
    static Scanner keyboard = new Scanner(System.in); 
    
    public static void getScores(String[] names, double[] scores, int students) { 
        final double MAX = 100; 
        
        double nextScore; 
        String nextName;
        
        //filling both arrays with new names and scores 
        for (int i = 0; i < students; ) {
            System.out.println("\nEnter the name for the Student #" + (i + 1) + ": "); 
            nextName = keyboard.nextLine(); 
            
            System.out.println("Enter the score for Student #" + (i + 1) + ": ");
            nextScore = keyboard.nextDouble();
            keyboard.nextLine(); 
            
            if (nextScore >= 0 && nextScore <= MAX) {
                names[i] = nextName; 
                scores[i] = nextScore; 
                i++; 
            }
        }
    } //end of getScores method
    
    public static void printScores(String[] names, double[] scores, int students) {
        //prints a list of both arrays 
        for (int i = 0; i < students; i++) {
            System.out.println("Score for student " + names[i] + ": " + scores[i]);
        }
    } //end of printScores method
    
    public static double average (double[] scores, int students) {
        double sum = 0; 
        
        //getting a running sum of the scores array 
        for (int i = 0; i < students; i++) {
            sum += scores[i];
        }
        
        //returning the average of the students
        return sum / students; 
    }
    
    public static int highestScore(double[] scores, int students) {
        double highest = scores[0]; 
        int highestIndex = 0; 
        
        //using for loop to decide the highest score in the scores[]
        for (int i = 1; i < students; i++) {
            if (scores[i] > highest) highestIndex = i; 
            highest = Math.max(scores[i], highest);     
        }
        
        return highestIndex; 
    } //end of highestScore method
    
    public static int lowestScore(double[] scores, int students) {
        double lowest = scores[0];
        int lowestIndex = 0;
        
        //using for loop to decide the lowest score in the scores[]
        for (int i = 1; i < students; i++) {
            if (scores[i] < lowest) lowestIndex = i;
            lowest = Math.min(scores[i], lowest);
        }    
            
        return lowestIndex;
    } //end of lowestScore method
    
    public static void main(String[] args) { 
        NumberFormat formatter = new DecimalFormat("#0.00");
        
        double[] scores; 
        String[] names;
        
        double average; 
        int highestIndex; 
        int lowestIndex; 
        int students;
        
        System.out.println("==============================================================================");
        System.out.println("This program will take test scores from students and return the average grade");
        System.out.println("==============================================================================\n");
        
        //Getting the number of students to be used as the length of both arrays 
        System.out.println("Enter number of students: "); 
        students = keyboard.nextInt(); 
        keyboard.nextLine(); 
        
        scores = new double[students]; 
        names = new String[students]; 
        
        //calling the getScores() with both arrays and the student number
        getScores(names, scores, students);  
        average = average(scores, students); 
        
        highestIndex = highestScore(scores, students); 
        lowestIndex = lowestScore(scores, students);
        
        //Displaying the average and the scores 
        System.out.println("\n===========================================================");
        printScores(names, scores, students);
        System.out.println("\n===========================================================");
        System.out.println("Average score: " + formatter.format(average)); 
        System.out.println(names[highestIndex] + " has the highest score of: " + scores[highestIndex]); 
        System.out.println(names[lowestIndex] + " has the highest score of: " + scores[lowestIndex]); 
        System.out.println("\n===========================================================");
    }
    
}
