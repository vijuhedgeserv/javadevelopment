package LoopProgram;

import java.util.Scanner;

public class EvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int num;
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter your limit");
    num=sc.nextInt();
    int counter =0;
    System.out.println("List of Even number: ");
    while(counter<=num) {
    	System.out.print(counter + " ");
    	counter=counter+2;
    }
	}

}
