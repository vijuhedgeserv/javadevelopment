package ConditionsProgram;

import java.util.Scanner;

public class PosNegNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int num;
     System.out.println("Enter your number");
     Scanner sc = new Scanner (System.in);
     num =sc.nextInt();
     
     if(num>0) {
    	 System.out.println("Number is Positive");
     }else if(num<0) {
    	 System.out.println("Number is Negative");}
    	 else {
    		 System.out.println("Null");
    	 }
     }
	}


