package com.dev.operator;
import java.util.Scanner;
public class LargestOfThreeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c, largest, temp;  
		//object of the Scanner class  
		Scanner sc = new Scanner(System.in);  
		//reading input from the user  
		System.out.println("Enter the first number:");  
		a = sc.nextInt();  
		System.out.println("Enter the second number:");  
		b = sc.nextInt();  
		System.out.println("Enter the third number:");  
		c = sc.nextInt();  
		//comparing a and b and storing the largest number in a temp variable  
		temp=a>b?a:b;  
		//comparing the temp variable with c and storing the result in the variable  
		largest=c>temp?c:temp;  
		//prints the largest number  
		System.out.println("The largest number is: "+largest);  
		}  
	}


