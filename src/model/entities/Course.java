package model.entities;

import java.util.ArrayList;
import java.util.List;

public class Course {
		
		private List<Student> students = new ArrayList<>();
		public static final int NUMBER_OF_COURSES = 3;

		public List<Student> getStudents() {
			return students;
		}
		
		public void addStudent(Student student)
		{
			students.add(student);
		}
		
		public void removeStudent(Student student)
		{
			students.remove(student);
		}
}
