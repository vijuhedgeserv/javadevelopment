package com.dev.LoopProgram;

public class Oddnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num = 100;
       System.out.println("List of odd number from 1 to "+num+":");
       for (int counter = 0; counter <= num; counter++) {
		if(counter%2 != 0)
		{
			System.out.print(counter + " ");
		}
	}
	}

}
