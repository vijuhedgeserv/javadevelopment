package com.dev.LoopProgram;

public class GcdNumber {

	public static void main(String[] args) {
		int x = 12, y = 8, gcd = 1;  
		  
		for(int counter = 1; counter <= x && counter <= y; counter++)  
		{  
		   
		if(x%counter==0 && y%counter==0)  
		  
		gcd = counter;  
		}  
		  
		System.out.printf("GCD of %d and %d is: %d", x, y, gcd);  
		} 
	}


