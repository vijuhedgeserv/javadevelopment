package com.dev.string;

public class StringProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "Sachin Tendulkar is the best batsmen in the world";    
        int count = 0;    
        for(int counter = 0; counter < string.length(); counter++) {    
            if(string.charAt(counter) != ' ')    
                count++;    
        }    
         System.out.println("Dispaly number of characters in a string: " +count);
	}

}
