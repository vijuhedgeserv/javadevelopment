package LoopProgram;

public class loopProgram {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
	    for (int i = 1; i <= n; i++) {
	    	System.out.println("I am fines " +i);
	    	continue;
	    }
	    
	    method();
     
	}

	private static void method() {

		System.out.println("In Method"); 
		
		metod2();
	}

	private static void metod2() {
		// TODO Auto-generated method stub
		
	}
  
}
     