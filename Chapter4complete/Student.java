
//****************************************************************
//   Student.java
//
//   Define a student class that stores name, score on test 1, and
//   score on test 2.  Methods prompt for and read in grades,
//   compute the average, and return a string containing student's info.
// ****************************************************************
import java.util.Scanner;
public class Student
{
    //declare instance data
    private String name;
    private double test1Score;
    private double test2Score;
    Scanner scan = new Scanner(System.in);
    //-----------------------------------------------
    //constructor
    //-----------------------------------------------
    public Student(String nm)
    {
        this.name = nm;
        //add body of constructor
    }
    //-----------------------------------------------
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    //-----------------------------------------------
    public void inputGrades()
    {
        //add body of inputGrades
        test1Score = scan.nextDouble();
        test2Score = scan.nextDouble();
        
        System.out.println("Enter Joe's score for test1 " + test1Score);
        System.out.println("Enter Joe's score for test2 " + test2Score);
        
    }
    //-----------------------------------------------
    //getAverage: compute and return the student's test average
    //-----------------------------------------------
    //add header for getAverage
    public void getAverage()
    {
        //add body of getAverage
    }
    //-----------------------------------------------
    //getName: return the student's name
    //-----------------------------------------------
    //add header for getName
    {
        //add body of getName
    }
    //-----------------------------------------------
    //printName: print the student's name
    //-----------------------------------------------
    //add header for printName
    {
        //add body of printName
    }
}