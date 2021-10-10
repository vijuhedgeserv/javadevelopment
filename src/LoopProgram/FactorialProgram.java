package LoopProgram;

public class FactorialProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int fact=1;
      int num =5;
      
      for (int counter = 1; counter <= num; counter++) {
    	  fact=fact*counter;
		
	}
      System.out.println("Factorial of "+num+" is : " +fact);
	}

}
