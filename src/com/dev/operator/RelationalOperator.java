package com.dev.operator;

import java.util.Scanner;

public class RelationalOperator {
	static int referenceAge = 18;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int userAge = sc.nextInt();
		if (userAge > referenceAge) {
			System.out.println("you are major");
		} else {
			System.out.println("You are minor");
		}
	}

}
