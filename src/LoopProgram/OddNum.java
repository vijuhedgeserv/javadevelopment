package LoopProgram;

import java.util.Scanner;

public class OddNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int num;
   Scanner sc = new Scanner (System.in);
   System.out.println("Enter the limit");
   num=sc.nextInt();
   int counter=1;
   System.out.println("List of odd number:");
   
   while (counter <=num) {
	   System.out.print(counter + " ");
	 counter=counter+2;
	 
   }
   
   
	}

}
