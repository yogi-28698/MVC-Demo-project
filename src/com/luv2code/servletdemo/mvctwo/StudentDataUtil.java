package com.luv2code.servletdemo.mvctwo;

import java.util.ArrayList;
import java.util.List;

//Helper Class to Access the Model
//Actually It is a Model in Layman term

public class StudentDataUtil {  
	
	public static List<Student> getStudents() {
		
		//Create an Empty List
		List<Student> students = new ArrayList<>();
		students.add(new Student("Yogesh", "Verma", "xyz@gmail.com"));
		students.add(new Student("Akash", "Gupta", "pqr@gmail.com"));
		students.add(new Student("Shubhank", "Srivastava", "abc@gmail.com"));
		
		//Add some Sample Data
		
		//return the List
		return students;
		
	}
	
}
