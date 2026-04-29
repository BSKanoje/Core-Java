package helper;

import entity.Student;

public class OutputHelper {
	
	public void printStudentDetails(Student student) {
		
		System.out.println("Print "+student.firstName+" details");
		System.out.println("Id : "+student.id);
		System.out.println("First name : "+student.firstName);
		System.out.println("Last name : "+student.lastName);
		System.out.println("English Marks : "+student.mathsObtained);
		System.out.println("Maths marks : "+student.englishObtained);
		System.out.println("Science marks : "+student.scienceObtained);
	}

}
