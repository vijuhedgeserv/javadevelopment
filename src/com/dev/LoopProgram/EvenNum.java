package com.dev.LoopProgram;

import java.util.Scanner;

public class EvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the limit");
       num= sc.nextInt();
       
       System.out.println("List of even number: ");
       for (int counter = 0; counter < num; counter++) {
    	   if(counter%2==0) {
    		   System.out.print(counter + " ");
    	   }
		
	}
	}

}
