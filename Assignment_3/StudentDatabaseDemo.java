package oop_assign03;

/*
Andrew Samuel-Assignment 3
CS 3300 M-[1:00-2:15]

This assignment is to implement three classes and test the accessor,
mutator, copy contsructor, and constructor methods.
*/

import java.io.IOException;
import java.util.Scanner;

public class StudentDatabaseDemo 
{
    public static void main(String[] args) throws IOException 
    {
        StudentDatabase stud = new StudentDatabase();
        
        stud.AddStudent();
       // stud.AddStudent("/students.txt/"); /* FileNotFoundException */
        stud.DisplayStudents(); /* NullPointerException */
        stud.SearchStudentbyName("John"); /* NullPointerException */
        stud.RemoveStudent(); /* NullPointerException */
                
        Scanner in = new Scanner(System.in);
        int user_in;
        
        //Menu and switch-case works but methods in StudentDatabse class throws those exceptions
        
        String lb = "----------------------------------------------------------------------------------------------------";
        
        System.out.println(lb);
        System.out.print("Main Menu {Please choose an option (Pick number of your choosing}\n");
        System.out.print("1. Add Student\n"); 
        System.out.print("2. Remove Student\n"); /* NullPointerException */
        System.out.print("3. Display Students\n"); /* NullPointerException */
        System.out.print("0. Exit Menu\n");
        System.out.println(lb);
        
        user_in = in.nextInt();
        
        
        switch (user_in)
        {
            case 0:
            System.exit(0);
            case 1:
            {stud.AddStudent();} 
            case 2:
            {stud.RemoveStudent();} /* NullPointerException */
            case 3:
            {stud.DisplayStudents();} /* NullPointerException */     
        }                  
    }    
}
