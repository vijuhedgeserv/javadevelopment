package ConditionsProgram;

import java.util.Scanner;

public class LargestOfAllNum {

	public static void main(String[] args) {   
		int a,b,c,Largest;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter first number");
		a =sc.nextInt();
		System.out.println("Enter second number");
		b =sc.nextInt();
		System.out.println("Enter third number");
		c =sc.nextInt();
		
		if(a>=b && a>=c)  {
		System.out.println(a+" is the largest Number");  
		}
		else if (b>=a && b>=c)  {
		System.out.println(b+" is the largest Number");  
		}else  {
				System.out.println(c+" is the largest number");  }
		}  
		}  