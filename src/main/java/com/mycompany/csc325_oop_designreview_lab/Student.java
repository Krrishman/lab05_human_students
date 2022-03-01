
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
/**
 *
 * @author MoaathAlrajab
 */
public class Student {
	// ToDo 1: Make this class a child of Human
	
	// ToDo 2: Fix the resulting errors
	
	// ToDo 3: Add a field for GPA and create setter and getter
	
	// ToDo 4: Add comments to your code
	private String name;
	private int age;
        private int gpa;
	
	public Student(String name, int age, int gpa) {
		this.name = name;
		this.age = age;
                this.gpa = gpa;
	}
	
	public String getName() {
		return name;
	}
        public int getAge() {
		return age;
	}
        public int getGpa() {
		return gpa;
	}
        
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
        public void setgpa(int gpa) {
		this.gpa = gpa;
	}
}