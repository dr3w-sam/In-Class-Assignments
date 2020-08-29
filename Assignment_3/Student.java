package oop_assign03;

public class Student 
{
    String name;
    double GPA;
    int studentID;
    
    Student ()
    {
        name = "";
        GPA = 0.0;
        studentID = 0;
    }
 
    Student (String newname, double newGPA, int newID)
    {
        name = newname;
        GPA = newGPA;
        studentID = newID;        
    }
    
    Student (Student A)
    {
        this.name = A.name;
        this.GPA = A.GPA;
        this.studentID = A.studentID;                
    }
    
    String getName ()
    { return name; }
    
    void setName (String n)
    { name = n; }    
}
