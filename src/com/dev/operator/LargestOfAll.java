package com.dev.operator;

import java.util.Scanner;

public class LargestOfAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a,b,c,d;
     Scanner sc = new Scanner (System.in);
     
     System.out.println("Enter the first number: ");
     a = sc.nextInt();
     System.out.println("Enter the second number: ");
     b = sc.nextInt();
     System.out.println("Enter the third number:");
     c = sc.nextInt();
     
     d = c >(a>b ? a:b) ? c:((a>b) ? a:b);  
     
     System.out.println("The Largest number is:"+d);
     
	}

}
