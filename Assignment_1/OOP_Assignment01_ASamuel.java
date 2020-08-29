package oop_assignment01;

import java.util.Scanner;


public class OOP_Assignment01_ASamuel 
{
/*
 Assignment 1 coded by Andrew Samuel
Date : 1/28/20   
Class: (M [1:00-2:15])
    Objective: Basic Java console output format, 
        Console input, conditional execution, 
            arithmetic expressions. 
 */
    public static void main(String[] args) 
    {
        
        //Declaring scanner for user input
        Scanner in = new Scanner(System.in);
        String user_in;
        
        //Declaring all variables for assignment
        String emp_name = "";
        float salary = 17.25f;
        int labor_hr = 0;
        int ot = 0;
        float gross_income = 0.0f;
        float pocket_money = 0.0f;
        float w_insurance = 80.00f;
        float dep_insurance = 0.0f;
        float fed_tax = 0.0f;
        float income_tax = 0.0f;
        int dep = 0;
        
        boolean cont = true; // to use in while loop
        //String to organize lines between employees
        String org = "*****************************************************************";
        
        
        while (cont == true)
        {
            System.out.print("Employee name: ");
            emp_name = in.nextLine();
            
            System.out.print("# of Hours Worked: ");
            labor_hr = in.nextInt();
            
            System.out.print("# of Dependants: ");
            dep = in.nextInt();
            
            //This includes all calculations given
            
            if (labor_hr <= 40)// Pay with NO OT
            { gross_income = (labor_hr * salary); }
            
            //Overtime is incorporated starting now
            
            else if (labor_hr > 40 && labor_hr <= 60)
            {
                gross_income = (labor_hr * 40);
                ot = (labor_hr - 40);
                gross_income = (gross_income + (12.34f * ot));
            }
            
            else if (labor_hr > 60 && labor_hr <= 80)
            {
                gross_income = (labor_hr * 40);
                ot = (labor_hr - 40);
                gross_income = (gross_income + (14.34f * ot));
            }
            
            else if (labor_hr > 80)
            {
                gross_income = (labor_hr * 40);
                ot = (labor_hr - 40);
                gross_income = (gross_income + (16.00f * ot));
            }
            
            if (dep >= 3) // Extra insurance (if needed)
            { dep_insurance = (25 * (dep - 2)); }
            
            fed_tax = (gross_income * 0.14f);
            income_tax = (gross_income * 0.05f);
            
            //Calculates FINAL in pocket income
            
            pocket_money = gross_income - (fed_tax + income_tax + w_insurance + dep_insurance);
            
            //Outputs begin here
            System.out.print(org);
            System.out.print("Paycheck Breakdown");
            System.out.print("\n");
            System.out.println("Employee Name: "+ emp_name);
            System.out.println("# of Dependants: "+ dep);
            System.out.println("# of Hours Worked: "+ labor_hr);
            System.out.println("# of Overtime Hours (if any): "+ ot);
            System.out.println("Gross Income: "+ gross_income);
            System.out.println("State Income Tax Subtracted (5$): "+ income_tax);
            System.out.println("Federal Tax Subtracted (14%): "+ fed_tax);
            System.out.println("Automatic (Worker + 2 Dependants) Insurance: "+ w_insurance);
            System.out.println("Additional Isurance (Dependants > 2): "+ dep_insurance);
            System.out.print("\n");
            System.out.println("Net Income (After Subtractions): "+ pocket_money);
            System.out.print(org);
            
            //Continue?
            
            System.out.print("Do you wish to enter any other employees?");
            in.nextLine();
            user_in = in.nextLine();
            
            if (user_in.equals("y") || user_in.equals("Y") || user_in.equals("yes") || user_in.equals("Yes") || user_in.equals("YES"))
            {cont = true;}
            else {cont = false;}
         }
        in.close();
        new OOP_Assignment01_ASamuel();
    }
}
