package com.dev.operator;

import java.util.Scanner;

public class SmallestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a,b,c,comp,smallest;
       Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter 1st number");
      a =sc.nextInt();
      System.out.println("Enter 2nd number");
      b =sc.nextInt();
      System.out.println("Enter 3rd number");
      c =sc.nextInt();
      
     comp=a<b?a:b;
     smallest=c<comp?c:comp;
     
     //else we can write smallest = c < (a < b ? a : b) ? c : ((a < b) ? a : b); 
     
     System.out.println("The smallest number is: " +smallest);
	}

}
