package main;

import java.util.Scanner;
import helper.OutputHelper;
import entity.Student;
import repository.StudentRepository;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name of Student: ");
		String name = sc.next();
		
		StudentRepository repository = new StudentRepository();
		OutputHelper helper = new OutputHelper();
		
		switch (name) {
		case "Ram" : {
			Student ram = repository.getRamObject();
			helper.printStudentDetails(ram);
			break;
		}
		case "Sham": {
			Student sham =repository.getShamObject();
			helper.printStudentDetails(sham);
			break;
		}
		default:
			System.err.println("Please enter a proper name...");
		}
		
	}

}
