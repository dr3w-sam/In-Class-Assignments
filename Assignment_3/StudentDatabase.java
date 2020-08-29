package oop_assign03;

import java.io.*; // Imports txt file I/O
import java.util.Arrays;
import java.util.Scanner;

public class StudentDatabase 
{
    private int max_num = 10;
    int stud_num = 0;
    private Student[] Students = new Student[max_num];
    
    void AddStudent ()
    {
        Scanner in = new Scanner(System.in);
        Student sd = new Student();
        
        System.out.println("Enter Student Name:");
        sd.name = in.nextLine();
        System.out.println("Enter Student's GPA:");
        sd.GPA = in.nextDouble();
        System.out.println("Enter Student's ID:");
        sd.studentID = in.nextInt();
        sd = Students[stud_num]; /* NullPointerException */
        stud_num++;
        
        if (stud_num >= max_num)
        {
            System.out.println("ERROR: Exceeding maximum number of students.");
        }
    }
    
    
    void AddStudent (String student_file) throws FileNotFoundException, IOException
    {
       FileReader fr = new FileReader(student_file); /* FileNotFoundException */
       BufferedReader br = new BufferedReader(fr);
             
       System.out.println("Adding students from " + student_file);
       
       String p = "";
       while ((p = br.readLine()) != null)
       {
           String[] pH = p.split(",");           
           Students[stud_num] = new Student();
           Students[stud_num].name = pH[0];
           Students[stud_num].GPA = Double.parseDouble(pH[1]);
           Students[stud_num].studentID = Integer.parseInt(pH[2]);
           stud_num++;
       }
       
       if (stud_num >= max_num)
        {
            System.out.println("ERROR: Exceeding maximum number of students.");
            System.exit(0);
        }
    }
    
    void DisplayStudents ()
    { 
        Student[] temp = new Student[max_num];	
        Student[] t2 = new Student[max_num];	//added to allow for comparison of GPA
        
        for (int i = 0; i < stud_num; i++)	
        {t2[i] = Students[i];}
        
        for (int j = 0; j < stud_num; j++)
        {
            if (t2[j].GPA > t2[j+1].GPA)
            {
                temp[j] = t2[j];
                temp[j+1] = t2[j+1];
            }
            else 
            {
                temp[j] = t2[j+1];
                temp[j+1] = t2[j];
            }
        }
        
        for (int x = 0; x <= 10; x++)
        {
            System.out.println("(" + temp[x].name + "," + temp[x].GPA + "," + temp[x].studentID + ")"); /* NullPointerException */
        }
    }
  
    
    Student SearchStudentbyName (String name)
    {
        for (int i = 0; i < stud_num; i++)
        {
            if (Students[i].name.equals(name))
            {return Students[i];} /* NullPointerException */
        }
        return null;
    }
    
    Student SearchStudentbyID (int studentID)
    {
        for (int i = 0; i < stud_num; i++)
        {
            if (Students[i].studentID == studentID)
            {return Students[i];}
        }
        return null;
    }
    
    Student[] SearchStudentsbyGPA (double GPA)
    {
        Student[] temp = new Student[stud_num];
        
        for (int i = 0; i < stud_num; i++)
        {
            if (Students[i].GPA == GPA)
            {
                for (int j = 0; j < stud_num; j++)
                {
                    temp[j] = Students[i];
                }
                return temp;
            }            
        }
        return null;        
    }
    
    Student RemoveStudent ()
    {
        Scanner din = new Scanner(System.in);
        String d;
        int del = 0;
        
        System.out.print("Who do you want to remove?\n");
        d = din.nextLine();
        
        for (int i = 0; i < stud_num; i++)
        {
            if (Students[i].name.equals(d)==false)
            {
                Students[del++] = Students[i];
                stud_num--;
            }
            
            if ( i == 10 && Students[i].name.equals(d)==false)
            {
                System.out.println("ERROR: Student not found");
            }
        }
        
        return Students[del]; /* NullPointerException */
    }   
}
