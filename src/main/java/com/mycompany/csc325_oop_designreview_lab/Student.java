
package com.mycompany.csc325_oop_designreview_lab;

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
    private int gpa;
    public Student(String name, int age, int gpa) 
    {
        super(name, age);
        this.gpa = gpa;
    }
	
        public int getGpa() {
		return gpa;
	}
        
        public void setgpa(int gpa) {
		this.gpa = gpa;
	}
}