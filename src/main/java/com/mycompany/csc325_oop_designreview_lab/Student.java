
package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human {


	// ToDo 1: Make this class a child of Human
	
	// ToDo 2: Fix the resulting errors
	
	// ToDo 3: Add a field for GPA and create setter and getter
	
	// ToDo 4: Add comments to your code
    private double gpa;
    public Student(String name, int age, double gpa) 
    {
        super(name, age);
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Your GPA\n");
        this.gpa = myObj.nextDouble();
    }
	
        public double getGpa() {
		return gpa;
	}
        
        public void setgpa(double gpa) {
            
		this.gpa = gpa;
	}
        
}