package ConditionsProgram;

import java.util.Scanner;

public class IfelseProgram {
	static int distinctionMarks = 850;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter student marks");
		Scanner sc1 = new Scanner(System.in);
		int studentMark = sc1.nextInt();
		if(studentMark > distinctionMarks) {
			System.out.println("passed");
		} else {
			System.out.println("failed");
		}
		

	}

}
