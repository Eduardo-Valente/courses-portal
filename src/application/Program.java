package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import model.entities.Course;
import model.entities.Student;

/*
 * Reads the students IDs of 
 * n courses shows them and displays the total of students enrolled. 
 */

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Student> students = new HashSet<>();
		
		Course[] courses = new Course[Course.NUMBER_OF_COURSES];
		
		int studentId = 0;
		char c = 'A';
		
		for(int i = 0; i < Course.NUMBER_OF_COURSES; i++)
		{
			courses[i] = new Course();
			
			System.out.printf("How many students for course %c? ", c);
			int numberStudents = sc.nextInt();
			
			for(int j = 0; j < numberStudents; j++)
			{	
			  studentId = sc.nextInt();
			  Student stu = new Student(studentId);
			  
			  students.add(stu);
			  
			  courses[i].addStudent(stu);
			}
			
			c++;
		}
		
		c = 'A';
		
		System.out.println();
		
		for(int i = 0; i < courses.length; i++)
		{
			System.out.printf("Students of course %c:%n", c);
			
			for(Student stu : courses[i].getStudents())
			{
				System.out.println(stu.getUniqueID());
			}
			
			c++;
		}
		
		System.out.println("Total students: " + students.size());
		
		sc.close();
	}
}
